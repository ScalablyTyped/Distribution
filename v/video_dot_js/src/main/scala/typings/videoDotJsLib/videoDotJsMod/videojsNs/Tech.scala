package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tech extends Component {
  /**
  		 * Boolean indicating whether the `Tech` supports fullscreen resize control.
  		 * Resizing plugins using request fullscreen reloads the plugin
  		 *
  		 * @default
  		 */
  var featuresFullscreenResize: scala.Boolean = js.native
  /**
  		 * Boolean indicating whether the `Tech` supports muting volume.
  		 *
  		 * @default
  		 */
  var featuresMuteControl: scala.Boolean = js.native
  /**
  		 * Boolean indicating whether the `Tech` supports the native `TextTrack`s.
  		 * This will help us integrate with native `TextTrack`s if the browser supports them.
  		 *
  		 * @default
  		 */
  var featuresNativeTextTracks: scala.Boolean = js.native
  /**
  		 * Boolean indicating whether the `Tech` supports changing the speed at which the video
  		 * plays. Examples:
  		 *   - Set player to play 2x (twice) as fast
  		 *   - Set player to play 0.5x (half) as fast
  		 *
  		 * @default
  		 */
  var featuresPlaybackRate: scala.Boolean = js.native
  /**
  		 * Boolean indicating whether the `Tech` supports the `progress` event. This is currently
  		 * not triggered by video-js-swf. This will be used to determine if
  		 * {@link Tech#manualProgressOn} should be called.
  		 *
  		 * @default
  		 */
  var featuresProgressEvents: scala.Boolean = js.native
  /**
  		 * Boolean indicating whether the `Tech` supports the `sourceset` event.
  		 *
  		 * A tech should set this to `true` and then use {@link Tech#triggerSourceset}
  		 * to trigger a {@link Tech#event:sourceset} at the earliest time after getting
  		 * a new source.
  		 *
  		 * @default
  		 */
  var featuresSourceset: scala.Boolean = js.native
  /**
  		 * Boolean indicating whether the `Tech` supports the `timeupdate` event. This is currently
  		 * not triggered by video-js-swf. This will be used to determine if
  		 * {@link Tech#manualTimeUpdates} should be called.
  		 *
  		 * @default
  		 */
  var featuresTimeupdateEvents: scala.Boolean = js.native
  /**
  		 * Boolean indicating whether the `Tech` supports volume control.
  		 *
  		 * @default
  		 */
  var featuresVolumeControl: scala.Boolean = js.native
  /**
  		 * Creates a remote text track object and returns an html track element.
  		 *
  		 * > Note: This can be an emulated {@link HTMLTrackElement} or a native one.
  		 *
  		 * @param options
  		 *        See {@link Tech#createRemoteTextTrack} for more detailed properties.
  		 *
  		 * @param [manualCleanup=true]
  		 *        - When false: the TextTrack will be automatically removed from the video
  		 *          element whenever the source changes
  		 *        - When True: The TextTrack will have to be cleaned up manually
  		 *
  		 * @return An Html Track Element.
  		 *
  		 * @deprecated The default functionality for this function will be equivalent
  		 *             to "manualCleanup=false" in the future. The manualCleanup parameter will
  		 *             also be removed.
  		 */
  def addRemoteTextTrack(options: TextTrackOptions, manualCleanup: videoDotJsLib.videoDotJsLibNumbers.`true`): stdLib.HTMLTrackElement = js.native
  /**
  		 * Create and returns a remote {@link TextTrack} object.
  		 *
  		 * @param kind
  		 *        `TextTrack` kind (subtitles, captions, descriptions, chapters, or metadata)
  		 *
  		 * @param [label]
  		 *        Label to identify the text track
  		 *
  		 * @param [language]
  		 *        Two letter language abbreviation
  		 *
  		 * @return The TextTrack that gets created.
  		 */
  def addTextTrack(kind: java.lang.String, label: java.lang.String, language: java.lang.String): TextTrack = js.native
  /**
  		 * Emulate TextTracks using vtt.js if necessary
  		 *
  		 * @fires Tech#vttjsloaded
  		 * @fires Tech#vttjserror
  		 */
  def `addWebVttScript_`(): scala.Unit = js.native
  /**
  		 * Get the {@link AudioTrackList}
  		 *
  		 * @return Tech.prototype.audioTracks
  		 */
  def audioTracks(): TrackList = js.native
  /**
  		 * Get and create a `TimeRange` object for buffering.
  		 *
  		 * @return The time range object that was created.
  		 */
  def buffered(): js.Any = js.native
  /**
  		 * Get the percentage of the current video that is currently buffered.
  		 *
  		 * @return A number from 0 to 1 that represents the decimal percentage of the
  		 *         video that is buffered.
  		 *
  		 */
  def bufferedPercent(): scala.Double = js.native
  /**
  		 * Check if the tech can support the given mime-type.
  		 *
  		 * The base tech does not support any type, but source handlers might
  		 * overwrite this.
  		 *
  		 * @param type
  		 *         The mimetype to check for support
  		 *
  		 * @return 'probably', 'maybe', or empty string
  		 *
  		 * @see [Spec]{@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/canPlayType}
  		 */
  def canPlayType(`type`: java.lang.String): java.lang.String = js.native
  /**
  		 * Remove any TextTracks added via addRemoteTextTrack that are
  		 * flagged for automatic garbage collection
  		 */
  def cleanupAutoTextTracks(): scala.Unit = js.native
  /**
  		 * Clear out a single `TrackList` or an array of `TrackLists` given their names.
  		 *
  		 * > Note: Techs without source handlers should call this between sources for `video`
  		 *         & `audio` tracks. You don't want to use them between tracks!
  		 *
  		 * @param types
  		 *        TrackList names to clear, valid names are `video`, `audio`, and
  		 *        `text`.
  		 */
  def clearTracks(types: java.lang.String): scala.Unit = js.native
  def clearTracks(types: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Create an emulated TextTrack for use by addRemoteTextTrack
  		 *
  		 * This is intended to be overridden by classes that inherit from
  		 * Tech in order to create native or custom TextTracks.
  		 *
  		 * @param options
  		 *        The object should contain the options to initialize the TextTrack with.
  		 *
  		 * @param [options.kind]
  		 *        `TextTrack` kind (subtitles, captions, descriptions, chapters, or metadata).
  		 *
  		 * @param [options.label].
  		 *        Label to identify the text track
  		 *
  		 * @param [options.language]
  		 *        Two letter language abbreviation.
  		 *
  		 * @return The track element that gets created.
  		 */
  def createRemoteTextTrack(options: TextTrackOptions): stdLib.HTMLTextAreaElement = js.native
  /**
  		 * Emulate texttracks
  		 *
  		 */
  def emulateTextTracks(): scala.Unit = js.native
  /**
  		 * Get or set an error on the Tech.
  		 *
  		 * @param [err]
  		 *        Error to set on the Tech
  		 *
  		 * @return The current error object on the tech, or null if there isn't one.
  		 */
  def error(err: MediaError): MediaError | scala.Null = js.native
  /**
  		 * Gets available media playback quality metrics as specified by the W3C's Media
  		 * Playback Quality API.
  		 *
  		 * @see [Spec]{@link https://wicg.github.io/media-playback-quality}
  		 *
  		 * @return An object with supported media playback quality metrics
  		 */
  def getVideoPlaybackQuality(): js.Any = js.native
  /**
  		 * Turn on listeners for {@link VideoTrackList}, {@link {AudioTrackList}, and
  		 * {@link TextTrackList} events.
  		 *
  		 * This adds {@link EventTarget~EventListeners} for `addtrack`, and  `removetrack`.
  		 *
  		 * @fires Tech#audiotrackchange
  		 * @fires Tech#videotrackchange
  		 * @fires Tech#texttrackchange
  		 */
  def initTrackListeners(): scala.Unit = js.native
  def manualProgressOff(): scala.Unit = js.native
  /**
  		 * Polyfill the `progress` event for browsers that don't support it natively.
  		 *
  		 * @see {@link Tech#trackProgress}
  		 */
  def manualProgressOn(): scala.Unit = js.native
  /**
  		 * Turn off the polyfill for `progress` events that was created in
  		 * {@link Tech#manualProgressOn}
  		 */
  def manualTimeUpdatesOff(): scala.Unit = js.native
  /**
  		 * Polyfill the `timeupdate` event for browsers that don't support it.
  		 *
  		 * @see {@link Tech#trackCurrentTime}
  		 */
  def manualTimeUpdatesOn(): scala.Unit = js.native
  /**
  		 * Update our internal duration on a `durationchange` event by calling
  		 * {@link Tech#duration}.
  		 *
  		 * @param event
  		 *        The `durationchange` event that caused this to run.
  		 *
  		 * @listens Tech#durationchange
  		 */
  def onDurationChange(event: stdLib.Event): scala.Unit = js.native
  /**
  		 * Attempt to force override of native audio tracks.
  		 *
  		 * @param override - If set to true native audio will be overridden,
  		 * otherwise native audio will potentially be used.
  		 */
  def overrideNativeAudioTracks(`override`: scala.Boolean): scala.Unit = js.native
  /**
  		 * Attempt to force override of native video tracks.
  		 *
  		 * @param override - If set to true native video will be overridden,
  		 * otherwise native video will potentially be used.
  		 */
  def overrideNativeVideoTracks(`override`: scala.Boolean): scala.Unit = js.native
  /**
  		 * A method to check for the presence of the 'playsinline' <video> attribute.
  		 */
  def playsinline(): js.Any = js.native
  /**
  		 * Get the remote element {@link HTMLTrackElementList}
  		 */
  def remoteTextTrackEls(): HTMLTrackElementList = js.native
  /**
  		 * Get the remote element {@link TextTrackList}
  		 */
  def remoteTextTracks(): TextTrackList = js.native
  /**
  		 * Remove a remote text track from the remote `TextTrackList`.
  		 *
  		 * @param track
  		 *        `TextTrack` to remove from the `TextTrackList`
  		 */
  def removeRemoteTextTrack(track: TextTrack): scala.Unit = js.native
  /**
  		 * Reset the tech, which will removes all sources and reset the internal readyState.
  		 */
  def reset(): scala.Unit = js.native
  /**
  		 * Causes a manual time update to occur if {@link Tech#manualTimeUpdatesOn} was
  		 * previously called.
  		 *
  		 * @fires Tech#timeupdate
  		 */
  def setCurrentTime(): scala.Unit = js.native
  /**
  		 * A method to set or unset the 'playsinline' <video> attribute.
  		 */
  def setPlaysinline(): scala.Unit = js.native
  /**
  		 * A method to set a poster from a `Tech`.
  		 */
  def setPoster(): scala.Unit = js.native
  /**
  		 * Stop the interval function created in {@link Tech#trackCurrentTime} so that the
  		 * `timeupdate` event is no longer triggered.
  		 *
  		 * @listens {Tech#pause}
  		 */
  def stopTrackingCurrentTime(): scala.Unit = js.native
  /**
  		 * Turn off the polyfill for `progress` events that was created in
  		 * {@link Tech#manualProgressOn}
  		 * Stop manually tracking progress events by clearing the interval that was set in
  		 * {@link Tech#trackProgress}.
  		 */
  def stopTrackingProgress(): scala.Unit = js.native
  /**
  		 * Get the {@link TextTrackList}
  		 */
  def textTracks(): TextTrackList = js.native
  /**
  		 * Sets up an interval function to track current time and trigger `timeupdate` every
  		 * 250 milliseconds.
  		 *
  		 * @listens Tech#play
  		 * @triggers Tech#timeupdate
  		 */
  def trackCurrentTime(): scala.Unit = js.native
  /**
  		 * This is used to trigger a `progress` event when the buffered percent changes. It
  		 * sets an interval function that will be called every 500 milliseconds to check if the
  		 * buffer end percent has changed.
  		 *
  		 * > This function is called by {@link Tech#manualProgressOn}
  		 *
  		 * @param event
  		 *        The `ready` event that caused this to run.
  		 *
  		 * @listens Tech#ready
  		 * @fires Tech#progress
  		 */
  def trackProgress(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * A special function to trigger source set in a way that will allow player
  		 * to re-trigger if the player or tech are not ready yet.
  		 *
  		 * @fires Tech#sourceset
  		 * @param src The source string at the time of the source changing.
  		 */
  def triggerSourceset(src: java.lang.String): scala.Unit = js.native
  /**
  		 * Get the {@link VideoTrackList}
  		 */
  def videoTracks(): TrackList = js.native
}


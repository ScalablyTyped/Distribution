package typings.videoJs.mod

import typings.std.CanPlayTypeResult
import typings.std.Element
import typings.std.HTMLTrackElement
import typings.std.MediaError
import typings.std.TextTrackList
import typings.std.TimeRanges
import typings.videoJs.anon.PartialBreakpoint
import typings.videoJs.mod.videojs.AudioTrackList
import typings.videoJs.mod.videojs.Autoplay
import typings.videoJs.mod.videojs.Breakpoint
import typings.videoJs.mod.videojs.Button
import typings.videoJs.mod.videojs.Component
import typings.videoJs.mod.videojs.ControlBar
import typings.videoJs.mod.videojs.LiveTracker
import typings.videoJs.mod.videojs.ModalDialog
import typings.videoJs.mod.videojs.NetworkState
import typings.videoJs.mod.videojs.PictureInPictureWindow
import typings.videoJs.mod.videojs.Player
import typings.videoJs.mod.videojs.Player.MediaObject
import typings.videoJs.mod.videojs.PlayerOptions
import typings.videoJs.mod.videojs.ReadyState
import typings.videoJs.mod.videojs.Tech
import typings.videoJs.mod.videojs.Tech.SourceObject
import typings.videoJs.mod.videojs.TextTrackOptions
import typings.videoJs.mod.videojs.TimeRange
import typings.videoJs.videoJsBooleans.`true`
import typings.videoJs.videoJsStrings.`use-credentials`
import typings.videoJs.videoJsStrings.anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoJsPlayer
  extends StObject
     with Component {
  
  /**
    * Create a remote {@link TextTrack} and an {@link HTMLTrackElement}. It will
    * automatically removed from the video element whenever the source changes, unless
    * manualCleanup is set to false.
    *
    * @param options
    *        Options to pass to {@link HTMLTrackElement} during creation. See
    *        {@link HTMLTrackElement} for object properties that you should use.
    *
    * @param [manualCleanup=true] if set to false, the TextTrack will be
    *
    * @return the HTMLTrackElement that was created and added
    *         to the HtmlTrackElementList and the remote
    *         TextTrackList
    */
  def addRemoteTextTrack(options: TextTrackOptions, manualCleanup: Boolean): HTMLTrackElement = js.native
  
  /**
    * A helper method for adding a {@link TextTrack} to our
    * {@link TextTrackList}.
    *
    * In addition to the W3C settings we allow adding additional info through options.
    *
    * @see http://www.w3.org/html/wg/drafts/html/master/embedded-content-0.html#dom-media-addtexttrack
    *
    * @param [kind]
    *        the kind of TextTrack you are adding
    *
    * @param [label]
    *        the label to give the TextTrack label
    *
    * @param [language]
    *        the language to set on the TextTrack
    *
    * @return the TextTrack that was added or undefined
    *         if there is no tech
    */
  def addTextTrack(): Unit = js.native
  def addTextTrack(kind: String): Unit = js.native
  def addTextTrack(kind: String, label: String): Unit = js.native
  def addTextTrack(kind: String, label: String, language: String): Unit = js.native
  def addTextTrack(kind: String, label: Unit, language: String): Unit = js.native
  def addTextTrack(kind: Unit, label: String): Unit = js.native
  def addTextTrack(kind: Unit, label: String, language: String): Unit = js.native
  def addTextTrack(kind: Unit, label: Unit, language: String): Unit = js.native
  
  def aspectRatio(): String = js.native
  /**
    * A getter/setter for the `Player`'s aspect ratio.
    *
    * @param [ratio]
    *        The value to set the `Player's aspect ratio to.
    *
    * @return - The current aspect ratio of the `Player` when getting.
    *         - undefined when setting
    */
  def aspectRatio(ratio: String): Unit = js.native
  
  def audioOnlyMode(): Boolean = js.native
  /**
    * Get the current audioOnlyMode state or set audioOnlyMode to true or false.
    *
    * Setting this to `true` will hide all player components except the control bar,
    * as well as control bar components needed only for video.
    *
    * @param [value]
    *         The value to set audioOnlyMode to.
    *
    * @return A Promise is returned when setting the state, and a boolean when getting
    *         the present state
    */
  def audioOnlyMode(value: Boolean): js.Promise[Unit] = js.native
  
  def audioPosterMode(): Boolean = js.native
  /**
    * Get the current audioPosterMode state or set audioPosterMode to true or false
    *
    * @param [value]
    *         The value to set audioPosterMode to.
    *
    * @return A Promise is returned when setting the state, and a boolean when getting
    *         the present state
    */
  def audioPosterMode(value: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Get the remote {@link videojs.AudioTrackList}
    * @return The current remote audio track list
    */
  def audioTracks(): AudioTrackList = js.native
  
  def autoplay(): Autoplay = js.native
  /**
    * Get or set the autoplay option. When this is a boolean it will
    * modify the attribute on the tech. When this is a string the attribute on
    * the tech will be removed and `Player` will handle autoplay on loadstarts.
    *
    * @param [value]
    *        - true: autoplay using the browser behavior
    *        - false: do not autoplay
    *        - 'play': call play() on every loadstart
    *        - 'muted': call muted() then play() on every loadstart
    *        - 'any': call play() on every loadstart. if that fails call muted() then play().
    *        - *: values other than those listed here will be set `autoplay` to true
    *
    * @return The current value of autoplay when getting
    */
  def autoplay(value: Autoplay): Unit = js.native
  
  var bigPlayButton: Button = js.native
  
  def breakpoints(): Breakpoint = js.native
  /**
    * Get or set breakpoints on the player.
    *
    * Calling this method with an object or `true` will remove any previous
    * custom breakpoints and start from the defaults again.
    *
    * @param  [breakpoints]
    *         If an object is given, it can be used to provide custom
    *         breakpoints. If `true` is given, will set default breakpoints.
    *         If this argument is not given, will simply return the current
    *         breakpoints.
    *
    * @param  [breakpoints.tiny]
    *         The maximum width for the "vjs-layout-tiny" class.
    *
    * @param  [breakpoints.xsmall]
    *         The maximum width for the "vjs-layout-x-small" class.
    *
    * @param  [breakpoints.small]
    *         The maximum width for the "vjs-layout-small" class.
    *
    * @param  [breakpoints.medium]
    *         The maximum width for the "vjs-layout-medium" class.
    *
    * @param  [breakpoints.large]
    *         The maximum width for the "vjs-layout-large" class.
    *
    * @param  [breakpoints.xlarge]
    *         The maximum width for the "vjs-layout-x-large" class.
    *
    * @param  [breakpoints.huge]
    *         The maximum width for the "vjs-layout-huge" class.
    *
    * @return An object mapping breakpoint names to maximum width values.
    */
  def breakpoints(breakpoints: PartialBreakpoint): Unit = js.native
  @JSName("breakpoints")
  def breakpoints_true(breakpoints: `true`): Unit = js.native
  
  /**
    * Get a TimeRange object with an array of the times of the video
    * that have been downloaded. If you just want the percent of the
    * video that's been downloaded, use bufferedPercent.
    *
    * @see [Buffered Spec]{@link http://dev.w3.org/html5/spec/video.html#dom-media-buffered}
    *
    * @return A mock TimeRange object (following HTML spec)
    */
  def buffered(): TimeRange = js.native
  
  /**
    * Get the ending time of the last buffered time range
    * This is used in the progress bar to encapsulate all time ranges.
    *
    * @return The end of the last buffered time range
    */
  def bufferedEnd(): Double = js.native
  
  /**
    * Get the percent (as a decimal) of the video that's been downloaded.
    * This method is not a part of the native HTML video API.
    *
    * @return A decimal between 0 and 1 representing the percent
    *         that is buffered 0 being 0% and 1 being 100%
    */
  def bufferedPercent(): Double = js.native
  
  /**
    * Check whether the player can play a given mimetype
    *
    * @see https://www.w3.org/TR/2011/WD-html5-20110113/video.html#dom-navigator-canplaytype
    *
    * @param type
    *        The mimetype to check
    *
    * @return 'probably', 'maybe', or '' (empty string)
    */
  def canPlayType(`type`: String): CanPlayTypeResult = js.native
  
  def cancelFullScreen(): Player = js.native
  
  var controlBar: ControlBar = js.native
  
  def controls(): Boolean = js.native
  /**
    * Get or set whether or not the controls are showing.
    *
    * @fires Player#controlsenabled
    *
    * @param [bool]
    *        - true to turn controls on
    *        - false to turn controls off
    *
    * @return The current value of controls when getting
    */
  def controls(bool: Boolean): Unit = js.native
  
  /**
    * Creates a simple modal dialog (an instance of the {@link ModalDialog}
    * component) that immediately overlays the player with arbitrary
    * content and removes itself when closed.
    *
    * @param content
    *        Same as {@link ModalDialog#content}'s param of the same name.
    *        The most straight-forward usage is to provide a string or DOM
    *        element.
    *
    * @param [options]
    *        Extra options which will be passed on to the {@link ModalDialog}.
    * @check
    * @return the {@link ModalDialog} that was created
    */
  def createModal(content: String, options: Any): ModalDialog = js.native
  def createModal(content: js.Array[Any], options: Any): ModalDialog = js.native
  def createModal(content: js.Function0[Any], options: Any): ModalDialog = js.native
  def createModal(content: Element, options: Any): ModalDialog = js.native
  
  def crossOrigin(): String = js.native
  /**
    * Get or set the `Player`'s crossOrigin option. For the HTML5 player, this
    * sets the `crossOrigin` property on the `<video>` tag to control the CORS
    * behavior.
    *
    * @param [value]
    *        The value to set the `Player`'s crossOrigin to. If an argument is
    *        given, must be one of `anonymous` or `use-credentials`.
    *
    * @return - The current crossOrigin value of the `Player` when getting.
    *         - undefined when setting
    */
  def crossOrigin(value: anonymous | `use-credentials`): Unit = js.native
  
  /**
    * Get current breakpoint name, if any.
    *
    * @return If there is currently a breakpoint set, returns a the key from the
    *         breakpoints object matching it. Otherwise, returns an empty string.
    */
  def currentBreakpoint(): String = js.native
  
  /**
    * Get the current breakpoint class name.
    *
    * @return The matching class name (e.g. `"vjs-layout-tiny"` or
    *         `"vjs-layout-large"`) for the current breakpoint. Empty string if
    *         there is no current breakpoint.
    */
  def currentBreakpointClass(): String = js.native
  
  /**
    * Returns the current source object.
    *
    * @return The current source object
    */
  def currentSource(): SourceObject = js.native
  
  /**
    * Returns all of the current source objects.
    *
    * @return The current source objects
    */
  def currentSources(): js.Array[SourceObject] = js.native
  
  /**
    * Returns the fully qualified URL of the current source value e.g. http://mysite.com/video.mp4
    * Can be used in conjunction with `currentType` to assist in rebuilding the current source object.
    *
    * @return The current source
    */
  def currentSrc(): String = js.native
  
  def currentTime(): Double = js.native
  /**
    * Get or set the current time (in seconds)
    *
    * @param [seconds]
    *        The time to seek to in seconds
    *
    * @return - the current time in seconds when getting
    */
  def currentTime(seconds: Double): Unit = js.native
  
  /**
    * Get the current source type e.g. video/mp4
    * This can allow you rebuild the current source object so that you could load the same
    * source and tech later
    *
    * @return The source MIME type
    */
  def currentType(): String = js.native
  
  /**
    * Set debug mode to enable/disable logs at info level.
    *
    * @param enabled
    */
  def debug(enabled: Boolean): Unit = js.native
  
  def defaultMuted(): Boolean = js.native
  /**
    * Get the current defaultMuted state, or turn defaultMuted on or off. defaultMuted
    * indicates the state of muted on initial playback.
    *
    * ```js
    *   var myPlayer = videojs('some-player-id');
    *
    *   myPlayer.src("http://www.example.com/path/to/video.mp4");
    *
    *   // get, should be false
    *   console.log(myPlayer.defaultMuted());
    *   // set to true
    *   myPlayer.defaultMuted(true);
    *   // get should be true
    *   console.log(myPlayer.defaultMuted());
    * ```
    *
    * @param [defaultMuted]
    *        - true to mute
    *        - false to unmute
    *
    * @return - true if defaultMuted is on and getting
    *         - false if defaultMuted is off and getting
    *         - A reference to the current player when setting
    */
  def defaultMuted(defaultMuted: Boolean): Unit = js.native
  
  def defaultPlaybackRate(): Boolean = js.native
  /**
    * Gets or sets the current default playback rate. A default playback rate of
    * 1.0 represents normal speed and 0.5 would indicate half-speed playback, for instance.
    * defaultPlaybackRate will only represent what the initial playbackRate of a video was, not
    * not the current playbackRate.
    *
    * @see https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-defaultplaybackrate
    *
    * @param [rate]
    *       New default playback rate to set.
    *
    * @return - The default playback rate when getting or 1.0
    *         - the player when setting
    */
  def defaultPlaybackRate(rate: Double): Player = js.native
  
  /**
    * Disable Picture-in-Picture mode.
    *
    * @param value
    *        - true will disable Picture-in-Picture mode
    *        - false will enable Picture-in-Picture mode
    */
  def disablePictureInPicture(value: Boolean): Unit = js.native
  
  def duration(): Double = js.native
  /**
    * Normally gets the length in time of the video in seconds;
    * in all but the rarest use cases an argument will NOT be passed to the method
    *
    * > **NOTE**: The video must have started loading before the duration can be
    * known, and in the case of Flash, may not be known until the video starts
    * playing.
    *
    *
    * @fires Player#durationchange
    *
    * @param [seconds]
    *        The duration of the video to set in seconds
    *
    * @return - The duration of the video in seconds when getting
    */
  def duration(seconds: Double): Unit = js.native
  
  /**
    * Get the value of `ended` from the media element. `ended` indicates whether
    * the media has reached the end or not.
    *
    * @return - The value of `ended` from the media element.
    *         - True indicates that the media has ended.
    *         - False indicates that the media has not ended.
    *
    * @see [Spec]{@link https://www.w3.org/TR/html5/embedded-content-0.html#dom-media-ended}
    */
  def ended(): Boolean = js.native
  
  /**
    * When fullscreen isn't supported we can stretch the
    * video container to as wide as the browser will let us.
    *
    * @fires Player#enterFullWindow
    */
  def enterFullWindow(): Unit = js.native
  
  def error(): MediaError | Null = js.native
  def error(err: String): Unit = js.native
  def error(err: Double): Unit = js.native
  def error(err: MediaError): Unit = js.native
  
  var errorDisplay: ModalDialog = js.native
  
  /**
    * Set or get the current MediaError
    *
    * @fires Player#error
    *
    * @param [err]
    *         A MediaError or a string/number to be turned
    *         into a MediaError
    *
    * @return The current MediaError when getting (or null)
    */
  @JSName("error")
  def error_Unit(): Unit = js.native
  
  /**
    * Exit full window
    *
    * @fires Player#exitFullWindow
    */
  def exitFullWindow(): Unit = js.native
  
  /**
    * Return the video to its normal size after having been in full screen mode
    *
    * @fires Player#fullscreenchange //noinspection JSUnresolvedVariable
    */
  def exitFullscreen(): Player = js.native
  
  /**
    * Exit Picture-in-Picture mode.
    *
    * @see [Spec]{@link https://wicg.github.io/picture-in-picture}
    *
    * @fires Player#leavepictureinpicture
    */
  def exitPictureInPicture(): js.Promise[Unit] = js.native
  
  def fill(): Boolean = js.native
  /**
    * Get or set a flag indicating whether or not this player should fill out its container.
    *
    * @param [bool] Should be `true` if the player should fill its container; otherwise it should be false.
    *
    * @return Will be `true` if this player should fill its container;
    * otherwise, will be `false`.
    */
  def fill(bool: Boolean): Unit = js.native
  
  def fluid(): Boolean = js.native
  /**
    * A getter/setter/toggler for the vjs-fluid `className` on the `Player`.
    *
    * @param [bool]
    *        - A value of true adds the class.
    *        - A value of false removes the class.
    *        - No value will toggle the fluid class.
    *
    * @return - The value of fluid when getting.
    *         - `undefined` when setting.
    */
  def fluid(bool: Boolean): Unit = js.native
  
  /**
    * Get object for cached values.
    *
    * @return get the current object cache
    */
  def getCache(): Any = js.native
  
  /**
    * Get a clone of the current Player~MediaObject for this player.
    * If the loadMedia method has not been used, will attempt to return a Player~MediaObject based on the current state of the player.
    */
  def getMedia(): MediaObject = js.native
  
  /**
    * Gets available media playback quality metrics as specified by the W3C's Media
    * Playback Quality API.
    *
    * @see [Spec]{@link https://wicg.github.io/media-playback-quality}
    *
    * @return An object with supported media playback quality metrics or undefined if there
    *         is no tech or the tech does not support it.
    */
  def getVideoPlaybackQuality(): Any = js.native
  
  /**
    * Reports whether or not a player has a plugin available.
    *
    * This does not report whether or not the plugin has ever been initialized
    * on this player. For that, [usingPlugin]{@link Player#usingPlugin}.
    *
    * @param name
    *         The name of a plugin.
    *
    * @return Whether or not this player has the requested plugin available.
    */
  def hasPlugin(name: String): Boolean = js.native
  
  def hasStarted(): Boolean = js.native
  /**
    * Add/remove the vjs-has-started class
    *
    * @fires Player#firstplay
    *
    * @param request
    *        - true: adds the class
    *        - false: remove the class
    *
    * @return the boolean value of hasStarted_
    */
  def hasStarted(request: Boolean): Unit = js.native
  
  def isAudio(): Boolean = js.native
  /**
    * Gets or sets the audio flag
    *
    * @param bool
    *        - true signals that this is an audio player
    *        - false signals that this is not an audio player
    *
    * @return The current value of isAudio when getting
    */
  def isAudio(bool: Boolean): Unit = js.native
  
  def isFullscreen(): Boolean = js.native
  /**
    * Check if the player is in fullscreen mode or tell the player that it
    * is or is not in fullscreen mode.
    *
    * > NOTE: As of the latest HTML5 spec, isFullscreen is no longer an official
    * property and instead document.fullscreenElement is used. But isFullscreen is
    * still a valuable property for internal player workings.
    *
    * @param [isFS]
    *         Set the players current fullscreen state
    *
    * @return - true if fullscreen is on and getting
    *         - false if fullscreen is off and getting
    */
  def isFullscreen(isFS: Boolean): Unit = js.native
  
  def isInPictureInPicture(): Boolean = js.native
  /**
    * Check if the player is in Picture-in-Picture mode or tell the player that it
    * is or is not in Picture-in-Picture mode.
    *
    * @param  [isPiP]
    *         Set the players current Picture-in-Picture state
    *
    * @return - true if Picture-in-Picture is on and getting
    *         - false if Picture-in-Picture is off and getting
    */
  def isInPictureInPicture(isPiP: Boolean): Unit = js.native
  
  def language(): String = js.native
  /**
    * The player's language code
    * NOTE: The language should be set in the player options if you want the
    * the controls to be built with a specific language. Changing the language
    * later will not update controls text.
    *
    * @param [code]
    *        the language code to set the player to
    *
    * @return The current language code when getting
    */
  def language(code: String): Unit = js.native
  
  def languageSwitch(options: Any): Unit = js.native
  
  /**
    * Get the player's language dictionary
    * Merge every time, because a newly added plugin might call videojs.addLanguage() at any time
    * Languages specified directly in the player options have precedence
    *
    * @return An array of of supported languages
    */
  def languages(): js.Array[String] = js.native
  
  var liveTracker: LiveTracker = js.native
  
  /**
    * Begin loading the src data.
    */
  def load(): Unit = js.native
  
  /**
    * Populate the player using a MediaObject.
    */
  def loadMedia(media: MediaObject, ready: js.Function0[Any]): Unit = js.native
  
  var loadingSpinner: Component = js.native
  
  def loop(): Boolean = js.native
  /**
    * Get or set the loop attribute on the video element.
    *
    * @param [value]
    *        - true means that we should loop the video
    *        - false means that we should not loop the video
    *
    * @return The current value of loop when getting
    */
  def loop(value: Boolean): Unit = js.native
  
  def muted(): Boolean = js.native
  /**
    * Get the current muted state, or turn mute on or off
    *
    * @param [muted]
    *        - true to mute
    *        - false to unmute
    *
    * @return - true if mute is on and getting
    *         - false if mute is off and getting
    */
  def muted(muted: Boolean): Unit = js.native
  
  /**
    * Returns the current state of network activity for the element
    *
    * @return The current network state
    */
  def networkState(): NetworkState = js.native
  
  @JSName("options_")
  var options__VideoJsPlayer: PlayerOptions = js.native
  
  /**
    * Pause the video playback
    * @check
    * @return A reference to the player object this function was called on
    */
  def pause(): Player = js.native
  
  /**
    * Check if the player is paused or has yet to play
    *
    * @return - false: if the media is currently playing
    *         - true: if media is not currently playing
    */
  def paused(): Boolean = js.native
  
  /**
    * Attempt to begin playback at the first opportunity.
    * @check
    * @return Returns a `Promise` only if the browser returns one and the player
    *         is ready to begin playback. For some browsers and all non-ready
    *         situations, this will return `undefined`.
    */
  def play(): js.UndefOr[js.Promise[Unit]] = js.native
  
  def playbackRate(): Double = js.native
  /**
    * Gets or sets the current playback rate. A playback rate of
    * 1.0 represents normal speed and 0.5 would indicate half-speed
    * playback, for instance.
    *
    * @see https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-playbackrate
    *
    * @param [rate]
    *       New playback rate to set.
    *
    * @return The current playback rate when getting or 1.0
    */
  def playbackRate(rate: Double): Unit = js.native
  
  def playbackRates(): js.Array[Double] = js.native
  /**
    * Set or get current playback rates.
    * Takes an array and updates the playback rates menu with the new items.
    * Pass in an empty array to hide the menu.
    */
  def playbackRates(rates: js.Array[Double]): Unit = js.native
  
  /**
    * Get a TimeRange object representing the current ranges of time that the user
    * has played.
    * @check
    * @return A time range object that represents all the increments of time that have
    *         been played.
    */
  def played(): TimeRanges = js.native
  
  def playsinline(): String = js.native
  /**
    * Set or unset the playsinline attribute.
    * Playsinline tells the browser that non-fullscreen playback is preferred.
    *
    * @param [value]
    *        - true means that we should try to play inline by default
    *        - false means that we should use the browser's default playback mode,
    *          which in most cases is inline. iOS Safari is a notable exception
    *          and plays fullscreen by default.
    *
    * @return - the current value of playsinline
    *         - the player when setting
    *
    * @see [Spec]{@link https://html.spec.whatwg.org/#attr-video-playsinline}
    */
  def playsinline(value: Boolean): Player = js.native
  
  def poster(): String = js.native
  /**
    * Get or set the poster image source url
    *
    * @fires Player#posterchange
    *
    * @param [src]
    *        Poster image source URL
    *
    * @return The current value of poster when getting
    */
  def poster(src: String): Unit = js.native
  
  /**
    * Get or set the preload attribute
    *
    * @param [value]
    *        - true means that we should preload
    *        - false means that we should not preload
    *
    * @return The preload attribute value when getting
    */
  def preload(): String = js.native
  def preload(value: Boolean): String = js.native
  
  /**
    * Returns a value that expresses the current state of the element
    * with respect to rendering the current playback position.
    */
  def readyState(): ReadyState = js.native
  
  /**
    * Calculates how much time is left in the video. Not part
    * of the native video API.
    *
    * @return The time remaining in seconds
    */
  def remainingTime(): Double = js.native
  
  /**
    * A remaining time function that is intented to be used when
    * the time is to be displayed directly to the user.
    *
    * @return The rounded time remaining in seconds
    */
  def remainingTimeDisplay(): Double = js.native
  
  /**
    * Get the remote {@link TextTrackList}
    * @return The current remote text track list
    */
  def remoteTextTracks(): TextTrackList = js.native
  
  /**
    * Remove a remote {@link TextTrack} from the respective
    * {@link TextTrackList} and {@link HtmlTrackElementList}.
    *
    * @param track
    *        Remote {@link TextTrack} to remove
    *
    * @return does not return anything
    */
  def removeRemoteTextTrack(track: HTMLTrackElement): Unit = js.native
  
  /**
    * Report user activity
    *
    * @param event
    *        Event object
    */
  def reportUserActivity(event: Any): Unit = js.native
  
  /**
    * Increase the size of the video to full screen
    * In some browsers, full screen is not supported natively, so it enters
    * "full window mode", where the video fills the browser window.
    * In browsers and devices that support native full screen, sometimes the
    * browser's default controls will be shown, and not the Video.js custom skin.
    * This includes most mobile devices (iOS, Android) and older versions of
    * Safari.
    *
    * @fires Player#fullscreenchange
    */
  def requestFullscreen(): Player = js.native
  
  /**
    * Create a floating video window always on top of other windows so that
    * users may continue consuming media while they interact with other
    * content sites, or applications on their device.
    *
    * @see [Spec]{@link https://wicg.github.io/picture-in-picture}
    *
    * @fires Player#enterpictureinpicture
    */
  def requestPictureInPicture(): js.Promise[PictureInPictureWindow] = js.native
  
  /**
    * Reset the player. Loads the first tech in the techOrder,
    * and calls `reset` on the tech`.
    */
  def reset(): Unit = js.native
  
  def responsive(): Boolean = js.native
  /**
    * Get or set a flag indicating whether or not this player should adjust its
    * UI based on its dimensions.
    *
    * @param [value] Should be `true` if the player should adjust its UI based
    * on its dimensions; otherwise, should be `false`.
    *
    * @return Will be `true` if this player should adjust its UI based on its
    * dimensions; otherwise, will be `false`.
    */
  def responsive(value: Boolean): Unit = js.native
  
  def scrubbing(): Boolean = js.native
  /**
    * Returns whether or not the user is "scrubbing". Scrubbing is
    * when the user has clicked the progress bar handle and is
    * dragging it along the progress bar.
    *
    * @param [isScrubbing]
    *        whether the user is or is not scrubbing
    *
    * @return The value of scrubbing when getting
    */
  def scrubbing(isScrubbing: Boolean): Unit = js.native
  
  /**
    * Returns the TimeRanges of the media that are currently available for seeking to.
    *
    * @return TimeRanges Returns the TimeRanges of the media that are currently available for seeking to.
    */
  def seekable(): TimeRanges = js.native
  
  /**
    * Returns whether or not the player is in the "seeking" state.
    *
    * @return boolean True if the player is in the seeking state, false if not.
    */
  def seeking(): Boolean = js.native
  
  /**
    * Select source based on tech-order or source-order
    * Uses source-order selection if `options.sourceOrder` is truthy. Otherwise,
    * defaults to tech-order selection
    *
    * @param sources
    *        The sources for a media asset
    *
    * @return Object of source and tech order or false
    */
  def selectSource(sources: js.Array[Any]): Any = js.native
  
  def src(): String = js.native
  /**
    * Get or set the video source.
    *
    * @param [source]
    *        A SourceObject, an array of SourceObjects, or a string referencing
    *        a URL to a media source. It is _highly recommended_ that an object
    *        or array of objects is used here, so that source selection
    *        algorithms can take the `type` into account.
    *
    *        If not provided, this method acts as a getter.
    *
    * @return If the `source` argument is missing, returns the current source
    *         URL. Otherwise, returns nothing/undefined.
    */
  def src(source: String): Unit = js.native
  def src(source: js.Array[SourceObject]): Unit = js.native
  def src(source: SourceObject): Unit = js.native
  
  /**
    * Check if current tech can support native fullscreen
    * (e.g. with built in controls like iOS, so not our flash swf)
    *
    * @return if native fullscreen is supported
    */
  def supportsFullScreen(): Boolean = js.native
  
  /**
    * Return a reference to the current {@link Tech}.
    * It will print a warning by default about the danger of using the tech directly
    * but any argument that is passed in will silence the warning.
    *
    * @param [safety]
    *        Anything passed in to silence the warning
    *
    * @return The Tech
    */
  def tech(): Tech = js.native
  def tech(safety: Any): Tech = js.native
  
  /**
    * Get the remote {@link TextTrackList}
    * @return The current remote text track list
    */
  def textTracks(): TextTrackList = js.native
  
  /**
    * returns a JavaScript object reperesenting the current track
    * information. **DOES not return it as JSON**
    *
    * @return Object representing the current of track info
    */
  def toJSON(): Any = js.native
  
  def userActive(): Boolean = js.native
  /**
    * Get/set if user is active
    *
    * @fires Player#useractive
    * @fires Player#userinactive
    *
    * @param [bool]
    *        - true if the user is active
    *        - false if the user is inactive
    *
    * @return The current value of userActive when getting
    */
  def userActive(bool: Boolean): Unit = js.native
  
  var userActive_ : Boolean = js.native
  
  var userActivity_ : Boolean = js.native
  
  def usingNativeControls(): Boolean = js.native
  /**
    * Toggle native controls on/off. Native controls are the controls built into
    * devices (e.g. default iPhone controls), Flash, or other techs
    * (e.g. Vimeo Controls)
    * **This should only be set by the current tech, because only the tech knows
    * if it can support native controls**
    *
    * @fires Player#usingnativecontrols
    * @fires Player#usingcustomcontrols
    *
    * @param [bool]
    *        - true to turn native controls on
    *        - false to turn native controls off
    *
    * @return The current value of native controls when getting
    */
  def usingNativeControls(bool: Boolean): Unit = js.native
  
  /**
    * Reports whether or not a player is using a plugin by name.
    *
    * For basic plugins, this only reports whether the plugin has _ever_ been
    * initialized on this player.
    *
    * @param name
    *         The name of a plugin.
    *
    * @return Whether or not this player is using the requested plugin.
    */
  def usingPlugin(name: String): Boolean = js.native
  
  /**
    * Get video height
    *
    * @return current video height
    */
  def videoHeight(): Double = js.native
  
  /**
    * Get video width
    *
    * @return current video width
    */
  def videoWidth(): Double = js.native
  
  def volume(): Double = js.native
  /**
    * Get or set the current volume of the media
    *
    * @param [percentAsDecimal]
    *         The new volume as a decimal percent:
    *         - 0 is muted/0%/off
    *         - 1.0 is 100%/full
    *         - 0.5 is half volume or 50%
    *
    * @return The current volume as a percent when getting
    */
  def volume(percentAsDecimal: Double): TimeRange = js.native
}

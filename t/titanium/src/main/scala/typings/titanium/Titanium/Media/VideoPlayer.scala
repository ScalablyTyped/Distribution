package typings.titanium.Titanium.Media

import typings.titanium.MovieSize
import typings.titanium.ThumbnailResponse
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.complete
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.durationavailable
import typings.titanium.titaniumStrings.error
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.load
import typings.titanium.titaniumStrings.loadstate
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.naturalsizeavailable
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.playbackstate
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.preload
import typings.titanium.titaniumStrings.resize
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A native control for playing videos.
  */
@js.native
trait VideoPlayer extends View {
  
  @JSName("addEventListener")
  def addEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationavailable(
    name: durationavailable,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerDurationavailableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    name: error,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerErrorEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    name: load,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerLoadEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstate(
    name: loadstate,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerLoadstateEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_naturalsizeavailable(
    name: naturalsizeavailable,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerNaturalsizeavailableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackstate(
    name: playbackstate,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerPlaybackstateEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    name: typings.titanium.titaniumStrings.playing,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerPlayingEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_preload(
    name: preload,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerPreloadEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    name: resize,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerResizeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Whether or not the current movie can be played on a remote device.
    */
  var allowsAirPlay: Boolean = js.native
  
  /**
    * Indicates if a movie should automatically start playback.
    */
  var autoplay: Boolean = js.native
  
  /**
    * Sets the background view for customization which is always displayed behind movie content.
    * @deprecated Use [Titanium.Media.VideoPlayer.overlayView](Titanium.Media.VideoPlayer.overlayView) instead.
    */
  var backgroundView: View = js.native
  
  /**
    * Cancels all pending asynchronous thumbnail requests.
    */
  def cancelAllThumbnailImageRequests(): Unit = js.native
  
  /**
    * Current playback time of the current movie in milliseconds.
    */
  var currentPlaybackTime: Double = js.native
  
  /**
    * The duration of the current movie in milliseconds, or 0.0 if not known.
    */
  var duration: Double = js.native
  
  /**
    * The end time of movie playback, in milliseconds.
    */
  var endPlaybackTime: Double = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: VideoPlayerClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete, event: VideoPlayerCompleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: VideoPlayerDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: VideoPlayerDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_durationavailable(name: durationavailable): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_durationavailable(name: durationavailable, event: VideoPlayerDurationavailableEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error, event: VideoPlayerErrorEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: VideoPlayerFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: VideoPlayerKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_load(name: load): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_load(name: load, event: VideoPlayerLoadEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_loadstate(name: loadstate): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_loadstate(name: loadstate, event: VideoPlayerLoadstateEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: VideoPlayerLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: VideoPlayerLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_naturalsizeavailable(name: naturalsizeavailable): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_naturalsizeavailable(name: naturalsizeavailable, event: VideoPlayerNaturalsizeavailableEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: VideoPlayerPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_playbackstate(name: playbackstate): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_playbackstate(name: playbackstate, event: VideoPlayerPlaybackstateEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_playing(name: typings.titanium.titaniumStrings.playing): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_playing(name: typings.titanium.titaniumStrings.playing, event: VideoPlayerPlayingEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: VideoPlayerPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_preload(name: preload): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_preload(name: preload, event: VideoPlayerPreloadEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resize(name: resize): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resize(name: resize, event: VideoPlayerResizeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: VideoPlayerSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: VideoPlayerSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: VideoPlayerTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: VideoPlayerTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: VideoPlayerTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: VideoPlayerTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: VideoPlayerTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.allowsAirPlay> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.allowsAirPlay> instead.
    */
  def getAllowsAirPlay(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.autoplay> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.autoplay> instead.
    */
  def getAutoplay(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.backgroundView> property.
    * @deprecated Use [Titanium.Media.VideoPlayer.overlayView](Titanium.Media.VideoPlayer.overlayView) instead.
    */
  def getBackgroundView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.currentPlaybackTime> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.currentPlaybackTime> instead.
    */
  def getCurrentPlaybackTime(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.duration> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.duration> instead.
    */
  def getDuration(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.endPlaybackTime> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.endPlaybackTime> instead.
    */
  def getEndPlaybackTime(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.initialPlaybackTime> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.initialPlaybackTime> instead.
    */
  def getInitialPlaybackTime(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.loadState> property.
    * @deprecated On iOS, use [Titanium.Media.VideoPlayer.moviePlayerStatus](Titanium.Media.VideoPlayer.moviePlayerStatus) instead.
    */
  def getLoadState(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.mediaTypes> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.mediaTypes> instead.
    */
  def getMediaTypes(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.moviePlayerStatus> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.moviePlayerStatus> instead.
    */
  def getMoviePlayerStatus(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.naturalSize> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.naturalSize> instead.
    */
  def getNaturalSize(): MovieSize = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.overlayView> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.overlayView> instead.
    */
  def getOverlayView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.pictureInPictureEnabled> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.pictureInPictureEnabled> instead.
    */
  def getPictureInPictureEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.playableDuration> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.playableDuration> instead.
    */
  def getPlayableDuration(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.playbackState> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.playbackState> instead.
    */
  def getPlaybackState(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.playing> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.playing> instead.
    */
  def getPlaying(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.repeatMode> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.repeatMode> instead.
    */
  def getRepeatMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.scalingMode> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.scalingMode> instead.
    */
  def getScalingMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.showsControls> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.showsControls> instead.
    */
  def getShowsControls(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.url> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.url> instead.
    */
  def getUrl(): String | js.Array[String] = js.native
  
  /**
    * Gets the value of the <Titanium.Media.VideoPlayer.volume> property.
    * @deprecated Access <Titanium.Media.VideoPlayer.volume> instead.
    */
  def getVolume(): Double = js.native
  
  /**
    * The start time of movie playback, in milliseconds.
    */
  var initialPlaybackTime: Double = js.native
  
  /**
    * Returns the network load state of the movie player.
    * @deprecated On iOS, use [Titanium.Media.VideoPlayer.moviePlayerStatus](Titanium.Media.VideoPlayer.moviePlayerStatus) instead.
    */
  val loadState: Double = js.native
  
  /**
    * Media object to play, as either a `File`,  a `Blob`, or a URL.
    */
  var media: Blob | File | String = js.native
  
  /**
    * The types of media in the movie, or <Titanium.Media.VIDEO_MEDIA_TYPE_NONE> if not known.
    */
  var mediaTypes: Double = js.native
  
  /**
    * Returns the status of the movie player.
    */
  val moviePlayerStatus: Double = js.native
  
  /**
    * Returns the natural size of the movie.
    */
  var naturalSize: MovieSize = js.native
  
  /**
    * Use the overlay view to add additional custom views between the video content and the controls.
    */
  var overlayView: View = js.native
  
  /**
    * Pauses playing the video.
    */
  def pause(): Unit = js.native
  
  /**
    * Whether or not the receiver allows Picture in Picture playback.
    */
  var pictureInPictureEnabled: Boolean = js.native
  
  /**
    * Starts playing the video.
    */
  def play(): Unit = js.native
  
  /**
    * Currently playable duration of the movie, in milliseconds, for progressively
    * downloaded network content, or 0.0 if not known.
    */
  val playableDuration: Double = js.native
  
  /**
    * Current playback state of the video player.
    */
  val playbackState: Double = js.native
  
  /**
    * Boolean to indicate if the player has started playing.
    */
  val playing: Boolean = js.native
  
  /**
    * Releases the internal video resources immediately.
    */
  def release(): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationavailable(
    name: durationavailable,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerDurationavailableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    name: error,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerErrorEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    name: load,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerLoadEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstate(
    name: loadstate,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerLoadstateEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_naturalsizeavailable(
    name: naturalsizeavailable,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerNaturalsizeavailableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackstate(
    name: playbackstate,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerPlaybackstateEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    name: typings.titanium.titaniumStrings.playing,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerPlayingEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_preload(
    name: preload,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerPreloadEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    name: resize,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ VideoPlayerResizeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Determines how the movie player repeats when reaching the end of playback.
    */
  var repeatMode: Double = js.native
  
  /**
    * Asynchronously request thumbnail images for one or more points in time in the video.
    */
  def requestThumbnailImagesAtTimes(
    times: js.Array[Double],
    option: Double,
    callback: js.Function1[/* param0 */ ThumbnailResponse, Unit]
  ): Unit = js.native
  
  /**
    * Determines how the content scales to fit the view.
    */
  var scalingMode: Double = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.allowsAirPlay> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.allowsAirPlay> instead.
    */
  def setAllowsAirPlay(allowsAirPlay: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.autoplay> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.autoplay> instead.
    */
  def setAutoplay(autoplay: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.backgroundView> property.
    * @deprecated Use [Titanium.Media.VideoPlayer.overlayView](Titanium.Media.VideoPlayer.overlayView) instead.
    */
  def setBackgroundView(backgroundView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.currentPlaybackTime> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.currentPlaybackTime> instead.
    */
  def setCurrentPlaybackTime(currentPlaybackTime: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.duration> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.duration> instead.
    */
  def setDuration(duration: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.endPlaybackTime> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.endPlaybackTime> instead.
    */
  def setEndPlaybackTime(endPlaybackTime: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.initialPlaybackTime> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.initialPlaybackTime> instead.
    */
  def setInitialPlaybackTime(initialPlaybackTime: Double): Unit = js.native
  
  def setMedia(media: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.media> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.media> instead.
    */
  def setMedia(media: Blob): Unit = js.native
  def setMedia(media: File): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.mediaTypes> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.mediaTypes> instead.
    */
  def setMediaTypes(mediaTypes: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.naturalSize> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.naturalSize> instead.
    */
  def setNaturalSize(naturalSize: MovieSize): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.overlayView> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.overlayView> instead.
    */
  def setOverlayView(overlayView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.pictureInPictureEnabled> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.pictureInPictureEnabled> instead.
    */
  def setPictureInPictureEnabled(pictureInPictureEnabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.repeatMode> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.repeatMode> instead.
    */
  def setRepeatMode(repeatMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.scalingMode> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.scalingMode> instead.
    */
  def setScalingMode(scalingMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.showsControls> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.showsControls> instead.
    */
  def setShowsControls(showsControls: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.url> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.url> instead.
    */
  def setUrl(url: String): Unit = js.native
  def setUrl(url: js.Array[String]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.VideoPlayer.volume> property.
    * @deprecated Set the value using <Titanium.Media.VideoPlayer.volume> instead.
    */
  def setVolume(volume: Double): Unit = js.native
  
  /**
    * Whether or not the receiver shows playback controls. Default is true.
    */
  var showsControls: Boolean = js.native
  
  /**
    * Stops playing the video.
    */
  def stop(): Unit = js.native
  
  /**
    * URL of the media to play.
    */
  var url: String | js.Array[String] = js.native
  
  /**
    * Volume of the audio portion of the video.
    */
  var volume: Double = js.native
}

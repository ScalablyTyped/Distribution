package typings.titanium.Titanium.Media

import typings.titanium.MovieSize
import typings.titanium.ThumbnailResponse
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A native control for playing videos.
		 */
@js.native
trait VideoPlayer extends View {
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
  			 */
  var backgroundView: View = js.native
  /**
  			 * URL of the media to play.
  			 */
  var contentURL: String = js.native
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
  /**
  			 * Determines if the movie is presented in the entire screen (obscuring all other application content).
  			 */
  var fullscreen: Boolean = js.native
  /**
  			 * The start time of movie playback, in milliseconds.
  			 */
  var initialPlaybackTime: Double = js.native
  /**
  			 * Returns the network load state of the movie player.
  			 */
  val loadState: Double = js.native
  /**
  			 * Media object to play, as either a `File`,  a `Blob`, or a URL.
  			 */
  var media: Blob | File | String = js.native
  /**
  			 * The style of the playback controls.
  			 */
  var mediaControlStyle: Double = js.native
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
  			 * Whether or not the receiver allows Picture in Picture playback.
  			 */
  var pictureInPictureEnabled: Boolean = js.native
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
  			 * Determines how the movie player repeats when reaching the end of playback.
  			 */
  var repeatMode: Double = js.native
  /**
  			 * Determines how the content scales to fit the view.
  			 */
  var scalingMode: Double = js.native
  /**
  			 * Whether or not the receiver shows playback controls. Default is true.
  			 */
  var showsControls: Boolean = js.native
  /**
  			 * The playback type of the movie.
  			 */
  var sourceType: Double = js.native
  /**
  			 * URL of the media to play.
  			 */
  var url: String | js.Array[String] = js.native
  /**
  			 * Volume of the audio portion of the video.
  			 */
  var volume: Double = js.native
  /**
  			 * Cancels all pending asynchronous thumbnail requests.
  			 */
  def cancelAllThumbnailImageRequests(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.allowsAirPlay> property.
  			 */
  def getAllowsAirPlay(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.autoplay> property.
  			 */
  def getAutoplay(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.backgroundView> property.
  			 */
  def getBackgroundView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.contentURL> property.
  			 */
  def getContentURL(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.currentPlaybackTime> property.
  			 */
  def getCurrentPlaybackTime(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.duration> property.
  			 */
  def getDuration(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.endPlaybackTime> property.
  			 */
  def getEndPlaybackTime(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.fullscreen> property.
  			 */
  def getFullscreen(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.initialPlaybackTime> property.
  			 */
  def getInitialPlaybackTime(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.loadState> property.
  			 */
  def getLoadState(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.mediaControlStyle> property.
  			 */
  def getMediaControlStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.mediaTypes> property.
  			 */
  def getMediaTypes(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.moviePlayerStatus> property.
  			 */
  def getMoviePlayerStatus(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.naturalSize> property.
  			 */
  def getNaturalSize(): MovieSize = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.overlayView> property.
  			 */
  def getOverlayView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.pictureInPictureEnabled> property.
  			 */
  def getPictureInPictureEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.playableDuration> property.
  			 */
  def getPlayableDuration(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.playbackState> property.
  			 */
  def getPlaybackState(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.playing> property.
  			 */
  def getPlaying(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.repeatMode> property.
  			 */
  def getRepeatMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.scalingMode> property.
  			 */
  def getScalingMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.showsControls> property.
  			 */
  def getShowsControls(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.sourceType> property.
  			 */
  def getSourceType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.url> property.
  			 */
  def getUrl(): String | js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.volume> property.
  			 */
  def getVolume(): Double = js.native
  /**
  			 * Pauses playing the video.
  			 */
  def pause(): Unit = js.native
  /**
  			 * Starts playing the video.
  			 */
  def play(): Unit = js.native
  /**
  			 * Releases the internal video resources immediately.
  			 */
  def release(): Unit = js.native
  /**
  			 * Asynchronously request thumbnail images for one or more points in time in the video.
  			 */
  def requestThumbnailImagesAtTimes(times: js.Array[Double], option: Double, callback: js.Function1[/* param0 */ ThumbnailResponse, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.allowsAirPlay> property.
  			 */
  def setAllowsAirPlay(allowsAirPlay: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.autoplay> property.
  			 */
  def setAutoplay(autoplay: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.backgroundView> property.
  			 */
  def setBackgroundView(backgroundView: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.contentURL> property.
  			 */
  def setContentURL(contentURL: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.currentPlaybackTime> property.
  			 */
  def setCurrentPlaybackTime(currentPlaybackTime: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.duration> property.
  			 */
  def setDuration(duration: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.endPlaybackTime> property.
  			 */
  def setEndPlaybackTime(endPlaybackTime: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.initialPlaybackTime> property.
  			 */
  def setInitialPlaybackTime(initialPlaybackTime: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.media> property.
  			 */
  def setMedia(media: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.media> property.
  			 */
  def setMedia(media: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.media> property.
  			 */
  def setMedia(media: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.mediaControlStyle> property.
  			 */
  def setMediaControlStyle(mediaControlStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.mediaTypes> property.
  			 */
  def setMediaTypes(mediaTypes: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.naturalSize> property.
  			 */
  def setNaturalSize(naturalSize: MovieSize): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.overlayView> property.
  			 */
  def setOverlayView(overlayView: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.pictureInPictureEnabled> property.
  			 */
  def setPictureInPictureEnabled(pictureInPictureEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.repeatMode> property.
  			 */
  def setRepeatMode(repeatMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.scalingMode> property.
  			 */
  def setScalingMode(scalingMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.showsControls> property.
  			 */
  def setShowsControls(showsControls: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.sourceType> property.
  			 */
  def setSourceType(sourceType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.url> property.
  			 */
  def setUrl(url: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.url> property.
  			 */
  def setUrl(url: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.volume> property.
  			 */
  def setVolume(volume: Double): Unit = js.native
  /**
  			 * Stops playing the video.
  			 */
  def stop(): Unit = js.native
  /**
  			 * Returns a thumbnail image for the video at the specified time.
  			 */
  def thumbnailImageAtTime(time: Double, option: Double): Blob = js.native
}


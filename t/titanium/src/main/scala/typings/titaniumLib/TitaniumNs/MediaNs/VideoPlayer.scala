package typings
package titaniumLib.TitaniumNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A native control for playing videos.
		 */
@js.native
trait VideoPlayer
  extends titaniumLib.TitaniumNs.UINs.View {
  /**
  			 * Whether or not the current movie can be played on a remote device.
  			 */
  var allowsAirPlay: scala.Boolean = js.native
  /**
  			 * Indicates if a movie should automatically start playback.
  			 */
  var autoplay: scala.Boolean = js.native
  /**
  			 * Sets the background view for customization which is always displayed behind movie content.
  			 */
  var backgroundView: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  			 * URL of the media to play.
  			 */
  var contentURL: java.lang.String = js.native
  /**
  			 * Current playback time of the current movie in milliseconds.
  			 */
  var currentPlaybackTime: scala.Double = js.native
  /**
  			 * The duration of the current movie in milliseconds, or 0.0 if not known.
  			 */
  var duration: scala.Double = js.native
  /**
  			 * The end time of movie playback, in milliseconds.
  			 */
  var endPlaybackTime: scala.Double = js.native
  /**
  			 * Determines if the movie is presented in the entire screen (obscuring all other application content).
  			 */
  var fullscreen: scala.Boolean = js.native
  /**
  			 * The start time of movie playback, in milliseconds.
  			 */
  var initialPlaybackTime: scala.Double = js.native
  /**
  			 * Returns the network load state of the movie player.
  			 */
  val loadState: scala.Double = js.native
  /**
  			 * Media object to play, as either a `File`,  a `Blob`, or a URL.
  			 */
  var media: titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File | java.lang.String = js.native
  /**
  			 * The style of the playback controls.
  			 */
  var mediaControlStyle: scala.Double = js.native
  /**
  			 * The types of media in the movie, or <Titanium.Media.VIDEO_MEDIA_TYPE_NONE> if not known.
  			 */
  var mediaTypes: scala.Double = js.native
  /**
  			 * Returns the status of the movie player.
  			 */
  val moviePlayerStatus: scala.Double = js.native
  /**
  			 * Returns the natural size of the movie.
  			 */
  var naturalSize: titaniumLib.MovieSize = js.native
  /**
  			 * Use the overlay view to add additional custom views between the video content and the controls.
  			 */
  var overlayView: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  			 * Whether or not the receiver allows Picture in Picture playback.
  			 */
  var pictureInPictureEnabled: scala.Boolean = js.native
  /**
  			 * Currently playable duration of the movie, in milliseconds, for progressively
  			 * downloaded network content, or 0.0 if not known.
  			 */
  val playableDuration: scala.Double = js.native
  /**
  			 * Current playback state of the video player.
  			 */
  val playbackState: scala.Double = js.native
  /**
  			 * Boolean to indicate if the player has started playing.
  			 */
  val playing: scala.Boolean = js.native
  /**
  			 * Determines how the movie player repeats when reaching the end of playback.
  			 */
  var repeatMode: scala.Double = js.native
  /**
  			 * Determines how the content scales to fit the view.
  			 */
  var scalingMode: scala.Double = js.native
  /**
  			 * Whether or not the receiver shows playback controls. Default is true.
  			 */
  var showsControls: scala.Boolean = js.native
  /**
  			 * The playback type of the movie.
  			 */
  var sourceType: scala.Double = js.native
  /**
  			 * URL of the media to play.
  			 */
  var url: java.lang.String | js.Array[java.lang.String] = js.native
  /**
  			 * Volume of the audio portion of the video.
  			 */
  var volume: scala.Double = js.native
  /**
  			 * Cancels all pending asynchronous thumbnail requests.
  			 */
  def cancelAllThumbnailImageRequests(): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.allowsAirPlay> property.
  			 */
  def getAllowsAirPlay(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.autoplay> property.
  			 */
  def getAutoplay(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.backgroundView> property.
  			 */
  def getBackgroundView(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.contentURL> property.
  			 */
  def getContentURL(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.currentPlaybackTime> property.
  			 */
  def getCurrentPlaybackTime(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.duration> property.
  			 */
  def getDuration(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.endPlaybackTime> property.
  			 */
  def getEndPlaybackTime(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.fullscreen> property.
  			 */
  def getFullscreen(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.initialPlaybackTime> property.
  			 */
  def getInitialPlaybackTime(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.loadState> property.
  			 */
  def getLoadState(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.mediaControlStyle> property.
  			 */
  def getMediaControlStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.mediaTypes> property.
  			 */
  def getMediaTypes(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.moviePlayerStatus> property.
  			 */
  def getMoviePlayerStatus(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.naturalSize> property.
  			 */
  def getNaturalSize(): titaniumLib.MovieSize = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.overlayView> property.
  			 */
  def getOverlayView(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.pictureInPictureEnabled> property.
  			 */
  def getPictureInPictureEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.playableDuration> property.
  			 */
  def getPlayableDuration(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.playbackState> property.
  			 */
  def getPlaybackState(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.playing> property.
  			 */
  def getPlaying(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.repeatMode> property.
  			 */
  def getRepeatMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.scalingMode> property.
  			 */
  def getScalingMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.showsControls> property.
  			 */
  def getShowsControls(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.sourceType> property.
  			 */
  def getSourceType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.url> property.
  			 */
  def getUrl(): java.lang.String | js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.Media.VideoPlayer.volume> property.
  			 */
  def getVolume(): scala.Double = js.native
  /**
  			 * Pauses playing the video.
  			 */
  def pause(): scala.Unit = js.native
  /**
  			 * Starts playing the video.
  			 */
  def play(): scala.Unit = js.native
  /**
  			 * Releases the internal video resources immediately.
  			 */
  def release(): scala.Unit = js.native
  /**
  			 * Asynchronously request thumbnail images for one or more points in time in the video.
  			 */
  def requestThumbnailImagesAtTimes(
    times: js.Array[scala.Double],
    option: scala.Double,
    callback: js.Function1[/* param0 */ titaniumLib.ThumbnailResponse, _]
  ): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.allowsAirPlay> property.
  			 */
  def setAllowsAirPlay(allowsAirPlay: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.autoplay> property.
  			 */
  def setAutoplay(autoplay: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.backgroundView> property.
  			 */
  def setBackgroundView(backgroundView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.contentURL> property.
  			 */
  def setContentURL(contentURL: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.currentPlaybackTime> property.
  			 */
  def setCurrentPlaybackTime(currentPlaybackTime: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.duration> property.
  			 */
  def setDuration(duration: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.endPlaybackTime> property.
  			 */
  def setEndPlaybackTime(endPlaybackTime: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.initialPlaybackTime> property.
  			 */
  def setInitialPlaybackTime(initialPlaybackTime: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.media> property.
  			 */
  def setMedia(media: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.media> property.
  			 */
  def setMedia(media: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.media> property.
  			 */
  def setMedia(media: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.mediaControlStyle> property.
  			 */
  def setMediaControlStyle(mediaControlStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.mediaTypes> property.
  			 */
  def setMediaTypes(mediaTypes: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.naturalSize> property.
  			 */
  def setNaturalSize(naturalSize: titaniumLib.MovieSize): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.overlayView> property.
  			 */
  def setOverlayView(overlayView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.pictureInPictureEnabled> property.
  			 */
  def setPictureInPictureEnabled(pictureInPictureEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.repeatMode> property.
  			 */
  def setRepeatMode(repeatMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.scalingMode> property.
  			 */
  def setScalingMode(scalingMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.showsControls> property.
  			 */
  def setShowsControls(showsControls: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.sourceType> property.
  			 */
  def setSourceType(sourceType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.url> property.
  			 */
  def setUrl(url: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.VideoPlayer.volume> property.
  			 */
  def setVolume(volume: scala.Double): scala.Unit = js.native
  /**
  			 * Stops playing the video.
  			 */
  def stop(): scala.Unit = js.native
  /**
  			 * Returns a thumbnail image for the video at the specified time.
  			 */
  def thumbnailImageAtTime(time: scala.Double, option: scala.Double): titaniumLib.TitaniumNs.Blob = js.native
}


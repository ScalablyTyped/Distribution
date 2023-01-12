package typings.videoReact.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerState extends StObject {
  
  /**
    * Returns whether the player has been paused by the player itself
    */
  var autoPaused: Boolean
  
  /**
    * Returns a TimeRanges object representing the buffered parts of the video
    */
  var buffered: Record[Any, Any]
  
  /**
    * Returns the URL of the current video
    */
  var currentSrc: String
  
  /**
    * Returns the current playback position in the video (in seconds)
    */
  var currentTime: Double
  
  /**
    * Returns the length of the current video (in seconds)
    */
  var duration: Double
  
  /**
    * Returns whether the playback of the video has ended or not
    */
  var ended: Boolean
  
  /**
    * Returns whether the video has been started
    */
  var hasStarted: Boolean
  
  /**
    * Returns whether the player is in activity.
    */
  var isActive: Boolean
  
  /**
    * Returns whether the player is in fullscreen.
    */
  var isFullscreen: Boolean
  
  /**
    * Returns whether the video is muted or not
    */
  var muted: Boolean
  
  /**
    * Returns the current network state of the video
    */
  var networkState: Double
  
  /**
    * Returns whether the player has been paused
    */
  var paused: Boolean
  
  /**
    * Returns the speed of the video playback
    */
  var playbackRate: Double
  
  /**
    * Returns the current ready state of the video
    */
  var readyState: Double
  
  /**
    * Returns whether the user is currently seeking in the video
    */
  var seeking: Boolean
  
  /**
    * Returns the current seeking position in the video (in seconds)
    */
  var seekingTime: Double
  
  /**
    * Returns whether the user is in activity.
    */
  var userActivity: Boolean
  
  /**
    * Returns the height of the video
    */
  var videoHeight: Double
  
  /**
    * Set the id of the video element.
    */
  var videoId: String
  
  /**
    * Returns the volume of the video
    */
  var videoWidth: Double
  
  /**
    * Returns the volume of the video.
    */
  var volume: Double
  
  /**
    * Returns whether the player needs to buffer the next frame
    */
  var waiting: Boolean
}
object PlayerState {
  
  inline def apply(
    autoPaused: Boolean,
    buffered: Record[Any, Any],
    currentSrc: String,
    currentTime: Double,
    duration: Double,
    ended: Boolean,
    hasStarted: Boolean,
    isActive: Boolean,
    isFullscreen: Boolean,
    muted: Boolean,
    networkState: Double,
    paused: Boolean,
    playbackRate: Double,
    readyState: Double,
    seeking: Boolean,
    seekingTime: Double,
    userActivity: Boolean,
    videoHeight: Double,
    videoId: String,
    videoWidth: Double,
    volume: Double,
    waiting: Boolean
  ): PlayerState = {
    val __obj = js.Dynamic.literal(autoPaused = autoPaused.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], currentSrc = currentSrc.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], hasStarted = hasStarted.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isFullscreen = isFullscreen.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], networkState = networkState.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], playbackRate = playbackRate.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], seekingTime = seekingTime.asInstanceOf[js.Any], userActivity = userActivity.asInstanceOf[js.Any], videoHeight = videoHeight.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], videoWidth = videoWidth.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerState] (val x: Self) extends AnyVal {
    
    inline def setAutoPaused(value: Boolean): Self = StObject.set(x, "autoPaused", value.asInstanceOf[js.Any])
    
    inline def setBuffered(value: Record[Any, Any]): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setCurrentSrc(value: String): Self = StObject.set(x, "currentSrc", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    inline def setHasStarted(value: Boolean): Self = StObject.set(x, "hasStarted", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setNetworkState(value: Double): Self = StObject.set(x, "networkState", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    inline def setSeeking(value: Boolean): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
    
    inline def setSeekingTime(value: Double): Self = StObject.set(x, "seekingTime", value.asInstanceOf[js.Any])
    
    inline def setUserActivity(value: Boolean): Self = StObject.set(x, "userActivity", value.asInstanceOf[js.Any])
    
    inline def setVideoHeight(value: Double): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoWidth(value: Double): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setWaiting(value: Boolean): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
  }
}

package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LiveTracker provides several useful helper functions and events for dealing with live playback, all of which are used and tested internally.
  * Internally this component keeps track of the live current time through a function that runs on a 30ms interval.
  */
@js.native
trait LiveTracker
  extends StObject
     with Component {
  
  /**
    * Determines if the currentTime of the player is close enough to live to be considered live.
    * We make sure it's close enough, rather than absolutely live, because there are too many factors to determine when live actually is.
    * We consider the currentTime live when it is within two seekable increments and 70ms (two ticks of the live tracking interval).
    * The seekable increment is a number that is determined by the amount that seekable end changes as playback continues.
    * See the seekableendchange event and the pastSeekEnd() function for more info.
    */
  def atLiveEdge(): Boolean = js.native
  
  /**
    * Determines if the currentTime of the player is close enough to live to be considered live.
    * We make sure it's close enough, rather than absolutely live, because there are too many factors to determine when live actually is.
    * We consider the currentTime live when it is within two seekable increments and 70ms (two ticks of the live tracking interval).
    * The seekable increment is a number that is determined by the amount that seekable end changes as playback continues.
    * See the seekableendchange event and the pastSeekEnd() function for more info.
    */
  def behindLiveEdge(): Boolean = js.native
  
  /**
    * isTracking and isLive do the same thing they tell you if the LiveTracker is currently tracking live playback
    * and since we assume that live tracking will only be done during live they should be the same.
    */
  def isLive(): Boolean = js.native
  
  /**
    * isTracking and isLive do the same thing they tell you if the LiveTracker is currently tracking live playback
    * and since we assume that live tracking will only be done during live they should be the same.
    */
  def isTracking(): Boolean = js.native
  
  /**
    * live current time is our best approximation of what the live current time is.
    * Internally it uses the pastSeekEnd() function and adds that to the seekableEnd() function.
    * It is possible for this function to return Infinity.
    */
  def liveCurrentTime(): Double = js.native
  
  /**
    * This function gets the amount of time between the seekableStart() and the liveCurrentTime().
    * We use this internally to update the total length of our bars, such as the progress/seek bar.
    */
  def liveWindow(): Double = js.native
  
  /**
    * The next seeked event is from the user. Meaning that any seek
    * > 2s behind live will be considered behind live for real and
    * liveTolerance will be ignored.
    */
  def nextSeekedFromUser(): Unit = js.native
  
  /**
    * This is the main value that we use to track if the player is live or not.
    * Every 30ms we add 0.03 seconds to this value and every seekableendchange it is reset to 0 and 0.03 is added to it right away.
    */
  def pastSeekEnd(): Double = js.native
  
  /**
    * This function sets the players currentTime to the result of the liveCurrentTime() function.
    * It will also start playback if playback is currently paused.
    * It starts playback because it is easy to fall behind the live edge if the player is not playing.
    */
  def seekToLiveEdge(): Unit = js.native
  
  /**
    * seekableEnd gets the time in seconds of the furthest seekable end.
    * For instance if we have an array of seekable TimeRanges where the first element in the array is the start() second and the last is the end() second:
    */
  def seekableEnd(): Double = js.native
  
  /**
    * seekableStart gets the time in seconds of the earliest seekable start.
    * For instance if we have an array of seekable TimeRanges where the first element in the array is the start() second and the last is the end() second:
    */
  def seekableStart(): Double = js.native
  
  /**
    * These functions can be called to arbitrarily start/stop tracking live playback.
    * Normally these are handled by automatically when the player triggers a durationchange with a duration of Infinity.
    * You won't want to call them unless you are doing something fairly specific.
    */
  def startTracking(): Unit = js.native
  
  /**
    * These functions can be called to arbitrarily start/stop tracking live playback.
    * Normally these are handled by automatically when the player triggers a durationchange with a duration of Infinity.
    * You won't want to call them unless you are doing something fairly specific.
    */
  def stopTracking(): Unit = js.native
}

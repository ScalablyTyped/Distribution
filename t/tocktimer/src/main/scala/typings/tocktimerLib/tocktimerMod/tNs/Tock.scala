package typings
package tocktimerLib.tocktimerMod.tNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tock extends js.Object {
  /**
    * Returns the elapsed time in milliseconds
    */
  def lap(): scala.Double = js.native
  /**
    * Convert number of milliseconds to a MM:SS time string. Won't handle times greater than 1 hour
    */
  def msToTime(ms: scala.Double): java.lang.String = js.native
  /**
    * Convert number of milliseconds to timecode string
    */
  def msToTimecode(ms: scala.Double): java.lang.String = js.native
  def msToTimecode(ms: scala.Double, showMs: scala.Boolean): java.lang.String = js.native
  /**
    * Stop the clock if it's running, continue clock if paused
    */
  def pause(): scala.Unit = js.native
  /**
    * Reset times to zero. Countdown clocks need a duration to be passed to start() after reset() is called.
    */
  def reset(): scala.Unit = js.native
  /**
    * Start the timer
    * @param time Can be either a countdown value or a starting value.
    * If a countdown timer then set time to count down from.
    * If a starting value then set time to the desired start time to count up from.
    */
  def start(): scala.Unit = js.native
  def start(time: scala.Double): scala.Unit = js.native
  /**
    * Stop the clock and clear the timeout
    */
  def stop(): scala.Unit = js.native
  /**
    * Convert a time string to a number of milliseconds. Should be a duration as a string of form MM:SS, MM:SS:ms, MM:SS.ms, HH:MM:SS
    * Alternatively a time in the future can be provided using the form yyyy-mm-dd HH:MM:SS.ms. The difference between this time and present will be returned.
    * If the input cannot be recognized as one of the above then 0 is returned
    */
  def timeToMS(time: java.lang.String): scala.Double = js.native
}


package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Clock")
@js.native
/**
  * @param autoStart Automatically start the clock.
  */
class Clock () extends js.Object {
  def this(autoStart: scala.Boolean) = this()
  /**
    * If set, starts the clock automatically when the first update is called.
    */
  var autoStart: scala.Boolean = js.native
  /**
    * When the clock is running, It holds the time elapsed between the start of the clock to the previous update.
    * This parameter is in seconds of three decimal places.
    */
  var elapsedTime: scala.Double = js.native
  /**
    * When the clock is running, It holds the previous time from a update.
    * This counted from the number of milliseconds elapsed since 1 January 1970 00:00:00 UTC.
    */
  var oldTime: scala.Double = js.native
  /**
    * This property keeps track whether the clock is running or not.
    */
  var running: scala.Boolean = js.native
  /**
    * When the clock is running, It holds the starttime of the clock.
    * This counted from the number of milliseconds elapsed since 1 January 1970 00:00:00 UTC.
    */
  var startTime: scala.Double = js.native
  /**
    * Get the seconds passed since the last call to this method.
    */
  def getDelta(): scala.Double = js.native
  /**
    * Get the seconds passed since the clock started.
    */
  def getElapsedTime(): scala.Double = js.native
  /**
    * Starts clock.
    */
  def start(): scala.Unit = js.native
  /**
    * Stops clock.
    */
  def stop(): scala.Unit = js.native
}


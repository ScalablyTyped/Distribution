package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads infrared frames from a infrared frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameReader")
@js.native
abstract class PerceptionInfraredFrameReader () extends js.Object {
  /** Gets a boolean value indicating whether or not this reader is paused. */
  var isPaused: scala.Boolean = js.native
  /** Subscribes to the FrameArrived event. This event is fired whenever a new frame arrives from the infrared frame source. */
  @JSName("onframearrived")
  var onframearrived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameReader, PerceptionInfraredFrameArrivedEventArgs] = js.native
  /** Gets the infrared frame source this reader gets frames from. */
  var source: PerceptionInfraredFrameSource = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_framearrived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.framearrived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameReader, PerceptionInfraredFrameArrivedEventArgs]
  ): scala.Unit = js.native
  /** Releases system resources that are exposed by a Windows Runtime object */
  def close(): scala.Unit = js.native
  /** Subscribes to the FrameArrived event. This event is fired whenever a new frame arrives from the infrared frame source. */
  def onframearrived(
    ev: PerceptionInfraredFrameArrivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameReader]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_framearrived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.framearrived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameReader, PerceptionInfraredFrameArrivedEventArgs]
  ): scala.Unit = js.native
  /**
    * Attempts to read the most recent frame that is available to this infrared frame reader.
    * @return If the attempt was successful, this method returns the most recent frame that is available to this infrared frame reader. If the attempt was not successful, this method returns null.
    */
  def tryReadLatestFrame(): PerceptionInfraredFrame = js.native
}


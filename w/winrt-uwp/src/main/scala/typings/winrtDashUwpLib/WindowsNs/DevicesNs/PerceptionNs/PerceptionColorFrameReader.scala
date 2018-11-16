package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads color frames from a color frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrameReader")
@js.native
abstract class PerceptionColorFrameReader () extends js.Object {
  /** Gets or sets a boolean value indicating whether or not this reader is paused. */
  var isPaused: scala.Boolean = js.native
  /** Subscribes to the FrameArrived event. This event is fired whenever a new frame arrives from the color frame source. */
  @JSName("onframearrived")
  var onframearrived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameReader, PerceptionColorFrameArrivedEventArgs] = js.native
  /** Gets the color frame source this reader gets frames from. */
  var source: PerceptionColorFrameSource = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_framearrived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.framearrived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameReader, PerceptionColorFrameArrivedEventArgs]
  ): scala.Unit = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): scala.Unit = js.native
  /** Subscribes to the FrameArrived event. This event is fired whenever a new frame arrives from the color frame source. */
  def onframearrived(
    ev: PerceptionColorFrameArrivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionColorFrameReader]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_framearrived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.framearrived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameReader, PerceptionColorFrameArrivedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Attempts to read the most recent frame that is available to this color frame reader.
                   * @return If the attempt was successful, this method returns the most recent frame that is available to this color frame reader. If the attempt was not successful, this method returns null.
                   */
  def tryReadLatestFrame(): PerceptionColorFrame = js.native
}


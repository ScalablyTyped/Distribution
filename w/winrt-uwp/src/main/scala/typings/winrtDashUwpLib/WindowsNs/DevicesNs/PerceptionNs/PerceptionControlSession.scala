package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a control session on a controllable frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionControlSession")
@js.native
abstract class PerceptionControlSession () extends js.Object {
  /** Subscribes to the ControlLost event. This event is triggered when control of the session is lost to another client. */
  @JSName("oncontrollost")
  var oncontrollost_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionControlSession, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllost(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.controllost,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionControlSession, _]
  ): scala.Unit = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): scala.Unit = js.native
  /** Subscribes to the ControlLost event. This event is triggered when control of the session is lost to another client. */
  def oncontrollost(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionControlSession]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllost(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.controllost,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionControlSession, _]
  ): scala.Unit = js.native
  /**
                   * Creates a property change request. This request is asynchronously processed, and is not guaranteed to succeed. The property change result should be inspected to determine if the property change was actually accepted and, if it was not, the reason why the property change was not accepted.
                   * @param name The name of the property to change.
                   * @param value The new property value.
                   * @return This method asynchronously returns the result of the property change request.
                   */
  def trySetPropertyAsync(name: java.lang.String, value: js.Any): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PerceptionFrameSourcePropertyChangeResult] = js.native
}


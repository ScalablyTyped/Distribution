package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.controllost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a control session on a controllable frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionControlSession")
@js.native
abstract class PerceptionControlSession () extends js.Object {
  /** Subscribes to the ControlLost event. This event is triggered when control of the session is lost to another client. */
  @JSName("oncontrollost")
  var oncontrollost_Original: TypedEventHandler[PerceptionControlSession, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllost(`type`: controllost, listener: TypedEventHandler[PerceptionControlSession, _]): Unit = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  /** Subscribes to the ControlLost event. This event is triggered when control of the session is lost to another client. */
  def oncontrollost(ev: js.Any with WinRTEvent[PerceptionControlSession]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllost(`type`: controllost, listener: TypedEventHandler[PerceptionControlSession, _]): Unit = js.native
  /**
    * Creates a property change request. This request is asynchronously processed, and is not guaranteed to succeed. The property change result should be inspected to determine if the property change was actually accepted and, if it was not, the reason why the property change was not accepted.
    * @param name The name of the property to change.
    * @param value The new property value.
    * @return This method asynchronously returns the result of the property change request.
    */
  def trySetPropertyAsync(name: String, value: js.Any): IPromiseWithIAsyncOperation[PerceptionFrameSourcePropertyChangeResult] = js.native
}


package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PerceptionFrameSourcePropertyChangeStatus extends js.Object

/** Indicates the status of a property change that an app requested of a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus")
@js.native
object PerceptionFrameSourcePropertyChangeStatus extends js.Object {
  /** The requested property change was accepted by the frame source. */
  @js.native
  sealed trait accepted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus
  
  /** The frame source property could not be changed because the app lost controller mode before the request was processed. */
  @js.native
  sealed trait lostControl
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property is not supported by the frame source. */
  @js.native
  sealed trait propertyNotSupported
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the property is read-only. */
  @js.native
  sealed trait propertyReadOnly
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus
  
  /** The status change is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the value is not in a valid range. */
  @js.native
  sealed trait valueOutOfRange
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus
  
  /* 1 */ val accepted: accepted with scala.Double = js.native
  /* 2 */ val lostControl: lostControl with scala.Double = js.native
  /* 3 */ val propertyNotSupported: propertyNotSupported with scala.Double = js.native
  /* 4 */ val propertyReadOnly: propertyReadOnly with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 5 */ val valueOutOfRange: valueOutOfRange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus with scala.Double
  ] = js.native
}


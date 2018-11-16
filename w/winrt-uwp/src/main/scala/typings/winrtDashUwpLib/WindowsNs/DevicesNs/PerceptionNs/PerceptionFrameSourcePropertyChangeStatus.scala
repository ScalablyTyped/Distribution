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
  
  val accepted: accepted with java.lang.String = js.native
  val lostControl: lostControl with java.lang.String = js.native
  val propertyNotSupported: propertyNotSupported with java.lang.String = js.native
  val propertyReadOnly: propertyReadOnly with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val valueOutOfRange: valueOutOfRange with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus with java.lang.String
  ] = js.native
}


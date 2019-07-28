package typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs

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
  sealed trait accepted extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The frame source property could not be changed because the app lost controller mode before the request was processed. */
  @js.native
  sealed trait lostControl extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property is not supported by the frame source. */
  @js.native
  sealed trait propertyNotSupported extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the property is read-only. */
  @js.native
  sealed trait propertyReadOnly extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The status change is unknown. */
  @js.native
  sealed trait unknown extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the value is not in a valid range. */
  @js.native
  sealed trait valueOutOfRange extends PerceptionFrameSourcePropertyChangeStatus
  
  /* 1 */ val accepted: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus.accepted with Double = js.native
  /* 2 */ val lostControl: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus.lostControl with Double = js.native
  /* 3 */ val propertyNotSupported: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus.propertyNotSupported with Double = js.native
  /* 4 */ val propertyReadOnly: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus.propertyReadOnly with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus.unknown with Double = js.native
  /* 5 */ val valueOutOfRange: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourcePropertyChangeStatus.valueOutOfRange with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PerceptionFrameSourcePropertyChangeStatus with Double] = js.native
}


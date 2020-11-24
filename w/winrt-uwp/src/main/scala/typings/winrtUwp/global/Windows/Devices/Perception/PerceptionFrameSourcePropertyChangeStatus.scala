package typings.winrtUwp.global.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the status of a property change that an app requested of a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus")
@js.native
object PerceptionFrameSourcePropertyChangeStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus with Double
  ] = js.native
  
  /* 1 */ val accepted: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.accepted with Double = js.native
  
  /* 2 */ val lostControl: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.lostControl with Double = js.native
  
  /* 3 */ val propertyNotSupported: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.propertyNotSupported with Double = js.native
  
  /* 4 */ val propertyReadOnly: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.propertyReadOnly with Double = js.native
  
  /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.unknown with Double = js.native
  
  /* 5 */ val valueOutOfRange: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus.valueOutOfRange with Double = js.native
}

package typings.winrtDashUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerDeviceType extends js.Object

/** Enumerates pointer device types. */
@JSGlobal("Windows.Devices.Input.PointerDeviceType")
@js.native
object PointerDeviceType extends js.Object {
  /** Mouse */
  @js.native
  sealed trait mouse extends PointerDeviceType
  
  /** Pen */
  @js.native
  sealed trait pen extends PointerDeviceType
  
  /** A touch-enabled device */
  @js.native
  sealed trait touch extends PointerDeviceType
  
  /* 2 */ val mouse: typings.winrtDashUwp.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
  /* 1 */ val pen: typings.winrtDashUwp.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
  /* 0 */ val touch: typings.winrtDashUwp.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerDeviceType with Double] = js.native
}


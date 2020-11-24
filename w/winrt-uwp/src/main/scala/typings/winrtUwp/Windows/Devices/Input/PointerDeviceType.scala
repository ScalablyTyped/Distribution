package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

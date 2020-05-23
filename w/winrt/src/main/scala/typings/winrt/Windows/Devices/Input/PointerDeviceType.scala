package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerDeviceType extends js.Object

@JSGlobal("Windows.Devices.Input.PointerDeviceType")
@js.native
object PointerDeviceType extends js.Object {
  @js.native
  sealed trait mouse extends PointerDeviceType
  
  @js.native
  sealed trait pen extends PointerDeviceType
  
  @js.native
  sealed trait touch extends PointerDeviceType
  
}


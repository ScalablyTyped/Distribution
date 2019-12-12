package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Devices.Input.PointerDeviceType.mouse
import typings.winrt.Windows.Devices.Input.PointerDeviceType.pen
import typings.winrt.Windows.Devices.Input.PointerDeviceType.touch
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerDeviceType with Double] = js.native
  /* 2 */ @js.native
  object mouse extends TopLevel[mouse with Double]
  
  /* 1 */ @js.native
  object pen extends TopLevel[pen with Double]
  
  /* 0 */ @js.native
  object touch extends TopLevel[touch with Double]
  
}


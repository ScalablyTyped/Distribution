package typings.winrtUwp.Windows.Devices.Input

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerDeviceType with Double] = js.native
  /* 2 */ @js.native
  object mouse extends TopLevel[mouse with Double]
  
  /* 1 */ @js.native
  object pen extends TopLevel[pen with Double]
  
  /* 0 */ @js.native
  object touch extends TopLevel[touch with Double]
  
}


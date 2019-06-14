package typings
package wonderDotJsLib.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBlendEquation extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendEquation")
@js.native
object EBlendEquation extends js.Object {
  @js.native
  sealed trait ADD
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendEquation
  
  @js.native
  sealed trait REVERSE_SUBTRAC
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendEquation
  
  @js.native
  sealed trait SUBTRACT
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendEquation
  
  /* 0 */ val ADD: ADD with scala.Double = js.native
  /* 2 */ val REVERSE_SUBTRAC: REVERSE_SUBTRAC with scala.Double = js.native
  /* 1 */ val SUBTRACT: SUBTRACT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendEquation with scala.Double] = js.native
}


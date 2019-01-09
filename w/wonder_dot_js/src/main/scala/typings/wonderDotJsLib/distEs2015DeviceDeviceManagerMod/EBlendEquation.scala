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
  
  val ADD: ADD with java.lang.String = js.native
  val REVERSE_SUBTRAC: REVERSE_SUBTRAC with java.lang.String = js.native
  val SUBTRACT: SUBTRACT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendEquation with java.lang.String
  ] = js.native
}


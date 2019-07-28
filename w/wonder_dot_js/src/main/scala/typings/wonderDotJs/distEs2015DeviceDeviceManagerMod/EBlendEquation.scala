package typings.wonderDotJs.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBlendEquation extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendEquation")
@js.native
object EBlendEquation extends js.Object {
  @js.native
  sealed trait ADD extends EBlendEquation
  
  @js.native
  sealed trait REVERSE_SUBTRAC extends EBlendEquation
  
  @js.native
  sealed trait SUBTRACT extends EBlendEquation
  
  /* 0 */ val ADD: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendEquation.ADD with Double = js.native
  /* 2 */ val REVERSE_SUBTRAC: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendEquation.REVERSE_SUBTRAC with Double = js.native
  /* 1 */ val SUBTRACT: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendEquation.SUBTRACT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBlendEquation with Double] = js.native
}


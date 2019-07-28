package typings.wonderDotJs.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBlendType extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendType")
@js.native
object EBlendType extends js.Object {
  @js.native
  sealed trait ADDITIVE extends EBlendType
  
  @js.native
  sealed trait ADDITIVEALPHA extends EBlendType
  
  @js.native
  sealed trait MULTIPLICATIVE extends EBlendType
  
  @js.native
  sealed trait NONE extends EBlendType
  
  @js.native
  sealed trait NORMAL extends EBlendType
  
  @js.native
  sealed trait PREMULTIPLIED extends EBlendType
  
  /* 2 */ val ADDITIVE: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendType.ADDITIVE with Double = js.native
  /* 3 */ val ADDITIVEALPHA: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendType.ADDITIVEALPHA with Double = js.native
  /* 4 */ val MULTIPLICATIVE: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendType.MULTIPLICATIVE with Double = js.native
  /* 0 */ val NONE: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendType.NONE with Double = js.native
  /* 1 */ val NORMAL: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendType.NORMAL with Double = js.native
  /* 5 */ val PREMULTIPLIED: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EBlendType.PREMULTIPLIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBlendType with Double] = js.native
}


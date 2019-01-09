package typings
package wonderDotJsLib.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBlendType extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendType")
@js.native
object EBlendType extends js.Object {
  @js.native
  sealed trait ADDITIVE
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendType
  
  @js.native
  sealed trait ADDITIVEALPHA
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendType
  
  @js.native
  sealed trait MULTIPLICATIVE
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendType
  
  @js.native
  sealed trait NONE
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendType
  
  @js.native
  sealed trait NORMAL
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendType
  
  @js.native
  sealed trait PREMULTIPLIED
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendType
  
  /* 2 */ val ADDITIVE: ADDITIVE with scala.Double = js.native
  /* 3 */ val ADDITIVEALPHA: ADDITIVEALPHA with scala.Double = js.native
  /* 4 */ val MULTIPLICATIVE: MULTIPLICATIVE with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 5 */ val PREMULTIPLIED: PREMULTIPLIED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EBlendType with scala.Double] = js.native
}


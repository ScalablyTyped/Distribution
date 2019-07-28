package typings.wonderDotJs.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDepthFunction extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EDepthFunction")
@js.native
object EDepthFunction extends js.Object {
  @js.native
  sealed trait ALWAYS extends EDepthFunction
  
  @js.native
  sealed trait EQUAL extends EDepthFunction
  
  @js.native
  sealed trait GEQUAL extends EDepthFunction
  
  @js.native
  sealed trait GREATER extends EDepthFunction
  
  @js.native
  sealed trait LEQUAL extends EDepthFunction
  
  @js.native
  sealed trait LESS extends EDepthFunction
  
  @js.native
  sealed trait NEVER extends EDepthFunction
  
  @js.native
  sealed trait NOTEQUAL extends EDepthFunction
  
  /* 1 */ val ALWAYS: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EDepthFunction.ALWAYS with Double = js.native
  /* 4 */ val EQUAL: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EDepthFunction.EQUAL with Double = js.native
  /* 5 */ val GEQUAL: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EDepthFunction.GEQUAL with Double = js.native
  /* 6 */ val GREATER: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EDepthFunction.GREATER with Double = js.native
  /* 3 */ val LEQUAL: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EDepthFunction.LEQUAL with Double = js.native
  /* 2 */ val LESS: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EDepthFunction.LESS with Double = js.native
  /* 0 */ val NEVER: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EDepthFunction.NEVER with Double = js.native
  /* 7 */ val NOTEQUAL: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EDepthFunction.NOTEQUAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepthFunction with Double] = js.native
}


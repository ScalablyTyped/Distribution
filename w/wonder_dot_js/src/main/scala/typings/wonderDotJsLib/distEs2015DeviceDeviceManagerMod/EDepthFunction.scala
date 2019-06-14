package typings
package wonderDotJsLib.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDepthFunction extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EDepthFunction")
@js.native
object EDepthFunction extends js.Object {
  @js.native
  sealed trait ALWAYS
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction
  
  @js.native
  sealed trait EQUAL
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction
  
  @js.native
  sealed trait GEQUAL
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction
  
  @js.native
  sealed trait GREATER
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction
  
  @js.native
  sealed trait LEQUAL
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction
  
  @js.native
  sealed trait LESS
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction
  
  @js.native
  sealed trait NEVER
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction
  
  @js.native
  sealed trait NOTEQUAL
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction
  
  /* 1 */ val ALWAYS: ALWAYS with scala.Double = js.native
  /* 4 */ val EQUAL: EQUAL with scala.Double = js.native
  /* 5 */ val GEQUAL: GEQUAL with scala.Double = js.native
  /* 6 */ val GREATER: GREATER with scala.Double = js.native
  /* 3 */ val LEQUAL: LEQUAL with scala.Double = js.native
  /* 2 */ val LESS: LESS with scala.Double = js.native
  /* 0 */ val NEVER: NEVER with scala.Double = js.native
  /* 7 */ val NOTEQUAL: NOTEQUAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EDepthFunction with scala.Double] = js.native
}


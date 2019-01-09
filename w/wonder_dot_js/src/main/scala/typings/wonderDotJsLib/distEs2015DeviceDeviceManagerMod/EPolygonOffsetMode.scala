package typings
package wonderDotJsLib.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPolygonOffsetMode extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EPolygonOffsetMode")
@js.native
object EPolygonOffsetMode extends js.Object {
  @js.native
  sealed trait CUSTOM
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode
  
  @js.native
  sealed trait IN
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode
  
  @js.native
  sealed trait NONE
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode
  
  @js.native
  sealed trait OUT
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode
  
  /* 3 */ val CUSTOM: CUSTOM with scala.Double = js.native
  /* 1 */ val IN: IN with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val OUT: OUT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    wonderDotJsLib.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode with scala.Double
  ] = js.native
}


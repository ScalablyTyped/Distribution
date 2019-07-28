package typings.wonderDotJs.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPolygonOffsetMode extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EPolygonOffsetMode")
@js.native
object EPolygonOffsetMode extends js.Object {
  @js.native
  sealed trait CUSTOM extends EPolygonOffsetMode
  
  @js.native
  sealed trait IN extends EPolygonOffsetMode
  
  @js.native
  sealed trait NONE extends EPolygonOffsetMode
  
  @js.native
  sealed trait OUT extends EPolygonOffsetMode
  
  /* 3 */ val CUSTOM: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode.CUSTOM with Double = js.native
  /* 1 */ val IN: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode.IN with Double = js.native
  /* 0 */ val NONE: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode.NONE with Double = js.native
  /* 2 */ val OUT: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.EPolygonOffsetMode.OUT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPolygonOffsetMode with Double] = js.native
}


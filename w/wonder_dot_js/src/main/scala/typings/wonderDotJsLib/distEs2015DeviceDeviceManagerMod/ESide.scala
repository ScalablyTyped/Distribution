package typings
package wonderDotJsLib.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ESide extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "ESide")
@js.native
object ESide extends js.Object {
  @js.native
  sealed trait BACK
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.ESide
  
  @js.native
  sealed trait BOTH
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.ESide
  
  @js.native
  sealed trait FRONT
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.ESide
  
  @js.native
  sealed trait NONE
    extends wonderDotJsLib.distEs2015DeviceDeviceManagerMod.ESide
  
  /* 2 */ val BACK: BACK with scala.Double = js.native
  /* 1 */ val BOTH: BOTH with scala.Double = js.native
  /* 3 */ val FRONT: FRONT with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDotJsLib.distEs2015DeviceDeviceManagerMod.ESide with scala.Double] = js.native
}


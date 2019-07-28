package typings.wonderDotJs.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ESide extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "ESide")
@js.native
object ESide extends js.Object {
  @js.native
  sealed trait BACK extends ESide
  
  @js.native
  sealed trait BOTH extends ESide
  
  @js.native
  sealed trait FRONT extends ESide
  
  @js.native
  sealed trait NONE extends ESide
  
  /* 2 */ val BACK: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.ESide.BACK with Double = js.native
  /* 1 */ val BOTH: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.ESide.BOTH with Double = js.native
  /* 3 */ val FRONT: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.ESide.FRONT with Double = js.native
  /* 0 */ val NONE: typings.wonderDotJs.distEs2015DeviceDeviceManagerMod.ESide.NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESide with Double] = js.native
}


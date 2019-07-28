package typings.wonderDotJs.distEs2015DeviceEScreenSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EScreenSize extends js.Object

@JSImport("wonder.js/dist/es2015/device/EScreenSize", "EScreenSize")
@js.native
object EScreenSize extends js.Object {
  @js.native
  sealed trait FULL extends EScreenSize
  
  /* 0 */ val FULL: typings.wonderDotJs.distEs2015DeviceEScreenSizeMod.EScreenSize.FULL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EScreenSize with Double] = js.native
}


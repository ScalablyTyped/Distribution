package typings.wonderDotJs

import typings.wonderDotJs.distEs2015DeviceEScreenSizeMod.EScreenSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/device/EScreenSize", JSImport.Namespace)
@js.native
object distEs2015DeviceEScreenSizeMod extends js.Object {
  @js.native
  sealed trait EScreenSize extends js.Object
  
  @js.native
  object EScreenSize extends js.Object {
    @js.native
    sealed trait FULL extends EScreenSize
    
    /* 0 */ val FULL: typings.wonderDotJs.distEs2015DeviceEScreenSizeMod.EScreenSize.FULL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EScreenSize with Double] = js.native
  }
  
}


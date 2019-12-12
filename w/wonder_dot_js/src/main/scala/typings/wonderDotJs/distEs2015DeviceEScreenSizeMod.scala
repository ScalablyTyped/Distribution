package typings.wonderDotJs

import org.scalablytyped.runtime.TopLevel
import typings.wonderDotJs.distEs2015DeviceEScreenSizeMod.EScreenSize
import typings.wonderDotJs.distEs2015DeviceEScreenSizeMod.EScreenSize.FULL
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EScreenSize with Double] = js.native
    /* 0 */ @js.native
    object FULL extends TopLevel[FULL with Double]
    
  }
  
}


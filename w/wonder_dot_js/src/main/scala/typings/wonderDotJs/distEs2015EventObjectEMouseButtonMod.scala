package typings.wonderDotJs

import org.scalablytyped.runtime.TopLevel
import typings.wonderDotJs.distEs2015EventObjectEMouseButtonMod.EMouseButton
import typings.wonderDotJs.distEs2015EventObjectEMouseButtonMod.EMouseButton.CENTER
import typings.wonderDotJs.distEs2015EventObjectEMouseButtonMod.EMouseButton.LEFT
import typings.wonderDotJs.distEs2015EventObjectEMouseButtonMod.EMouseButton.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/EMouseButton", JSImport.Namespace)
@js.native
object distEs2015EventObjectEMouseButtonMod extends js.Object {
  @js.native
  sealed trait EMouseButton extends js.Object
  
  @js.native
  object EMouseButton extends js.Object {
    @js.native
    sealed trait CENTER extends EMouseButton
    
    @js.native
    sealed trait LEFT extends EMouseButton
    
    @js.native
    sealed trait RIGHT extends EMouseButton
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EMouseButton with Double] = js.native
    /* 2 */ @js.native
    object CENTER extends TopLevel[CENTER with Double]
    
    /* 0 */ @js.native
    object LEFT extends TopLevel[LEFT with Double]
    
    /* 1 */ @js.native
    object RIGHT extends TopLevel[RIGHT with Double]
    
  }
  
}


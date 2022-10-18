package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectEmousebuttonMod {
  
  @js.native
  sealed trait EMouseButton extends StObject
  @JSImport("wonder.js/dist/es2015/event/object/EMouseButton", "EMouseButton")
  @js.native
  object EMouseButton extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EMouseButton & Double] = js.native
    
    @js.native
    sealed trait CENTER
      extends StObject
         with EMouseButton
    /* 2 */ val CENTER: typings.wonderJs.distEs2015EventObjectEmousebuttonMod.EMouseButton.CENTER & Double = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with EMouseButton
    /* 0 */ val LEFT: typings.wonderJs.distEs2015EventObjectEmousebuttonMod.EMouseButton.LEFT & Double = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with EMouseButton
    /* 1 */ val RIGHT: typings.wonderJs.distEs2015EventObjectEmousebuttonMod.EMouseButton.RIGHT & Double = js.native
  }
}

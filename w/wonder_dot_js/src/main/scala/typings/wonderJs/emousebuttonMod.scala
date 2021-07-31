package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emousebuttonMod {
  
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
    /* 2 */ val CENTER: typings.wonderJs.emousebuttonMod.EMouseButton.CENTER & Double = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with EMouseButton
    /* 0 */ val LEFT: typings.wonderJs.emousebuttonMod.EMouseButton.LEFT & Double = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with EMouseButton
    /* 1 */ val RIGHT: typings.wonderJs.emousebuttonMod.EMouseButton.RIGHT & Double = js.native
  }
}

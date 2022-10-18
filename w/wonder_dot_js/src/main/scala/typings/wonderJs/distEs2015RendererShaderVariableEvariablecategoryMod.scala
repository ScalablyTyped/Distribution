package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderVariableEvariablecategoryMod {
  
  @js.native
  sealed trait EVariableCategory extends StObject
  @JSImport("wonder.js/dist/es2015/renderer/shader/variable/EVariableCategory", "EVariableCategory")
  @js.native
  object EVariableCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EVariableCategory & Double] = js.native
    
    @js.native
    sealed trait CUSTOM
      extends StObject
         with EVariableCategory
    /* 1 */ val CUSTOM: typings.wonderJs.distEs2015RendererShaderVariableEvariablecategoryMod.EVariableCategory.CUSTOM & Double = js.native
    
    @js.native
    sealed trait ENGINE
      extends StObject
         with EVariableCategory
    /* 0 */ val ENGINE: typings.wonderJs.distEs2015RendererShaderVariableEvariablecategoryMod.EVariableCategory.ENGINE & Double = js.native
  }
}

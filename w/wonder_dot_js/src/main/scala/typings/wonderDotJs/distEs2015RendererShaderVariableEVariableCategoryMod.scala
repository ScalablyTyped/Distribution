package typings.wonderDotJs

import typings.wonderDotJs.distEs2015RendererShaderVariableEVariableCategoryMod.EVariableCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/variable/EVariableCategory", JSImport.Namespace)
@js.native
object distEs2015RendererShaderVariableEVariableCategoryMod extends js.Object {
  @js.native
  sealed trait EVariableCategory extends js.Object
  
  @js.native
  object EVariableCategory extends js.Object {
    @js.native
    sealed trait CUSTOM extends EVariableCategory
    
    @js.native
    sealed trait ENGINE extends EVariableCategory
    
    /* 1 */ val CUSTOM: typings.wonderDotJs.distEs2015RendererShaderVariableEVariableCategoryMod.EVariableCategory.CUSTOM with Double = js.native
    /* 0 */ val ENGINE: typings.wonderDotJs.distEs2015RendererShaderVariableEVariableCategoryMod.EVariableCategory.ENGINE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EVariableCategory with Double] = js.native
  }
  
}


package typings
package wonderDotJsLib.distEs2015RendererShaderVariableEVariableCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EVariableCategory extends js.Object

@JSImport("wonder.js/dist/es2015/renderer/shader/variable/EVariableCategory", "EVariableCategory")
@js.native
object EVariableCategory extends js.Object {
  @js.native
  sealed trait CUSTOM
    extends wonderDotJsLib.distEs2015RendererShaderVariableEVariableCategoryMod.EVariableCategory
  
  @js.native
  sealed trait ENGINE
    extends wonderDotJsLib.distEs2015RendererShaderVariableEVariableCategoryMod.EVariableCategory
  
  val CUSTOM: CUSTOM with java.lang.String = js.native
  val ENGINE: ENGINE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    wonderDotJsLib.distEs2015RendererShaderVariableEVariableCategoryMod.EVariableCategory with java.lang.String
  ] = js.native
}


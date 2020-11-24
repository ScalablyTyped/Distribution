package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.ExpressionNode
import typings.vueCompilerCore.mod.InterpolationNode
import typings.vueCompilerCore.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createInterpolation")
@js.native
object createInterpolation extends js.Object {
  
  def apply(content: String, loc: SourceLocation): InterpolationNode = js.native
  def apply(content: ExpressionNode, loc: SourceLocation): InterpolationNode = js.native
}

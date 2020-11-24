package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-core", "createInterpolation")
@js.native
object createInterpolation extends js.Object {
  
  def apply(content: String, loc: SourceLocation): InterpolationNode = js.native
  def apply(content: ExpressionNode, loc: SourceLocation): InterpolationNode = js.native
}

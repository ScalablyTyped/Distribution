package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.ArrayExpression
import typings.vueCompilerCore.mod.JSChildNode
import typings.vueCompilerCore.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createArrayExpression")
@js.native
object createArrayExpression extends js.Object {
  
  def apply(elements: js.Array[String | JSChildNode]): ArrayExpression = js.native
  def apply(elements: js.Array[String | JSChildNode], loc: SourceLocation): ArrayExpression = js.native
}

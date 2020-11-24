package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.ObjectExpression
import typings.vueCompilerCore.mod.Property
import typings.vueCompilerCore.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createObjectExpression")
@js.native
object createObjectExpression extends js.Object {
  
  def apply(properties: js.Array[Property]): ObjectExpression = js.native
  def apply(properties: js.Array[Property], loc: SourceLocation): ObjectExpression = js.native
}

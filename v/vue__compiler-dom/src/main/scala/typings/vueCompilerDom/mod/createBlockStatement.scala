package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.BlockStatement
import typings.vueCompilerCore.mod.IfStatement
import typings.vueCompilerCore.mod.JSChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createBlockStatement")
@js.native
object createBlockStatement extends js.Object {
  
  def apply(body: js.Array[JSChildNode | IfStatement]): BlockStatement = js.native
}

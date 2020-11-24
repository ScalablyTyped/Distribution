package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.RootNode
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerCore.mod.TemplateChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createRoot")
@js.native
object createRoot extends js.Object {
  
  def apply(children: js.Array[TemplateChildNode]): RootNode = js.native
  def apply(children: js.Array[TemplateChildNode], loc: SourceLocation): RootNode = js.native
}

package typings.vueCompilerCore.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-core", "findDir")
@js.native
object findDir extends js.Object {
  
  def apply(node: ElementNode, name: String): js.UndefOr[DirectiveNode] = js.native
  def apply(node: ElementNode, name: String, allowEmpty: Boolean): js.UndefOr[DirectiveNode] = js.native
  def apply(node: ElementNode, name: RegExp): js.UndefOr[DirectiveNode] = js.native
  def apply(node: ElementNode, name: RegExp, allowEmpty: Boolean): js.UndefOr[DirectiveNode] = js.native
}

package typings.vueCompilerDom.mod

import typings.std.RegExp
import typings.vueCompilerCore.mod.NodeTransform
import typings.vueCompilerCore.mod.StructuralDirectiveTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createStructuralDirectiveTransform")
@js.native
object createStructuralDirectiveTransform extends js.Object {
  
  def apply(name: String, fn: StructuralDirectiveTransform): NodeTransform = js.native
  def apply(name: RegExp, fn: StructuralDirectiveTransform): NodeTransform = js.native
}

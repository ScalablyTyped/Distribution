package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.Property
import typings.vueCompilerCore.mod.RenderSlotCall
import typings.vueCompilerCore.mod.TransformContext
import typings.vueCompilerCore.mod.VNodeCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "injectProp")
@js.native
object injectProp extends js.Object {
  
  def apply(node: RenderSlotCall, prop: Property, context: TransformContext): Unit = js.native
  def apply(node: VNodeCall, prop: Property, context: TransformContext): Unit = js.native
}

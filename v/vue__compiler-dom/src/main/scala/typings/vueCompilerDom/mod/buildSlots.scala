package typings.vueCompilerDom.mod

import typings.vueCompilerCore.anon.HasDynamicSlots
import typings.vueCompilerCore.mod.ElementNode
import typings.vueCompilerCore.mod.SlotFnBuilder
import typings.vueCompilerCore.mod.TransformContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "buildSlots")
@js.native
object buildSlots extends js.Object {
  
  def apply(node: ElementNode, context: TransformContext): HasDynamicSlots = js.native
  def apply(node: ElementNode, context: TransformContext, buildSlotFn: SlotFnBuilder): HasDynamicSlots = js.native
}

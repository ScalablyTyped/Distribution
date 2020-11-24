package typings.vueDocgenApi.slotHandlerMod

import typings.astTypes.nodePathMod.NodePath
import typings.vueInbrowserCompilerUtils.typesMod.SlotDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/script-handlers/slotHandler", "getSlotComment")
@js.native
object getSlotComment extends js.Object {
  
  def apply(path: NodePath[_, _], descriptor: SlotDescriptor): js.UndefOr[SlotComment] = js.native
}

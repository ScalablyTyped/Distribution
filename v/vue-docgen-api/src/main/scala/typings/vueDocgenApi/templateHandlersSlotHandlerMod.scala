package typings.vueDocgenApi

import typings.vueCompilerCore.mod.TemplateChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateHandlersSlotHandlerMod {
  
  @JSImport("vue-docgen-api/dist/template-handlers/slotHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    documentation: typings.vueDocgenApi.documentationMod.default,
    templateAst: TemplateChildNode,
    siblings: js.Array[TemplateChildNode]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], templateAst.asInstanceOf[js.Any], siblings.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

package typings.vueDocgenApi

import typings.vueCompilerCore.mod.TemplateChildNode
import typings.vueDocgenApi.parseTemplateMod.TemplateParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/template-handlers", JSImport.Namespace)
@js.native
object templateHandlersMod extends js.Object {
  
  val default: js.Array[
    js.Function4[
      /* documentation */ typings.vueDocgenApi.documentationMod.default, 
      /* templateAst */ TemplateChildNode, 
      /* siblings */ js.Array[TemplateChildNode], 
      /* options */ TemplateParserOptions, 
      Unit
    ]
  ] = js.native
}

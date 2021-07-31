package typings.vueDocgenApi

import org.scalablytyped.runtime.Shortcut
import typings.vueCompilerCore.mod.TemplateChildNode
import typings.vueDocgenApi.parseTemplateMod.TemplateParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateHandlersMod extends Shortcut {
  
  @JSImport("vue-docgen-api/dist/template-handlers", JSImport.Default)
  @js.native
  val default: js.Array[
    js.Function4[
      /* documentation */ typings.vueDocgenApi.documentationMod.default, 
      /* templateAst */ TemplateChildNode, 
      /* siblings */ js.Array[TemplateChildNode], 
      /* options */ TemplateParserOptions, 
      Unit
    ]
  ] = js.native
  
  type _To = js.Array[
    js.Function4[
      /* documentation */ typings.vueDocgenApi.documentationMod.default, 
      /* templateAst */ TemplateChildNode, 
      /* siblings */ js.Array[TemplateChildNode], 
      /* options */ TemplateParserOptions, 
      Unit
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `templateHandlersMod.foo` */
  override def _to: js.Array[
    js.Function4[
      /* documentation */ typings.vueDocgenApi.documentationMod.default, 
      /* templateAst */ TemplateChildNode, 
      /* siblings */ js.Array[TemplateChildNode], 
      /* options */ TemplateParserOptions, 
      Unit
    ]
  ] = default
}

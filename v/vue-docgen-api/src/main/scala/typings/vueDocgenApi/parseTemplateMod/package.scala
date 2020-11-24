package typings.vueDocgenApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object parseTemplateMod {
  
  type Handler = js.Function4[
    /* documentation */ typings.vueDocgenApi.documentationMod.default, 
    /* templateAst */ typings.vueCompilerCore.mod.TemplateChildNode, 
    /* siblings */ js.Array[typings.vueCompilerCore.mod.TemplateChildNode], 
    /* options */ typings.vueDocgenApi.parseTemplateMod.TemplateParserOptions, 
    scala.Unit
  ]
}

package typings.vueDocgenApi

import typings.vueCompilerCore.mod.TemplateChildNode
import typings.vueDocgenApi.anon.PickSFCTemplateBlockconte
import typings.vueDocgenApi.documentationMod.default
import typings.vueDocgenApi.parseMod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseTemplateMod {
  
  @JSImport("vue-docgen-api/dist/parse-template", JSImport.Default)
  @js.native
  def default(
    tpl: PickSFCTemplateBlockconte,
    documentation: typings.vueDocgenApi.documentationMod.default,
    handlers: js.Array[Handler],
    opts: ParseOptions
  ): Unit = js.native
  
  @JSImport("vue-docgen-api/dist/parse-template", "traverse")
  @js.native
  def traverse(
    templateAst: TemplateChildNode,
    documentation: default,
    handlers: js.Array[Handler],
    siblings: js.Array[TemplateChildNode],
    options: TemplateParserOptions
  ): Unit = js.native
  
  type Handler = js.Function4[
    /* documentation */ default, 
    /* templateAst */ TemplateChildNode, 
    /* siblings */ js.Array[TemplateChildNode], 
    /* options */ TemplateParserOptions, 
    Unit
  ]
  
  @js.native
  trait TemplateParserOptions extends StObject {
    
    var functional: Boolean = js.native
  }
  object TemplateParserOptions {
    
    @scala.inline
    def apply(functional: Boolean): TemplateParserOptions = {
      val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateParserOptions]
    }
    
    @scala.inline
    implicit class TemplateParserOptionsMutableBuilder[Self <: TemplateParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctional(value: Boolean): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
    }
  }
}

package typings.vueDocgenApi

import typings.vueCompilerCore.mod.TemplateChildNode
import typings.vueDocgenApi.anon.PickSFCTemplateBlockconte
import typings.vueDocgenApi.documentationMod.default
import typings.vueDocgenApi.parseMod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseTemplateMod {
  
  @JSImport("vue-docgen-api/dist/parse-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    tpl: PickSFCTemplateBlockconte,
    documentation: typings.vueDocgenApi.documentationMod.default,
    handlers: js.Array[Handler],
    opts: ParseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tpl.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def traverse(
    templateAst: TemplateChildNode,
    documentation: default,
    handlers: js.Array[Handler],
    siblings: js.Array[TemplateChildNode],
    options: TemplateParserOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(templateAst.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], siblings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Handler = js.Function4[
    /* documentation */ default, 
    /* templateAst */ TemplateChildNode, 
    /* siblings */ js.Array[TemplateChildNode], 
    /* options */ TemplateParserOptions, 
    Unit
  ]
  
  trait TemplateParserOptions extends StObject {
    
    var functional: Boolean
  }
  object TemplateParserOptions {
    
    inline def apply(functional: Boolean): TemplateParserOptions = {
      val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateParserOptions]
    }
    
    extension [Self <: TemplateParserOptions](x: Self) {
      
      inline def setFunctional(value: Boolean): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
    }
  }
}

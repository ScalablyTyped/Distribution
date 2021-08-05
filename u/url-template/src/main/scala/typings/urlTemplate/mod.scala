package typings.urlTemplate

import org.scalablytyped.runtime.Shortcut
import typings.urlTemplate.mod.UrlTemplate.TemplateParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("url-template", JSImport.Namespace)
  @js.native
  val ^ : TemplateParser = js.native
  
  object UrlTemplate {
    
    trait Template extends StObject {
      
      def expand(parameters: js.Any): String
    }
    object Template {
      
      inline def apply(expand: js.Any => String): Template = {
        val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
        __obj.asInstanceOf[Template]
      }
      
      extension [Self <: Template](x: Self) {
        
        inline def setExpand(value: js.Any => String): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      }
    }
    
    trait TemplateParser extends StObject {
      
      def parse(template: String): Template
    }
    object TemplateParser {
      
      inline def apply(parse: String => Template): TemplateParser = {
        val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
        __obj.asInstanceOf[TemplateParser]
      }
      
      extension [Self <: TemplateParser](x: Self) {
        
        inline def setParse(value: String => Template): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      }
    }
  }
  
  type _To = TemplateParser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TemplateParser = ^
}

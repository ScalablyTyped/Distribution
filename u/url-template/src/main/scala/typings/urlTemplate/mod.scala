package typings.urlTemplate

import org.scalablytyped.runtime.Shortcut
import typings.urlTemplate.mod.UrlTemplate.TemplateParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("url-template", JSImport.Namespace)
  @js.native
  val ^ : TemplateParser = js.native
  
  object UrlTemplate {
    
    @js.native
    trait Template extends StObject {
      
      def expand(parameters: js.Any): String = js.native
    }
    object Template {
      
      @scala.inline
      def apply(expand: js.Any => String): Template = {
        val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
        __obj.asInstanceOf[Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExpand(value: js.Any => String): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait TemplateParser extends StObject {
      
      def parse(template: String): Template = js.native
    }
    object TemplateParser {
      
      @scala.inline
      def apply(parse: String => Template): TemplateParser = {
        val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
        __obj.asInstanceOf[TemplateParser]
      }
      
      @scala.inline
      implicit class TemplateParserMutableBuilder[Self <: TemplateParser] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setParse(value: String => Template): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      }
    }
  }
  
  type _To = TemplateParser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TemplateParser = ^
}

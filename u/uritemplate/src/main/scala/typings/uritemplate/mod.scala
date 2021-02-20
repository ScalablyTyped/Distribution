package typings.uritemplate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uritemplate", "UriTemplate")
  @js.native
  class UriTemplate () extends StObject {
    
    /**
      * Expands template into a string using parameter
      * supplied
      */
    def expand(data: js.Object): String = js.native
  }
  
  @JSImport("uritemplate", "UriTemplateError")
  @js.native
  class UriTemplateError protected () extends StObject {
    def this(options: UriTemplateErrorOptions) = this()
  }
  
  @JSImport("uritemplate", "parse")
  @js.native
  def parse(templateText: String): UriTemplate = js.native
  
  @js.native
  trait UriTemplateErrorOptions extends StObject {
    
    var expressionText: String = js.native
    
    var message: String = js.native
    
    var position: Double = js.native
  }
  object UriTemplateErrorOptions {
    
    @scala.inline
    def apply(expressionText: String, message: String, position: Double): UriTemplateErrorOptions = {
      val __obj = js.Dynamic.literal(expressionText = expressionText.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[UriTemplateErrorOptions]
    }
    
    @scala.inline
    implicit class UriTemplateErrorOptionsMutableBuilder[Self <: UriTemplateErrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpressionText(value: String): Self = StObject.set(x, "expressionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}

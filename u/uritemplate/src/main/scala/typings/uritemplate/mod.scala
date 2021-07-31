package typings.uritemplate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uritemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def parse(templateText: String): UriTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(templateText.asInstanceOf[js.Any]).asInstanceOf[UriTemplate]
  
  trait UriTemplateErrorOptions extends StObject {
    
    var expressionText: String
    
    var message: String
    
    var position: Double
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

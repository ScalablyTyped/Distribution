package typings.twit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: Double
    
    var message: String
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, message: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: Double
    
    var id_str: String
  }
  object Id {
    
    @scala.inline
    def apply(id: Double, id_str: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Text {
    
    @scala.inline
    def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}

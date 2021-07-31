package typings.wordpressMediaUtils

import typings.std.File
import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: UploadMediaErrorCode
    
    var file: File
    
    var message: String
  }
  object Code {
    
    @scala.inline
    def apply(code: UploadMediaErrorCode, file: File, message: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: UploadMediaErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}

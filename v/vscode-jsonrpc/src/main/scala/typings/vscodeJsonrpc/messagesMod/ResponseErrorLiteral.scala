package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseErrorLiteral[D] extends StObject {
  
  /**
    * A number indicating the error type that occured.
    */
  var code: Double
  
  /**
    * A Primitive or Structured value that contains additional
    * information about the error. Can be omitted.
    */
  var data: js.UndefOr[D] = js.undefined
  
  /**
    * A string providing a short decription of the error.
    */
  var message: String
}
object ResponseErrorLiteral {
  
  @scala.inline
  def apply[D](code: Double, message: String): ResponseErrorLiteral[D] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseErrorLiteral[D]]
  }
  
  @scala.inline
  implicit class ResponseErrorLiteralMutableBuilder[Self <: ResponseErrorLiteral[?], D] (val x: Self & ResponseErrorLiteral[D]) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}

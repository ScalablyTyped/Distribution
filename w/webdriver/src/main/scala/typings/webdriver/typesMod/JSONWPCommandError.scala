package typings.webdriver.typesMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONWPCommandError
  extends StObject
     with Error {
  
  var code: js.UndefOr[String] = js.undefined
  
  var statusCode: js.UndefOr[String] = js.undefined
  
  var statusMessage: js.UndefOr[String] = js.undefined
}
object JSONWPCommandError {
  
  @scala.inline
  def apply(message: String, name: String): JSONWPCommandError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONWPCommandError]
  }
  
  @scala.inline
  implicit class JSONWPCommandErrorMutableBuilder[Self <: JSONWPCommandError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}

package typings.surveyKnockout.anon

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var request: XMLHttpRequest
}
object Request {
  
  @scala.inline
  def apply(request: XMLHttpRequest): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}

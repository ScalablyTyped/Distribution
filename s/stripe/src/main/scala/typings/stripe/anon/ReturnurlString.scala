package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnurlString extends StObject {
  
  var return_url: String = js.native
}
object ReturnurlString {
  
  @scala.inline
  def apply(return_url: String): ReturnurlString = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnurlString]
  }
  
  @scala.inline
  implicit class ReturnurlStringMutableBuilder[Self <: ReturnurlString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
  }
}

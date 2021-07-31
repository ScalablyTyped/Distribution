package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveSourceOptions extends StObject {
  
  var client_secret: String
  
  var id: String
}
object RetrieveSourceOptions {
  
  @scala.inline
  def apply(client_secret: String, id: String): RetrieveSourceOptions = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveSourceOptions]
  }
  
  @scala.inline
  implicit class RetrieveSourceOptionsMutableBuilder[Self <: RetrieveSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

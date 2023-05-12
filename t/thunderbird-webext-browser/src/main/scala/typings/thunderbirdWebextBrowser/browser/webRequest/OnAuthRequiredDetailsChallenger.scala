package typings.thunderbirdWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAuthRequiredDetailsChallenger extends StObject {
  
  var host: String
  
  var port: Double
}
object OnAuthRequiredDetailsChallenger {
  
  inline def apply(host: String, port: Double): OnAuthRequiredDetailsChallenger = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAuthRequiredDetailsChallenger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAuthRequiredDetailsChallenger] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}

package typings.webextensionPolyfill.webRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The server requesting authentication.
  */
trait OnAuthRequiredDetailsTypeChallengerType extends StObject {
  
  var host: String
  
  var port: Double
}
object OnAuthRequiredDetailsTypeChallengerType {
  
  inline def apply(host: String, port: Double): OnAuthRequiredDetailsTypeChallengerType = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAuthRequiredDetailsTypeChallengerType]
  }
  
  extension [Self <: OnAuthRequiredDetailsTypeChallengerType](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}

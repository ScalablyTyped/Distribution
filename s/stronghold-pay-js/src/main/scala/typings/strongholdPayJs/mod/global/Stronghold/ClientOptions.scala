package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
  var environment: ENVIRONMENT
  
  var host: js.UndefOr[String] = js.undefined
  
  var publishableKey: String
}
object ClientOptions {
  
  inline def apply(environment: ENVIRONMENT, publishableKey: String): ClientOptions = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], publishableKey = publishableKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: ENVIRONMENT): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPublishableKey(value: String): Self = StObject.set(x, "publishableKey", value.asInstanceOf[js.Any])
  }
}

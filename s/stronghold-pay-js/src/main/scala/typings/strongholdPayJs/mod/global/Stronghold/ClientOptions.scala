package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends StObject {
  
  var environment: ENVIRONMENT = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var publishableKey: String = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(environment: ENVIRONMENT, publishableKey: String): ClientOptions = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], publishableKey = publishableKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: ENVIRONMENT): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPublishableKey(value: String): Self = StObject.set(x, "publishableKey", value.asInstanceOf[js.Any])
  }
}

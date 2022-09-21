package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var uuidv4: String
  
  var webhookurl: js.UndefOr[String] = js.undefined
}
object Disabled {
  
  inline def apply(name: String, uuidv4: String): Disabled = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuidv4 = uuidv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setDisabled(value: Double): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUuidv4(value: String): Self = StObject.set(x, "uuidv4", value.asInstanceOf[js.Any])
    
    inline def setWebhookurl(value: String): Self = StObject.set(x, "webhookurl", value.asInstanceOf[js.Any])
    
    inline def setWebhookurlUndefined: Self = StObject.set(x, "webhookurl", js.undefined)
  }
}

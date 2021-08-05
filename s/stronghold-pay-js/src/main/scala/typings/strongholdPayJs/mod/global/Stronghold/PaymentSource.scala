package typings.strongholdPayJs.mod.global.Stronghold

import typings.strongholdPayJs.strongholdPayJsStrings.bank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentSource extends StObject {
  
  var id: String
  
  var label: String
  
  var `type`: bank
}
object PaymentSource {
  
  inline def apply(id: String, label: String): PaymentSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bank")
    __obj.asInstanceOf[PaymentSource]
  }
  
  extension [Self <: PaymentSource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: bank): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

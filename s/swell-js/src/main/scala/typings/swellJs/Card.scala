package typings.swellJs

import typings.swellJs.typesCardCamelMod.CardCamel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.swellJs.mod.BaseModel because var conflicts: date_created, date_updated, id. Inlined 
- typings.swellJs.CardSnake because var conflicts: active, address_check, billing, brand, cvc_check, date_created, date_updated, exp_month, exp_year, fingerprint, gateway, id, last4, parent, parent_id, test, token, zip_check. Inlined  */ trait Card
  extends StObject
     with CardCamel
object Card {
  
  inline def apply(token: String): Card = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
}

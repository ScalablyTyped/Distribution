package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.CoinInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomFee
  extends StObject
     with _UiEvent {
  
  var payload: CoinInfo
  
  var `type`: /* "ui-update_custom_fee" */ String
}
object UpdateCustomFee {
  
  inline def apply(payload: CoinInfo, `type`: /* "ui-update_custom_fee" */ String): UpdateCustomFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomFee]
  }
  
  extension [Self <: UpdateCustomFee](x: Self) {
    
    inline def setPayload(value: CoinInfo): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-update_custom_fee" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

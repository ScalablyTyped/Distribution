package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.AccountTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectAccount
  extends StObject
     with _UiEvent {
  
  var payload: AccountTypes
  
  var `type`: /* "ui-select_account" */ String
}
object SelectAccount {
  
  inline def apply(payload: AccountTypes, `type`: /* "ui-select_account" */ String): SelectAccount = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectAccount]
  }
  
  extension [Self <: SelectAccount](x: Self) {
    
    inline def setPayload(value: AccountTypes): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-select_account" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

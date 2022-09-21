package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedPassphraseStateRequest extends StObject {
  
  var state: js.UndefOr[String] = js.undefined
}
object DeprecatedPassphraseStateRequest {
  
  inline def apply(): DeprecatedPassphraseStateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprecatedPassphraseStateRequest]
  }
  
  extension [Self <: DeprecatedPassphraseStateRequest](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

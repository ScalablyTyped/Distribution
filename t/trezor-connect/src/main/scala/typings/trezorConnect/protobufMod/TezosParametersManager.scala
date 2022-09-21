package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosParametersManager extends StObject {
  
  var cancel_delegate: js.UndefOr[Boolean] = js.undefined
  
  var set_delegate: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var transfer: js.UndefOr[TezosManagerTransfer] = js.undefined
}
object TezosParametersManager {
  
  inline def apply(): TezosParametersManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TezosParametersManager]
  }
  
  extension [Self <: TezosParametersManager](x: Self) {
    
    inline def setCancel_delegate(value: Boolean): Self = StObject.set(x, "cancel_delegate", value.asInstanceOf[js.Any])
    
    inline def setCancel_delegateUndefined: Self = StObject.set(x, "cancel_delegate", js.undefined)
    
    inline def setSet_delegate(value: js.typedarray.Uint8Array): Self = StObject.set(x, "set_delegate", value.asInstanceOf[js.Any])
    
    inline def setSet_delegateUndefined: Self = StObject.set(x, "set_delegate", js.undefined)
    
    inline def setTransfer(value: TezosManagerTransfer): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
  }
}

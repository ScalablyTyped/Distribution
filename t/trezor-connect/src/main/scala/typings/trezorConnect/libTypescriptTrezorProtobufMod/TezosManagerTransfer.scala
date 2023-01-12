package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosManagerTransfer extends StObject {
  
  var amount: UintType
  
  var destination: TezosContractID
}
object TezosManagerTransfer {
  
  inline def apply(amount: UintType, destination: TezosContractID): TezosManagerTransfer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosManagerTransfer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TezosManagerTransfer] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: TezosContractID): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}

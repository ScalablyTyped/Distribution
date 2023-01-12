package typings.trezorConnect.libTypescriptNetworksNemMod

import typings.trezorConnect.libTypescriptTrezorProtobufMod.UintType
import typings.trezorConnect.trezorConnectInts.`0x0101`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMTransferTransaction
  extends StObject
     with TransactionCommon
     with NEMRegularTransaction {
  
  var amount: UintType
  
  var message: js.UndefOr[Message] = js.undefined
  
  var mosaics: js.UndefOr[js.Array[NEMMosaic]] = js.undefined
  
  var recipient: String
  
  var `type`: `0x0101`
}
object NEMTransferTransaction {
  
  inline def apply(
    amount: UintType,
    deadline: Double,
    fee: Double,
    recipient: String,
    timeStamp: Double,
    version: Double
  ): NEMTransferTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x0101)
    __obj.asInstanceOf[NEMTransferTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMTransferTransaction] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMosaics(value: js.Array[NEMMosaic]): Self = StObject.set(x, "mosaics", value.asInstanceOf[js.Any])
    
    inline def setMosaicsUndefined: Self = StObject.set(x, "mosaics", js.undefined)
    
    inline def setMosaicsVarargs(value: NEMMosaic*): Self = StObject.set(x, "mosaics", js.Array(value*))
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x0101`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

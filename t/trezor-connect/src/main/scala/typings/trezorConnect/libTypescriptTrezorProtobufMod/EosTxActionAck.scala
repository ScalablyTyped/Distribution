package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosTxActionAck extends StObject {
  
  var buy_ram: js.UndefOr[EosActionBuyRam] = js.undefined
  
  var buy_ram_bytes: js.UndefOr[EosActionBuyRamBytes] = js.undefined
  
  var common: EosActionCommon
  
  var delegate: js.UndefOr[EosActionDelegate] = js.undefined
  
  var delete_auth: js.UndefOr[EosActionDeleteAuth] = js.undefined
  
  var link_auth: js.UndefOr[EosActionLinkAuth] = js.undefined
  
  var new_account: js.UndefOr[EosActionNewAccount] = js.undefined
  
  var refund: js.UndefOr[EosActionRefund] = js.undefined
  
  var sell_ram: js.UndefOr[EosActionSellRam] = js.undefined
  
  var transfer: js.UndefOr[EosActionTransfer] = js.undefined
  
  var undelegate: js.UndefOr[EosActionUndelegate] = js.undefined
  
  var unknown: js.UndefOr[EosActionUnknown] = js.undefined
  
  var unlink_auth: js.UndefOr[EosActionUnlinkAuth] = js.undefined
  
  var update_auth: js.UndefOr[EosActionUpdateAuth] = js.undefined
  
  var vote_producer: js.UndefOr[EosActionVoteProducer] = js.undefined
}
object EosTxActionAck {
  
  inline def apply(common: EosActionCommon): EosTxActionAck = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosTxActionAck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EosTxActionAck] (val x: Self) extends AnyVal {
    
    inline def setBuy_ram(value: EosActionBuyRam): Self = StObject.set(x, "buy_ram", value.asInstanceOf[js.Any])
    
    inline def setBuy_ramUndefined: Self = StObject.set(x, "buy_ram", js.undefined)
    
    inline def setBuy_ram_bytes(value: EosActionBuyRamBytes): Self = StObject.set(x, "buy_ram_bytes", value.asInstanceOf[js.Any])
    
    inline def setBuy_ram_bytesUndefined: Self = StObject.set(x, "buy_ram_bytes", js.undefined)
    
    inline def setCommon(value: EosActionCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setDelegate(value: EosActionDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setDelete_auth(value: EosActionDeleteAuth): Self = StObject.set(x, "delete_auth", value.asInstanceOf[js.Any])
    
    inline def setDelete_authUndefined: Self = StObject.set(x, "delete_auth", js.undefined)
    
    inline def setLink_auth(value: EosActionLinkAuth): Self = StObject.set(x, "link_auth", value.asInstanceOf[js.Any])
    
    inline def setLink_authUndefined: Self = StObject.set(x, "link_auth", js.undefined)
    
    inline def setNew_account(value: EosActionNewAccount): Self = StObject.set(x, "new_account", value.asInstanceOf[js.Any])
    
    inline def setNew_accountUndefined: Self = StObject.set(x, "new_account", js.undefined)
    
    inline def setRefund(value: EosActionRefund): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    inline def setRefundUndefined: Self = StObject.set(x, "refund", js.undefined)
    
    inline def setSell_ram(value: EosActionSellRam): Self = StObject.set(x, "sell_ram", value.asInstanceOf[js.Any])
    
    inline def setSell_ramUndefined: Self = StObject.set(x, "sell_ram", js.undefined)
    
    inline def setTransfer(value: EosActionTransfer): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setUndelegate(value: EosActionUndelegate): Self = StObject.set(x, "undelegate", value.asInstanceOf[js.Any])
    
    inline def setUndelegateUndefined: Self = StObject.set(x, "undelegate", js.undefined)
    
    inline def setUnknown(value: EosActionUnknown): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    
    inline def setUnlink_auth(value: EosActionUnlinkAuth): Self = StObject.set(x, "unlink_auth", value.asInstanceOf[js.Any])
    
    inline def setUnlink_authUndefined: Self = StObject.set(x, "unlink_auth", js.undefined)
    
    inline def setUpdate_auth(value: EosActionUpdateAuth): Self = StObject.set(x, "update_auth", value.asInstanceOf[js.Any])
    
    inline def setUpdate_authUndefined: Self = StObject.set(x, "update_auth", js.undefined)
    
    inline def setVote_producer(value: EosActionVoteProducer): Self = StObject.set(x, "vote_producer", value.asInstanceOf[js.Any])
    
    inline def setVote_producerUndefined: Self = StObject.set(x, "vote_producer", js.undefined)
  }
}

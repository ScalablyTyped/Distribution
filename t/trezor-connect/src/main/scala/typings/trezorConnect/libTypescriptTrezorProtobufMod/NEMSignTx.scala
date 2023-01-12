package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMSignTx extends StObject {
  
  var aggregate_modification: js.UndefOr[NEMAggregateModification] = js.undefined
  
  var cosigning: js.UndefOr[Boolean] = js.undefined
  
  var importance_transfer: js.UndefOr[NEMImportanceTransfer] = js.undefined
  
  var mosaic_creation: js.UndefOr[NEMMosaicCreation] = js.undefined
  
  var multisig: js.UndefOr[NEMTransactionCommon] = js.undefined
  
  var provision_namespace: js.UndefOr[NEMProvisionNamespace] = js.undefined
  
  var supply_change: js.UndefOr[NEMMosaicSupplyChange] = js.undefined
  
  var transaction: NEMTransactionCommon
  
  var transfer: js.UndefOr[NEMTransfer] = js.undefined
}
object NEMSignTx {
  
  inline def apply(transaction: NEMTransactionCommon): NEMSignTx = {
    val __obj = js.Dynamic.literal(transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMSignTx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMSignTx] (val x: Self) extends AnyVal {
    
    inline def setAggregate_modification(value: NEMAggregateModification): Self = StObject.set(x, "aggregate_modification", value.asInstanceOf[js.Any])
    
    inline def setAggregate_modificationUndefined: Self = StObject.set(x, "aggregate_modification", js.undefined)
    
    inline def setCosigning(value: Boolean): Self = StObject.set(x, "cosigning", value.asInstanceOf[js.Any])
    
    inline def setCosigningUndefined: Self = StObject.set(x, "cosigning", js.undefined)
    
    inline def setImportance_transfer(value: NEMImportanceTransfer): Self = StObject.set(x, "importance_transfer", value.asInstanceOf[js.Any])
    
    inline def setImportance_transferUndefined: Self = StObject.set(x, "importance_transfer", js.undefined)
    
    inline def setMosaic_creation(value: NEMMosaicCreation): Self = StObject.set(x, "mosaic_creation", value.asInstanceOf[js.Any])
    
    inline def setMosaic_creationUndefined: Self = StObject.set(x, "mosaic_creation", js.undefined)
    
    inline def setMultisig(value: NEMTransactionCommon): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
    
    inline def setMultisigUndefined: Self = StObject.set(x, "multisig", js.undefined)
    
    inline def setProvision_namespace(value: NEMProvisionNamespace): Self = StObject.set(x, "provision_namespace", value.asInstanceOf[js.Any])
    
    inline def setProvision_namespaceUndefined: Self = StObject.set(x, "provision_namespace", js.undefined)
    
    inline def setSupply_change(value: NEMMosaicSupplyChange): Self = StObject.set(x, "supply_change", value.asInstanceOf[js.Any])
    
    inline def setSupply_changeUndefined: Self = StObject.set(x, "supply_change", js.undefined)
    
    inline def setTransaction(value: NEMTransactionCommon): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransfer(value: NEMTransfer): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
  }
}

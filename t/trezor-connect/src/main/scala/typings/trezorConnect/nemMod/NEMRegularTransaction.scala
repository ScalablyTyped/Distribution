package typings.trezorConnect.nemMod

import typings.trezorConnect.anon.Mode
import typings.trezorConnect.anon.RelativeChange
import typings.trezorConnect.protobufMod.UintType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.nemMod.NEMTransferTransaction
  - typings.trezorConnect.nemMod.NEMImportanceTransaction
  - typings.trezorConnect.nemMod.NEMAggregateModificationTransaction
  - typings.trezorConnect.nemMod.NEMProvisionNamespaceTransaction
  - typings.trezorConnect.nemMod.NEMMosaicCreationTransaction
  - typings.trezorConnect.nemMod.NEMSupplyChangeTransaction
*/
trait NEMRegularTransaction
  extends StObject
     with NEMTransaction
object NEMRegularTransaction {
  
  inline def NEMAggregateModificationTransaction(
    deadline: Double,
    fee: Double,
    minCosignatories: RelativeChange,
    timeStamp: Double,
    version: Double
  ): typings.trezorConnect.nemMod.NEMAggregateModificationTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], minCosignatories = minCosignatories.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x1001)
    __obj.asInstanceOf[typings.trezorConnect.nemMod.NEMAggregateModificationTransaction]
  }
  
  inline def NEMImportanceTransaction(deadline: Double, fee: Double, importanceTransfer: Mode, timeStamp: Double, version: Double): typings.trezorConnect.nemMod.NEMImportanceTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], importanceTransfer = importanceTransfer.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x0801)
    __obj.asInstanceOf[typings.trezorConnect.nemMod.NEMImportanceTransaction]
  }
  
  inline def NEMMosaicCreationTransaction(
    creationFee: Double,
    creationFeeSink: String,
    deadline: Double,
    fee: Double,
    mosaicDefinition: MosaicDefinition,
    timeStamp: Double,
    version: Double
  ): typings.trezorConnect.nemMod.NEMMosaicCreationTransaction = {
    val __obj = js.Dynamic.literal(creationFee = creationFee.asInstanceOf[js.Any], creationFeeSink = creationFeeSink.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], mosaicDefinition = mosaicDefinition.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x4001)
    __obj.asInstanceOf[typings.trezorConnect.nemMod.NEMMosaicCreationTransaction]
  }
  
  inline def NEMProvisionNamespaceTransaction(
    deadline: Double,
    fee: Double,
    newPart: String,
    rentalFee: Double,
    rentalFeeSink: String,
    timeStamp: Double,
    version: Double
  ): typings.trezorConnect.nemMod.NEMProvisionNamespaceTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], newPart = newPart.asInstanceOf[js.Any], rentalFee = rentalFee.asInstanceOf[js.Any], rentalFeeSink = rentalFeeSink.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x2001)
    __obj.asInstanceOf[typings.trezorConnect.nemMod.NEMProvisionNamespaceTransaction]
  }
  
  inline def NEMSupplyChangeTransaction(
    deadline: Double,
    delta: Double,
    fee: Double,
    mosaicId: MosaicID,
    supplyType: Double,
    timeStamp: Double,
    version: Double
  ): typings.trezorConnect.nemMod.NEMSupplyChangeTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], mosaicId = mosaicId.asInstanceOf[js.Any], supplyType = supplyType.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x4002)
    __obj.asInstanceOf[typings.trezorConnect.nemMod.NEMSupplyChangeTransaction]
  }
  
  inline def NEMTransferTransaction(
    amount: UintType,
    deadline: Double,
    fee: Double,
    recipient: String,
    timeStamp: Double,
    version: Double
  ): typings.trezorConnect.nemMod.NEMTransferTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x0101)
    __obj.asInstanceOf[typings.trezorConnect.nemMod.NEMTransferTransaction]
  }
}

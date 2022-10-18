package typings.trezorConnect.libTypescriptNetworksStellarMod

import typings.trezorConnect.anon.D
import typings.trezorConnect.libTypescriptTrezorProtobufMod.StellarAssetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarCreateAccountOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPaymentOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPathPaymentStrictReceiveOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPathPaymentStrictSendOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPassiveSellOfferOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageSellOfferOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageBuyOfferOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarSetOptionsOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarChangeTrustOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarAllowTrustOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarAccountMergeOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarInflationOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageDataOperation
  - typings.trezorConnect.libTypescriptNetworksStellarMod.StellarBumpSequenceOperation
*/
trait StellarOperation extends StObject
object StellarOperation {
  
  inline def StellarAccountMergeOperation(destination: String): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarAccountMergeOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("accountMerge")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarAccountMergeOperation]
  }
  
  inline def StellarAllowTrustOperation(assetCode: String, assetType: StellarAssetType, trustor: String): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarAllowTrustOperation = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], assetType = assetType.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("allowTrust")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarAllowTrustOperation]
  }
  
  inline def StellarBumpSequenceOperation(bumpTo: String): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarBumpSequenceOperation = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bumpSequence")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarBumpSequenceOperation]
  }
  
  inline def StellarChangeTrustOperation(limit: String, line: StellarAsset): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarChangeTrustOperation = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("changeTrust")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarChangeTrustOperation]
  }
  
  inline def StellarCreateAccountOperation(destination: String, startingBalance: String): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarCreateAccountOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("createAccount")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarCreateAccountOperation]
  }
  
  inline def StellarInflationOperation(): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarInflationOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("inflation")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarInflationOperation]
  }
  
  inline def StellarManageBuyOfferOperation(amount: String, buying: StellarAsset, price: D, selling: StellarAsset): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageBuyOfferOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manageBuyOffer")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageBuyOfferOperation]
  }
  
  inline def StellarManageDataOperation(name: String): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageDataOperation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manageData")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageDataOperation]
  }
  
  inline def StellarManageSellOfferOperation(amount: String, buying: StellarAsset, price: D, selling: StellarAsset): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageSellOfferOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manageSellOffer")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarManageSellOfferOperation]
  }
  
  inline def StellarPassiveSellOfferOperation(amount: String, buying: StellarAsset, price: D, selling: StellarAsset): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPassiveSellOfferOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("createPassiveSellOffer")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPassiveSellOfferOperation]
  }
  
  inline def StellarPathPaymentStrictReceiveOperation(
    destAmount: String,
    destAsset: StellarAsset,
    destination: String,
    sendAsset: StellarAsset,
    sendMax: String
  ): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPathPaymentStrictReceiveOperation = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pathPaymentStrictReceive")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPathPaymentStrictReceiveOperation]
  }
  
  inline def StellarPathPaymentStrictSendOperation(
    destAsset: StellarAsset,
    destMin: String,
    destination: String,
    sendAmount: String,
    sendAsset: StellarAsset
  ): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPathPaymentStrictSendOperation = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pathPaymentStrictSend")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPathPaymentStrictSendOperation]
  }
  
  inline def StellarPaymentOperation(amount: String, asset: StellarAsset, destination: String): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPaymentOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("payment")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarPaymentOperation]
  }
  
  inline def StellarSetOptionsOperation(): typings.trezorConnect.libTypescriptNetworksStellarMod.StellarSetOptionsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("setOptions")
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksStellarMod.StellarSetOptionsOperation]
  }
}

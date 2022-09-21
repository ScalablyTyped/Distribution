package typings.trezorConnect.stellarMod

import typings.trezorConnect.anon.D
import typings.trezorConnect.protobufMod.StellarAssetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.stellarMod.StellarCreateAccountOperation
  - typings.trezorConnect.stellarMod.StellarPaymentOperation
  - typings.trezorConnect.stellarMod.StellarPathPaymentStrictReceiveOperation
  - typings.trezorConnect.stellarMod.StellarPathPaymentStrictSendOperation
  - typings.trezorConnect.stellarMod.StellarPassiveSellOfferOperation
  - typings.trezorConnect.stellarMod.StellarManageSellOfferOperation
  - typings.trezorConnect.stellarMod.StellarManageBuyOfferOperation
  - typings.trezorConnect.stellarMod.StellarSetOptionsOperation
  - typings.trezorConnect.stellarMod.StellarChangeTrustOperation
  - typings.trezorConnect.stellarMod.StellarAllowTrustOperation
  - typings.trezorConnect.stellarMod.StellarAccountMergeOperation
  - typings.trezorConnect.stellarMod.StellarInflationOperation
  - typings.trezorConnect.stellarMod.StellarManageDataOperation
  - typings.trezorConnect.stellarMod.StellarBumpSequenceOperation
*/
trait StellarOperation extends StObject
object StellarOperation {
  
  inline def StellarAccountMergeOperation(destination: String): typings.trezorConnect.stellarMod.StellarAccountMergeOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("accountMerge")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarAccountMergeOperation]
  }
  
  inline def StellarAllowTrustOperation(assetCode: String, assetType: StellarAssetType, trustor: String): typings.trezorConnect.stellarMod.StellarAllowTrustOperation = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], assetType = assetType.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("allowTrust")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarAllowTrustOperation]
  }
  
  inline def StellarBumpSequenceOperation(bumpTo: String): typings.trezorConnect.stellarMod.StellarBumpSequenceOperation = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bumpSequence")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarBumpSequenceOperation]
  }
  
  inline def StellarChangeTrustOperation(limit: String, line: StellarAsset): typings.trezorConnect.stellarMod.StellarChangeTrustOperation = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("changeTrust")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarChangeTrustOperation]
  }
  
  inline def StellarCreateAccountOperation(destination: String, startingBalance: String): typings.trezorConnect.stellarMod.StellarCreateAccountOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("createAccount")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarCreateAccountOperation]
  }
  
  inline def StellarInflationOperation(): typings.trezorConnect.stellarMod.StellarInflationOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("inflation")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarInflationOperation]
  }
  
  inline def StellarManageBuyOfferOperation(amount: String, buying: StellarAsset, price: D, selling: StellarAsset): typings.trezorConnect.stellarMod.StellarManageBuyOfferOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manageBuyOffer")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarManageBuyOfferOperation]
  }
  
  inline def StellarManageDataOperation(name: String): typings.trezorConnect.stellarMod.StellarManageDataOperation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manageData")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarManageDataOperation]
  }
  
  inline def StellarManageSellOfferOperation(amount: String, buying: StellarAsset, price: D, selling: StellarAsset): typings.trezorConnect.stellarMod.StellarManageSellOfferOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manageSellOffer")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarManageSellOfferOperation]
  }
  
  inline def StellarPassiveSellOfferOperation(amount: String, buying: StellarAsset, price: D, selling: StellarAsset): typings.trezorConnect.stellarMod.StellarPassiveSellOfferOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("createPassiveSellOffer")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarPassiveSellOfferOperation]
  }
  
  inline def StellarPathPaymentStrictReceiveOperation(
    destAmount: String,
    destAsset: StellarAsset,
    destination: String,
    sendAsset: StellarAsset,
    sendMax: String
  ): typings.trezorConnect.stellarMod.StellarPathPaymentStrictReceiveOperation = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pathPaymentStrictReceive")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarPathPaymentStrictReceiveOperation]
  }
  
  inline def StellarPathPaymentStrictSendOperation(
    destAsset: StellarAsset,
    destMin: String,
    destination: String,
    sendAmount: String,
    sendAsset: StellarAsset
  ): typings.trezorConnect.stellarMod.StellarPathPaymentStrictSendOperation = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pathPaymentStrictSend")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarPathPaymentStrictSendOperation]
  }
  
  inline def StellarPaymentOperation(amount: String, asset: StellarAsset, destination: String): typings.trezorConnect.stellarMod.StellarPaymentOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("payment")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarPaymentOperation]
  }
  
  inline def StellarSetOptionsOperation(): typings.trezorConnect.stellarMod.StellarSetOptionsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("setOptions")
    __obj.asInstanceOf[typings.trezorConnect.stellarMod.StellarSetOptionsOperation]
  }
}

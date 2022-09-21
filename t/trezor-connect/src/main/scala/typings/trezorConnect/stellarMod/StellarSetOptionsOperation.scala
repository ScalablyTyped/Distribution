package typings.trezorConnect.stellarMod

import typings.trezorConnect.anon.Key
import typings.trezorConnect.protobufMod.UintType
import typings.trezorConnect.trezorConnectStrings.setOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarSetOptionsOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "inflation_destination_account"
  var clearFlags: js.UndefOr[Double] = js.undefined
  
  // Proto: "medium_threshold"
  var highThreshold: js.UndefOr[UintType] = js.undefined
  
  // Proto: "high_threshold"
  var homeDomain: js.UndefOr[String] = js.undefined
  
  var inflationDest: js.UndefOr[String] = js.undefined
  
  // Proto: "master_weight"
  var lowThreshold: js.UndefOr[UintType] = js.undefined
  
  // Proto: "set_flags"
  var masterWeight: js.UndefOr[UintType] = js.undefined
  
  // Proto: "low_threshold"
  var medThreshold: js.UndefOr[UintType] = js.undefined
  
  // Proto: "clear_flags"
  var setFlags: js.UndefOr[Double] = js.undefined
  
  // Proto: "source_account"
  var signer: js.UndefOr[Key] = js.undefined
  
  // Proto: "StellarSetOptionsOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: setOptions
}
object StellarSetOptionsOperation {
  
  inline def apply(): StellarSetOptionsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("setOptions")
    __obj.asInstanceOf[StellarSetOptionsOperation]
  }
  
  extension [Self <: StellarSetOptionsOperation](x: Self) {
    
    inline def setClearFlags(value: Double): Self = StObject.set(x, "clearFlags", value.asInstanceOf[js.Any])
    
    inline def setClearFlagsUndefined: Self = StObject.set(x, "clearFlags", js.undefined)
    
    inline def setHighThreshold(value: UintType): Self = StObject.set(x, "highThreshold", value.asInstanceOf[js.Any])
    
    inline def setHighThresholdUndefined: Self = StObject.set(x, "highThreshold", js.undefined)
    
    inline def setHomeDomain(value: String): Self = StObject.set(x, "homeDomain", value.asInstanceOf[js.Any])
    
    inline def setHomeDomainUndefined: Self = StObject.set(x, "homeDomain", js.undefined)
    
    inline def setInflationDest(value: String): Self = StObject.set(x, "inflationDest", value.asInstanceOf[js.Any])
    
    inline def setInflationDestUndefined: Self = StObject.set(x, "inflationDest", js.undefined)
    
    inline def setLowThreshold(value: UintType): Self = StObject.set(x, "lowThreshold", value.asInstanceOf[js.Any])
    
    inline def setLowThresholdUndefined: Self = StObject.set(x, "lowThreshold", js.undefined)
    
    inline def setMasterWeight(value: UintType): Self = StObject.set(x, "masterWeight", value.asInstanceOf[js.Any])
    
    inline def setMasterWeightUndefined: Self = StObject.set(x, "masterWeight", js.undefined)
    
    inline def setMedThreshold(value: UintType): Self = StObject.set(x, "medThreshold", value.asInstanceOf[js.Any])
    
    inline def setMedThresholdUndefined: Self = StObject.set(x, "medThreshold", js.undefined)
    
    inline def setSetFlags(value: Double): Self = StObject.set(x, "setFlags", value.asInstanceOf[js.Any])
    
    inline def setSetFlagsUndefined: Self = StObject.set(x, "setFlags", js.undefined)
    
    inline def setSigner(value: Key): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: setOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

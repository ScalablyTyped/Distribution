package typings.trezorConnect.protobufMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarSetOptionsOp extends StObject {
  
  var clear_flags: js.UndefOr[Double] = js.undefined
  
  var high_threshold: js.UndefOr[UintType] = js.undefined
  
  var home_domain: js.UndefOr[String] = js.undefined
  
  var inflation_destination_account: js.UndefOr[String] = js.undefined
  
  var low_threshold: js.UndefOr[UintType] = js.undefined
  
  var master_weight: js.UndefOr[UintType] = js.undefined
  
  var medium_threshold: js.UndefOr[UintType] = js.undefined
  
  var set_flags: js.UndefOr[Double] = js.undefined
  
  var signer_key: js.UndefOr[Buffer | String] = js.undefined
  
  var signer_type: js.UndefOr[StellarSignerType] = js.undefined
  
  var signer_weight: js.UndefOr[Double] = js.undefined
  
  var source_account: js.UndefOr[String] = js.undefined
}
object StellarSetOptionsOp {
  
  inline def apply(): StellarSetOptionsOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StellarSetOptionsOp]
  }
  
  extension [Self <: StellarSetOptionsOp](x: Self) {
    
    inline def setClear_flags(value: Double): Self = StObject.set(x, "clear_flags", value.asInstanceOf[js.Any])
    
    inline def setClear_flagsUndefined: Self = StObject.set(x, "clear_flags", js.undefined)
    
    inline def setHigh_threshold(value: UintType): Self = StObject.set(x, "high_threshold", value.asInstanceOf[js.Any])
    
    inline def setHigh_thresholdUndefined: Self = StObject.set(x, "high_threshold", js.undefined)
    
    inline def setHome_domain(value: String): Self = StObject.set(x, "home_domain", value.asInstanceOf[js.Any])
    
    inline def setHome_domainUndefined: Self = StObject.set(x, "home_domain", js.undefined)
    
    inline def setInflation_destination_account(value: String): Self = StObject.set(x, "inflation_destination_account", value.asInstanceOf[js.Any])
    
    inline def setInflation_destination_accountUndefined: Self = StObject.set(x, "inflation_destination_account", js.undefined)
    
    inline def setLow_threshold(value: UintType): Self = StObject.set(x, "low_threshold", value.asInstanceOf[js.Any])
    
    inline def setLow_thresholdUndefined: Self = StObject.set(x, "low_threshold", js.undefined)
    
    inline def setMaster_weight(value: UintType): Self = StObject.set(x, "master_weight", value.asInstanceOf[js.Any])
    
    inline def setMaster_weightUndefined: Self = StObject.set(x, "master_weight", js.undefined)
    
    inline def setMedium_threshold(value: UintType): Self = StObject.set(x, "medium_threshold", value.asInstanceOf[js.Any])
    
    inline def setMedium_thresholdUndefined: Self = StObject.set(x, "medium_threshold", js.undefined)
    
    inline def setSet_flags(value: Double): Self = StObject.set(x, "set_flags", value.asInstanceOf[js.Any])
    
    inline def setSet_flagsUndefined: Self = StObject.set(x, "set_flags", js.undefined)
    
    inline def setSigner_key(value: Buffer | String): Self = StObject.set(x, "signer_key", value.asInstanceOf[js.Any])
    
    inline def setSigner_keyUndefined: Self = StObject.set(x, "signer_key", js.undefined)
    
    inline def setSigner_type(value: StellarSignerType): Self = StObject.set(x, "signer_type", value.asInstanceOf[js.Any])
    
    inline def setSigner_typeUndefined: Self = StObject.set(x, "signer_type", js.undefined)
    
    inline def setSigner_weight(value: Double): Self = StObject.set(x, "signer_weight", value.asInstanceOf[js.Any])
    
    inline def setSigner_weightUndefined: Self = StObject.set(x, "signer_weight", js.undefined)
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
  }
}

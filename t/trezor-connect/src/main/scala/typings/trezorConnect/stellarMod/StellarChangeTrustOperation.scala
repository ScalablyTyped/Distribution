package typings.trezorConnect.stellarMod

import typings.trezorConnect.trezorConnectStrings.changeTrust
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarChangeTrustOperation
  extends StObject
     with StellarOperation {
  
  // Proto: ok
  var limit: String
  
  // Proto: "source_account"
  var line: StellarAsset
  
  // Proto: "StellarChangeTrustOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: changeTrust
}
object StellarChangeTrustOperation {
  
  inline def apply(limit: String, line: StellarAsset): StellarChangeTrustOperation = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("changeTrust")
    __obj.asInstanceOf[StellarChangeTrustOperation]
  }
  
  extension [Self <: StellarChangeTrustOperation](x: Self) {
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLine(value: StellarAsset): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: changeTrust): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

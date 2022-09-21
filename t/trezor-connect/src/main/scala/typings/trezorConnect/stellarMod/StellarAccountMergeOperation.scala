package typings.trezorConnect.stellarMod

import typings.trezorConnect.trezorConnectStrings.accountMerge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarAccountMergeOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "source_account"
  var destination: String
  
  // Proto: "StellarAccountMergeOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: accountMerge
}
object StellarAccountMergeOperation {
  
  inline def apply(destination: String): StellarAccountMergeOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("accountMerge")
    __obj.asInstanceOf[StellarAccountMergeOperation]
  }
  
  extension [Self <: StellarAccountMergeOperation](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: accountMerge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

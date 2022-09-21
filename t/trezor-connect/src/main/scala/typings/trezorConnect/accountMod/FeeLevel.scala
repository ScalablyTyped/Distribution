package typings.trezorConnect.accountMod

import typings.trezorConnect.trezorConnectStrings.custom
import typings.trezorConnect.trezorConnectStrings.economy_
import typings.trezorConnect.trezorConnectStrings.high_
import typings.trezorConnect.trezorConnectStrings.low_
import typings.trezorConnect.trezorConnectStrings.normal_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeeLevel extends StObject {
  
  var blocks: Double
  
  var feeLimit: js.UndefOr[String] = js.undefined
  
  // eth gas limit
  var feePerTx: js.UndefOr[String] = js.undefined
  
  var feePerUnit: String
  
  var label: high_ | normal_ | economy_ | low_ | custom
}
object FeeLevel {
  
  inline def apply(blocks: Double, feePerUnit: String, label: high_ | normal_ | economy_ | low_ | custom): FeeLevel = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], feePerUnit = feePerUnit.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeLevel]
  }
  
  extension [Self <: FeeLevel](x: Self) {
    
    inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setFeeLimit(value: String): Self = StObject.set(x, "feeLimit", value.asInstanceOf[js.Any])
    
    inline def setFeeLimitUndefined: Self = StObject.set(x, "feeLimit", js.undefined)
    
    inline def setFeePerTx(value: String): Self = StObject.set(x, "feePerTx", value.asInstanceOf[js.Any])
    
    inline def setFeePerTxUndefined: Self = StObject.set(x, "feePerTx", js.undefined)
    
    inline def setFeePerUnit(value: String): Self = StObject.set(x, "feePerUnit", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: high_ | normal_ | economy_ | low_ | custom): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

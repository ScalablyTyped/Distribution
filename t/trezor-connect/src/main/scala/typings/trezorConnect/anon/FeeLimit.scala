package typings.trezorConnect.anon

import typings.trezorConnect.trezorConnectStrings.high_
import typings.trezorConnect.trezorConnectStrings.low_
import typings.trezorConnect.trezorConnectStrings.normal_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeeLimit extends StObject {
  
  var feeLimit: String
  
  var feePerUnit: String
  
  var label: high_ | normal_ | low_
}
object FeeLimit {
  
  inline def apply(feeLimit: String, feePerUnit: String, label: high_ | normal_ | low_): FeeLimit = {
    val __obj = js.Dynamic.literal(feeLimit = feeLimit.asInstanceOf[js.Any], feePerUnit = feePerUnit.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeeLimit] (val x: Self) extends AnyVal {
    
    inline def setFeeLimit(value: String): Self = StObject.set(x, "feeLimit", value.asInstanceOf[js.Any])
    
    inline def setFeePerUnit(value: String): Self = StObject.set(x, "feePerUnit", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: high_ | normal_ | low_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

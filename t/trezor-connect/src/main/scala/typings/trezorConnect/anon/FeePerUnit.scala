package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeePerUnit extends StObject {
  
  var feePerUnit: String
}
object FeePerUnit {
  
  inline def apply(feePerUnit: String): FeePerUnit = {
    val __obj = js.Dynamic.literal(feePerUnit = feePerUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeePerUnit]
  }
  
  extension [Self <: FeePerUnit](x: Self) {
    
    inline def setFeePerUnit(value: String): Self = StObject.set(x, "feePerUnit", value.asInstanceOf[js.Any])
  }
}

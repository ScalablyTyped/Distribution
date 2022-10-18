package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosTxActionRequest extends StObject {
  
  var data_size: js.UndefOr[Double] = js.undefined
}
object EosTxActionRequest {
  
  inline def apply(): EosTxActionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EosTxActionRequest]
  }
  
  extension [Self <: EosTxActionRequest](x: Self) {
    
    inline def setData_size(value: Double): Self = StObject.set(x, "data_size", value.asInstanceOf[js.Any])
    
    inline def setData_sizeUndefined: Self = StObject.set(x, "data_size", js.undefined)
  }
}

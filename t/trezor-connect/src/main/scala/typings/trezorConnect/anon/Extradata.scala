package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxAckResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extradata
  extends StObject
     with TxAckResponse {
  
  var extra_data: String
}
object Extradata {
  
  inline def apply(extra_data: String): Extradata = {
    val __obj = js.Dynamic.literal(extra_data = extra_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extradata]
  }
  
  extension [Self <: Extradata](x: Self) {
    
    inline def setExtra_data(value: String): Self = StObject.set(x, "extra_data", value.asInstanceOf[js.Any])
  }
}

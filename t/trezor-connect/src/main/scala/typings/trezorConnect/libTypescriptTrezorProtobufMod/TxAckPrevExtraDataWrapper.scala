package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckPrevExtraDataWrapper extends StObject {
  
  var extra_data_chunk: String
}
object TxAckPrevExtraDataWrapper {
  
  inline def apply(extra_data_chunk: String): TxAckPrevExtraDataWrapper = {
    val __obj = js.Dynamic.literal(extra_data_chunk = extra_data_chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckPrevExtraDataWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TxAckPrevExtraDataWrapper] (val x: Self) extends AnyVal {
    
    inline def setExtra_data_chunk(value: String): Self = StObject.set(x, "extra_data_chunk", value.asInstanceOf[js.Any])
  }
}

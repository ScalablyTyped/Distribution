package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordRequest extends StObject {
  
  var `type`: WordRequestType
}
object WordRequest {
  
  inline def apply(`type`: WordRequestType): WordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordRequest] (val x: Self) extends AnyVal {
    
    inline def setType(value: WordRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

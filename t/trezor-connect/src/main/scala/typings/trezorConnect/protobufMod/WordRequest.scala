package typings.trezorConnect.protobufMod

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
  
  extension [Self <: WordRequest](x: Self) {
    
    inline def setType(value: WordRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

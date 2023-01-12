package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipheredKeyValue extends StObject {
  
  var value: String
}
object CipheredKeyValue {
  
  inline def apply(value: String): CipheredKeyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipheredKeyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CipheredKeyValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangePin extends StObject {
  
  var remove: js.UndefOr[Boolean] = js.undefined
}
object ChangePin {
  
  inline def apply(): ChangePin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangePin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangePin] (val x: Self) extends AnyVal {
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}

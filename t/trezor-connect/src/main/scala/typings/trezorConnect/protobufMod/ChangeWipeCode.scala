package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeWipeCode extends StObject {
  
  var remove: js.UndefOr[Boolean] = js.undefined
}
object ChangeWipeCode {
  
  inline def apply(): ChangeWipeCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeWipeCode]
  }
  
  extension [Self <: ChangeWipeCode](x: Self) {
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}

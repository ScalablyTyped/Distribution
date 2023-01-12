package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMCosignatoryModification extends StObject {
  
  var public_key: String
  
  var `type`: NEMModificationType
}
object NEMCosignatoryModification {
  
  inline def apply(public_key: String, `type`: NEMModificationType): NEMCosignatoryModification = {
    val __obj = js.Dynamic.literal(public_key = public_key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMCosignatoryModification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMCosignatoryModification] (val x: Self) extends AnyVal {
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setType(value: NEMModificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

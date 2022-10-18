package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMAggregateModification extends StObject {
  
  var modifications: js.UndefOr[js.Array[NEMCosignatoryModification]] = js.undefined
  
  var relative_change: js.UndefOr[Double] = js.undefined
}
object NEMAggregateModification {
  
  inline def apply(): NEMAggregateModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NEMAggregateModification]
  }
  
  extension [Self <: NEMAggregateModification](x: Self) {
    
    inline def setModifications(value: js.Array[NEMCosignatoryModification]): Self = StObject.set(x, "modifications", value.asInstanceOf[js.Any])
    
    inline def setModificationsUndefined: Self = StObject.set(x, "modifications", js.undefined)
    
    inline def setModificationsVarargs(value: NEMCosignatoryModification*): Self = StObject.set(x, "modifications", js.Array(value*))
    
    inline def setRelative_change(value: Double): Self = StObject.set(x, "relative_change", value.asInstanceOf[js.Any])
    
    inline def setRelative_changeUndefined: Self = StObject.set(x, "relative_change", js.undefined)
  }
}

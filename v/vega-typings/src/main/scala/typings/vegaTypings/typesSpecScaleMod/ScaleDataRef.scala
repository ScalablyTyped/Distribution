package typings.vegaTypings.typesSpecScaleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleDataRef extends StObject {
  
  var data: String
  
  var field: ScaleField
}
object ScaleDataRef {
  
  inline def apply(data: String, field: ScaleField): ScaleDataRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDataRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleDataRef] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setField(value: ScaleField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}

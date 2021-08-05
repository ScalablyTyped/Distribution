package typings.vegaTypings.scaleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleMultiFieldsRef extends StObject {
  
  var data: String
  
  var fields: js.Array[ScaleField]
}
object ScaleMultiFieldsRef {
  
  inline def apply(data: String, fields: js.Array[ScaleField]): ScaleMultiFieldsRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiFieldsRef]
  }
  
  extension [Self <: ScaleMultiFieldsRef](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[ScaleField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: ScaleField*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}

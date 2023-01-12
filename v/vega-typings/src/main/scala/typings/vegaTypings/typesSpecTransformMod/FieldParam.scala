package typings.vegaTypings.typesSpecTransformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldParam
  extends StObject
     with TransformField {
  
  var field: String
}
object FieldParam {
  
  inline def apply(field: String): FieldParam = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldParam] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}

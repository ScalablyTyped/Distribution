package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldGroup extends StObject {
  
  var field: Group
}
object FieldGroup {
  
  inline def apply(field: Group): FieldGroup = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldGroup] (val x: Self) extends AnyVal {
    
    inline def setField(value: Group): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}

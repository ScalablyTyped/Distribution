package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecEncodeMod.BaseValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field
  extends StObject
     with BaseValueRef[Any] {
  
  var field: typings.vegaTypings.typesSpecEncodeMod.Field
}
object Field {
  
  inline def apply(field: typings.vegaTypings.typesSpecEncodeMod.Field): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    inline def setField(value: typings.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}

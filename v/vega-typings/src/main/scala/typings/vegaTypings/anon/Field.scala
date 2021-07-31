package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.BaseValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field
  extends StObject
     with BaseValueRef[js.Any] {
  
  var field: typings.vegaTypings.encodeMod.Field
}
object Field {
  
  @scala.inline
  def apply(field: typings.vegaTypings.encodeMod.Field): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}

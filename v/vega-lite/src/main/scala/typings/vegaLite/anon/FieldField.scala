package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldField extends StObject {
  
  var field: typings.vegaTypings.encodeMod.Field
}
object FieldField {
  
  @scala.inline
  def apply(field: typings.vegaTypings.encodeMod.Field): FieldField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldField]
  }
  
  @scala.inline
  implicit class FieldFieldMutableBuilder[Self <: FieldField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}

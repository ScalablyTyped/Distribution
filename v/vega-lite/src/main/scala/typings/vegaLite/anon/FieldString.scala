package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldString extends StObject {
  
  var field: String
}
object FieldString {
  
  @scala.inline
  def apply(field: String): FieldString = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldString]
  }
  
  @scala.inline
  implicit class FieldStringMutableBuilder[Self <: FieldString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}

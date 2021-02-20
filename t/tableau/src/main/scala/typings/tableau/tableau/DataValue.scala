package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataValue extends StObject {
  
  /** The value formatted according to the locale and the formatting applied to the field or parameter. */
  var formattedValue: String = js.native
  
  /** Contains the raw native value as a JavaScript type, which is one of String, Number, Boolean, or Date */
  var value: js.Any = js.native
}
object DataValue {
  
  @scala.inline
  def apply(formattedValue: String, value: js.Any): DataValue = {
    val __obj = js.Dynamic.literal(formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  
  @scala.inline
  implicit class DataValueMutableBuilder[Self <: DataValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

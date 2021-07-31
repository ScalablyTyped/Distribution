package typings.tableau.tableau

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pair extends StObject {
  
  /** The field name to which the value is applied. */
  var fieldName: String
  
  /** The value formatted according to the locale and the formatting applied to the field. */
  var formattedValue: String
  
  /** Contains the raw native value for the field as a JavaScript type, which is one of String, Number, Boolean, or Date. */
  var value: String | Double | Boolean | Date
}
object Pair {
  
  @scala.inline
  def apply(fieldName: String, formattedValue: String, value: String | Double | Boolean | Date): Pair = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair]
  }
  
  @scala.inline
  implicit class PairMutableBuilder[Self <: Pair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double | Boolean | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

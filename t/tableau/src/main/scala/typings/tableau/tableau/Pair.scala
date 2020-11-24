package typings.tableau.tableau

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pair extends js.Object {
  
  /** The field name to which the value is applied. */
  var fieldName: String = js.native
  
  /** The value formatted according to the locale and the formatting applied to the field. */
  var formattedValue: String = js.native
  
  /** Contains the raw native value for the field as a JavaScript type, which is one of String, Number, Boolean, or Date. */
  var value: String | Double | Boolean | Date = js.native
}
object Pair {
  
  @scala.inline
  def apply(fieldName: String, formattedValue: String, value: String | Double | Boolean | Date): Pair = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair]
  }
  
  @scala.inline
  implicit class PairOps[Self <: Pair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedValue(value: String): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double | Boolean | Date): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}

package typings.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlAvailability extends js.Object {
  
  var dateTimeFormat: Boolean = js.native
  
  var numberFormat: Boolean = js.native
}
object IntlAvailability {
  
  @scala.inline
  def apply(dateTimeFormat: Boolean, numberFormat: Boolean): IntlAvailability = {
    val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlAvailability]
  }
  
  @scala.inline
  implicit class IntlAvailabilityOps[Self <: IntlAvailability] (val x: Self) extends AnyVal {
    
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
    def setDateTimeFormat(value: Boolean): Self = this.set("dateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: Boolean): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
  }
}

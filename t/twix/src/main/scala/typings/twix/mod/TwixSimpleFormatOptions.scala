package typings.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwixSimpleFormatOptions extends js.Object {
  
  var allDay: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, _]] = js.native
}
object TwixSimpleFormatOptions {
  
  @scala.inline
  def apply(): TwixSimpleFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwixSimpleFormatOptions]
  }
  
  @scala.inline
  implicit class TwixSimpleFormatOptionsOps[Self <: TwixSimpleFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setAllDay(value: String): Self = this.set("allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDay: Self = this.set("allDay", js.undefined)
    
    @scala.inline
    def setTemplate(value: (/* left */ js.Any, /* right */ js.Any) => _): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}

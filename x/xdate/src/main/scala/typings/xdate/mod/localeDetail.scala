package typings.xdate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait localeDetail extends js.Object {
  
  var amDesignator: js.UndefOr[String] = js.native
  
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
  
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
  
  var pmDesignator: js.UndefOr[String] = js.native
}
object localeDetail {
  
  @scala.inline
  def apply(): localeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[localeDetail]
  }
  
  @scala.inline
  implicit class localeDetailOps[Self <: localeDetail] (val x: Self) extends AnyVal {
    
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
    def setAmDesignator(value: String): Self = this.set("amDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmDesignator: Self = this.set("amDesignator", js.undefined)
    
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayNames: Self = this.set("dayNames", js.undefined)
    
    @scala.inline
    def setDayNamesShortVarargs(value: String*): Self = this.set("dayNamesShort", js.Array(value :_*))
    
    @scala.inline
    def setDayNamesShort(value: js.Array[String]): Self = this.set("dayNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayNamesShort: Self = this.set("dayNamesShort", js.undefined)
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    
    @scala.inline
    def setMonthNamesShortVarargs(value: String*): Self = this.set("monthNamesShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthNamesShort(value: js.Array[String]): Self = this.set("monthNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNamesShort: Self = this.set("monthNamesShort", js.undefined)
    
    @scala.inline
    def setPmDesignator(value: String): Self = this.set("pmDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePmDesignator: Self = this.set("pmDesignator", js.undefined)
  }
}

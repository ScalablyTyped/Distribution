package typings.timezoneSupport.lookupConvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZoneOffset extends js.Object {
  
  var abbreviation: js.UndefOr[String] = js.native
  
  var offset: Double = js.native
}
object TimeZoneOffset {
  
  @scala.inline
  def apply(offset: Double): TimeZoneOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneOffset]
  }
  
  @scala.inline
  implicit class TimeZoneOffsetOps[Self <: TimeZoneOffset] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbreviation(value: String): Self = this.set("abbreviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbbreviation: Self = this.set("abbreviation", js.undefined)
  }
}

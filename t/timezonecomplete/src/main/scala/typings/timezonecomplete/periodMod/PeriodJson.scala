package typings.timezonecomplete.periodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeriodJson extends js.Object {
  
  /**
    * Interval as a timezonecomplete duration string
    */
  var duration: String = js.native
  
  /**
    * Daylight saving time handling
    */
  var periodDst: PeriodDstJson = js.native
  
  /**
    * Reference date as iso timestamp + time zone
    */
  var reference: String = js.native
}
object PeriodJson {
  
  @scala.inline
  def apply(duration: String, periodDst: PeriodDstJson, reference: String): PeriodJson = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], periodDst = periodDst.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodJson]
  }
  
  @scala.inline
  implicit class PeriodJsonOps[Self <: PeriodJson] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodDst(value: PeriodDstJson): Self = this.set("periodDst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}

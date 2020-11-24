package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Timeslice. */
@js.native
trait Timeslice extends js.Object {
  
  /** Used to indicate that anomaly detection should be performed. Anomaly detection is used to locate unusual datapoints within a time series. */
  var anomaly: js.UndefOr[Boolean] = js.native
  
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.native
  
  /** Interval of the aggregation. Valid date interval values are second/seconds minute/minutes, hour/hours, day/days, week/weeks, month/months, and year/years. */
  var interval: js.UndefOr[String] = js.native
}
object Timeslice {
  
  @scala.inline
  def apply(): Timeslice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeslice]
  }
  
  @scala.inline
  implicit class TimesliceOps[Self <: Timeslice] (val x: Self) extends AnyVal {
    
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
    def setAnomaly(value: Boolean): Self = this.set("anomaly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnomaly: Self = this.set("anomaly", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
}

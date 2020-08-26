package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing the schedule information for the source. */
@js.native
trait SourceSchedule extends js.Object {
  /** When `true`, the source is re-crawled based on the **frequency** field in this object. When `false` the source is not re-crawled; When `false` and connecting to Salesforce the source is crawled annually. */
  var enabled: js.UndefOr[Boolean] = js.native
  /** The crawl schedule in the specified **time_zone**. -  `daily`: Runs every day between 00:00 and 06:00. -  `weekly`: Runs every week on Sunday between 00:00 and 06:00. -  `monthly`: Runs the on the first Sunday of every month between 00:00 and 06:00. */
  var frequency: js.UndefOr[String] = js.native
  /** The time zone to base source crawl times on. Possible values correspond to the IANA (Internet Assigned Numbers Authority) time zones list. */
  var time_zone: js.UndefOr[String] = js.native
}

object SourceSchedule {
  @scala.inline
  def apply(): SourceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSchedule]
  }
  @scala.inline
  implicit class SourceScheduleOps[Self <: SourceSchedule] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFrequency(value: String): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setTime_zone(value: String): Self = this.set("time_zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime_zone: Self = this.set("time_zone", js.undefined)
  }
  
}


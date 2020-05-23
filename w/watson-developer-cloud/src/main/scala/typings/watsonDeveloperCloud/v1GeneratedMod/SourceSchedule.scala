package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing the schedule information for the source. */
trait SourceSchedule extends js.Object {
  /** When `true`, the source is re-crawled based on the **frequency** field in this object. When `false` the source is not re-crawled; When `false` and connecting to Salesforce the source is crawled annually. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** The crawl schedule in the specified **time_zone**. -  `daily`: Runs every day between 00:00 and 06:00. -  `weekly`: Runs every week on Sunday between 00:00 and 06:00. -  `monthly`: Runs the on the first Sunday of every month between 00:00 and 06:00. */
  var frequency: js.UndefOr[String] = js.undefined
  /** The time zone to base source crawl times on. Possible values correspond to the IANA (Internet Assigned Numbers Authority) time zones list. */
  var time_zone: js.UndefOr[String] = js.undefined
}

object SourceSchedule {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, frequency: String = null, time_zone: String = null): SourceSchedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSchedule]
  }
}


package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Timeslice. */
trait Timeslice extends js.Object {
  /** Used to indicate that anomaly detection should be performed. Anomaly detection is used to locate unusual datapoints within a time series. */
  var anomaly: js.UndefOr[Boolean] = js.undefined
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.undefined
  /** Interval of the aggregation. Valid date interval values are second/seconds minute/minutes, hour/hours, day/days, week/weeks, month/months, and year/years. */
  var interval: js.UndefOr[String] = js.undefined
}

object Timeslice {
  @scala.inline
  def apply(anomaly: js.UndefOr[Boolean] = js.undefined, field: String = null, interval: String = null): Timeslice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anomaly)) __obj.updateDynamic("anomaly")(anomaly.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeslice]
  }
}


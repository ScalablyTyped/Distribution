package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Histogram. */
trait Histogram extends js.Object {
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.undefined
  /** Interval of the aggregation. (For 'histogram' type). */
  var interval: js.UndefOr[Double] = js.undefined
}

object Histogram {
  @scala.inline
  def apply(field: String = null, interval: js.UndefOr[Double] = js.undefined): Histogram = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Histogram]
  }
}


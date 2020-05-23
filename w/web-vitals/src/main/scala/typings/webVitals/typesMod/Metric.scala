package typings.webVitals.typesMod

import typings.std.PerformanceEntry
import typings.webVitals.webVitalsStrings.CLS
import typings.webVitals.webVitalsStrings.FCP
import typings.webVitals.webVitalsStrings.FID
import typings.webVitals.webVitalsStrings.LCP
import typings.webVitals.webVitalsStrings.TTFB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  var delta: Double
  var entries: js.Array[PerformanceEntry]
  var id: String
  var isFinal: Boolean
  var name: CLS | FCP | FID | LCP | TTFB
  var value: Double
}

object Metric {
  @scala.inline
  def apply(
    delta: Double,
    entries: js.Array[PerformanceEntry],
    id: String,
    isFinal: Boolean,
    name: CLS | FCP | FID | LCP | TTFB,
    value: Double
  ): Metric = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFinal = isFinal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
}


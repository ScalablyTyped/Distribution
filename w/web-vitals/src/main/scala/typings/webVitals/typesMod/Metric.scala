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

@js.native
trait Metric extends js.Object {
  var delta: Double = js.native
  var entries: js.Array[PerformanceEntry] = js.native
  var id: String = js.native
  var isFinal: Boolean = js.native
  var name: CLS | FCP | FID | LCP | TTFB = js.native
  var value: Double = js.native
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
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntriesVarargs(value: PerformanceEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[PerformanceEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFinal(value: Boolean): Self = this.set("isFinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: CLS | FCP | FID | LCP | TTFB): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


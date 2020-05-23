package typings.webVitals

import typings.webVitals.typesMod.Metric
import typings.webVitals.webVitalsStrings.CLS
import typings.webVitals.webVitalsStrings.FCP
import typings.webVitals.webVitalsStrings.FID
import typings.webVitals.webVitalsStrings.LCP
import typings.webVitals.webVitalsStrings.TTFB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/lib/initMetric", JSImport.Namespace)
@js.native
object initMetricMod extends js.Object {
  @JSName("initMetric")
  def initMetric_CLS(name: CLS): Metric = js.native
  @JSName("initMetric")
  def initMetric_CLS(name: CLS, value: Double): Metric = js.native
  @JSName("initMetric")
  def initMetric_FCP(name: FCP): Metric = js.native
  @JSName("initMetric")
  def initMetric_FCP(name: FCP, value: Double): Metric = js.native
  @JSName("initMetric")
  def initMetric_FID(name: FID): Metric = js.native
  @JSName("initMetric")
  def initMetric_FID(name: FID, value: Double): Metric = js.native
  @JSName("initMetric")
  def initMetric_LCP(name: LCP): Metric = js.native
  @JSName("initMetric")
  def initMetric_LCP(name: LCP, value: Double): Metric = js.native
  @JSName("initMetric")
  def initMetric_TTFB(name: TTFB): Metric = js.native
  @JSName("initMetric")
  def initMetric_TTFB(name: TTFB, value: Double): Metric = js.native
}


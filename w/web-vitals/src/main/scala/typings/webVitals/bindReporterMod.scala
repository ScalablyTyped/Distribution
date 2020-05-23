package typings.webVitals

import typings.std.PerformanceObserver
import typings.webVitals.typesMod.Metric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/lib/bindReporter", JSImport.Namespace)
@js.native
object bindReporterMod extends js.Object {
  def bindReporter(callback: js.Function, metric: Metric): js.Function0[Unit] = js.native
  def bindReporter(callback: js.Function, metric: Metric, po: PerformanceObserver): js.Function0[Unit] = js.native
  def bindReporter(callback: js.Function, metric: Metric, po: PerformanceObserver, observeAllUpdates: Boolean): js.Function0[Unit] = js.native
}


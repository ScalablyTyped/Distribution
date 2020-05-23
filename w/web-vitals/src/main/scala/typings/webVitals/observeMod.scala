package typings.webVitals

import typings.std.PerformanceEntry
import typings.std.PerformanceObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/lib/observe", JSImport.Namespace)
@js.native
object observeMod extends js.Object {
  def observe(`type`: String, callback: PerformanceEntryHandler): js.UndefOr[PerformanceObserver] = js.native
  type PerformanceEntryHandler = js.Function1[/* entry */ PerformanceEntry, Unit]
}


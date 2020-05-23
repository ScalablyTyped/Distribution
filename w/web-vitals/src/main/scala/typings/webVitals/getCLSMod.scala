package typings.webVitals

import typings.webVitals.typesMod.ReportHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/getCLS", JSImport.Namespace)
@js.native
object getCLSMod extends js.Object {
  def getCLS(onReport: ReportHandler): Unit = js.native
  def getCLS(onReport: ReportHandler, reportAllChanges: Boolean): Unit = js.native
}


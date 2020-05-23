package typings.webVitals

import typings.webVitals.typesMod.ReportHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/getLCP", JSImport.Namespace)
@js.native
object getLCPMod extends js.Object {
  def getLCP(onReport: ReportHandler): Unit = js.native
  def getLCP(onReport: ReportHandler, reportAllChanges: Boolean): Unit = js.native
}


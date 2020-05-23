package typings.webVitals

import typings.webVitals.typesMod.ReportHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getCLS(onReport: ReportHandler): Unit = js.native
  def getCLS(onReport: ReportHandler, reportAllChanges: Boolean): Unit = js.native
  def getFCP(onReport: ReportHandler): Unit = js.native
  def getFID(onReport: ReportHandler): Unit = js.native
  def getLCP(onReport: ReportHandler): Unit = js.native
  def getLCP(onReport: ReportHandler, reportAllChanges: Boolean): Unit = js.native
  def getTTFB(onReport: ReportHandler): Unit = js.native
}


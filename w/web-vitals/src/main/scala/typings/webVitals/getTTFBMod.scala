package typings.webVitals

import typings.webVitals.typesMod.ReportHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/getTTFB", JSImport.Namespace)
@js.native
object getTTFBMod extends js.Object {
  def getTTFB(onReport: ReportHandler): Unit = js.native
}


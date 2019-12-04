package typings.styleDashValueDashTypes

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("style-value-types/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  val colorRegex: RegExp = js.native
  val floatRegex: RegExp = js.native
  val singleColorRegex: RegExp = js.native
  def clamp(min: Double, max: Double): js.Function1[/* v */ Double, Double] = js.native
  def sanitize(v: Double): Double = js.native
}


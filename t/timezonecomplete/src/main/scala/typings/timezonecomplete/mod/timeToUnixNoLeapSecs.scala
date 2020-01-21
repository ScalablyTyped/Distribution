package typings.timezonecomplete.mod

import typings.timezonecomplete.basicsMod.TimeComponentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "timeToUnixNoLeapSecs")
@js.native
object timeToUnixNoLeapSecs extends js.Object {
  def apply(components: TimeComponentOpts): Double = js.native
  def apply(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milli: Double
  ): Double = js.native
}


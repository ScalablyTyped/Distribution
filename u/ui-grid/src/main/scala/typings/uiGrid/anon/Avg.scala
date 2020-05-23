package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avg extends js.Object {
  var avg: Double
  var count: Double
  var max: Double
  var min: Double
  var sum: Double
}

object Avg {
  @scala.inline
  def apply(avg: Double, count: Double, max: Double, min: Double, sum: Double): Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
}


package typings.uiDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AVG extends js.Object {
  var AVG: String
  var COUNT: String
  var MAX: String
  var MIN: String
  var SUM: String
}

trait Anon_Avg extends js.Object {
  var avg: Double
  var count: Double
  var max: Double
  var min: Double
  var sum: Double
}

object Anon_AVG {
  @scala.inline
  def apply(AVG: String, COUNT: String, MAX: String, MIN: String, SUM: String): Anon_AVG = {
    val __obj = js.Dynamic.literal(AVG = AVG, COUNT = COUNT, MAX = MAX, MIN = MIN, SUM = SUM)
  
    __obj.asInstanceOf[Anon_AVG]
  }
}

object Anon_Avg {
  @scala.inline
  def apply(avg: Double, count: Double, max: Double, min: Double, sum: Double): Anon_Avg = {
    val __obj = js.Dynamic.literal(avg = avg, count = count, max = max, min = min, sum = sum)
  
    __obj.asInstanceOf[Anon_Avg]
  }
}


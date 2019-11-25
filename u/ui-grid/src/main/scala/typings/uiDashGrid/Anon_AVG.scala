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

object Anon_AVG {
  @scala.inline
  def apply(AVG: String, COUNT: String, MAX: String, MIN: String, SUM: String): Anon_AVG = {
    val __obj = js.Dynamic.literal(AVG = AVG.asInstanceOf[js.Any], COUNT = COUNT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any], SUM = SUM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AVG]
  }
}

trait Anon_Avg extends js.Object {
  var avg: Double
  var count: Double
  var max: Double
  var min: Double
  var sum: Double
}

object Anon_Avg {
  @scala.inline
  def apply(avg: Double, count: Double, max: Double, min: Double, sum: Double): Anon_Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Avg]
  }
}


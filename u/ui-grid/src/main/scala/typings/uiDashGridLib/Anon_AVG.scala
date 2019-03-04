package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AVG extends js.Object {
  var AVG: java.lang.String
  var COUNT: java.lang.String
  var MAX: java.lang.String
  var MIN: java.lang.String
  var SUM: java.lang.String
}

trait Anon_Avg extends js.Object {
  var avg: scala.Double
  var count: scala.Double
  var max: scala.Double
  var min: scala.Double
  var sum: scala.Double
}

object Anon_AVG {
  @scala.inline
  def apply(
    AVG: java.lang.String,
    COUNT: java.lang.String,
    MAX: java.lang.String,
    MIN: java.lang.String,
    SUM: java.lang.String
  ): Anon_AVG = {
    val __obj = js.Dynamic.literal(AVG = AVG, COUNT = COUNT, MAX = MAX, MIN = MIN, SUM = SUM)
  
    __obj.asInstanceOf[Anon_AVG]
  }
}

object Anon_Avg {
  @scala.inline
  def apply(avg: scala.Double, count: scala.Double, max: scala.Double, min: scala.Double, sum: scala.Double): Anon_Avg = {
    val __obj = js.Dynamic.literal(avg = avg, count = count, max = max, min = min, sum = sum)
  
    __obj.asInstanceOf[Anon_Avg]
  }
}


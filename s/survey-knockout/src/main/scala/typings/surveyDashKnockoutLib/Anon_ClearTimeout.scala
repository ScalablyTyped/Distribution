package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearTimeout extends js.Object {
  def clearTimeout(timerId: scala.Double): scala.Unit
  def setTimeout(func: js.Function0[_]): scala.Double
}

object Anon_ClearTimeout {
  @scala.inline
  def apply(
    clearTimeout: js.Function1[scala.Double, scala.Unit],
    setTimeout: js.Function1[js.Function0[_], scala.Double]
  ): Anon_ClearTimeout = {
    val __obj = js.Dynamic.literal(clearTimeout = clearTimeout, setTimeout = setTimeout)
  
    __obj.asInstanceOf[Anon_ClearTimeout]
  }
}


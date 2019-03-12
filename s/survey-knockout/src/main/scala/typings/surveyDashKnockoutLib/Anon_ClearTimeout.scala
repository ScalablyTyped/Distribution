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
  def apply(clearTimeout: scala.Double => scala.Unit, setTimeout: js.Function0[_] => scala.Double): Anon_ClearTimeout = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction1(setTimeout))
  
    __obj.asInstanceOf[Anon_ClearTimeout]
  }
}


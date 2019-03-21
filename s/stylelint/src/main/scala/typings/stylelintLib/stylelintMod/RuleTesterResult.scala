package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterResult extends js.Object {
  var actual: scala.Double
  var description: java.lang.String
  var expected: scala.Double
}

object RuleTesterResult {
  @scala.inline
  def apply(actual: scala.Double, description: java.lang.String, expected: scala.Double): RuleTesterResult = {
    val __obj = js.Dynamic.literal(actual = actual, description = description, expected = expected)
  
    __obj.asInstanceOf[RuleTesterResult]
  }
}


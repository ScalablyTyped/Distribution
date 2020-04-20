package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterResult extends js.Object {
  var actual: Double
  var description: String
  var expected: Double
}

object RuleTesterResult {
  @scala.inline
  def apply(actual: Double, description: String, expected: Double): RuleTesterResult = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTesterResult]
  }
}


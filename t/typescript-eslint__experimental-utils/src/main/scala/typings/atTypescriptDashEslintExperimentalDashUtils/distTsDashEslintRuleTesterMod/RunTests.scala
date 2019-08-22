package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunTests[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */] extends js.Object {
  var invalid: js.Array[InvalidTestCase[TMessageIds, TOptions]]
  var valid: js.Array[ValidTestCase[TOptions] | String]
}

object RunTests {
  @scala.inline
  def apply[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](
    invalid: js.Array[InvalidTestCase[TMessageIds, TOptions]],
    valid: js.Array[ValidTestCase[TOptions] | String]
  ): RunTests[TMessageIds, TOptions] = {
    val __obj = js.Dynamic.literal(invalid = invalid, valid = valid)
  
    __obj.asInstanceOf[RunTests[TMessageIds, TOptions]]
  }
}


package typings.atTypescriptDashEslintExperimentalDashUtils

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod.InvalidTestCase
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod.ValidTestCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils/dist/eslint-utils/batchedSingleLineTests", JSImport.Namespace)
@js.native
object distEslintDashUtilsBatchedSingleLineTestsMod extends js.Object {
  /**
    * Converts a batch of single line tests into a number of separate test cases.
    * This makes it easier to write tests which use the same options.
    *
    * Why wouldn't you just leave them as one test?
    * Because it makes the test error messages harder to decipher.
    * This way each line will fail separately, instead of them all failing together.
    */
  def batchedSingleLineTests[TOptions /* <: js.Array[_] */](test: ValidTestCase[TOptions]): js.Array[ValidTestCase[TOptions]] = js.native
  /**
    * Converts a batch of single line tests into a number of separate test cases.
    * This makes it easier to write tests which use the same options.
    *
    * Why wouldn't you just leave them as one test?
    * Because it makes the test error messages harder to decipher.
    * This way each line will fail separately, instead of them all failing together.
    *
    * Make sure you have your line numbers correct for error reporting, as it will match
    * the line numbers up with the split tests!
    */
  def batchedSingleLineTests[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](test: InvalidTestCase[TMessageIds, TOptions]): js.Array[InvalidTestCase[TMessageIds, TOptions]] = js.native
}


package typings.atTypescriptDashEslintExperimentalDashUtils

import typings.atTypescriptDashEslintExperimentalDashUtils.distEslintDashUtilsDeepMergeMod.ObjectLike
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleListener
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod.RuleModule
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod.InvalidTestCase
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod.ValidTestCase
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils/dist/eslint-utils", JSImport.Namespace)
@js.native
object distEslintDashUtilsMod extends js.Object {
  def RuleCreator(urlCreator: js.Function1[/* ruleName */ String, String]): js.Function1[
    /* hasNameMetaDefaultOptionsCreate */ Anon_Context[String, js.Array[_], RuleListener], 
    RuleModule[String, js.Array[_], RuleListener]
  ] = js.native
  def applyDefault[TUser /* <: js.Array[_] */, TDefault /* <: TUser */](defaultOptions: TDefault): TDefault = js.native
  def applyDefault[TUser /* <: js.Array[_] */, TDefault /* <: TUser */](defaultOptions: TDefault, userOptions: TUser): TDefault = js.native
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
  def deepMerge(): Record[String, _] = js.native
  def deepMerge(first: ObjectLike[_]): Record[String, _] = js.native
  def deepMerge(first: ObjectLike[_], second: ObjectLike[_]): Record[String, _] = js.native
  def isObjectNotArray[T /* <: js.Object */](obj: T): /* is T */ Boolean = js.native
  def isObjectNotArray[T /* <: js.Object */](obj: js.Array[_]): /* is T */ Boolean = js.native
}


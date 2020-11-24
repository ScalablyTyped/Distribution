package typings.tslint.formatterMod

import typings.tslint.ruleMod.RuleFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormatter extends js.Object {
  
  /**
    * Formats linter results
    * @param failures Linter failures that were not fixed
    * @param fixes Fixed linter failures. Available when the `--fix` argument is used on the command line
    * @param fileNames All of the file paths that were linted
    */
  def format(failures: js.Array[RuleFailure]): String = js.native
  def format(failures: js.Array[RuleFailure], fixes: js.UndefOr[scala.Nothing], fileNames: js.Array[String]): String = js.native
  def format(failures: js.Array[RuleFailure], fixes: js.Array[RuleFailure]): String = js.native
  def format(failures: js.Array[RuleFailure], fixes: js.Array[RuleFailure], fileNames: js.Array[String]): String = js.native
}

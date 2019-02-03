package typings
package tslintLib.libLanguageFormatterAbstractFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/formatter/abstractFormatter", "AbstractFormatter")
@js.native
abstract class AbstractFormatter ()
  extends tslintLib.libLanguageFormatterFormatterMod.IFormatter {
  /* protected */ def sortFailures(failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
}

/* static members */
@JSImport("tslint/lib/language/formatter/abstractFormatter", "AbstractFormatter")
@js.native
object AbstractFormatter extends js.Object {
  var metadata: tslintLib.libLanguageFormatterFormatterMod.IFormatterMetadata = js.native
}


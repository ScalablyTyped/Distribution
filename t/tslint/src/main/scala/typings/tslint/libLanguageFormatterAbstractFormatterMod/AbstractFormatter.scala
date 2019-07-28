package typings.tslint.libLanguageFormatterAbstractFormatterMod

import typings.tslint.libLanguageFormatterFormatterMod.IFormatter
import typings.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import typings.tslint.libLanguageRuleRuleMod.RuleFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/formatter/abstractFormatter", "AbstractFormatter")
@js.native
abstract class AbstractFormatter () extends IFormatter {
  /* protected */ def sortFailures(failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
}

/* static members */
@JSImport("tslint/lib/language/formatter/abstractFormatter", "AbstractFormatter")
@js.native
object AbstractFormatter extends js.Object {
  var metadata: IFormatterMetadata = js.native
}


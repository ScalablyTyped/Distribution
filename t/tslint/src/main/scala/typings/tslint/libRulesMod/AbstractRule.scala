package typings.tslint.libRulesMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules", "AbstractRule")
@js.native
abstract class AbstractRule protected ()
  extends typings.tslint.libLanguageRuleAbstractRuleMod.AbstractRule {
  def this(options: IOptions) = this()
}

/* static members */
@JSImport("tslint/lib/rules", "AbstractRule")
@js.native
object AbstractRule extends js.Object {
  var metadata: IRuleMetadata = js.native
}


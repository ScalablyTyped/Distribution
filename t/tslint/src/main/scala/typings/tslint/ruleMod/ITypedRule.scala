package typings.tslint.ruleMod

import typings.tslint.walkerWalkerMod.IWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedRule extends IRule {
  def applyWithProgram(sourceFile: SourceFile, program: Program): js.Array[RuleFailure]
}

object ITypedRule {
  @scala.inline
  def apply(
    apply: SourceFile => js.Array[RuleFailure],
    applyWithProgram: (SourceFile, Program) => js.Array[RuleFailure],
    applyWithWalker: IWalker => js.Array[RuleFailure],
    getOptions: () => IOptions,
    isEnabled: () => Boolean
  ): ITypedRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWithProgram = js.Any.fromFunction2(applyWithProgram), applyWithWalker = js.Any.fromFunction1(applyWithWalker), getOptions = js.Any.fromFunction0(getOptions), isEnabled = js.Any.fromFunction0(isEnabled))
    __obj.asInstanceOf[ITypedRule]
  }
}


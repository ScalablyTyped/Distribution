package typings.tslint.ruleMod

import typings.tslint.walkerWalkerMod.IWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypedRule extends IRule {
  def applyWithProgram(sourceFile: SourceFile, program: Program): js.Array[RuleFailure] = js.native
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
  @scala.inline
  implicit class ITypedRuleOps[Self <: ITypedRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyWithProgram(value: (SourceFile, Program) => js.Array[RuleFailure]): Self = this.set("applyWithProgram", js.Any.fromFunction2(value))
  }
  
}


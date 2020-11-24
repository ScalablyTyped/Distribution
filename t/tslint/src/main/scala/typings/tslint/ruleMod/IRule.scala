package typings.tslint.ruleMod

import typings.tslint.walkerWalkerMod.IWalker
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRule extends js.Object {
  
  @JSName("apply")
  def apply(sourceFile: SourceFile): js.Array[RuleFailure] = js.native
  
  def applyWithWalker(walker: IWalker): js.Array[RuleFailure] = js.native
  
  def getOptions(): IOptions = js.native
  
  def isEnabled(): Boolean = js.native
}
object IRule {
  
  @scala.inline
  def apply(
    apply: SourceFile => js.Array[RuleFailure],
    applyWithWalker: IWalker => js.Array[RuleFailure],
    getOptions: () => IOptions,
    isEnabled: () => Boolean
  ): IRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWithWalker = js.Any.fromFunction1(applyWithWalker), getOptions = js.Any.fromFunction0(getOptions), isEnabled = js.Any.fromFunction0(isEnabled))
    __obj.asInstanceOf[IRule]
  }
  
  @scala.inline
  implicit class IRuleOps[Self <: IRule] (val x: Self) extends AnyVal {
    
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
    def setApply(value: SourceFile => js.Array[RuleFailure]): Self = this.set("apply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplyWithWalker(value: IWalker => js.Array[RuleFailure]): Self = this.set("applyWithWalker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOptions(value: () => IOptions): Self = this.set("getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("isEnabled", js.Any.fromFunction0(value))
  }
}

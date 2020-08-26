package typings.tslint.walkerWalkerMod

import typings.tslint.ruleMod.RuleFailure
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWalker extends js.Object {
  def getFailures(): js.Array[RuleFailure] = js.native
  def getSourceFile(): SourceFile = js.native
  def walk(sourceFile: SourceFile): Unit = js.native
}

object IWalker {
  @scala.inline
  def apply(
    getFailures: () => js.Array[RuleFailure],
    getSourceFile: () => SourceFile,
    walk: SourceFile => Unit
  ): IWalker = {
    val __obj = js.Dynamic.literal(getFailures = js.Any.fromFunction0(getFailures), getSourceFile = js.Any.fromFunction0(getSourceFile), walk = js.Any.fromFunction1(walk))
    __obj.asInstanceOf[IWalker]
  }
  @scala.inline
  implicit class IWalkerOps[Self <: IWalker] (val x: Self) extends AnyVal {
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
    def setGetFailures(value: () => js.Array[RuleFailure]): Self = this.set("getFailures", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSourceFile(value: () => SourceFile): Self = this.set("getSourceFile", js.Any.fromFunction0(value))
    @scala.inline
    def setWalk(value: SourceFile => Unit): Self = this.set("walk", js.Any.fromFunction1(value))
  }
  
}


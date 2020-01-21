package typings.tslint.walkerWalkerMod

import typings.tslint.ruleMod.RuleFailure
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWalker extends js.Object {
  def getFailures(): js.Array[RuleFailure]
  def getSourceFile(): SourceFile
  def walk(sourceFile: SourceFile): Unit
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
}


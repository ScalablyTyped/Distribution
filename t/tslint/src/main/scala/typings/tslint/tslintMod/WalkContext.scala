package typings.tslint.tslintMod

import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "WalkContext")
@js.native
class WalkContext[T] protected ()
  extends typings.tslint.libLanguageWalkerMod.WalkContext[T] {
  def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
}


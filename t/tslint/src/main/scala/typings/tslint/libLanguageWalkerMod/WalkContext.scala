package typings.tslint.libLanguageWalkerMod

import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", "WalkContext")
@js.native
class WalkContext[T] protected ()
  extends typings.tslint.libLanguageWalkerWalkContextMod.WalkContext[T] {
  def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
}


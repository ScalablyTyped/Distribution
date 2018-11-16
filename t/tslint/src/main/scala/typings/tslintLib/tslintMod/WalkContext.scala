package typings
package tslintLib.tslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "WalkContext")
@js.native
class WalkContext[T] protected ()
  extends tslintLib.libLanguageWalkerMod.WalkContext[T] {
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, ruleName: java.lang.String, options: T) = this()
}


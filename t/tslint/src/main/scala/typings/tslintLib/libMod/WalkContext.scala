package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib", "WalkContext")
@js.native
class WalkContext[T] protected ()
  extends tslintLib.libLanguageWalkerMod.WalkContext[T] {
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, ruleName: java.lang.String, options: T) = this()
}


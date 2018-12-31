package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptReferenceHost extends js.Object {
  def getCompilerOptions(): CompilerOptions
  def getCurrentDirectory(): java.lang.String
  def getSourceFile(fileName: java.lang.String): js.UndefOr[SourceFile]
  def getSourceFileByPath(path: Path): js.UndefOr[SourceFile]
}


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

object ScriptReferenceHost {
  @scala.inline
  def apply(
    getCompilerOptions: js.Function0[CompilerOptions],
    getCurrentDirectory: js.Function0[java.lang.String],
    getSourceFile: js.Function1[java.lang.String, js.UndefOr[SourceFile]],
    getSourceFileByPath: js.Function1[Path, js.UndefOr[SourceFile]]
  ): ScriptReferenceHost = {
    val __obj = js.Dynamic.literal(getCompilerOptions = getCompilerOptions, getCurrentDirectory = getCurrentDirectory, getSourceFile = getSourceFile, getSourceFileByPath = getSourceFileByPath)
  
    __obj.asInstanceOf[ScriptReferenceHost]
  }
}


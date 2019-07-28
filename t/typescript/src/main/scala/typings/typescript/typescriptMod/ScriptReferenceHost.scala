package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptReferenceHost extends js.Object {
  def getCompilerOptions(): CompilerOptions
  def getCurrentDirectory(): String
  def getSourceFile(fileName: String): js.UndefOr[SourceFile]
  def getSourceFileByPath(path: Path): js.UndefOr[SourceFile]
}

object ScriptReferenceHost {
  @scala.inline
  def apply(
    getCompilerOptions: () => CompilerOptions,
    getCurrentDirectory: () => String,
    getSourceFile: String => js.UndefOr[SourceFile],
    getSourceFileByPath: Path => js.UndefOr[SourceFile]
  ): ScriptReferenceHost = {
    val __obj = js.Dynamic.literal(getCompilerOptions = js.Any.fromFunction0(getCompilerOptions), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getSourceFile = js.Any.fromFunction1(getSourceFile), getSourceFileByPath = js.Any.fromFunction1(getSourceFileByPath))
  
    __obj.asInstanceOf[ScriptReferenceHost]
  }
}


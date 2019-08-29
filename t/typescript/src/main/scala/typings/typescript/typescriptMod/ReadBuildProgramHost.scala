package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBuildProgramHost extends js.Object {
  def getCurrentDirectory(): String
  def readFile(fileName: String): js.UndefOr[String]
  def useCaseSensitiveFileNames(): Boolean
}

object ReadBuildProgramHost {
  @scala.inline
  def apply(
    getCurrentDirectory: () => String,
    readFile: String => js.UndefOr[String],
    useCaseSensitiveFileNames: () => Boolean
  ): ReadBuildProgramHost = {
    val __obj = js.Dynamic.literal(getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), readFile = js.Any.fromFunction1(readFile), useCaseSensitiveFileNames = js.Any.fromFunction0(useCaseSensitiveFileNames))
  
    __obj.asInstanceOf[ReadBuildProgramHost]
  }
}


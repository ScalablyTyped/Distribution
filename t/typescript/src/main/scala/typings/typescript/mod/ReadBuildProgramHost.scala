package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBuildProgramHost extends js.Object {
  def getCurrentDirectory(): java.lang.String
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
  def useCaseSensitiveFileNames(): Boolean
}

object ReadBuildProgramHost {
  @scala.inline
  def apply(
    getCurrentDirectory: () => java.lang.String,
    readFile: java.lang.String => js.UndefOr[java.lang.String],
    useCaseSensitiveFileNames: () => Boolean
  ): ReadBuildProgramHost = {
    val __obj = js.Dynamic.literal(getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), readFile = js.Any.fromFunction1(readFile), useCaseSensitiveFileNames = js.Any.fromFunction0(useCaseSensitiveFileNames))
    __obj.asInstanceOf[ReadBuildProgramHost]
  }
}


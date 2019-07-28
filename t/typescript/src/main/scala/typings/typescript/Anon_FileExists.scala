package typings.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileExists extends js.Object {
  def fileExists(fileName: String): Boolean
  def getExecutingFilePath(): String
  def readFile(fileName: String): js.UndefOr[String]
  def resolvePath(path: String): String
}

object Anon_FileExists {
  @scala.inline
  def apply(
    fileExists: String => Boolean,
    getExecutingFilePath: () => String,
    readFile: String => js.UndefOr[String],
    resolvePath: String => String
  ): Anon_FileExists = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getExecutingFilePath = js.Any.fromFunction0(getExecutingFilePath), readFile = js.Any.fromFunction1(readFile), resolvePath = js.Any.fromFunction1(resolvePath))
  
    __obj.asInstanceOf[Anon_FileExists]
  }
}


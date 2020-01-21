package typings.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileExists extends js.Object {
  def fileExists(fileName: String): Boolean
  def getExecutingFilePath(): String
  def readFile(fileName: String): js.UndefOr[String]
  def resolvePath(path: String): String
}

object AnonFileExists {
  @scala.inline
  def apply(
    fileExists: String => Boolean,
    getExecutingFilePath: () => String,
    readFile: String => js.UndefOr[String],
    resolvePath: String => String
  ): AnonFileExists = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getExecutingFilePath = js.Any.fromFunction0(getExecutingFilePath), readFile = js.Any.fromFunction1(readFile), resolvePath = js.Any.fromFunction1(resolvePath))
  
    __obj.asInstanceOf[AnonFileExists]
  }
}


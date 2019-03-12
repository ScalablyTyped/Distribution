package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileExists extends js.Object {
  def fileExists(fileName: java.lang.String): scala.Boolean
  def getExecutingFilePath(): java.lang.String
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
  def resolvePath(path: java.lang.String): java.lang.String
}

object Anon_FileExists {
  @scala.inline
  def apply(
    fileExists: java.lang.String => scala.Boolean,
    getExecutingFilePath: () => java.lang.String,
    readFile: java.lang.String => js.UndefOr[java.lang.String],
    resolvePath: java.lang.String => java.lang.String
  ): Anon_FileExists = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getExecutingFilePath = js.Any.fromFunction0(getExecutingFilePath), readFile = js.Any.fromFunction1(readFile), resolvePath = js.Any.fromFunction1(resolvePath))
  
    __obj.asInstanceOf[Anon_FileExists]
  }
}


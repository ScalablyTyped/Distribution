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
    fileExists: js.Function1[java.lang.String, scala.Boolean],
    getExecutingFilePath: js.Function0[java.lang.String],
    readFile: js.Function1[java.lang.String, js.UndefOr[java.lang.String]],
    resolvePath: js.Function1[java.lang.String, java.lang.String]
  ): Anon_FileExists = {
    val __obj = js.Dynamic.literal(fileExists = fileExists, getExecutingFilePath = getExecutingFilePath, readFile = readFile, resolvePath = resolvePath)
  
    __obj.asInstanceOf[Anon_FileExists]
  }
}


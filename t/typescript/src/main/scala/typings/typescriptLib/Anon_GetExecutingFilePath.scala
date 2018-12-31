package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetExecutingFilePath extends js.Object {
  def fileExists(fileName: java.lang.String): scala.Boolean
  def getExecutingFilePath(): java.lang.String
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
  def resolvePath(path: java.lang.String): java.lang.String
}


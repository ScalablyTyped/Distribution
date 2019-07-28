package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/fs", JSImport.Namespace)
@js.native
object distLibUtilsFsMod extends js.Object {
  def directoryExists(directoryPath: String): Boolean = js.native
  def ensureDirectoriesExist(directoryPath: String): Unit = js.native
  def normalizePath(path: String): String = js.native
  def readFile(file: String): String = js.native
  def writeFile(fileName: String, data: String, writeByteOrderMark: Boolean): Unit = js.native
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
}


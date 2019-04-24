package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemManager extends js.Object {
  def access(options: AccessOptions): scala.Unit = js.native
  def accessSync(path: java.lang.String): scala.Unit = js.native
  def appendFile(options: AppendFileOptions): scala.Unit = js.native
  def appendFileSync(filePath: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def appendFileSync(filePath: java.lang.String, data: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def appendFileSync(filePath: java.lang.String, data: stdLib.ArrayBuffer): scala.Unit = js.native
  def appendFileSync(filePath: java.lang.String, data: stdLib.ArrayBuffer, encoding: java.lang.String): scala.Unit = js.native
  def copyFile(options: CopyFileOptions): scala.Unit = js.native
  def copyFileSync(srcPath: java.lang.String, destPath: java.lang.String): scala.Unit = js.native
  def getFileInfo(options: FsGetFileInfoOptions): scala.Unit = js.native
  def getSavedFileList(options: GetSavedFileListOptions): scala.Unit = js.native
  def mkdir(options: MkdirOptions): scala.Unit = js.native
  def mkdirSync(dirPath: java.lang.String): scala.Unit = js.native
  def mkdirSync(dirPath: java.lang.String, recursive: scala.Boolean): scala.Unit = js.native
  def readFile(options: ReadFileOptions): scala.Unit = js.native
  def readFileSync(filePath: java.lang.String): java.lang.String | stdLib.ArrayBuffer = js.native
  def readFileSync(filePath: java.lang.String, encoding: java.lang.String): java.lang.String | stdLib.ArrayBuffer = js.native
  def readdir(options: ReaddirOptions): scala.Unit = js.native
  def readdirSync(dirPath: java.lang.String): js.Array[java.lang.String] = js.native
  def removeSavedFile(options: FsRemoveSavedFileOptions): scala.Unit = js.native
  def rename(options: RenameOptions): scala.Unit = js.native
  def renameSync(oldPath: java.lang.String, newPath: java.lang.String): scala.Unit = js.native
  def rmdir(options: RmdirOptions): scala.Unit = js.native
  def rmdirSync(dirPath: java.lang.String): scala.Unit = js.native
  def rmdirSync(dirPath: java.lang.String, recursive: scala.Boolean): scala.Unit = js.native
  def saveFile(options: FsSaveFileOptions): scala.Unit = js.native
  def saveFileSync(tempFilePath: java.lang.String): SavedFileData = js.native
  def saveFileSync(tempFilePath: java.lang.String, filePath: java.lang.String): SavedFileData = js.native
  def stat(options: StatOptions): scala.Unit = js.native
  def statSync(path: java.lang.String): Stat | js.Object = js.native
  def statSync(path: java.lang.String, recursive: scala.Boolean): Stat | js.Object = js.native
  def unlink(options: UnlinkOptions): scala.Unit = js.native
  def unlinkSync(filePath: java.lang.String): scala.Unit = js.native
  def unzip(options: UnzipOptions): scala.Unit = js.native
  def unzipSync(options: UnzipOptions): scala.Unit = js.native
  def writeFile(options: WriteFileOptions): scala.Unit = js.native
  def writeFileSync(filePath: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def writeFileSync(filePath: java.lang.String, data: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def writeFileSync(filePath: java.lang.String, data: stdLib.ArrayBuffer): scala.Unit = js.native
  def writeFileSync(filePath: java.lang.String, data: stdLib.ArrayBuffer, encoding: java.lang.String): scala.Unit = js.native
}


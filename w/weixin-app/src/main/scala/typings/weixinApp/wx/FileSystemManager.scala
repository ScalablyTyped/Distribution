package typings.weixinApp.wx

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemManager extends js.Object {
  def access(options: AccessOptions): Unit = js.native
  def accessSync(path: String): Unit = js.native
  def appendFile(options: AppendFileOptions): Unit = js.native
  def appendFileSync(filePath: String, data: String): Unit = js.native
  def appendFileSync(filePath: String, data: String, encoding: String): Unit = js.native
  def appendFileSync(filePath: String, data: ArrayBuffer): Unit = js.native
  def appendFileSync(filePath: String, data: ArrayBuffer, encoding: String): Unit = js.native
  def copyFile(options: CopyFileOptions): Unit = js.native
  def copyFileSync(srcPath: String, destPath: String): Unit = js.native
  def getFileInfo(options: FsGetFileInfoOptions): Unit = js.native
  def getSavedFileList(options: GetSavedFileListOptions): Unit = js.native
  def mkdir(options: MkdirOptions): Unit = js.native
  def mkdirSync(dirPath: String): Unit = js.native
  def mkdirSync(dirPath: String, recursive: Boolean): Unit = js.native
  def readFile(options: ReadFileOptions): Unit = js.native
  def readFileSync(filePath: String): String | ArrayBuffer = js.native
  def readFileSync(filePath: String, encoding: String): String | ArrayBuffer = js.native
  def readdir(options: ReaddirOptions): Unit = js.native
  def readdirSync(dirPath: String): js.Array[String] = js.native
  def removeSavedFile(options: FsRemoveSavedFileOptions): Unit = js.native
  def rename(options: RenameOptions): Unit = js.native
  def renameSync(oldPath: String, newPath: String): Unit = js.native
  def rmdir(options: RmdirOptions): Unit = js.native
  def rmdirSync(dirPath: String): Unit = js.native
  def rmdirSync(dirPath: String, recursive: Boolean): Unit = js.native
  def saveFile(options: FsSaveFileOptions): Unit = js.native
  def saveFileSync(tempFilePath: String): SavedFileData = js.native
  def saveFileSync(tempFilePath: String, filePath: String): SavedFileData = js.native
  def stat(options: StatOptions): Unit = js.native
  def statSync(path: String): Stat | js.Object = js.native
  def statSync(path: String, recursive: Boolean): Stat | js.Object = js.native
  def unlink(options: UnlinkOptions): Unit = js.native
  def unlinkSync(filePath: String): Unit = js.native
  def unzip(options: UnzipOptions): Unit = js.native
  def unzipSync(options: UnzipOptions): Unit = js.native
  def writeFile(options: WriteFileOptions): Unit = js.native
  def writeFileSync(filePath: String, data: String): Unit = js.native
  def writeFileSync(filePath: String, data: String, encoding: String): Unit = js.native
  def writeFileSync(filePath: String, data: ArrayBuffer): Unit = js.native
  def writeFileSync(filePath: String, data: ArrayBuffer, encoding: String): Unit = js.native
}


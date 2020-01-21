package typings.wegameApi

import typings.std.ArrayBuffer
import typings.wegameApi.wx.types.AccessfileParams
import typings.wegameApi.wx.types.AppendfileParams
import typings.wegameApi.wx.types.CallbacksWithType
import typings.wegameApi.wx.types.CopyfileParams
import typings.wegameApi.wx.types.FileContentEncoding
import typings.wegameApi.wx.types.FileinfoParams
import typings.wegameApi.wx.types.MkdirParams
import typings.wegameApi.wx.types.ReaddirParams
import typings.wegameApi.wx.types.ReadfileParams
import typings.wegameApi.wx.types.RemovefileParams
import typings.wegameApi.wx.types.RenameParams
import typings.wegameApi.wx.types.RmdirParams
import typings.wegameApi.wx.types.SavedfileList
import typings.wegameApi.wx.types.SavefileParams
import typings.wegameApi.wx.types.StatParams
import typings.wegameApi.wx.types.UnlinkParams
import typings.wegameApi.wx.types.UnzipParams
import typings.wegameApi.wx.types.WritefileParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FileSystemManager")
@js.native
class FileSystemManager () extends js.Object {
  /**
    * 判断文件/目录是否存在
    */
  def access(param: AccessfileParams): Unit = js.native
  /**
    * access的同步版本
    * @param path 要判断是否存在的文件/目录路径
    * @throws 文件/目录不存在
    */
  def accessSync(path: String): Unit = js.native
  /**
    * 在文件结尾追加内容
    */
  def appendFile(param: AppendfileParams): Unit = js.native
  /**
    * appendFile的同步版本
    * @param filePath 要追加内容的文件路径
    * @param data 要追加的文本或二进制数据
    * @param encoding 指定写入文件的字符编码
    * @throws 指定的 filePath 文件不存在
    * @throws 指定的 filePath 是一个已经存在的目录
    * @throws 指定的 filePath 路径没有写权限
    * @throws 指定的 filePath 是一个已经存在的目录
    */
  def appendFileSync(filePath: String, data: String, encoding: FileContentEncoding): Unit = js.native
  def appendFileSync(filePath: String, data: ArrayBuffer, encoding: FileContentEncoding): Unit = js.native
  /**
    * 复制文件
    */
  def copyFile(param: CopyfileParams): Unit = js.native
  /**
    * copyFile 的同步版本
    * @param srcPath 源文件路径，只可以是普通文件
    * @param destPath 目标文件路径
    * @throws 指定目标文件路径没有写权限
    * @throws 源文件不存在，或目标文件路径的上层目录不存在
    */
  def copyFileSync(srcPath: String, destPath: String): Unit = js.native
  /**
    * 获取该小程序下的 本地临时文件 或 本地缓存文件 信息
    */
  def getFileInfo(param: FileinfoParams): Unit = js.native
  /**
    * 获取该小程序下已保存的本地缓存文件列表
    * @param res.fileList.filePath 本地路径
    * @param res.fileList.size 本地文件大小，以字节为单位
    * @param res.fileList.createTime 文件创建时间
    */
  def getSavedFileList(param: CallbacksWithType[SavedfileList]): Unit = js.native
  /**
    * 创建目录
    */
  def mkdir(param: MkdirParams): Unit = js.native
  /**
    * mkdir 的同步版本
    * @param dirPath 创建的目录路径
    * @param recursive 是否在递归创建该目录的上级目录后再创建该目录。如果对应的上级目录已经存在，则不创建该上级目录。如 dirPath 为 a/b/c/d 且 recursive 为 true，将创建 a 目录，再在 a 目录下创建 b 目录，以此类推直至创建 a/b/c 目录下的 d 目录。
    * @throws 上级目录不存在
    * @throws 指定的 filePath 路径没有写权限
    * @throws 有同名文件或目录
    */
  def mkdirSync(dirPath: String): Unit = js.native
  def mkdirSync(dirPath: String, recursive: Boolean): Unit = js.native
  /**
    * 读取本地文件内容
    */
  def readFile(param: ReadfileParams): Unit = js.native
  /**
    * readFile 的同步版本，读取并返回指定路径的文件的原始二进制内容
    * @param filePath 要读取的文件的路径
    * @throws 指定的 filePath 所在目录不存在
    * @throws 指定的 filePath 路径没有读权限
    */
  def readFileSync(filePath: String): ArrayBuffer = js.native
  /**
    * readFile 的同步版本，读取并按指定字符编码返回字符串
    * @param filePath 要读取的文件的路径
    * @param encoding 指定读取文件的字符编码
    * @throws 指定的 filePath 所在目录不存在
    * @throws 指定的 filePath 路径没有读权限
    */
  def readFileSync(filePath: String, encoding: FileContentEncoding): String = js.native
  /**
    * 读取目录内文件列表
    */
  def readdir(param: ReaddirParams): Unit = js.native
  /**
    * readdir的同步版本
    * @param dirPath 要读取的目录路径
    * @throws 目录不存在
    * @throws dirPath 不是目录
    * @throws 指定的 filePath 路径没有读权限
    */
  def readdirSync(dirPath: String): js.Array[String] = js.native
  /**
    * 删除该小程序下已保存的本地缓存文件（新版本应使用unlink）
    */
  def removeSavedFile(param: RemovefileParams): Unit = js.native
  /**
    * 重命名文件，可以把文件从 oldPath 移动到 newPath
    */
  def rename(param: RenameParams): Unit = js.native
  /**
    * FileSystemManager.rename 的同步版本
    * @param oldPath 源文件路径，可以是普通文件或目录
    * @param newPath 新文件路径
    * @throws 指定源文件或目标文件没有写权限
    * @throws 源文件不存在，或目标文件路径的上层目录不存在
    */
  def renameSync(oldPath: String, newPath: String): Unit = js.native
  /**
    * 删除目录
    */
  def rmdir(param: RmdirParams): Unit = js.native
  /**
    * rmdir 的同步版本
    * @param dirPath 要删除的目录路径
    * @param recursive 是否递归删除目录。如果为 true，则删除该目录和该目录下的所有子目录以及文件。
    * @throws 目录不存在, 目录不为空, 指定的 dirPath 路径没有写权限
    */
  def rmdirSync(dirPath: String): Unit = js.native
  def rmdirSync(dirPath: String, recursive: Boolean): Unit = js.native
  /**
    * 保存临时文件到本地。此接口会移动临时文件，因此调用成功后，tempFilePath 将不可用。
    */
  def saveFile(param: SavefileParams): Unit = js.native
  /**
    * saveFile的同步版本
    * @param tempFilePath 临时存储文件路径
    * @param filePath 要存储的文件路径
    * @throws 指定的 tempFilePath 找不到文件
    * @throws 指定的 filePath 路径没有写权限
    * @throws 上级目录不存在
    */
  def saveFileSync(tempFilePath: String): String = js.native
  def saveFileSync(tempFilePath: String, filePath: String): String = js.native
  /**
    * 获取文件 Stats 对象
    */
  def stat(param: StatParams): Unit = js.native
  /**
    * stat 的同步版本
    * @param path 文件/目录路径
    * @throws 指定的 path 路径没有读权限
    * @throws 文件不存在
    */
  def statSync(path: String): Stats = js.native
  /**
    * 解链文件
    */
  def unlink(param: UnlinkParams): Unit = js.native
  /**
    * unlink 的同步版本
    * @param filePath 要解链的文件路径
    * @throws 指定的 path 路径没有读权限
    * @throws 文件不存在
    * @throws 传入的 filePath 是一个目录
    */
  def unlinkSync(filePath: String): Unit = js.native
  /**
    * 解压文件
    */
  def unzip(param: UnzipParams): Unit = js.native
  /**
    * 写文件
    */
  def writeFile(param: WritefileParams): Unit = js.native
  /**
    * writeFile 的同步版本，写入文本字符串数据至文件
    * @param filePath 要写入的文件路径
    * @param data 要写入的文本内容
    * @param encoding 指定写入的文本的字符编码格式
    * @throws 指定的 filePath 所在目录不存在
    * @throws 指定的 filePath 路径没有写权限
    */
  def writeFileSync(filePath: String, data: String, encoding: FileContentEncoding): Unit = js.native
  /**
    * writeFile 的同步版本，写入二进制原始文件数据
    * @param filePath 要写入的文件路径
    * @param data 要写入的二进制数据
    * @throws 指定的 filePath 所在目录不存在
    * @throws 指定的 filePath 路径没有写权限
    */
  def writeFileSync(filePath: String, data: ArrayBuffer): Unit = js.native
}


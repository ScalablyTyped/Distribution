package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FileSystemManager")
@js.native
class FileSystemManager () extends js.Object {
  /**
    * 判断文件/目录是否存在
    */
  def access(param: wegameDashApiLib.wxNs.typesNs.AccessfileParams): scala.Unit = js.native
  /**
    * access的同步版本
    * @param path 要判断是否存在的文件/目录路径
    * @throws 文件/目录不存在
    */
  def accessSync(path: java.lang.String): scala.Unit = js.native
  /**
    * 在文件结尾追加内容
    */
  def appendFile(param: wegameDashApiLib.wxNs.typesNs.AppendfileParams): scala.Unit = js.native
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
  def appendFileSync(
    filePath: java.lang.String,
    data: java.lang.String,
    encoding: wegameDashApiLib.wxNs.typesNs.FileContentEncoding
  ): scala.Unit = js.native
  def appendFileSync(
    filePath: java.lang.String,
    data: stdLib.ArrayBuffer,
    encoding: wegameDashApiLib.wxNs.typesNs.FileContentEncoding
  ): scala.Unit = js.native
  /**
    * 复制文件
    */
  def copyFile(param: wegameDashApiLib.wxNs.typesNs.CopyfileParams): scala.Unit = js.native
  /**
    * copyFile 的同步版本
    * @param srcPath 源文件路径，只可以是普通文件
    * @param destPath 目标文件路径
    * @throws 指定目标文件路径没有写权限
    * @throws 源文件不存在，或目标文件路径的上层目录不存在
    */
  def copyFileSync(srcPath: java.lang.String, destPath: java.lang.String): scala.Unit = js.native
  /**
    * 获取该小程序下的 本地临时文件 或 本地缓存文件 信息
    */
  def getFileInfo(param: wegameDashApiLib.wxNs.typesNs.FileinfoParams): scala.Unit = js.native
  /**
    * 获取该小程序下已保存的本地缓存文件列表
    * @param res.fileList.filePath 本地路径
    * @param res.fileList.size 本地文件大小，以字节为单位
    * @param res.fileList.createTime 文件创建时间
    */
  def getSavedFileList(
    param: wegameDashApiLib.wxNs.typesNs.CallbacksWithType[wegameDashApiLib.wxNs.typesNs.SavedfileList]
  ): scala.Unit = js.native
  /**
    * 创建目录
    */
  def mkdir(param: wegameDashApiLib.wxNs.typesNs.MkdirParams): scala.Unit = js.native
  /**
    * mkdir 的同步版本
    * @param dirPath 创建的目录路径
    * @param recursive 是否在递归创建该目录的上级目录后再创建该目录。如果对应的上级目录已经存在，则不创建该上级目录。如 dirPath 为 a/b/c/d 且 recursive 为 true，将创建 a 目录，再在 a 目录下创建 b 目录，以此类推直至创建 a/b/c 目录下的 d 目录。
    * @throws 上级目录不存在
    * @throws 指定的 filePath 路径没有写权限
    * @throws 有同名文件或目录
    */
  def mkdirSync(dirPath: java.lang.String): scala.Unit = js.native
  def mkdirSync(dirPath: java.lang.String, recursive: scala.Boolean): scala.Unit = js.native
  /**
    * 读取本地文件内容
    */
  def readFile(param: wegameDashApiLib.wxNs.typesNs.ReadfileParams): scala.Unit = js.native
  /**
    * readFile 的同步版本
    * @param filePath 要读取的文件的路径
    * @param encoding 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    * @throws 指定的 filePath 所在目录不存在
    * @throws 指定的 filePath 路径没有读权限
    */
  def readFileSync(filePath: java.lang.String): java.lang.String | stdLib.ArrayBuffer = js.native
  def readFileSync(filePath: java.lang.String, encoding: wegameDashApiLib.wxNs.typesNs.FileContentEncoding): java.lang.String | stdLib.ArrayBuffer = js.native
  /**
    * 读取目录内文件列表
    */
  def readdir(param: wegameDashApiLib.wxNs.typesNs.ReaddirParams): scala.Unit = js.native
  /**
    * readdir的同步版本
    * @param dirPath 要读取的目录路径
    * @throws 目录不存在
    * @throws dirPath 不是目录
    * @throws 指定的 filePath 路径没有读权限
    */
  def readdirSync(dirPath: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * 删除该小程序下已保存的本地缓存文件（新版本应使用unlink）
    */
  def removeSavedFile(param: wegameDashApiLib.wxNs.typesNs.RemovefileParams): scala.Unit = js.native
  /**
    * 重命名文件，可以把文件从 oldPath 移动到 newPath
    */
  def rename(param: wegameDashApiLib.wxNs.typesNs.RenameParams): scala.Unit = js.native
  /**
    * FileSystemManager.rename 的同步版本
    * @param oldPath 源文件路径，可以是普通文件或目录
    * @param newPath 新文件路径
    * @throws 指定源文件或目标文件没有写权限
    * @throws 源文件不存在，或目标文件路径的上层目录不存在
    */
  def renameSync(oldPath: java.lang.String, newPath: java.lang.String): scala.Unit = js.native
  /**
    * 删除目录
    */
  def rmdir(param: wegameDashApiLib.wxNs.typesNs.RmdirParams): scala.Unit = js.native
  /**
    * rmdir 的同步版本
    * @param dirPath 要删除的目录路径
    * @param recursive 是否递归删除目录。如果为 true，则删除该目录和该目录下的所有子目录以及文件。
    * @throws 目录不存在, 目录不为空, 指定的 dirPath 路径没有写权限
    */
  def rmdirSync(dirPath: java.lang.String): scala.Unit = js.native
  def rmdirSync(dirPath: java.lang.String, recursive: scala.Boolean): scala.Unit = js.native
  /**
    * 保存临时文件到本地。此接口会移动临时文件，因此调用成功后，tempFilePath 将不可用。
    */
  def saveFile(param: wegameDashApiLib.wxNs.typesNs.SavefileParams): scala.Unit = js.native
  /**
    * saveFile的同步版本
    * @param tempFilePath 临时存储文件路径
    * @param filePath 要存储的文件路径
    * @throws 指定的 tempFilePath 找不到文件
    * @throws 指定的 filePath 路径没有写权限
    * @throws 上级目录不存在
    */
  def saveFileSync(tempFilePath: java.lang.String): java.lang.String = js.native
  def saveFileSync(tempFilePath: java.lang.String, filePath: java.lang.String): java.lang.String = js.native
  /**
    * 获取文件 Stats 对象
    */
  def stat(param: wegameDashApiLib.wxNs.typesNs.StatParams): scala.Unit = js.native
  /**
    * stat 的同步版本
    * @param path 文件/目录路径
    * @throws 指定的 path 路径没有读权限
    * @throws 文件不存在
    */
  def statSync(path: java.lang.String): Stats = js.native
  /**
    * 解链文件
    */
  def unlink(param: wegameDashApiLib.wxNs.typesNs.UnlinkParams): scala.Unit = js.native
  /**
    * unlink 的同步版本
    * @param filePath 要解链的文件路径
    * @throws 指定的 path 路径没有读权限
    * @throws 文件不存在
    * @throws 传入的 filePath 是一个目录
    */
  def unlinkSync(filePath: java.lang.String): scala.Unit = js.native
  /**
    * 解压文件
    */
  def unzip(param: wegameDashApiLib.wxNs.typesNs.UnzipParams): scala.Unit = js.native
  /**
    * 写文件
    */
  def writeFile(param: wegameDashApiLib.wxNs.typesNs.WritefileParams): scala.Unit = js.native
  /**
    * writeFile 的同步版本
    * @param filePath 要写入的文件路径
    * @param data 要写入的文本或二进制数据
    * @param encoding 指定写入文件的字符编码
    * @throws 指定的 filePath 所在目录不存在
    * @throws 指定的 filePath 路径没有写权限
    */
  def writeFileSync(filePath: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def writeFileSync(
    filePath: java.lang.String,
    data: java.lang.String,
    encoding: wegameDashApiLib.wxNs.typesNs.FileContentEncoding
  ): scala.Unit = js.native
  def writeFileSync(filePath: java.lang.String, data: stdLib.ArrayBuffer): scala.Unit = js.native
  def writeFileSync(
    filePath: java.lang.String,
    data: stdLib.ArrayBuffer,
    encoding: wegameDashApiLib.wxNs.typesNs.FileContentEncoding
  ): scala.Unit = js.native
}


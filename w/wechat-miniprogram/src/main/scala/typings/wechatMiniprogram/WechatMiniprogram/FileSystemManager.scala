package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`ucs-2`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`utf-16le`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`utf-8`
import typings.wechatMiniprogram.wechatMiniprogramStrings.ascii
import typings.wechatMiniprogram.wechatMiniprogramStrings.base64
import typings.wechatMiniprogram.wechatMiniprogramStrings.binary
import typings.wechatMiniprogram.wechatMiniprogramStrings.hex
import typings.wechatMiniprogram.wechatMiniprogramStrings.latin1
import typings.wechatMiniprogram.wechatMiniprogramStrings.ucs2
import typings.wechatMiniprogram.wechatMiniprogramStrings.utf16le
import typings.wechatMiniprogram.wechatMiniprogramStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemManager extends StObject {
  
  /** [FileSystemManager.access(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.access.html)
  *
  * 判断文件/目录是否存在
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  // 判断文件/目录是否存在
  fs.access({
    path: `${wx.env.USER_DATA_PATH}/hello.txt`,
    success(res) {
    // 文件存在
    console.log(res)
    },
    fail(res) {
    // 文件不存在或其他错误
    console.error(res)
    }
  })
  // 同步接口
  try {
    fs.accessSync(`${wx.env.USER_DATA_PATH}/hello.txt`)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def access(option: AccessOption): Unit = js.native
  
  /** [FileSystemManager.accessSync(string path)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.accessSync.html)
  *
  * [FileSystemManager.access](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.access.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  // 判断文件/目录是否存在
  fs.access({
    path: `${wx.env.USER_DATA_PATH}/hello.txt`,
    success(res) {
    // 文件存在
    console.log(res)
    },
    fail(res) {
    // 文件不存在或其他错误
    console.error(res)
    }
  })
  // 同步接口
  try {
    fs.accessSync(`${wx.env.USER_DATA_PATH}/hello.txt`)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def accessSync(/** 要判断是否存在的文件/目录路径 (本地路径) */
  path: String): Unit = js.native
  
  /** [FileSystemManager.appendFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.appendFile.html)
  *
  * 在文件结尾追加内容
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.appendFile({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    data: 'some text',
    encoding: 'utf8',
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    fs.appendFileSync(`${wx.env.USER_DATA_PATH}/hello.txt`, 'some text', 'utf8')
  } catch(e) {
    console.error(e)
  }
  ```
  *
  * 最低基础库： `2.1.0` */
  def appendFile(option: AppendFileOption): Unit = js.native
  
  /** [FileSystemManager.appendFileSync(string filePath, string|ArrayBuffer data, string encoding)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.appendFileSync.html)
  *
  * [FileSystemManager.appendFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.appendFile.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.appendFile({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    data: 'some text',
    encoding: 'utf8',
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    fs.appendFileSync(`${wx.env.USER_DATA_PATH}/hello.txt`, 'some text', 'utf8')
  } catch(e) {
    console.error(e)
  }
  ```
  *
  * 最低基础库： `2.1.0` */
  def appendFileSync(/** 要追加内容的文件路径 (本地路径) */
  filePath: String, /** 要追加的文本或二进制数据 */
  data: String): Unit = js.native
  def appendFileSync(
    /** 要追加内容的文件路径 (本地路径) */
  filePath: String,
    /** 要追加的文本或二进制数据 */
  data: String,
    /** 指定写入文件的字符编码
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
  ): Unit = js.native
  def appendFileSync(/** 要追加内容的文件路径 (本地路径) */
  filePath: String, /** 要追加的文本或二进制数据 */
  data: js.typedarray.ArrayBuffer): Unit = js.native
  def appendFileSync(
    /** 要追加内容的文件路径 (本地路径) */
  filePath: String,
    /** 要追加的文本或二进制数据 */
  data: js.typedarray.ArrayBuffer,
    /** 指定写入文件的字符编码
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
  ): Unit = js.native
  
  /** [FileSystemManager.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.close.html)
  *
  * 关闭文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  // 打开文件
  fs.open({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+',
    success(res) {
    // 关闭文件
    fs.close({
    fd: res.fd
    })
    }
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def close(option: FileSystemManagerCloseOption): Unit = js.native
  
  /** [undefined FileSystemManager.closeSync(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.closeSync.html)
  *
  * 同步关闭文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  const fd = fs.openSync({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+'
  })
  // 关闭文件
  fs.closeSync({fd: fd})
  ```
  *
  * 最低基础库： `2.16.1` */
  def closeSync(option: CloseSyncOption): Unit = js.native
  
  /** [FileSystemManager.copyFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.copyFile.html)
  *
  * 复制文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.copyFile({
    srcPath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    destPath: `${wx.env.USER_DATA_PATH}/hello_copy.txt`
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    fs.copyFileSync(
    `${wx.env.USER_DATA_PATH}/hello.txt`,
    `${wx.env.USER_DATA_PATH}/hello_copy.txt`
    )
  } catch(e) {
    console.error(e)
  }
  ``` */
  def copyFile(option: CopyFileOption): Unit = js.native
  
  /** [FileSystemManager.copyFileSync(string srcPath, string destPath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.copyFileSync.html)
  *
  * [FileSystemManager.copyFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.copyFile.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.copyFile({
    srcPath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    destPath: `${wx.env.USER_DATA_PATH}/hello_copy.txt`
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    fs.copyFileSync(
    `${wx.env.USER_DATA_PATH}/hello.txt`,
    `${wx.env.USER_DATA_PATH}/hello_copy.txt`
    )
  } catch(e) {
    console.error(e)
  }
  ``` */
  def copyFileSync(/** 源文件路径，支持本地路径 */
  srcPath: String, /** 目标文件路径，支持本地路径 */
  destPath: String): Unit = js.native
  
  /** [FileSystemManager.fstat(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.fstat.html)
  *
  * 获取文件的状态信息
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  // 打开文件
  fs.open({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+',
    success(res) {
    // 获取文件的状态信息
    fs.fstat({
    fd: res.fd,
    success(res) {
    console.log(res.stats)
    }
    })
    }
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def fstat(option: FstatOption): Unit = js.native
  
  /** [[Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html) FileSystemManager.fstatSync(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.fstatSync.html)
  *
  * 同步获取文件的状态信息
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  const fd = fs.openSync({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+'
  })
  const stats = fs.fstatSync({fd: fd})
  console.log(stats)
  ```
  *
  * 最低基础库： `2.16.1` */
  def fstatSync(option: FstatSyncOption): Stats = js.native
  
  /** [FileSystemManager.ftruncate(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.ftruncate.html)
  *
  * 对文件内容进行截断操作
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  // 打开文件
  fs.open({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+',
    success(res) {
    // 对文件内容进行截断操作
    fs.ftruncate({
    fd: res.fd,
    length: 10, // 从第10个字节开始截断文件
    success(res) {
    console.log(res)
    }
    })
    }
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def ftruncate(option: FtruncateOption): Unit = js.native
  
  /** [undefined FileSystemManager.ftruncateSync(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.ftruncateSync.html)
  *
  * 对文件内容进行截断操作
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  const fd = fs.openSync({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+'
  })
  fs.ftruncateSync({
    fd: fd,
    length: 10 // 从第10个字节开始截断文件
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def ftruncateSync(option: FtruncateSyncOption): Unit = js.native
  
  /** [FileSystemManager.getFileInfo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.getFileInfo.html)
    *
    * 获取该小程序下的 本地临时文件 或 本地缓存文件 信息 */
  def getFileInfo(option: FileSystemManagerGetFileInfoOption): Unit = js.native
  
  /** [FileSystemManager.getSavedFileList(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.getSavedFileList.html)
    *
    * 获取该小程序下已保存的本地缓存文件列表 */
  def getSavedFileList(): Unit = js.native
  def getSavedFileList(option: FileSystemManagerGetSavedFileListOption): Unit = js.native
  
  /** [FileSystemManager.mkdir(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.mkdir.html)
  *
  * 创建目录
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.mkdir({
    dirPath: `${wx.env.USER_DATA_PATH}/example`,
    recursive: false
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    fs.mkdirSync(`${wx.env.USER_DATA_PATH}/example`, false)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def mkdir(option: MkdirOption): Unit = js.native
  
  /** [FileSystemManager.mkdirSync(string dirPath, boolean recursive)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.mkdirSync.html)
  *
  * [FileSystemManager.mkdir](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.mkdir.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.mkdir({
    dirPath: `${wx.env.USER_DATA_PATH}/example`,
    recursive: false
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    fs.mkdirSync(`${wx.env.USER_DATA_PATH}/example`, false)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def mkdirSync(/** 创建的目录路径 (本地路径) */
  dirPath: String): Unit = js.native
  def mkdirSync(
    /** 创建的目录路径 (本地路径) */
  dirPath: String,
    /** 是否在递归创建该目录的上级目录后再创建该目录。如果对应的上级目录已经存在，则不创建该上级目录。如 dirPath 为 a/b/c/d 且 recursive 为 true，将创建 a 目录，再在 a 目录下创建 b 目录，以此类推直至创建 a/b/c 目录下的 d 目录。
    *
    * 最低基础库： `2.3.0` */
  recursive: Boolean
  ): Unit = js.native
  
  /** [FileSystemManager.open(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.open.html)
  *
  * 打开文件，返回文件描述符
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.open({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+',
    success(res) {
    console.log(res.fd)
    }
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def open(option: OpenOption): Unit = js.native
  
  /** [string FileSystemManager.openSync(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.openSync.html)
  *
  * 同步打开文件，返回文件描述符
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  const fd = fs.openSync({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+'
  })
  console.log(fd)
  ```
  *
  * 最低基础库： `2.16.1` */
  def openSync(option: OpenSyncOption): String = js.native
  
  /** [FileSystemManager.read(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.read.html)
  *
  * 读文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  const ab = new ArrayBuffer(1024)
  // 打开文件
  fs.open({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+',
    success(res) {
    // 读取文件到 ArrayBuffer 中
    fs.read({
    fd: res.fd,
    arrayBuffer: ab,
    length: 10,
    success(res) {
    console.log(res)
    }
    })
    }
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def read(option: ReadOption): Unit = js.native
  
  /** [FileSystemManager.readFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readFile.html)
  *
  * 读取本地文件内容
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.readFile({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    encoding: 'utf8',
    position: 0,
    success(res) {
    console.log(res.data)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.readFileSync(`${wx.env.USER_DATA_PATH}/hello.txt`, 'utf8', 0)
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def readFile(option: ReadFileOption): Unit = js.native
  
  /** [string|ArrayBuffer FileSystemManager.readFileSync(string filePath, string encoding, number position, number length)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readFileSync.html)
  *
  * [FileSystemManager.readFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readFile.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.readFile({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    encoding: 'utf8',
    position: 0,
    success(res) {
    console.log(res.data)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.readFileSync(`${wx.env.USER_DATA_PATH}/hello.txt`, 'utf8', 0)
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def readFileSync(/** 要读取的文件的路径 (本地路径) */
  filePath: String): String | js.typedarray.ArrayBuffer = js.native
  def readFileSync(
    /** 要读取的文件的路径 (本地路径) */
  filePath: String,
    /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
  ): String | js.typedarray.ArrayBuffer = js.native
  def readFileSync(
    /** 要读取的文件的路径 (本地路径) */
  filePath: String,
    /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1,
    /** 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  position: Double
  ): String | js.typedarray.ArrayBuffer = js.native
  def readFileSync(
    /** 要读取的文件的路径 (本地路径) */
  filePath: String,
    /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1,
    /** 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  position: Double,
    /** 指定文件的长度，如果不指定，则读到文件末尾。有效范围：[1, fileLength]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  length: Double
  ): String | js.typedarray.ArrayBuffer = js.native
  def readFileSync(
    /** 要读取的文件的路径 (本地路径) */
  filePath: String,
    /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1,
    /** 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  position: Unit,
    /** 指定文件的长度，如果不指定，则读到文件末尾。有效范围：[1, fileLength]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  length: Double
  ): String | js.typedarray.ArrayBuffer = js.native
  def readFileSync(
    /** 要读取的文件的路径 (本地路径) */
  filePath: String,
    /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: Unit,
    /** 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  position: Double
  ): String | js.typedarray.ArrayBuffer = js.native
  def readFileSync(
    /** 要读取的文件的路径 (本地路径) */
  filePath: String,
    /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: Unit,
    /** 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  position: Double,
    /** 指定文件的长度，如果不指定，则读到文件末尾。有效范围：[1, fileLength]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  length: Double
  ): String | js.typedarray.ArrayBuffer = js.native
  def readFileSync(
    /** 要读取的文件的路径 (本地路径) */
  filePath: String,
    /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: Unit,
    /** 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  position: Unit,
    /** 指定文件的长度，如果不指定，则读到文件末尾。有效范围：[1, fileLength]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  length: Double
  ): String | js.typedarray.ArrayBuffer = js.native
  
  /** [[ReadResult](https://developers.weixin.qq.com/miniprogram/dev/api/file/ReadResult.html) FileSystemManager.readSync(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readSync.html)
  *
  * 读文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  const ab = new ArrayBuffer(1024)
  const fd = fs.openSync({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+'
  })
  const res = fs.readSync({
    fd: fd,
    arrayBuffer: ab,
    length: 10
  })
  console.log(res)
  ```
  *
  * 最低基础库： `2.16.1` */
  def readSync(option: ReadSyncOption): ReadResult = js.native
  
  /** [FileSystemManager.readZipEntry(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readZipEntry.html)
  *
  * 读取压缩包内的文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  // 读取zip内某个或多个文件
  fs.readZipEntry({
    filePath: 'wxfile://from/to.zip',
    entries: [{
    path: 'some_folder/my_file.txt', // zip内文件路径
    encoding: 'utf-8', // 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    position: 0, // 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte
    length: 10000, // 指定文件的长度，如果不指定，则读到文件末尾。有效范围：[1, fileLength]。单位：byte
    }, {
    path: 'other_folder/orther_file.txt', // zip内文件路径
    }],
    success(res) {
    console.log(res.entries)
    // res.entries === {
    //     'some_folder/my_file.txt': {
    //         errMsg: 'readZipEntry:ok',
    //         data: 'xxxxxx'
    //     },
    //     'other_folder/orther_file.txt': {
    //         data: (ArrayBuffer)
    //     }
    // }
    },
    fail(res) {
    console.log(res.errMsg)
    },
  })
  // 读取zip内所有文件。允许指定统一的encoding。position、length则不再允许指定，分别默认为0和文件长度
  fs.readZipEntry({
    filePath: 'wxfile://from/to.zip',
    entries: 'all'
    encoding: 'utf-8', // 统一指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
    success(res) {
    console.log(res.entries)
    // res.entries === {
    //     'some_folder/my_file.txt': {
    //         errMsg: 'readZipEntry:ok',
    //         data: 'xxxxxx'
    //     },
    //     'other_folder/orther_file.txt': {
    //         errMsg: 'readZipEntry:ok',
    //         data: 'xxxxxx'
    //     }
    //  }
    },
    fail(res) {
    console.log(res.errMsg)
    },
  })
  ```
  *
  * 最低基础库： `2.17.3` */
  def readZipEntry(option: ReadZipEntryOption): Unit = js.native
  
  /** [FileSystemManager.readdir(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readdir.html)
  *
  * 读取目录内文件列表
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.readdir({
    dirPath: `${wx.env.USER_DATA_PATH}/example`,
    success(res) {
    console.log(res.files)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.readdirSync(`${wx.env.USER_DATA_PATH}/example`)
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def readdir(option: ReaddirOption): Unit = js.native
  
  /** [Array.&lt;string&gt; FileSystemManager.readdirSync(string dirPath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readdirSync.html)
  *
  * [FileSystemManager.readdir](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readdir.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.readdir({
    dirPath: `${wx.env.USER_DATA_PATH}/example`,
    success(res) {
    console.log(res.files)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.readdirSync(`${wx.env.USER_DATA_PATH}/example`)
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def readdirSync(/** 要读取的目录路径 (本地路径) */
  dirPath: String): js.Array[String] = js.native
  
  /** [FileSystemManager.removeSavedFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.removeSavedFile.html)
    *
    * 删除该小程序下已保存的本地缓存文件 */
  def removeSavedFile(option: FileSystemManagerRemoveSavedFileOption): Unit = js.native
  
  /** [FileSystemManager.rename(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.rename.html)
  *
  * 重命名文件。可以把文件从 oldPath 移动到 newPath
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.rename({
    oldPath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    newPath: `${wx.env.USER_DATA_PATH}/hello_new.txt`,
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.renameSync(
    `${wx.env.USER_DATA_PATH}/hello.txt`,
    `${wx.env.USER_DATA_PATH}/hello_new.txt`
    )
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def rename(option: RenameOption): Unit = js.native
  
  /** [FileSystemManager.renameSync(string oldPath, string newPath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.renameSync.html)
  *
  * [FileSystemManager.rename](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.rename.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.rename({
    oldPath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    newPath: `${wx.env.USER_DATA_PATH}/hello_new.txt`,
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.renameSync(
    `${wx.env.USER_DATA_PATH}/hello.txt`,
    `${wx.env.USER_DATA_PATH}/hello_new.txt`
    )
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def renameSync(/** 源文件路径，支持本地路径 */
  oldPath: String, /** 新文件路径，支持本地路径 */
  newPath: String): Unit = js.native
  
  /** [FileSystemManager.rmdir(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.rmdir.html)
  *
  * 删除目录
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.rmdir({
    dirPath: `${wx.env.USER_DATA_PATH}/example`,
    recursive: false,
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.rmdirSync(`${wx.env.USER_DATA_PATH}/example`, false)
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def rmdir(option: RmdirOption): Unit = js.native
  
  /** [FileSystemManager.rmdirSync(string dirPath, boolean recursive)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.rmdirSync.html)
  *
  * [FileSystemManager.rmdir](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.rmdir.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.rmdir({
    dirPath: `${wx.env.USER_DATA_PATH}/example`,
    recursive: false,
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.rmdirSync(`${wx.env.USER_DATA_PATH}/example`, false)
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def rmdirSync(/** 要删除的目录路径 (本地路径) */
  dirPath: String): Unit = js.native
  def rmdirSync(
    /** 要删除的目录路径 (本地路径) */
  dirPath: String,
    /** 是否递归删除目录。如果为 true，则删除该目录和该目录下的所有子目录以及文件。
    *
    * 最低基础库： `2.3.0` */
  recursive: Boolean
  ): Unit = js.native
  
  /** [FileSystemManager.saveFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.saveFile.html)
    *
    * 保存临时文件到本地。此接口会移动临时文件，因此调用成功后，tempFilePath 将不可用。 */
  def saveFile(option: FileSystemManagerSaveFileOption): Unit = js.native
  
  /** [string FileSystemManager.saveFileSync(string tempFilePath, string filePath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.saveFileSync.html)
    *
    * [FileSystemManager.saveFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.saveFile.html) 的同步版本 */
  def saveFileSync(/** 临时存储文件路径 (本地路径) */
  tempFilePath: String): String = js.native
  def saveFileSync(/** 临时存储文件路径 (本地路径) */
  tempFilePath: String, /** 要存储的文件路径 (本地路径) */
  filePath: String): String = js.native
  
  /** [FileSystemManager.stat(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.stat.html)
    *
    * 获取文件 Stats 对象 */
  def stat(option: StatOption): Unit = js.native
  
  /** [[Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html)|Array.&lt;[Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html)&gt; FileSystemManager.statSync(string path, boolean recursive)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.statSync.html)
    *
    * [FileSystemManager.stat](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.stat.html) 的同步版本 */
  def statSync(/** 文件/目录路径 (本地路径) */
  path: String): Stats | js.Array[Stats] = js.native
  def statSync(
    /** 文件/目录路径 (本地路径) */
  path: String,
    /** 是否递归获取目录下的每个文件的 Stats 信息
    *
    * 最低基础库： `2.3.0` */
  recursive: Boolean
  ): Stats | js.Array[Stats] = js.native
  
  /** [FileSystemManager.truncate(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.truncate.html)
  *
  * 对文件内容进行截断操作
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.truncate({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    length: 10, // 从第10个字节开始截断
    success(res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def truncate(option: TruncateOption): Unit = js.native
  
  /** [undefined FileSystemManager.truncateSync(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.truncateSync.html)
  *
  * 对文件内容进行截断操作 (truncate 的同步版本)
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.truncateSync({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    length: 10, // 从第10个字节开始截断
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def truncateSync(option: TruncateSyncOption): Unit = js.native
  
  /** [FileSystemManager.unlink(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.unlink.html)
  *
  * 删除文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.unlink({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.unlinkSync(`${wx.env.USER_DATA_PATH}/hello.txt`)
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def unlink(option: UnlinkOption): Unit = js.native
  
  /** [FileSystemManager.unlinkSync(string filePath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.unlinkSync.html)
  *
  * [FileSystemManager.unlink](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.unlink.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.unlink({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.unlinkSync(`${wx.env.USER_DATA_PATH}/hello.txt`)
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def unlinkSync(/** 要删除的文件路径 (本地路径) */
  filePath: String): Unit = js.native
  
  /** [FileSystemManager.unzip(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.unzip.html)
  *
  * 解压文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.unzip({
    zipFilePath: `${wx.env.USER_DATA_PATH}/example.zip`,
    targetPath: '${wx.env.USER_DATA_PATH}/example',
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  ``` */
  def unzip(option: UnzipOption): Unit = js.native
  
  /** [FileSystemManager.write(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.write.html)
  *
  * 写入文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  // 打开文件
  fs.open({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+',
    success(res) {
    // 写入文件
    fs.write({
    fd: res.fd,
    data: 'some text',
    success(res) {
    console.log(res.bytesWritten)
    }
    })
    }
  })
  ```
  *
  * 最低基础库： `2.16.1` */
  def write(option: WriteOption): Unit = js.native
  
  /** [FileSystemManager.writeFile(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.writeFile.html)
  *
  * 写文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.writeFile({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    data: 'some text or arrayBuffer',
    encoding: 'utf8',
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.writeFileSync(
    `${wx.env.USER_DATA_PATH}/hello.txt`,
    'some text or arrayBuffer',
    'utf8'
    )
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def writeFile(option: WriteFileOption): Unit = js.native
  
  /** [FileSystemManager.writeFileSync(string filePath, string|ArrayBuffer data, string encoding)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.writeFileSync.html)
  *
  * [FileSystemManager.writeFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.writeFile.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  fs.writeFile({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    data: 'some text or arrayBuffer',
    encoding: 'utf8',
    success(res) {
    console.log(res)
    },
    fail(res) {
    console.error(res)
    }
  })
  // 同步接口
  try {
    const res = fs.writeFileSync(
    `${wx.env.USER_DATA_PATH}/hello.txt`,
    'some text or arrayBuffer',
    'utf8'
    )
    console.log(res)
  } catch(e) {
    console.error(e)
  }
  ``` */
  def writeFileSync(/** 要写入的文件路径 (本地路径) */
  filePath: String, /** 要写入的文本或二进制数据 */
  data: String): Unit = js.native
  def writeFileSync(
    /** 要写入的文件路径 (本地路径) */
  filePath: String,
    /** 要写入的文本或二进制数据 */
  data: String,
    /** 指定写入文件的字符编码
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
  ): Unit = js.native
  def writeFileSync(/** 要写入的文件路径 (本地路径) */
  filePath: String, /** 要写入的文本或二进制数据 */
  data: js.typedarray.ArrayBuffer): Unit = js.native
  def writeFileSync(
    /** 要写入的文件路径 (本地路径) */
  filePath: String,
    /** 要写入的文本或二进制数据 */
  data: js.typedarray.ArrayBuffer,
    /** 指定写入文件的字符编码
    *
    * 参数 encoding 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  encoding: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
  ): Unit = js.native
  
  /** [[WriteResult](https://developers.weixin.qq.com/miniprogram/dev/api/file/WriteResult.html) FileSystemManager.writeSync(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.writeSync.html)
  *
  * 同步写入文件
  *
  * **示例代码**
  *
  *
  * ```js
  const fs = wx.getFileSystemManager()
  const fd = fs.openSync({
    filePath: `${wx.env.USER_DATA_PATH}/hello.txt`,
    flag: 'a+'
  })
  const res = fs.writeSync({
    fd: fd,
    data: 'some text'
  })
  console.log(res.bytesWritten)
  ```
  *
  * 最低基础库： `2.16.1` */
  def writeSync(option: WriteSyncOption): WriteResult = js.native
}

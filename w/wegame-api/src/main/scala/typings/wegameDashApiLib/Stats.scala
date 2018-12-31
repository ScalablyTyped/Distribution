package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stats")
@js.native
class Stats () extends js.Object {
  /**
    * 文件最近一次被存取或被执行的时间，UNIX 时间戳，对应 POSIX stat.st_atime
    */
  var lastAccessedTime: scala.Double = js.native
  /**
    * 文件最后一次被修改的时间，UNIX 时间戳，对应 POSIX stat.st_mtime
    */
  var lastModifiedTime: scala.Double = js.native
  /**
    * 文件的类型和存取的权限，对应 POSIX stat.st_mode
    */
  var mode: java.lang.String = js.native
  /**
    * 文件大小，单位：B，对应 POSIX stat.st_size
    */
  var size: scala.Double = js.native
  /**
    * 判断当前文件是否一个目录
    */
  def isDirectory(): scala.Boolean = js.native
  /**
    * 判断当前文件是否一个普通文件
    */
  def isFile(): scala.Boolean = js.native
}


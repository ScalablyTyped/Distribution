package typings.wegameApi.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stats")
@js.native
class Stats ()
  extends typings.wegameApi.Stats {
  /**
    * 文件最近一次被存取或被执行的时间，UNIX 时间戳，对应 POSIX stat.st_atime
    */
  /* CompleteClass */
  override var lastAccessedTime: Double = js.native
  /**
    * 文件最后一次被修改的时间，UNIX 时间戳，对应 POSIX stat.st_mtime
    */
  /* CompleteClass */
  override var lastModifiedTime: Double = js.native
  /**
    * 文件的类型和存取的权限，对应 POSIX stat.st_mode
    */
  /* CompleteClass */
  override var mode: String = js.native
  /**
    * 文件大小，单位：B，对应 POSIX stat.st_size
    */
  /* CompleteClass */
  override var size: Double = js.native
  /**
    * 判断当前文件是否一个目录
    */
  /* CompleteClass */
  override def isDirectory(): Boolean = js.native
  /**
    * 判断当前文件是否一个普通文件
    */
  /* CompleteClass */
  override def isFile(): Boolean = js.native
}


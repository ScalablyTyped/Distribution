package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  /**
    * 判断当前文件是否一个目录
    */
  def isDirectory(): Boolean
  
  /**
    * 判断当前文件是否一个普通文件
    */
  def isFile(): Boolean
  
  /**
    * 文件最近一次被存取或被执行的时间，UNIX 时间戳，对应 POSIX stat.st_atime
    */
  var lastAccessedTime: Double
  
  /**
    * 文件最后一次被修改的时间，UNIX 时间戳，对应 POSIX stat.st_mtime
    */
  var lastModifiedTime: Double
  
  /**
    * 文件的类型和存取的权限，对应 POSIX stat.st_mode
    */
  var mode: String
  
  /**
    * 文件大小，单位：B，对应 POSIX stat.st_size
    */
  var size: Double
}
object Stats {
  
  @scala.inline
  def apply(
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    lastAccessedTime: Double,
    lastModifiedTime: Double,
    mode: String,
    size: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), lastAccessedTime = lastAccessedTime.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastAccessedTime(value: Double): Self = StObject.set(x, "lastAccessedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: Double): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

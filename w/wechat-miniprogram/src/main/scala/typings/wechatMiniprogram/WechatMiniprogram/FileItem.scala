package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileItem extends StObject {
  
  /** 文件保存时的时间戳，从1970/01/01 08:00:00 到当前时间的秒数 */
  var createTime: Double
  
  /** 文件路径 (本地路径) */
  var filePath: String
  
  /** 本地文件大小，以字节为单位 */
  var size: Double
}
object FileItem {
  
  @scala.inline
  def apply(createTime: Double, filePath: String, size: Double): FileItem = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileItem]
  }
  
  @scala.inline
  implicit class FileItemMutableBuilder[Self <: FileItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

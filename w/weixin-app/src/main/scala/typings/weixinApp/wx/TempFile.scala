package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFile extends StObject {
  
  /** 本地文件路径 */
  var path: String
  
  /** 本地文件大小，单位：B */
  var size: Double
}
object TempFile {
  
  @scala.inline
  def apply(path: String, size: Double): TempFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFile]
  }
  
  @scala.inline
  implicit class TempFileMutableBuilder[Self <: TempFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

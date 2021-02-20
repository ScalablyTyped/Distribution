package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 源文件路径，只可以是普通文件
  var destPath: String = js.native
  
  var srcPath: String = js.native
}
object CopyFileOptions {
  
  @scala.inline
  def apply(destPath: String, srcPath: String): CopyFileOptions = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFileOptions]
  }
  
  @scala.inline
  implicit class CopyFileOptionsMutableBuilder[Self <: CopyFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestPath(value: String): Self = StObject.set(x, "destPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcPath(value: String): Self = StObject.set(x, "srcPath", value.asInstanceOf[js.Any])
  }
}

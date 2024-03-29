package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFileResponse extends StObject {
  
  /** 文件的临时路径 */
  var tempFilePath: String
}
object TempFileResponse {
  
  inline def apply(tempFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TempFileResponse] (val x: Self) extends AnyVal {
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}

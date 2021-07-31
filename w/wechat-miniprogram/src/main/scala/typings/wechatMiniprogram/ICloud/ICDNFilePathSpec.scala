package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.wechatMiniprogramStrings.filePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICDNFilePathSpec extends StObject {
  
  var filePath: String
  
  var `type`: filePath
}
object ICDNFilePathSpec {
  
  @scala.inline
  def apply(filePath: String): ICDNFilePathSpec = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filePath")
    __obj.asInstanceOf[ICDNFilePathSpec]
  }
  
  @scala.inline
  implicit class ICDNFilePathSpecMutableBuilder[Self <: ICDNFilePathSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: filePath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

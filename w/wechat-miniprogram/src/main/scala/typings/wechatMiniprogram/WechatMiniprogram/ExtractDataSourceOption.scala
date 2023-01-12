package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractDataSourceOption extends StObject {
  
  /** 视频源地址，只支持本地文件 */
  var source: String
}
object ExtractDataSourceOption {
  
  inline def apply(source: String): ExtractDataSourceOption = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractDataSourceOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtractDataSourceOption] (val x: Self) extends AnyVal {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

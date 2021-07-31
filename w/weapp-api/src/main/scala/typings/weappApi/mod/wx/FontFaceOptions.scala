package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  字体
trait FontFaceOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  可选的字体描述符
  var desc: js.UndefOr[FontDescOptions] = js.undefined
  
  //  定义的字体名称
  var family: String
  
  //  字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容。
  var source: String
}
object FontFaceOptions {
  
  @scala.inline
  def apply(family: String, source: String): FontFaceOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceOptions]
  }
  
  @scala.inline
  implicit class FontFaceOptionsMutableBuilder[Self <: FontFaceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: FontDescOptions): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

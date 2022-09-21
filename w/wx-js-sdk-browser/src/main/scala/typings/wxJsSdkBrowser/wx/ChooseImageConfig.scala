package typings.wxJsSdkBrowser.wx

import typings.wxJsSdkBrowser.anon.LocalIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageConfig extends StObject {
  
  /**
    * 照片数，默认9
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * 可以指定是原图还是压缩图，默认二者都有
    */
  var sizeType: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 可以指定来源是相册还是相机，默认二者都有
    */
  var sourceType: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
    */
  def success(res: LocalIds): Unit
}
object ChooseImageConfig {
  
  inline def apply(success: LocalIds => Unit): ChooseImageConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseImageConfig]
  }
  
  extension [Self <: ChooseImageConfig](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSizeType(value: js.Array[String]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    inline def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    inline def setSizeTypeVarargs(value: String*): Self = StObject.set(x, "sizeType", js.Array(value*))
    
    inline def setSourceType(value: js.Array[String]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: String*): Self = StObject.set(x, "sourceType", js.Array(value*))
    
    inline def setSuccess(value: LocalIds => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

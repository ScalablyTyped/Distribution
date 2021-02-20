package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.LocalIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseImageConfig extends StObject {
  
  /**
    * 照片数，默认9
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * 可以指定是原图还是压缩图，默认二者都有
    */
  var sizeType: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 可以指定来源是相册还是相机，默认二者都有
    */
  var sourceType: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
    */
  def success(res: LocalIds): Unit = js.native
}
object ChooseImageConfig {
  
  @scala.inline
  def apply(success: LocalIds => Unit): ChooseImageConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseImageConfig]
  }
  
  @scala.inline
  implicit class ChooseImageConfigMutableBuilder[Self <: ChooseImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSizeType(value: js.Array[String]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSizeTypeVarargs(value: String*): Self = StObject.set(x, "sizeType", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: js.Array[String]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: String*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: LocalIds => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

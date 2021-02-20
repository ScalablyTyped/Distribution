package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 图片对象
  *
  * 最低基础库： `2.7.0` */
@js.native
trait Image extends StObject {
  
  /** 图片的真实高度 */
  var height: Double = js.native
  
  /** 图片加载发生错误后触发的回调函数 */
  def onerror(args: js.Any*): js.Any = js.native
  
  /** 图片加载完成后触发的回调函数 */
  def onload(args: js.Any*): js.Any = js.native
  
  /** 图片的 URL。v2.11.0 起支持传递 base64 Data URI */
  var src: String = js.native
  
  /** 图片的真实宽度 */
  var width: Double = js.native
}
object Image {
  
  @scala.inline
  def apply(
    height: Double,
    onerror: /* repeated */ js.Any => js.Any,
    onload: /* repeated */ js.Any => js.Any,
    src: String,
    width: Double
  ): Image = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], onerror = js.Any.fromFunction1(onerror), onload = js.Any.fromFunction1(onload), src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnload(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 图片对象
  *
  * 最低基础库： `2.7.0` */
@js.native
trait Image extends js.Object {
  
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
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: /* repeated */ js.Any => js.Any): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnload(value: /* repeated */ js.Any => js.Any): Self = this.set("onload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}

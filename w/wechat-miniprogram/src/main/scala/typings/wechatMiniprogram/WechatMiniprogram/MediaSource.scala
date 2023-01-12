package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.image
import typings.wechatMiniprogram.wechatMiniprogramStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 需要预览的资源列表 */
trait MediaSource extends StObject {
  
  /** 视频的封面图片 */
  var poster: js.UndefOr[String] = js.undefined
  
  /** 资源的类型，默认为图片
    *
    * 可选值：
    * - 'image': 图片;
    * - 'video': 视频; */
  var `type`: js.UndefOr[image | video] = js.undefined
  
  /** 图片或视频的地址 */
  var url: String
}
object MediaSource {
  
  inline def apply(url: String): MediaSource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaSource] (val x: Self) extends AnyVal {
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setType(value: image | video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

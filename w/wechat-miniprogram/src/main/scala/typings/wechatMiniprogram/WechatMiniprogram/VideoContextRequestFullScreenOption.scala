package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramInts.`-90`
import typings.wechatMiniprogram.wechatMiniprogramInts.`0`
import typings.wechatMiniprogram.wechatMiniprogramInts.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoContextRequestFullScreenOption extends StObject {
  
  /** 设置全屏时视频的方向，不指定则根据宽高比自动判断。
    *
    * 可选值：
    * - 0: 正常竖向;
    * - 90: 屏幕逆时针90度;
    * - -90: 屏幕顺时针90度;
    *
    * 最低基础库： `1.7.0` */
  var direction: js.UndefOr[`0` | `90` | `-90`] = js.undefined
}
object VideoContextRequestFullScreenOption {
  
  inline def apply(): VideoContextRequestFullScreenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContextRequestFullScreenOption]
  }
  
  extension [Self <: VideoContextRequestFullScreenOption](x: Self) {
    
    inline def setDirection(value: `0` | `90` | `-90`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}

package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`down-mirrored`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`left-mirrored`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`right-mirrored`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`up-mirrored`
import typings.wechatMiniprogram.wechatMiniprogramStrings.down
import typings.wechatMiniprogram.wechatMiniprogramStrings.left
import typings.wechatMiniprogram.wechatMiniprogramStrings.right
import typings.wechatMiniprogram.wechatMiniprogramStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageInfoSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 图片原始高度，单位px。不考虑旋转。 */
  var height: Double
  
  /** [拍照时设备方向](http://sylvana.net/jpegcrop/exif_orientation.html)
    *
    * 可选值：
    * - 'up': 默认方向（手机横持拍照），对应 Exif 中的 1。或无 orientation 信息。;
    * - 'up-mirrored': 同 up，但镜像翻转，对应 Exif 中的 2;
    * - 'down': 旋转180度，对应 Exif 中的 3;
    * - 'down-mirrored': 同 down，但镜像翻转，对应 Exif 中的 4;
    * - 'left-mirrored': 同 left，但镜像翻转，对应 Exif 中的 5;
    * - 'right': 顺时针旋转90度，对应 Exif 中的 6;
    * - 'right-mirrored': 同 right，但镜像翻转，对应 Exif 中的 7;
    * - 'left': 逆时针旋转90度，对应 Exif 中的 8;
    *
    * 最低基础库： `1.9.90` */
  var orientation: up | `up-mirrored` | down | `down-mirrored` | `left-mirrored` | right | `right-mirrored` | left
  
  /** 图片的本地路径 */
  var path: String
  
  /** 图片格式
    *
    * 最低基础库： `1.9.90` */
  var `type`: String
  
  /** 图片原始宽度，单位px。不考虑旋转。 */
  var width: Double
}
object GetImageInfoSuccessCallbackResult {
  
  inline def apply(
    errMsg: String,
    height: Double,
    orientation: up | `up-mirrored` | down | `down-mirrored` | `left-mirrored` | right | `right-mirrored` | left,
    path: String,
    `type`: String,
    width: Double
  ): GetImageInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImageInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOrientation(
      value: up | `up-mirrored` | down | `down-mirrored` | `left-mirrored` | right | `right-mirrored` | left
    ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

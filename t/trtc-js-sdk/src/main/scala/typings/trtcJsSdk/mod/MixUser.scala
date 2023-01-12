package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixUser extends StObject {
  
  /** 该用户流在混流中的高度（px），必须大于等于0，默认值为 0 */
  var height: js.UndefOr[Double] = js.undefined
  
  /** 以混流左上角为起点，该用户流在混流中的 X 坐标（px），必须大于等于 0，默认值为 0 */
  var locationX: js.UndefOr[Double] = js.undefined
  
  /** 以混流左上角为起点，该用户流在混流中的 Y 坐标（px），必须大于等于 0，默认值为 0 */
  var locationY: js.UndefOr[Double] = js.undefined
  
  /** 只混入该用户的音频流, 若该值为true, 则以下视频相关参数不需要传入 */
  var pureAudio: Boolean
  
  /** 用户标识[必填]，该用户的 userId */
  var userId: String
  
  /** 该用户流在混流中的宽度（px），必须大于等于0，默认值为 0 */
  var width: js.UndefOr[Double] = js.undefined
  
  /** 该用户流在混流中的图层层次，取值范围为[1, 15]；若 pureAudio 的值为 false， 则 zOrder 必传，且各混入流的 zOrder 不可重复 */
  var zOrder: js.UndefOr[Double] = js.undefined
}
object MixUser {
  
  inline def apply(pureAudio: Boolean, userId: String): MixUser = {
    val __obj = js.Dynamic.literal(pureAudio = pureAudio.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixUser] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLocationX(value: Double): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
    
    inline def setLocationXUndefined: Self = StObject.set(x, "locationX", js.undefined)
    
    inline def setLocationY(value: Double): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
    
    inline def setLocationYUndefined: Self = StObject.set(x, "locationY", js.undefined)
    
    inline def setPureAudio(value: Boolean): Self = StObject.set(x, "pureAudio", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
    
    inline def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
  }
}

package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAppShowCallbackResult extends StObject {
  
  /** 打开的文件信息数组，只有从聊天素材场景打开（scene为1173）才会携带该参数 */
  var forwardMaterials: js.Array[ForwardMaterials]
  
  /** 小程序切前台的路径 (代码包路径) */
  var path: String
  
  /** 小程序切前台的 query 参数 */
  var query: IAnyObject
  
  /** 来源信息。从另一个小程序、公众号或 App 进入小程序时返回。否则返回 `{}`。(参见后文注意) */
  var referrerInfo: ReferrerInfo
  
  /** 小程序切前台的[场景值](https://developers.weixin.qq.com/miniprogram/dev/framework/app-service/scene.html) */
  var scene: Double
  
  /** shareTicket，详见[获取更多转发信息](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html) */
  var shareTicket: js.UndefOr[String] = js.undefined
}
object OnAppShowCallbackResult {
  
  inline def apply(
    forwardMaterials: js.Array[ForwardMaterials],
    path: String,
    query: IAnyObject,
    referrerInfo: ReferrerInfo,
    scene: Double
  ): OnAppShowCallbackResult = {
    val __obj = js.Dynamic.literal(forwardMaterials = forwardMaterials.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAppShowCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAppShowCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setForwardMaterials(value: js.Array[ForwardMaterials]): Self = StObject.set(x, "forwardMaterials", value.asInstanceOf[js.Any])
    
    inline def setForwardMaterialsVarargs(value: ForwardMaterials*): Self = StObject.set(x, "forwardMaterials", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReferrerInfo(value: ReferrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    
    inline def setShareTicketUndefined: Self = StObject.set(x, "shareTicket", js.undefined)
  }
}

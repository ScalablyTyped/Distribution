package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait onLaunchOptions extends StObject {
  
  /** 启动小程序的路径 */
  var path: String = js.native
  
  /** 启动小程序的query参数 */
  var query: js.Object = js.native
  
  /** 来源信息。从另一个小程序、公众号或App进入小程序时返回。范泽返回{} */
  var referrerInfo: typings.weappApi.mod.wx.referrerInfo = js.native
  
  /** 启动小程序的场景值 */
  var scene: Double = js.native
  
  var shareTicket: String = js.native
}
object onLaunchOptions {
  
  @scala.inline
  def apply(path: String, query: js.Object, referrerInfo: referrerInfo, scene: Double, shareTicket: String): onLaunchOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[onLaunchOptions]
  }
  
  @scala.inline
  implicit class onLaunchOptionsMutableBuilder[Self <: onLaunchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfo(value: referrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}

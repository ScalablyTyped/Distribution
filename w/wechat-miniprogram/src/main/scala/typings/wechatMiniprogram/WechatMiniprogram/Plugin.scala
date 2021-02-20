package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 插件帐号信息（仅在插件中调用时包含这一项） */
@js.native
trait Plugin extends StObject {
  
  /** 插件 appId */
  var appId: String = js.native
  
  /** 插件版本号 */
  var version: String = js.native
}
object Plugin {
  
  @scala.inline
  def apply(appId: String, version: String): Plugin = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

package typings.weixinApp.wx

import typings.weixinApp.anon.AppId
import typings.weixinApp.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region App里的onLaunch、onShow回调参数
// #region Account
trait AccountInfo extends StObject {
  
  /* 小程序账号信息 */
  var miniProgram: AppId
  
  /* 插件账号信息（仅在插件中调用时包含这一项）     */
  var plugin: js.UndefOr[Version] = js.undefined
}
object AccountInfo {
  
  inline def apply(miniProgram: AppId): AccountInfo = {
    val __obj = js.Dynamic.literal(miniProgram = miniProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
    inline def setMiniProgram(value: AppId): Self = StObject.set(x, "miniProgram", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: Version): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
  }
}

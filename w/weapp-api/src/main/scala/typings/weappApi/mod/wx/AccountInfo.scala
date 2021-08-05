package typings.weappApi.mod.wx

import typings.weappApi.anon.AppId
import typings.weappApi.anon.Vetsion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 帐号信息
trait AccountInfo extends StObject {
  
  //  插件帐号信息（仅在插件中调用时包含这一项）
  var Plugin: Vetsion
  
  //  小程序帐号信息
  var miniProgram: AppId
}
object AccountInfo {
  
  inline def apply(Plugin: Vetsion, miniProgram: AppId): AccountInfo = {
    val __obj = js.Dynamic.literal(Plugin = Plugin.asInstanceOf[js.Any], miniProgram = miniProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  extension [Self <: AccountInfo](x: Self) {
    
    inline def setMiniProgram(value: AppId): Self = StObject.set(x, "miniProgram", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: Vetsion): Self = StObject.set(x, "Plugin", value.asInstanceOf[js.Any])
  }
}

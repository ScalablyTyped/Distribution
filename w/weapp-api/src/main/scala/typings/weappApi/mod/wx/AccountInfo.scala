package typings.weappApi.mod.wx

import typings.weappApi.anon.AppId
import typings.weappApi.anon.Vetsion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 帐号信息
@js.native
trait AccountInfo extends StObject {
  
  //  插件帐号信息（仅在插件中调用时包含这一项）
  var Plugin: Vetsion = js.native
  
  //  小程序帐号信息
  var miniProgram: AppId = js.native
}
object AccountInfo {
  
  @scala.inline
  def apply(Plugin: Vetsion, miniProgram: AppId): AccountInfo = {
    val __obj = js.Dynamic.literal(Plugin = Plugin.asInstanceOf[js.Any], miniProgram = miniProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMiniProgram(value: AppId): Self = StObject.set(x, "miniProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: Vetsion): Self = StObject.set(x, "Plugin", value.asInstanceOf[js.Any])
  }
}

package typings.weappDashApi.weappDashApiMod.wx

import typings.weappDashApi.Anon_AppId
import typings.weappDashApi.Anon_AppIdVetsion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 帐号信息
trait AccountInfo extends js.Object {
  //  插件帐号信息（仅在插件中调用时包含这一项）
  var Plugin: Anon_AppIdVetsion
  //  小程序帐号信息
  var miniProgram: Anon_AppId
}

object AccountInfo {
  @scala.inline
  def apply(Plugin: Anon_AppIdVetsion, miniProgram: Anon_AppId): AccountInfo = {
    val __obj = js.Dynamic.literal(Plugin = Plugin.asInstanceOf[js.Any], miniProgram = miniProgram.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountInfo]
  }
}


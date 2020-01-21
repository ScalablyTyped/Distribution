package typings.weappApi.mod.wx

import typings.weappApi.AnonAppId
import typings.weappApi.AnonAppIdVetsion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 帐号信息
trait AccountInfo extends js.Object {
  //  插件帐号信息（仅在插件中调用时包含这一项）
  var Plugin: AnonAppIdVetsion
  //  小程序帐号信息
  var miniProgram: AnonAppId
}

object AccountInfo {
  @scala.inline
  def apply(Plugin: AnonAppIdVetsion, miniProgram: AnonAppId): AccountInfo = {
    val __obj = js.Dynamic.literal(Plugin = Plugin.asInstanceOf[js.Any], miniProgram = miniProgram.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountInfo]
  }
}


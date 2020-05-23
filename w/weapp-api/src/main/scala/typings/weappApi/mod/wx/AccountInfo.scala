package typings.weappApi.mod.wx

import typings.weappApi.anon.AppId
import typings.weappApi.anon.Vetsion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 帐号信息
trait AccountInfo extends js.Object {
  //  插件帐号信息（仅在插件中调用时包含这一项）
  var Plugin: Vetsion
  //  小程序帐号信息
  var miniProgram: AppId
}

object AccountInfo {
  @scala.inline
  def apply(Plugin: Vetsion, miniProgram: AppId): AccountInfo = {
    val __obj = js.Dynamic.literal(Plugin = Plugin.asInstanceOf[js.Any], miniProgram = miniProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
}


package typings.wegameDashApi

import org.scalablytyped.runtime.StringDictionary
import typings.wegameDashApi.wegameDashApiStrings.accept
import typings.wegameDashApi.wegameDashApiStrings.ban
import typings.wegameDashApi.wegameDashApiStrings.reject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends /**
  * [TEMPLATE_ID]是动态的键，即模板id，值包括'accept'、'reject'、'ban'。'accept'表示用户同意订阅该条id对应的模板消息，'reject'表示用户拒绝订阅该条id对应的模板消息，'ban'表示
  * 已被后台封禁。例如 { errMsg: "requestSubscribeMessage:ok", zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE: "accept"} 表示用户同意订阅zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE这条消息
  */
/* TEMPLATE_ID */ StringDictionary[accept | reject | ban | String] {
  /**
    * 接口调用成功时errMsg值为'requestSubscribeMessage:ok'
    */
  var errMsg: String
}

object Anon_Accept {
  @scala.inline
  def apply(
    errMsg: String,
    StringDictionary: /**
    * [TEMPLATE_ID]是动态的键，即模板id，值包括'accept'、'reject'、'ban'。'accept'表示用户同意订阅该条id对应的模板消息，'reject'表示用户拒绝订阅该条id对应的模板消息，'ban'表示
    * 已被后台封禁。例如 { errMsg: "requestSubscribeMessage:ok", zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE: "accept"} 表示用户同意订阅zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE这条消息
    */
  /* TEMPLATE_ID */ StringDictionary[accept | reject | ban | String] = null
  ): Anon_Accept = {
    val __obj = js.Dynamic.literal(errMsg = errMsg)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Accept]
  }
}


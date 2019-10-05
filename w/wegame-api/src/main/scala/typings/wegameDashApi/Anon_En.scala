package typings.wegameDashApi

import typings.wegameDashApi.wegameDashApiStrings.en
import typings.wegameDashApi.wegameDashApiStrings.zh_CN
import typings.wegameDashApi.wegameDashApiStrings.zh_TW
import typings.wegameDashApi.wx.types.ButtonStyle
import typings.wegameDashApi.wx.types.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_En extends js.Object {
  /**
    * 按钮的背景图片，仅当 type 为 image 时有效
    */
  var image: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  /**
    * 按钮的样式
    */
  var style: js.UndefOr[ButtonStyle] = js.undefined
  /**
    * 按钮上的文本，仅当 type 为 text 时有效
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * 按钮类型
    */
  var `type`: ButtonType
  /**
    * 是否带上登录态信息。当 withCredentials 为 true 时，要求此前有调用过 wx.login 且登录态尚未过期，此时返回的数据会包含 encryptedData, iv 等敏感信息；当 withCredentials 为 false 时，不要求有登录态，返回的数据不包含 encryptedData, iv 等敏感信息。
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_En {
  @scala.inline
  def apply(
    `type`: ButtonType,
    image: String = null,
    lang: en | zh_CN | zh_TW = null,
    style: ButtonStyle = null,
    text: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_En = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (image != null) __obj.updateDynamic("image")(image)
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Anon_En]
  }
}


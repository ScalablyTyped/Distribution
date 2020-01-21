package typings.wegameApi

import typings.wegameApi.wegameApiStrings.en
import typings.wegameApi.wegameApiStrings.zh_CN
import typings.wegameApi.wegameApiStrings.zh_TW
import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEn extends js.Object {
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

object AnonEn {
  @scala.inline
  def apply(
    `type`: ButtonType,
    image: String = null,
    lang: en | zh_CN | zh_TW = null,
    style: ButtonStyle = null,
    text: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): AnonEn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEn]
  }
}


package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Style extends js.Object {
  /**
    * 按钮的背景图片，仅当 type 为 image 时有效
    */
  var image: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.en | wegameDashApiLib.wegameDashApiLibStrings.zh_CN | wegameDashApiLib.wegameDashApiLibStrings.zh_TW
  ] = js.undefined
  /**
    * 按钮的样式
    */
  var style: wegameDashApiLib.wxNs.typesNs.ButtonStyle
  /**
    * 按钮上的文本，仅当 type 为 text 时有效
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮类型
    */
  var `type`: wegameDashApiLib.wxNs.typesNs.ButtonType
  /**
    * 是否带上登录态信息。当 withCredentials 为 true 时，要求此前有调用过 wx.login 且登录态尚未过期，此时返回的数据会包含 encryptedData, iv 等敏感信息；当 withCredentials 为 false 时，不要求有登录态，返回的数据不包含 encryptedData, iv 等敏感信息。
    */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}


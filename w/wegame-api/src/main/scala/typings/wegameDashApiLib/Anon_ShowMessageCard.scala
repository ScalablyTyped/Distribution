package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShowMessageCard extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 会话内消息卡片图片路径
    */
  var sendMessageImg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 会话内消息卡片路径
    */
  var sendMessagePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 会话内消息卡片标题
    */
  var sendMessageTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 会话来源
    */
  var sessionFrom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否显示会话内消息卡片，设置此参数为 true，用户进入客服会话之后会收到一个消息卡片，通过以下三个参数设置卡片的内容
    */
  var showMessageCard: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}


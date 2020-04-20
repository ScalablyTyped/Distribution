package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtraData extends js.Object {
  /* 来源小程序或公众号或App的 appId，详见下方说明 */
  var appId: String
  /* 来源小程序传过来的数据，scene=1037或1038时支持 */
  var extraData: js.Object
}

object AnonExtraData {
  @scala.inline
  def apply(appId: String, extraData: js.Object): AnonExtraData = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtraData]
  }
}


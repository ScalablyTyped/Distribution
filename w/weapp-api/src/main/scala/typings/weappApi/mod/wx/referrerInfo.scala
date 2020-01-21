package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait referrerInfo extends js.Object {
  /** 来源小程序、公众号或 App 的 appId */
  var appId: String
  /** 来源小程序传过来的数据，scene=1037或1038时支持 */
  var extraData: js.Object
}

object referrerInfo {
  @scala.inline
  def apply(appId: String, extraData: js.Object): referrerInfo = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[referrerInfo]
  }
}


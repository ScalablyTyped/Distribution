package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppId extends js.Object {
  /*小程序 appId	 */
  var appId: String
}

object AnonAppId {
  @scala.inline
  def apply(appId: String): AnonAppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppId]
  }
}


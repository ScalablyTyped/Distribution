package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppId extends js.Object {
  /*小程序 appId     */
  var appId: String
}

object AppId {
  @scala.inline
  def apply(appId: String): AppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppId]
  }
}


package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestParams extends js.Object {
  var appUrl: String
  var email: String
}

object ManifestParams {
  @scala.inline
  def apply(appUrl: String, email: String): ManifestParams = {
    val __obj = js.Dynamic.literal(appUrl = appUrl, email = email)
  
    __obj.asInstanceOf[ManifestParams]
  }
}


package typings.trezorConnect.mod

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
    val __obj = js.Dynamic.literal(appUrl = appUrl.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManifestParams]
  }
}


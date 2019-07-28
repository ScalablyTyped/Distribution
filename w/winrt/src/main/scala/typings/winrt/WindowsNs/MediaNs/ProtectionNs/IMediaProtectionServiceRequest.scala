package typings.winrt.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaProtectionServiceRequest extends js.Object {
  var protectionSystem: String
  var `type`: String
}

object IMediaProtectionServiceRequest {
  @scala.inline
  def apply(protectionSystem: String, `type`: String): IMediaProtectionServiceRequest = {
    val __obj = js.Dynamic.literal(protectionSystem = protectionSystem)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMediaProtectionServiceRequest]
  }
}


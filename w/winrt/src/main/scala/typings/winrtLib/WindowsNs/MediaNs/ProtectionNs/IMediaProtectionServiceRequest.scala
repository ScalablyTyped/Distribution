package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaProtectionServiceRequest extends js.Object {
  var protectionSystem: java.lang.String
  var `type`: java.lang.String
}

object IMediaProtectionServiceRequest {
  @scala.inline
  def apply(protectionSystem: java.lang.String, `type`: java.lang.String): IMediaProtectionServiceRequest = {
    val __obj = js.Dynamic.literal(protectionSystem = protectionSystem)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMediaProtectionServiceRequest]
  }
}


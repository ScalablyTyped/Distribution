package typings.winrtDashUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows a content enabler object to be exposed directly to an application rather than through a wrapper supplied by the ContentEnabler object. */
trait IMediaProtectionServiceRequest extends js.Object {
  /** Allows the application to identify the content protection system being used and therefore how to interpret the protection task. */
  var protectionSystem: String
  /** Retrieves the GUID for the type of operation that the IMediaProtectionServiceRequest performs. */
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


package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows a content enabler object to be exposed directly to an application rather than through a wrapper supplied by the ContentEnabler object. */

trait IMediaProtectionServiceRequest extends js.Object {
  /** Allows the application to identify the content protection system being used and therefore how to interpret the protection task. */
  var protectionSystem: java.lang.String
  /** Retrieves the GUID for the type of operation that the IMediaProtectionServiceRequest performs. */
  var `type`: java.lang.String
}


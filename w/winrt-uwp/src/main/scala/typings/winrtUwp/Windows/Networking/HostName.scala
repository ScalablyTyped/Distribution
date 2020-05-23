package typings.winrtUwp.Windows.Networking

import typings.winrtUwp.Windows.Networking.Connectivity.IPInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a hostname or an IP address. */
trait HostName extends js.Object {
  /** Gets the canonical name for the HostName object. */
  var canonicalName: String
  /** Gets the display name for the HostName object. */
  var displayName: String
  /** Gets the IPInformation object for a local IP address assigned to a HostName object. */
  var ipInformation: IPInformation
  /** Gets the original string used to construct the HostName object. */
  var rawName: String
  /** Gets the HostNameType of the HostName object. */
  var `type`: HostNameType
  /**
    * Determines whether the specified HostName object has an equivalent value to the current HostName object.
    * @param hostName A HostName object that is compared with the current HostName.
    * @return A Boolean value that indicates whether the specified HostName object is equal to the current HostName object.
    */
  def isEqual(hostName: HostName): Boolean
}

object HostName {
  @scala.inline
  def apply(
    canonicalName: String,
    displayName: String,
    ipInformation: IPInformation,
    isEqual: HostName => Boolean,
    rawName: String,
    `type`: HostNameType
  ): HostName = {
    val __obj = js.Dynamic.literal(canonicalName = canonicalName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], ipInformation = ipInformation.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), rawName = rawName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostName]
  }
}


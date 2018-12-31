package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a hostname or an IP address. */
@JSGlobal("Windows.Networking.HostName")
@js.native
class HostName protected () extends js.Object {
  /**
    * Creates a new HostName object from a string that contains a hostname or an IP address.
    * @param hostName A string that contains a hostname or an IP address.
    */
  def this(hostName: java.lang.String) = this()
  /** Gets the canonical name for the HostName object. */
  var canonicalName: java.lang.String = js.native
  /** Gets the display name for the HostName object. */
  var displayName: java.lang.String = js.native
  /** Gets the IPInformation object for a local IP address assigned to a HostName object. */
  var ipInformation: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.IPInformation = js.native
  /** Gets the original string used to construct the HostName object. */
  var rawName: java.lang.String = js.native
  /** Gets the HostNameType of the HostName object. */
  var `type`: HostNameType = js.native
  /**
    * Determines whether the specified HostName object has an equivalent value to the current HostName object.
    * @param hostName A HostName object that is compared with the current HostName.
    * @return A Boolean value that indicates whether the specified HostName object is equal to the current HostName object.
    */
  def isEqual(hostName: HostName): scala.Boolean = js.native
}

/** Provides data for a hostname or an IP address. */
@JSGlobal("Windows.Networking.HostName")
@js.native
object HostName extends js.Object {
  /**
    * Compares two strings to determine if they represent the same hostname.
    * @param value1 A hostname or IP address.
    * @param value2 A hostname or IP address.
    * @return The return value indicates the lexicographic relation of value1 to value2. If the two parameters represent the same canonical hostname, then zero is returned. If value1 is less than value2, the return value is less than zero. If value1 is greater than value2, the return vale is greater than zero.
    */
  def compare(value1: java.lang.String, value2: java.lang.String): scala.Double = js.native
}


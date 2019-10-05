package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Network.getSystemCookies")
@js.native
object getSystemCookies extends js.Object {
  /**
  		 * Gets all the cookies with the domain, path and name matched with the given values from the system cookie store.
  		 */
  def apply(domain: String, path: String, name: String): js.Array[Cookie] = js.native
}


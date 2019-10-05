package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Network.getHTTPCookies")
@js.native
object getHTTPCookies extends js.Object {
  /**
  		 * Gets all the cookies with the domain, path and name matched with the given values from the HTTP client cookie store.
  		 */
  def apply(domain: String, path: String, name: String): js.Array[Cookie] = js.native
}


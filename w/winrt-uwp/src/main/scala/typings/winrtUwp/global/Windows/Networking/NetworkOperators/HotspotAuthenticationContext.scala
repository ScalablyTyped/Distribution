package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the authentication context that contains details of the current authentication attempt and provides methods to perform the authentication. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
abstract class HotspotAuthenticationContext ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationContext

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
object HotspotAuthenticationContext extends js.Object {
  /**
    * Gets the context of an authentication attempt.
    * @param evenToken The event token retrieved from the network operator hotspot authentication event . The token is a GUID in string format.
    */
  def tryGetAuthenticationContext(evenToken: String): Context = js.native
}


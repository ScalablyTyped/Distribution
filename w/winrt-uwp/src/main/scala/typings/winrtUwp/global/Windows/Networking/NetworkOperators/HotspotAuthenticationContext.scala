package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the authentication context that contains details of the current authentication attempt and provides methods to perform the authentication. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
abstract class HotspotAuthenticationContext ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationContext
object HotspotAuthenticationContext {
  
  /**
    * Gets the context of an authentication attempt.
    * @param evenToken The event token retrieved from the network operator hotspot authentication event . The token is a GUID in string format.
    */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext.tryGetAuthenticationContext")
  @js.native
  def tryGetAuthenticationContext(evenToken: String): Context = js.native
}

package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the content of the event that is raised for background task handlers for the hotspot authentication event. */
@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails")
@js.native
abstract class HotspotAuthenticationEventDetails ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails {
  /** Gets a GUID that uniquely identifies the authentication attempt for which this event was raised. */
  /* CompleteClass */
  override var eventToken: String = js.native
}


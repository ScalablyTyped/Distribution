package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the content of the event that is raised for background task handlers for the hotspot authentication event. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails")
@js.native
open class HotspotAuthenticationEventDetails ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails {
  
  /** Gets a GUID that uniquely identifies the authentication attempt for which this event was raised. */
  /* CompleteClass */
  var eventToken: String = js.native
}

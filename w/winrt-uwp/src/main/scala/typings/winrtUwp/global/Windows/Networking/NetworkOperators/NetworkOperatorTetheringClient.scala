package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details about a tethering client. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient")
@js.native
open class NetworkOperatorTetheringClient ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient {
  
  /** Gets a list of hostnames used by this tethering client. */
  /* CompleteClass */
  var hostNames: IVectorView[HostName] = js.native
  
  /** Gets the MAC address of this tethering client. */
  /* CompleteClass */
  var macAddress: String = js.native
}

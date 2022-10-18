package typings.winrtUwp.global.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for a MediaProtectionManager object when the load of binary data fails. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.ComponentLoadFailedEventArgs")
@js.native
open class ComponentLoadFailedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.ComponentLoadFailedEventArgs {
  
  /** Returns an indication of the completion of the event. */
  /* CompleteClass */
  var completion: typings.winrtUwp.Windows.Media.Protection.MediaProtectionServiceCompletion = js.native
  
  /** Returns a list of components in the RevocationAndRenewalInformation object that need to be revoked and renewed with updated components. */
  /* CompleteClass */
  var information: typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalInformation = js.native
}

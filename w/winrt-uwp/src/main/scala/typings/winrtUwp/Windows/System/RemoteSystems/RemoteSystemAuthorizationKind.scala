package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RemoteSystemAuthorizationKind extends StObject
/** Contains values specifying whether the client device can discover only same-user devices or other users' devices as well. Cross-user devices must be available through a proximal connection in order to be discovered (see RemoteSystemDiscoveryType for details). */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemAuthorizationKind")
@js.native
object RemoteSystemAuthorizationKind extends StObject {
  
  /** The client device can discover other users' devices, provided they are available for proximal connection. */
  @js.native
  sealed trait anonymous
    extends StObject
       with RemoteSystemAuthorizationKind
  
  /** The client device can only discover devices signed in by the same user. */
  @js.native
  sealed trait sameUser
    extends StObject
       with RemoteSystemAuthorizationKind
}

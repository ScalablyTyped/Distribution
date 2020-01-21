package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemoteSystemAuthorizationKind extends js.Object

/** Contains values specifying whether the client device can discover only same-user devices or other users' devices as well. Cross-user devices must be available through a proximal connection in order to be discovered (see RemoteSystemDiscoveryType for details). */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemAuthorizationKind")
@js.native
object RemoteSystemAuthorizationKind extends js.Object {
  /** The client device can discover other users' devices, provided they are available for proximal connection. */
  @js.native
  sealed trait anonymous extends RemoteSystemAuthorizationKind
  
  /** The client device can only discover devices signed in by the same user. */
  @js.native
  sealed trait sameUser extends RemoteSystemAuthorizationKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemoteSystemAuthorizationKind with Double] = js.native
  /* 1 */ @js.native
  object anonymous extends TopLevel[anonymous with Double]
  
  /* 0 */ @js.native
  object sameUser extends TopLevel[sameUser with Double]
  
}


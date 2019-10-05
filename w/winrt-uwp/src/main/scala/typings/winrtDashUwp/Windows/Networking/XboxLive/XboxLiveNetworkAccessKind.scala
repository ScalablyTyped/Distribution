package typings.winrtDashUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveNetworkAccessKind extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveNetworkAccessKind")
@js.native
object XboxLiveNetworkAccessKind extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait moderate extends XboxLiveNetworkAccessKind
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait open extends XboxLiveNetworkAccessKind
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait strict extends XboxLiveNetworkAccessKind
  
  /* 1 */ val moderate: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.moderate with Double = js.native
  /* 0 */ val open: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.open with Double = js.native
  /* 2 */ val strict: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveNetworkAccessKind.strict with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveNetworkAccessKind with Double] = js.native
}


package typings.winrtDashUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveSocketKind extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveSocketKind")
@js.native
object XboxLiveSocketKind extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait datagram extends XboxLiveSocketKind
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait none extends XboxLiveSocketKind
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait stream extends XboxLiveSocketKind
  
  /* 1 */ val datagram: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.datagram with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.none with Double = js.native
  /* 2 */ val stream: typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveSocketKind.stream with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveSocketKind with Double] = js.native
}


package typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveEndpointPairState extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairState")
@js.native
object XboxLiveEndpointPairState extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait creatingInbound extends XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait creatingOutbound extends XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait deleted extends XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait deletingLocally extends XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait invalid extends XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait ready extends XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait remoteEndpointTerminating extends XboxLiveEndpointPairState
  
  /* 2 */ val creatingInbound: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState.creatingInbound with Double = js.native
  /* 1 */ val creatingOutbound: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState.creatingOutbound with Double = js.native
  /* 6 */ val deleted: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState.deleted with Double = js.native
  /* 4 */ val deletingLocally: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState.deletingLocally with Double = js.native
  /* 0 */ val invalid: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState.invalid with Double = js.native
  /* 3 */ val ready: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState.ready with Double = js.native
  /* 5 */ val remoteEndpointTerminating: typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairState.remoteEndpointTerminating with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveEndpointPairState with Double] = js.native
}


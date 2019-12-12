package typings.winrtDashUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingInbound
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.creatingOutbound
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deleted
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.deletingLocally
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.invalid
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.ready
import typings.winrtDashUwp.Windows.Networking.XboxLive.XboxLiveEndpointPairState.remoteEndpointTerminating
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveEndpointPairState with Double] = js.native
  /* 2 */ @js.native
  object creatingInbound extends TopLevel[creatingInbound with Double]
  
  /* 1 */ @js.native
  object creatingOutbound extends TopLevel[creatingOutbound with Double]
  
  /* 6 */ @js.native
  object deleted extends TopLevel[deleted with Double]
  
  /* 4 */ @js.native
  object deletingLocally extends TopLevel[deletingLocally with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 3 */ @js.native
  object ready extends TopLevel[ready with Double]
  
  /* 5 */ @js.native
  object remoteEndpointTerminating extends TopLevel[remoteEndpointTerminating with Double]
  
}


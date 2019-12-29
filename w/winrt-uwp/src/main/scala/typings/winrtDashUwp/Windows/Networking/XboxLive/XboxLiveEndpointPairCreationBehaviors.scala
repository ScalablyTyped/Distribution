package typings.winrtDashUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XboxLiveEndpointPairCreationBehaviors extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairCreationBehaviors")
@js.native
object XboxLiveEndpointPairCreationBehaviors extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait none extends XboxLiveEndpointPairCreationBehaviors
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait reevaluatePath extends XboxLiveEndpointPairCreationBehaviors
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveEndpointPairCreationBehaviors with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object reevaluatePath extends TopLevel[reevaluatePath with Double]
  
}


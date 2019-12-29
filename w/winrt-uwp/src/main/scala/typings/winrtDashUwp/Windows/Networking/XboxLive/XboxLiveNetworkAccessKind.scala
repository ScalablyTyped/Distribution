package typings.winrtDashUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveNetworkAccessKind with Double] = js.native
  /* 1 */ @js.native
  object moderate extends TopLevel[moderate with Double]
  
  /* 0 */ @js.native
  object open extends TopLevel[open with Double]
  
  /* 2 */ @js.native
  object strict extends TopLevel[strict with Double]
  
}


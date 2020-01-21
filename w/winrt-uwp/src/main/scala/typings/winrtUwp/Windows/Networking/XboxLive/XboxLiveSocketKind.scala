package typings.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XboxLiveSocketKind with Double] = js.native
  /* 1 */ @js.native
  object datagram extends TopLevel[datagram with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object stream extends TopLevel[stream with Double]
  
}


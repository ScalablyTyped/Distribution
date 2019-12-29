package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkConnectivityLevel extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends js.Object {
  @js.native
  sealed trait constrainedInternetAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait internetAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait localAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait none extends NetworkConnectivityLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkConnectivityLevel with Double] = js.native
  /* 2 */ @js.native
  object constrainedInternetAccess extends TopLevel[constrainedInternetAccess with Double]
  
  /* 3 */ @js.native
  object internetAccess extends TopLevel[internetAccess with Double]
  
  /* 1 */ @js.native
  object localAccess extends TopLevel[localAccess with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}


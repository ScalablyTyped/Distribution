package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkAuthenticationType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
@js.native
object NetworkAuthenticationType extends js.Object {
  @js.native
  sealed trait ihv extends NetworkAuthenticationType
  
  @js.native
  sealed trait none extends NetworkAuthenticationType
  
  @js.native
  sealed trait open80211 extends NetworkAuthenticationType
  
  @js.native
  sealed trait rsna extends NetworkAuthenticationType
  
  @js.native
  sealed trait rsnaPsk extends NetworkAuthenticationType
  
  @js.native
  sealed trait sharedKey80211 extends NetworkAuthenticationType
  
  @js.native
  sealed trait unknown extends NetworkAuthenticationType
  
  @js.native
  sealed trait wpa extends NetworkAuthenticationType
  
  @js.native
  sealed trait wpaNone extends NetworkAuthenticationType
  
  @js.native
  sealed trait wpaPsk extends NetworkAuthenticationType
  
  /* 9 */ val ihv: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.none with Double = js.native
  /* 2 */ val open80211: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211 with Double = js.native
  /* 7 */ val rsna: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna with Double = js.native
  /* 8 */ val rsnaPsk: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk with Double = js.native
  /* 3 */ val sharedKey80211: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211 with Double = js.native
  /* 1 */ val unknown: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown with Double = js.native
  /* 4 */ val wpa: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa with Double = js.native
  /* 6 */ val wpaNone: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone with Double = js.native
  /* 5 */ val wpaPsk: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkAuthenticationType with Double] = js.native
}


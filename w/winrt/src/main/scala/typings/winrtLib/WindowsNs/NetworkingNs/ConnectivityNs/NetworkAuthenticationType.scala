package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkAuthenticationType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
@js.native
object NetworkAuthenticationType extends js.Object {
  @js.native
  sealed trait ihv
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait open80211
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait rsna
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait rsnaPsk
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait sharedKey80211
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait wpa
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait wpaNone
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  @js.native
  sealed trait wpaPsk
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /* 9 */ val ihv: ihv with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val open80211: open80211 with scala.Double = js.native
  /* 7 */ val rsna: rsna with scala.Double = js.native
  /* 8 */ val rsnaPsk: rsnaPsk with scala.Double = js.native
  /* 3 */ val sharedKey80211: sharedKey80211 with scala.Double = js.native
  /* 1 */ val unknown: unknown with scala.Double = js.native
  /* 4 */ val wpa: wpa with scala.Double = js.native
  /* 6 */ val wpaNone: wpaNone with scala.Double = js.native
  /* 5 */ val wpaPsk: wpaPsk with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType with scala.Double
  ] = js.native
}


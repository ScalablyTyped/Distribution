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
  
  val ihv: ihv with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val open80211: open80211 with java.lang.String = js.native
  val rsna: rsna with java.lang.String = js.native
  val rsnaPsk: rsnaPsk with java.lang.String = js.native
  val sharedKey80211: sharedKey80211 with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val wpa: wpa with java.lang.String = js.native
  val wpaNone: wpaNone with java.lang.String = js.native
  val wpaPsk: wpaPsk with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType with java.lang.String
  ] = js.native
}


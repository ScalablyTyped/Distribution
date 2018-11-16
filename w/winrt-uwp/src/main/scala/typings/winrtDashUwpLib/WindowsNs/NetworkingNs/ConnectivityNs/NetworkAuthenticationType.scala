package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkAuthenticationType extends js.Object

/** Defines values that indicate the type of authentication used by the network. */
@JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
@js.native
object NetworkAuthenticationType extends js.Object {
  /** Specifies an authentication type defined by an independent hardware vendor (IHV). */
  @js.native
  sealed trait ihv
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** No authentication enabled. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** Open authentication over 802.11 wireless. Devices are authenticated and can connect to an access point, but communication with the network requires a matching Wired Equivalent Privacy (WEP) key. */
  @js.native
  sealed trait open80211
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11i Robust Security Network Association (RSNA) algorithm. IEEE 802.1X port authorization is performed by the supplicant, authenticator, and authentication server. Cipher keys are dynamically derived through the authentication process. */
  @js.native
  sealed trait rsna
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11i RSNA algorithm that uses PSK. IEEE 802.1X port authorization is performed by the supplicant and authenticator. Cipher keys are dynamically derived through a pre-shared key that is used on both the supplicant and authenticator. */
  @js.native
  sealed trait rsnaPsk
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11 Shared Key authentication algorithm that requires the use of a pre-shared Wired Equivalent Privacy (WEP) key for the 802.11 authentication. */
  @js.native
  sealed trait sharedKey80211
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** Authentication method unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** Specifies a Wi-Fi Protected Access (WPA) algorithm. IEEE 802.1X port authorization is performed by the supplicant, authenticator, and authentication server. Cipher keys are dynamically derived through the authentication process. */
  @js.native
  sealed trait wpa
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** Wi-Fi Protected Access. */
  @js.native
  sealed trait wpaNone
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
  /** Specifies a Wi-Fi Protected Access (WPA) algorithm that uses pre-shared keys (PSK). IEEE 802.1X port authorization is performed by the supplicant and authenticator. Cipher keys are dynamically derived through a pre-shared key that is used on both the supplicant and authenticator. */
  @js.native
  sealed trait wpaPsk
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType
  
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
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAuthenticationType with java.lang.String
  ] = js.native
}


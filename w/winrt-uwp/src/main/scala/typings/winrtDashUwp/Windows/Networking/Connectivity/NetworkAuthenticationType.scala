package typings.winrtDashUwp.Windows.Networking.Connectivity

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
  sealed trait ihv extends NetworkAuthenticationType
  
  /** No authentication enabled. */
  @js.native
  sealed trait none extends NetworkAuthenticationType
  
  /** Open authentication over 802.11 wireless. Devices are authenticated and can connect to an access point, but communication with the network requires a matching Wired Equivalent Privacy (WEP) key. */
  @js.native
  sealed trait open80211 extends NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11i Robust Security Network Association (RSNA) algorithm. IEEE 802.1X port authorization is performed by the supplicant, authenticator, and authentication server. Cipher keys are dynamically derived through the authentication process. */
  @js.native
  sealed trait rsna extends NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11i RSNA algorithm that uses PSK. IEEE 802.1X port authorization is performed by the supplicant and authenticator. Cipher keys are dynamically derived through a pre-shared key that is used on both the supplicant and authenticator. */
  @js.native
  sealed trait rsnaPsk extends NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11 Shared Key authentication algorithm that requires the use of a pre-shared Wired Equivalent Privacy (WEP) key for the 802.11 authentication. */
  @js.native
  sealed trait sharedKey80211 extends NetworkAuthenticationType
  
  /** Authentication method unknown. */
  @js.native
  sealed trait unknown extends NetworkAuthenticationType
  
  /** Specifies a Wi-Fi Protected Access (WPA) algorithm. IEEE 802.1X port authorization is performed by the supplicant, authenticator, and authentication server. Cipher keys are dynamically derived through the authentication process. */
  @js.native
  sealed trait wpa extends NetworkAuthenticationType
  
  /** Wi-Fi Protected Access. */
  @js.native
  sealed trait wpaNone extends NetworkAuthenticationType
  
  /** Specifies a Wi-Fi Protected Access (WPA) algorithm that uses pre-shared keys (PSK). IEEE 802.1X port authorization is performed by the supplicant and authenticator. Cipher keys are dynamically derived through a pre-shared key that is used on both the supplicant and authenticator. */
  @js.native
  sealed trait wpaPsk extends NetworkAuthenticationType
  
  /* 9 */ val ihv: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.none with Double = js.native
  /* 2 */ val open80211: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211 with Double = js.native
  /* 7 */ val rsna: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna with Double = js.native
  /* 8 */ val rsnaPsk: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk with Double = js.native
  /* 3 */ val sharedKey80211: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211 with Double = js.native
  /* 1 */ val unknown: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown with Double = js.native
  /* 4 */ val wpa: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa with Double = js.native
  /* 6 */ val wpaNone: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone with Double = js.native
  /* 5 */ val wpaPsk: typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkAuthenticationType with Double] = js.native
}


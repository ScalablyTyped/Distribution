package typings.winrtDashUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.none
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkAuthenticationType with Double] = js.native
  /* 9 */ @js.native
  object ihv extends TopLevel[ihv with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object open80211 extends TopLevel[open80211 with Double]
  
  /* 7 */ @js.native
  object rsna extends TopLevel[rsna with Double]
  
  /* 8 */ @js.native
  object rsnaPsk extends TopLevel[rsnaPsk with Double]
  
  /* 3 */ @js.native
  object sharedKey80211 extends TopLevel[sharedKey80211 with Double]
  
  /* 1 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 4 */ @js.native
  object wpa extends TopLevel[wpa with Double]
  
  /* 6 */ @js.native
  object wpaNone extends TopLevel[wpaNone with Double]
  
  /* 5 */ @js.native
  object wpaPsk extends TopLevel[wpaPsk with Double]
  
}


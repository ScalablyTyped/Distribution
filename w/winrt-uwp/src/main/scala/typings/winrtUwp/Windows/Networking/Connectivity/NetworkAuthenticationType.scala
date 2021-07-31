package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkAuthenticationType extends StObject
/** Defines values that indicate the type of authentication used by the network. */
@JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
@js.native
object NetworkAuthenticationType extends StObject {
  
  /** Specifies an authentication type defined by an independent hardware vendor (IHV). */
  @js.native
  sealed trait ihv
    extends StObject
       with NetworkAuthenticationType
  
  /** No authentication enabled. */
  @js.native
  sealed trait none
    extends StObject
       with NetworkAuthenticationType
  
  /** Open authentication over 802.11 wireless. Devices are authenticated and can connect to an access point, but communication with the network requires a matching Wired Equivalent Privacy (WEP) key. */
  @js.native
  sealed trait open80211
    extends StObject
       with NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11i Robust Security Network Association (RSNA) algorithm. IEEE 802.1X port authorization is performed by the supplicant, authenticator, and authentication server. Cipher keys are dynamically derived through the authentication process. */
  @js.native
  sealed trait rsna
    extends StObject
       with NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11i RSNA algorithm that uses PSK. IEEE 802.1X port authorization is performed by the supplicant and authenticator. Cipher keys are dynamically derived through a pre-shared key that is used on both the supplicant and authenticator. */
  @js.native
  sealed trait rsnaPsk
    extends StObject
       with NetworkAuthenticationType
  
  /** Specifies an IEEE 802.11 Shared Key authentication algorithm that requires the use of a pre-shared Wired Equivalent Privacy (WEP) key for the 802.11 authentication. */
  @js.native
  sealed trait sharedKey80211
    extends StObject
       with NetworkAuthenticationType
  
  /** Authentication method unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with NetworkAuthenticationType
  
  /** Specifies a Wi-Fi Protected Access (WPA) algorithm. IEEE 802.1X port authorization is performed by the supplicant, authenticator, and authentication server. Cipher keys are dynamically derived through the authentication process. */
  @js.native
  sealed trait wpa
    extends StObject
       with NetworkAuthenticationType
  
  /** Wi-Fi Protected Access. */
  @js.native
  sealed trait wpaNone
    extends StObject
       with NetworkAuthenticationType
  
  /** Specifies a Wi-Fi Protected Access (WPA) algorithm that uses pre-shared keys (PSK). IEEE 802.1X port authorization is performed by the supplicant and authenticator. Cipher keys are dynamically derived through a pre-shared key that is used on both the supplicant and authenticator. */
  @js.native
  sealed trait wpaPsk
    extends StObject
       with NetworkAuthenticationType
}

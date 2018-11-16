package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkEncryptionType extends js.Object

/** Defines values that indicate the type of encryption used for authentication. */
@JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
@js.native
object NetworkEncryptionType extends js.Object {
  /** Specifies an AES-CCMP algorithm, as specified in the IEEE 802.11i-2004 standard and RFC 3610. Advanced Encryption Standard (AES) is the encryption algorithm defined in FIPS PUB 197. */
  @js.native
  sealed trait ccmp
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** Specifies an encryption type defined by an independent hardware vendor (IHV). */
  @js.native
  sealed trait ihv
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** No encryption enabled. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** Specifies a Robust Security Network (RSN) Use Group Key cipher suite. For more information about the Use Group Key cipher suite, refer to Clause 7.3.2.25.1 of the IEEE 802.11i-2004 standard. */
  @js.native
  sealed trait rsnUseGroup
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** Specifies a Temporal Key Integrity Protocol (TKIP) algorithm, which is the RC4-based cipher suite that is based on the algorithms that are defined in the WPA specification and IEEE 802.11i-2004 standard. This cipher also uses the Michael Message Integrity Code (MIC) algorithm for forgery protection. */
  @js.native
  sealed trait tkip
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** Encryption method unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** Specifies a WEP cipher algorithm with a cipher key of any length. */
  @js.native
  sealed trait wep
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** Specifies a WEP cipher algorithm with a 104-bit cipher key. */
  @js.native
  sealed trait wep104
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** Specifies a Wired Equivalent Privacy (WEP) algorithm, which is the RC4-based algorithm that is specified in the IEEE 802.11-1999 standard. This enumerator specifies the WEP cipher algorithm with a 40-bit cipher key. */
  @js.native
  sealed trait wep40
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /** Specifies a Wifi Protected Access (WPA) Use Group Key cipher suite. For more information about the Use Group Key cipher suite, refer to Clause 7.3.2.25.1 of the IEEE 802.11i-2004 standard. */
  @js.native
  sealed trait wpaUseGroup
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  val ccmp: ccmp with java.lang.String = js.native
  val ihv: ihv with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val rsnUseGroup: rsnUseGroup with java.lang.String = js.native
  val tkip: tkip with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val wep: wep with java.lang.String = js.native
  val wep104: wep104 with java.lang.String = js.native
  val wep40: wep40 with java.lang.String = js.native
  val wpaUseGroup: wpaUseGroup with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType with java.lang.String
  ] = js.native
}


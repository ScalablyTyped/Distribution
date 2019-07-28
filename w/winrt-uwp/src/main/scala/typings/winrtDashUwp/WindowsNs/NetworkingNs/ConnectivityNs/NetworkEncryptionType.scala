package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

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
  sealed trait ccmp extends NetworkEncryptionType
  
  /** Specifies an encryption type defined by an independent hardware vendor (IHV). */
  @js.native
  sealed trait ihv extends NetworkEncryptionType
  
  /** No encryption enabled. */
  @js.native
  sealed trait none extends NetworkEncryptionType
  
  /** Specifies a Robust Security Network (RSN) Use Group Key cipher suite. For more information about the Use Group Key cipher suite, refer to Clause 7.3.2.25.1 of the IEEE 802.11i-2004 standard. */
  @js.native
  sealed trait rsnUseGroup extends NetworkEncryptionType
  
  /** Specifies a Temporal Key Integrity Protocol (TKIP) algorithm, which is the RC4-based cipher suite that is based on the algorithms that are defined in the WPA specification and IEEE 802.11i-2004 standard. This cipher also uses the Michael Message Integrity Code (MIC) algorithm for forgery protection. */
  @js.native
  sealed trait tkip extends NetworkEncryptionType
  
  /** Encryption method unknown. */
  @js.native
  sealed trait unknown extends NetworkEncryptionType
  
  /** Specifies a WEP cipher algorithm with a cipher key of any length. */
  @js.native
  sealed trait wep extends NetworkEncryptionType
  
  /** Specifies a WEP cipher algorithm with a 104-bit cipher key. */
  @js.native
  sealed trait wep104 extends NetworkEncryptionType
  
  /** Specifies a Wired Equivalent Privacy (WEP) algorithm, which is the RC4-based algorithm that is specified in the IEEE 802.11-1999 standard. This enumerator specifies the WEP cipher algorithm with a 40-bit cipher key. */
  @js.native
  sealed trait wep40 extends NetworkEncryptionType
  
  /** Specifies a Wifi Protected Access (WPA) Use Group Key cipher suite. For more information about the Use Group Key cipher suite, refer to Clause 7.3.2.25.1 of the IEEE 802.11i-2004 standard. */
  @js.native
  sealed trait wpaUseGroup extends NetworkEncryptionType
  
  /* 6 */ val ccmp: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.ccmp with Double = js.native
  /* 9 */ val ihv: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.ihv with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.none with Double = js.native
  /* 8 */ val rsnUseGroup: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.rsnUseGroup with Double = js.native
  /* 5 */ val tkip: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.tkip with Double = js.native
  /* 1 */ val unknown: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.unknown with Double = js.native
  /* 2 */ val wep: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.wep with Double = js.native
  /* 4 */ val wep104: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.wep104 with Double = js.native
  /* 3 */ val wep40: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.wep40 with Double = js.native
  /* 7 */ val wpaUseGroup: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.wpaUseGroup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkEncryptionType with Double] = js.native
}


package typings.winrtDashUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.ccmp
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.ihv
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.none
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.rsnUseGroup
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.tkip
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.unknown
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep104
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep40
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wpaUseGroup
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkEncryptionType with Double] = js.native
  /* 6 */ @js.native
  object ccmp extends TopLevel[ccmp with Double]
  
  /* 9 */ @js.native
  object ihv extends TopLevel[ihv with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 8 */ @js.native
  object rsnUseGroup extends TopLevel[rsnUseGroup with Double]
  
  /* 5 */ @js.native
  object tkip extends TopLevel[tkip with Double]
  
  /* 1 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object wep extends TopLevel[wep with Double]
  
  /* 4 */ @js.native
  object wep104 extends TopLevel[wep104 with Double]
  
  /* 3 */ @js.native
  object wep40 extends TopLevel[wep40 with Double]
  
  /* 7 */ @js.native
  object wpaUseGroup extends TopLevel[wpaUseGroup with Double]
  
}


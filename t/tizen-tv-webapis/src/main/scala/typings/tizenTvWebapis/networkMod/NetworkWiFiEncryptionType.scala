package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkWiFiEncryptionType extends js.Object
@JSImport("tizen-tv-webapis/network", "NetworkWiFiEncryptionType")
@js.native
object NetworkWiFiEncryptionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkWiFiEncryptionType with Double] = js.native
  
  /**
    * AES encryption
    */
  @js.native
  sealed trait AES extends NetworkWiFiEncryptionType
  /* 3 */ @js.native
  object AES extends TopLevel[AES with Double]
  
  /**
    * No encryption
    */
  @js.native
  sealed trait NONE extends NetworkWiFiEncryptionType
  /* 5 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /**
    * TKIP encryption
    */
  @js.native
  sealed trait TKIP extends NetworkWiFiEncryptionType
  /* 2 */ @js.native
  object TKIP extends TopLevel[TKIP with Double]
  
  /**
    * TKIP_AES_MIXED encryption
    */
  @js.native
  sealed trait TKIP_AES_MIXED extends NetworkWiFiEncryptionType
  /* 4 */ @js.native
  object TKIP_AES_MIXED extends TopLevel[TKIP_AES_MIXED with Double]
  
  /**
    * Encryption type unknown
    */
  @js.native
  sealed trait UNKNOWN extends NetworkWiFiEncryptionType
  /* 6 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /**
    * WEP encryption
    */
  @js.native
  sealed trait WEP extends NetworkWiFiEncryptionType
  /* 1 */ @js.native
  object WEP extends TopLevel[WEP with Double]
}

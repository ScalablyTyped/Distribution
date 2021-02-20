package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkWiFiEncryptionType extends StObject
@JSImport("tizen-tv-webapis/network", "NetworkWiFiEncryptionType")
@js.native
object NetworkWiFiEncryptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkWiFiEncryptionType with Double] = js.native
  
  /**
    * AES encryption
    */
  @js.native
  sealed trait AES extends NetworkWiFiEncryptionType
  /* 3 */ val AES: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.AES with Double = js.native
  
  /**
    * No encryption
    */
  @js.native
  sealed trait NONE extends NetworkWiFiEncryptionType
  /* 5 */ val NONE: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.NONE with Double = js.native
  
  /**
    * TKIP encryption
    */
  @js.native
  sealed trait TKIP extends NetworkWiFiEncryptionType
  /* 2 */ val TKIP: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.TKIP with Double = js.native
  
  /**
    * TKIP_AES_MIXED encryption
    */
  @js.native
  sealed trait TKIP_AES_MIXED extends NetworkWiFiEncryptionType
  /* 4 */ val TKIP_AES_MIXED: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.TKIP_AES_MIXED with Double = js.native
  
  /**
    * Encryption type unknown
    */
  @js.native
  sealed trait UNKNOWN extends NetworkWiFiEncryptionType
  /* 6 */ val UNKNOWN: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.UNKNOWN with Double = js.native
  
  /**
    * WEP encryption
    */
  @js.native
  sealed trait WEP extends NetworkWiFiEncryptionType
  /* 1 */ val WEP: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.WEP with Double = js.native
}

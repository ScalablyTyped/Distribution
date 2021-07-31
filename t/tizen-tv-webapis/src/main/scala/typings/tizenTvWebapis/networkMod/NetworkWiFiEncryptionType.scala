package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkWiFiEncryptionType extends StObject
@JSImport("tizen-tv-webapis/network", "NetworkWiFiEncryptionType")
@js.native
object NetworkWiFiEncryptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkWiFiEncryptionType & Double] = js.native
  
  /**
    * AES encryption
    */
  @js.native
  sealed trait AES
    extends StObject
       with NetworkWiFiEncryptionType
  /* 3 */ val AES: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.AES & Double = js.native
  
  /**
    * No encryption
    */
  @js.native
  sealed trait NONE
    extends StObject
       with NetworkWiFiEncryptionType
  /* 5 */ val NONE: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.NONE & Double = js.native
  
  /**
    * TKIP encryption
    */
  @js.native
  sealed trait TKIP
    extends StObject
       with NetworkWiFiEncryptionType
  /* 2 */ val TKIP: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.TKIP & Double = js.native
  
  /**
    * TKIP_AES_MIXED encryption
    */
  @js.native
  sealed trait TKIP_AES_MIXED
    extends StObject
       with NetworkWiFiEncryptionType
  /* 4 */ val TKIP_AES_MIXED: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.TKIP_AES_MIXED & Double = js.native
  
  /**
    * Encryption type unknown
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with NetworkWiFiEncryptionType
  /* 6 */ val UNKNOWN: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.UNKNOWN & Double = js.native
  
  /**
    * WEP encryption
    */
  @js.native
  sealed trait WEP
    extends StObject
       with NetworkWiFiEncryptionType
  /* 1 */ val WEP: typings.tizenTvWebapis.networkMod.NetworkWiFiEncryptionType.WEP & Double = js.native
}

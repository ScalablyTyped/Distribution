package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkEncryptionType extends StObject
@JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
@js.native
object NetworkEncryptionType extends StObject {
  
  @js.native
  sealed trait ccmp
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait ihv
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait none
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait rsnUseGroup
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait tkip
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait unknown
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait wep
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait wep104
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait wep40
    extends StObject
       with NetworkEncryptionType
  
  @js.native
  sealed trait wpaUseGroup
    extends StObject
       with NetworkEncryptionType
}

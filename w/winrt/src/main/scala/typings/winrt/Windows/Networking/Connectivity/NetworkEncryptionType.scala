package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkEncryptionType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
@js.native
object NetworkEncryptionType extends js.Object {
  @js.native
  sealed trait ccmp extends NetworkEncryptionType
  
  @js.native
  sealed trait ihv extends NetworkEncryptionType
  
  @js.native
  sealed trait none extends NetworkEncryptionType
  
  @js.native
  sealed trait rsnUseGroup extends NetworkEncryptionType
  
  @js.native
  sealed trait tkip extends NetworkEncryptionType
  
  @js.native
  sealed trait unknown extends NetworkEncryptionType
  
  @js.native
  sealed trait wep extends NetworkEncryptionType
  
  @js.native
  sealed trait wep104 extends NetworkEncryptionType
  
  @js.native
  sealed trait wep40 extends NetworkEncryptionType
  
  @js.native
  sealed trait wpaUseGroup extends NetworkEncryptionType
  
}


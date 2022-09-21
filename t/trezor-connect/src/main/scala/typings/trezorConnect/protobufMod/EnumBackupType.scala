package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBackupType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_BackupType")
@js.native
object EnumBackupType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBackupType & Double] = js.native
  
  @js.native
  sealed trait Bip39
    extends StObject
       with EnumBackupType
  /* 0 */ val Bip39: typings.trezorConnect.protobufMod.EnumBackupType.Bip39 & Double = js.native
  
  @js.native
  sealed trait Slip39_Advanced
    extends StObject
       with EnumBackupType
  /* 2 */ val Slip39_Advanced: typings.trezorConnect.protobufMod.EnumBackupType.Slip39_Advanced & Double = js.native
  
  @js.native
  sealed trait Slip39_Basic
    extends StObject
       with EnumBackupType
  /* 1 */ val Slip39_Basic: typings.trezorConnect.protobufMod.EnumBackupType.Slip39_Basic & Double = js.native
}

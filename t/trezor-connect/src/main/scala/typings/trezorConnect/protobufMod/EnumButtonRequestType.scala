package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumButtonRequestType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_ButtonRequestType")
@js.native
object EnumButtonRequestType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumButtonRequestType & Double] = js.native
  
  @js.native
  sealed trait ButtonRequest_Address
    extends StObject
       with EnumButtonRequestType
  /* 10 */ val ButtonRequest_Address: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_Address & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_ConfirmOutput
    extends StObject
       with EnumButtonRequestType
  /* 3 */ val ButtonRequest_ConfirmOutput: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_ConfirmOutput & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_ConfirmWord
    extends StObject
       with EnumButtonRequestType
  /* 5 */ val ButtonRequest_ConfirmWord: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_ConfirmWord & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_FeeOverThreshold
    extends StObject
       with EnumButtonRequestType
  /* 2 */ val ButtonRequest_FeeOverThreshold: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_FeeOverThreshold & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_FirmwareCheck
    extends StObject
       with EnumButtonRequestType
  /* 9 */ val ButtonRequest_FirmwareCheck: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_FirmwareCheck & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_MnemonicInput
    extends StObject
       with EnumButtonRequestType
  /* 13 */ val ButtonRequest_MnemonicInput: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_MnemonicInput & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_MnemonicWordCount
    extends StObject
       with EnumButtonRequestType
  /* 12 */ val ButtonRequest_MnemonicWordCount: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_MnemonicWordCount & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_Other
    extends StObject
       with EnumButtonRequestType
  /* 1 */ val ButtonRequest_Other: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_Other & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_PassphraseEntry
    extends StObject
       with EnumButtonRequestType
  /* 19 */ val ButtonRequest_PassphraseEntry: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_PassphraseEntry & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_PinEntry
    extends StObject
       with EnumButtonRequestType
  /* 20 */ val ButtonRequest_PinEntry: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_PinEntry & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_ProtectCall
    extends StObject
       with EnumButtonRequestType
  /* 7 */ val ButtonRequest_ProtectCall: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_ProtectCall & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_PublicKey
    extends StObject
       with EnumButtonRequestType
  /* 11 */ val ButtonRequest_PublicKey: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_PublicKey & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_RecoveryHomepage
    extends StObject
       with EnumButtonRequestType
  /* 16 */ val ButtonRequest_RecoveryHomepage: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_RecoveryHomepage & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_ResetDevice
    extends StObject
       with EnumButtonRequestType
  /* 4 */ val ButtonRequest_ResetDevice: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_ResetDevice & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_SignTx
    extends StObject
       with EnumButtonRequestType
  /* 8 */ val ButtonRequest_SignTx: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_SignTx & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_Success
    extends StObject
       with EnumButtonRequestType
  /* 17 */ val ButtonRequest_Success: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_Success & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_UnknownDerivationPath
    extends StObject
       with EnumButtonRequestType
  /* 15 */ val ButtonRequest_UnknownDerivationPath: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_UnknownDerivationPath & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_Warning
    extends StObject
       with EnumButtonRequestType
  /* 18 */ val ButtonRequest_Warning: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_Warning & Double = js.native
  
  @js.native
  sealed trait ButtonRequest_WipeDevice
    extends StObject
       with EnumButtonRequestType
  /* 6 */ val ButtonRequest_WipeDevice: typings.trezorConnect.protobufMod.EnumButtonRequestType.ButtonRequest_WipeDevice & Double = js.native
  
  @js.native
  sealed trait _Deprecated_ButtonRequest_PassphraseType
    extends StObject
       with EnumButtonRequestType
  /* 14 */ val _Deprecated_ButtonRequest_PassphraseType: typings.trezorConnect.protobufMod.EnumButtonRequestType._Deprecated_ButtonRequest_PassphraseType & Double = js.native
}

package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecoveryDeviceType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "RecoveryDeviceType")
@js.native
object RecoveryDeviceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecoveryDeviceType & Double] = js.native
  
  @js.native
  sealed trait RecoveryDeviceType_Matrix
    extends StObject
       with RecoveryDeviceType
  /* 1 */ val RecoveryDeviceType_Matrix: typings.trezorConnect.libTypescriptTrezorProtobufMod.RecoveryDeviceType.RecoveryDeviceType_Matrix & Double = js.native
  
  @js.native
  sealed trait RecoveryDeviceType_ScrambledWords
    extends StObject
       with RecoveryDeviceType
  /* 0 */ val RecoveryDeviceType_ScrambledWords: typings.trezorConnect.libTypescriptTrezorProtobufMod.RecoveryDeviceType.RecoveryDeviceType_ScrambledWords & Double = js.native
}

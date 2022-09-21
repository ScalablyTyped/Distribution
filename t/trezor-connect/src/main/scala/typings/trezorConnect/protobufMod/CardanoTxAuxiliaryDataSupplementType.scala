package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoTxAuxiliaryDataSupplementType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoTxAuxiliaryDataSupplementType")
@js.native
object CardanoTxAuxiliaryDataSupplementType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoTxAuxiliaryDataSupplementType & Double] = js.native
  
  @js.native
  sealed trait CATALYST_REGISTRATION_SIGNATURE
    extends StObject
       with CardanoTxAuxiliaryDataSupplementType
  /* 1 */ val CATALYST_REGISTRATION_SIGNATURE: typings.trezorConnect.protobufMod.CardanoTxAuxiliaryDataSupplementType.CATALYST_REGISTRATION_SIGNATURE & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with CardanoTxAuxiliaryDataSupplementType
  /* 0 */ val NONE: typings.trezorConnect.protobufMod.CardanoTxAuxiliaryDataSupplementType.NONE & Double = js.native
}

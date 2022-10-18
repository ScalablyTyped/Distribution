package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoTxSigningMode extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoTxSigningMode")
@js.native
object CardanoTxSigningMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoTxSigningMode & Double] = js.native
  
  @js.native
  sealed trait MULTISIG_TRANSACTION
    extends StObject
       with CardanoTxSigningMode
  /* 2 */ val MULTISIG_TRANSACTION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode.MULTISIG_TRANSACTION & Double = js.native
  
  @js.native
  sealed trait ORDINARY_TRANSACTION
    extends StObject
       with CardanoTxSigningMode
  /* 0 */ val ORDINARY_TRANSACTION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode.ORDINARY_TRANSACTION & Double = js.native
  
  @js.native
  sealed trait PLUTUS_TRANSACTION
    extends StObject
       with CardanoTxSigningMode
  /* 3 */ val PLUTUS_TRANSACTION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode.PLUTUS_TRANSACTION & Double = js.native
  
  @js.native
  sealed trait POOL_REGISTRATION_AS_OWNER
    extends StObject
       with CardanoTxSigningMode
  /* 1 */ val POOL_REGISTRATION_AS_OWNER: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode.POOL_REGISTRATION_AS_OWNER & Double = js.native
}

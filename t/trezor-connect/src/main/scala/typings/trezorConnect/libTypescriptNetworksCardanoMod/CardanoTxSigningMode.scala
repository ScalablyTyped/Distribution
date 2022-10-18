package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("trezor-connect/lib/typescript/networks/cardano", "CardanoTxSigningMode")
@js.native
object CardanoTxSigningMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode & Double
  ] = js.native
  
  /* 2 */ val MULTISIG_TRANSACTION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode.MULTISIG_TRANSACTION & Double = js.native
  
  /* 0 */ val ORDINARY_TRANSACTION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode.ORDINARY_TRANSACTION & Double = js.native
  
  /* 3 */ val PLUTUS_TRANSACTION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode.PLUTUS_TRANSACTION & Double = js.native
  
  /* 1 */ val POOL_REGISTRATION_AS_OWNER: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode.POOL_REGISTRATION_AS_OWNER & Double = js.native
}

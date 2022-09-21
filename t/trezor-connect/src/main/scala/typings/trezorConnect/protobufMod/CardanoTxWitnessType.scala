package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoTxWitnessType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoTxWitnessType")
@js.native
object CardanoTxWitnessType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoTxWitnessType & Double] = js.native
  
  @js.native
  sealed trait BYRON_WITNESS
    extends StObject
       with CardanoTxWitnessType
  /* 0 */ val BYRON_WITNESS: typings.trezorConnect.protobufMod.CardanoTxWitnessType.BYRON_WITNESS & Double = js.native
  
  @js.native
  sealed trait SHELLEY_WITNESS
    extends StObject
       with CardanoTxWitnessType
  /* 1 */ val SHELLEY_WITNESS: typings.trezorConnect.protobufMod.CardanoTxWitnessType.SHELLEY_WITNESS & Double = js.native
}

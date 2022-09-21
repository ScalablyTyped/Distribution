package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoDerivationType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoDerivationType")
@js.native
object CardanoDerivationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoDerivationType & Double] = js.native
  
  @js.native
  sealed trait ICARUS
    extends StObject
       with CardanoDerivationType
  /* 1 */ val ICARUS: typings.trezorConnect.protobufMod.CardanoDerivationType.ICARUS & Double = js.native
  
  @js.native
  sealed trait ICARUS_TREZOR
    extends StObject
       with CardanoDerivationType
  /* 2 */ val ICARUS_TREZOR: typings.trezorConnect.protobufMod.CardanoDerivationType.ICARUS_TREZOR & Double = js.native
  
  @js.native
  sealed trait LEDGER
    extends StObject
       with CardanoDerivationType
  /* 0 */ val LEDGER: typings.trezorConnect.protobufMod.CardanoDerivationType.LEDGER & Double = js.native
}

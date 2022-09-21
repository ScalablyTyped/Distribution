package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoNativeScriptHashDisplayFormat extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoNativeScriptHashDisplayFormat")
@js.native
object CardanoNativeScriptHashDisplayFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoNativeScriptHashDisplayFormat & Double] = js.native
  
  @js.native
  sealed trait BECH32
    extends StObject
       with CardanoNativeScriptHashDisplayFormat
  /* 1 */ val BECH32: typings.trezorConnect.protobufMod.CardanoNativeScriptHashDisplayFormat.BECH32 & Double = js.native
  
  @js.native
  sealed trait HIDE
    extends StObject
       with CardanoNativeScriptHashDisplayFormat
  /* 0 */ val HIDE: typings.trezorConnect.protobufMod.CardanoNativeScriptHashDisplayFormat.HIDE & Double = js.native
  
  @js.native
  sealed trait POLICY_ID
    extends StObject
       with CardanoNativeScriptHashDisplayFormat
  /* 2 */ val POLICY_ID: typings.trezorConnect.protobufMod.CardanoNativeScriptHashDisplayFormat.POLICY_ID & Double = js.native
}

package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoNativeScriptType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoNativeScriptType")
@js.native
object CardanoNativeScriptType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoNativeScriptType & Double] = js.native
  
  @js.native
  sealed trait ALL
    extends StObject
       with CardanoNativeScriptType
  /* 1 */ val ALL: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptType.ALL & Double = js.native
  
  @js.native
  sealed trait ANY
    extends StObject
       with CardanoNativeScriptType
  /* 2 */ val ANY: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptType.ANY & Double = js.native
  
  @js.native
  sealed trait INVALID_BEFORE
    extends StObject
       with CardanoNativeScriptType
  /* 4 */ val INVALID_BEFORE: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptType.INVALID_BEFORE & Double = js.native
  
  @js.native
  sealed trait INVALID_HEREAFTER
    extends StObject
       with CardanoNativeScriptType
  /* 5 */ val INVALID_HEREAFTER: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptType.INVALID_HEREAFTER & Double = js.native
  
  @js.native
  sealed trait N_OF_K
    extends StObject
       with CardanoNativeScriptType
  /* 3 */ val N_OF_K: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptType.N_OF_K & Double = js.native
  
  @js.native
  sealed trait PUB_KEY
    extends StObject
       with CardanoNativeScriptType
  /* 0 */ val PUB_KEY: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptType.PUB_KEY & Double = js.native
}

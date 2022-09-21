package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoAddressType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoAddressType")
@js.native
object CardanoAddressType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoAddressType & Double] = js.native
  
  @js.native
  sealed trait BASE
    extends StObject
       with CardanoAddressType
  /* 0 */ val BASE: typings.trezorConnect.protobufMod.CardanoAddressType.BASE & Double = js.native
  
  @js.native
  sealed trait BASE_KEY_SCRIPT
    extends StObject
       with CardanoAddressType
  /* 2 */ val BASE_KEY_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.BASE_KEY_SCRIPT & Double = js.native
  
  @js.native
  sealed trait BASE_SCRIPT_KEY
    extends StObject
       with CardanoAddressType
  /* 1 */ val BASE_SCRIPT_KEY: typings.trezorConnect.protobufMod.CardanoAddressType.BASE_SCRIPT_KEY & Double = js.native
  
  @js.native
  sealed trait BASE_SCRIPT_SCRIPT
    extends StObject
       with CardanoAddressType
  /* 3 */ val BASE_SCRIPT_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.BASE_SCRIPT_SCRIPT & Double = js.native
  
  @js.native
  sealed trait BYRON
    extends StObject
       with CardanoAddressType
  /* 8 */ val BYRON: typings.trezorConnect.protobufMod.CardanoAddressType.BYRON & Double = js.native
  
  @js.native
  sealed trait ENTERPRISE
    extends StObject
       with CardanoAddressType
  /* 6 */ val ENTERPRISE: typings.trezorConnect.protobufMod.CardanoAddressType.ENTERPRISE & Double = js.native
  
  @js.native
  sealed trait ENTERPRISE_SCRIPT
    extends StObject
       with CardanoAddressType
  /* 7 */ val ENTERPRISE_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.ENTERPRISE_SCRIPT & Double = js.native
  
  @js.native
  sealed trait POINTER
    extends StObject
       with CardanoAddressType
  /* 4 */ val POINTER: typings.trezorConnect.protobufMod.CardanoAddressType.POINTER & Double = js.native
  
  @js.native
  sealed trait POINTER_SCRIPT
    extends StObject
       with CardanoAddressType
  /* 5 */ val POINTER_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.POINTER_SCRIPT & Double = js.native
  
  @js.native
  sealed trait REWARD
    extends StObject
       with CardanoAddressType
  /* 14 */ val REWARD: typings.trezorConnect.protobufMod.CardanoAddressType.REWARD & Double = js.native
  
  @js.native
  sealed trait REWARD_SCRIPT
    extends StObject
       with CardanoAddressType
  /* 15 */ val REWARD_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.REWARD_SCRIPT & Double = js.native
}

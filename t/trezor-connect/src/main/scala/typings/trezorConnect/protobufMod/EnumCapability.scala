package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumCapability extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_Capability")
@js.native
object EnumCapability extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumCapability & Double] = js.native
  
  @js.native
  sealed trait Capability_Binance
    extends StObject
       with EnumCapability
  /* 3 */ val Capability_Binance: typings.trezorConnect.protobufMod.EnumCapability.Capability_Binance & Double = js.native
  
  @js.native
  sealed trait Capability_Bitcoin
    extends StObject
       with EnumCapability
  /* 1 */ val Capability_Bitcoin: typings.trezorConnect.protobufMod.EnumCapability.Capability_Bitcoin & Double = js.native
  
  @js.native
  sealed trait Capability_Bitcoin_like
    extends StObject
       with EnumCapability
  /* 2 */ val Capability_Bitcoin_like: typings.trezorConnect.protobufMod.EnumCapability.Capability_Bitcoin_like & Double = js.native
  
  @js.native
  sealed trait Capability_Cardano
    extends StObject
       with EnumCapability
  /* 4 */ val Capability_Cardano: typings.trezorConnect.protobufMod.EnumCapability.Capability_Cardano & Double = js.native
  
  @js.native
  sealed trait Capability_Crypto
    extends StObject
       with EnumCapability
  /* 5 */ val Capability_Crypto: typings.trezorConnect.protobufMod.EnumCapability.Capability_Crypto & Double = js.native
  
  @js.native
  sealed trait Capability_EOS
    extends StObject
       with EnumCapability
  /* 6 */ val Capability_EOS: typings.trezorConnect.protobufMod.EnumCapability.Capability_EOS & Double = js.native
  
  @js.native
  sealed trait Capability_Ethereum
    extends StObject
       with EnumCapability
  /* 7 */ val Capability_Ethereum: typings.trezorConnect.protobufMod.EnumCapability.Capability_Ethereum & Double = js.native
  
  @js.native
  sealed trait Capability_Lisk
    extends StObject
       with EnumCapability
  /* 8 */ val Capability_Lisk: typings.trezorConnect.protobufMod.EnumCapability.Capability_Lisk & Double = js.native
  
  @js.native
  sealed trait Capability_Monero
    extends StObject
       with EnumCapability
  /* 9 */ val Capability_Monero: typings.trezorConnect.protobufMod.EnumCapability.Capability_Monero & Double = js.native
  
  @js.native
  sealed trait Capability_NEM
    extends StObject
       with EnumCapability
  /* 10 */ val Capability_NEM: typings.trezorConnect.protobufMod.EnumCapability.Capability_NEM & Double = js.native
  
  @js.native
  sealed trait Capability_PassphraseEntry
    extends StObject
       with EnumCapability
  /* 17 */ val Capability_PassphraseEntry: typings.trezorConnect.protobufMod.EnumCapability.Capability_PassphraseEntry & Double = js.native
  
  @js.native
  sealed trait Capability_Ripple
    extends StObject
       with EnumCapability
  /* 11 */ val Capability_Ripple: typings.trezorConnect.protobufMod.EnumCapability.Capability_Ripple & Double = js.native
  
  @js.native
  sealed trait Capability_Shamir
    extends StObject
       with EnumCapability
  /* 15 */ val Capability_Shamir: typings.trezorConnect.protobufMod.EnumCapability.Capability_Shamir & Double = js.native
  
  @js.native
  sealed trait Capability_ShamirGroups
    extends StObject
       with EnumCapability
  /* 16 */ val Capability_ShamirGroups: typings.trezorConnect.protobufMod.EnumCapability.Capability_ShamirGroups & Double = js.native
  
  @js.native
  sealed trait Capability_Stellar
    extends StObject
       with EnumCapability
  /* 12 */ val Capability_Stellar: typings.trezorConnect.protobufMod.EnumCapability.Capability_Stellar & Double = js.native
  
  @js.native
  sealed trait Capability_Tezos
    extends StObject
       with EnumCapability
  /* 13 */ val Capability_Tezos: typings.trezorConnect.protobufMod.EnumCapability.Capability_Tezos & Double = js.native
  
  @js.native
  sealed trait Capability_U2F
    extends StObject
       with EnumCapability
  /* 14 */ val Capability_U2F: typings.trezorConnect.protobufMod.EnumCapability.Capability_U2F & Double = js.native
}

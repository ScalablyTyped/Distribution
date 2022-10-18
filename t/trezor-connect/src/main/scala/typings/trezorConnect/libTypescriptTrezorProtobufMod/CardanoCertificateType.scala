package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoCertificateType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoCertificateType")
@js.native
object CardanoCertificateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoCertificateType & Double] = js.native
  
  @js.native
  sealed trait STAKE_DELEGATION
    extends StObject
       with CardanoCertificateType
  /* 2 */ val STAKE_DELEGATION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoCertificateType.STAKE_DELEGATION & Double = js.native
  
  @js.native
  sealed trait STAKE_DEREGISTRATION
    extends StObject
       with CardanoCertificateType
  /* 1 */ val STAKE_DEREGISTRATION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoCertificateType.STAKE_DEREGISTRATION & Double = js.native
  
  @js.native
  sealed trait STAKE_POOL_REGISTRATION
    extends StObject
       with CardanoCertificateType
  /* 3 */ val STAKE_POOL_REGISTRATION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoCertificateType.STAKE_POOL_REGISTRATION & Double = js.native
  
  @js.native
  sealed trait STAKE_REGISTRATION
    extends StObject
       with CardanoCertificateType
  /* 0 */ val STAKE_REGISTRATION: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoCertificateType.STAKE_REGISTRATION & Double = js.native
}

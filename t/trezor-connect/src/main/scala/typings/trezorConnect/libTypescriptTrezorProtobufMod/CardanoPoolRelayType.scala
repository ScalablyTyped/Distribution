package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardanoPoolRelayType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "CardanoPoolRelayType")
@js.native
object CardanoPoolRelayType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardanoPoolRelayType & Double] = js.native
  
  @js.native
  sealed trait MULTIPLE_HOST_NAME
    extends StObject
       with CardanoPoolRelayType
  /* 2 */ val MULTIPLE_HOST_NAME: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoPoolRelayType.MULTIPLE_HOST_NAME & Double = js.native
  
  @js.native
  sealed trait SINGLE_HOST_IP
    extends StObject
       with CardanoPoolRelayType
  /* 0 */ val SINGLE_HOST_IP: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoPoolRelayType.SINGLE_HOST_IP & Double = js.native
  
  @js.native
  sealed trait SINGLE_HOST_NAME
    extends StObject
       with CardanoPoolRelayType
  /* 1 */ val SINGLE_HOST_NAME: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoPoolRelayType.SINGLE_HOST_NAME & Double = js.native
}

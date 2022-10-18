package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DecredStakingSpendType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "DecredStakingSpendType")
@js.native
object DecredStakingSpendType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DecredStakingSpendType & Double] = js.native
  
  @js.native
  sealed trait SSGen
    extends StObject
       with DecredStakingSpendType
  /* 0 */ val SSGen: typings.trezorConnect.libTypescriptTrezorProtobufMod.DecredStakingSpendType.SSGen & Double = js.native
  
  @js.native
  sealed trait SSRTX
    extends StObject
       with DecredStakingSpendType
  /* 1 */ val SSRTX: typings.trezorConnect.libTypescriptTrezorProtobufMod.DecredStakingSpendType.SSRTX & Double = js.native
}

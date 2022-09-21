package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NEMSupplyChangeType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "NEMSupplyChangeType")
@js.native
object NEMSupplyChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NEMSupplyChangeType & Double] = js.native
  
  @js.native
  sealed trait SupplyChange_Decrease
    extends StObject
       with NEMSupplyChangeType
  /* 2 */ val SupplyChange_Decrease: typings.trezorConnect.protobufMod.NEMSupplyChangeType.SupplyChange_Decrease & Double = js.native
  
  @js.native
  sealed trait SupplyChange_Increase
    extends StObject
       with NEMSupplyChangeType
  /* 1 */ val SupplyChange_Increase: typings.trezorConnect.protobufMod.NEMSupplyChangeType.SupplyChange_Increase & Double = js.native
}

package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NEMModificationType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "NEMModificationType")
@js.native
object NEMModificationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NEMModificationType & Double] = js.native
  
  @js.native
  sealed trait CosignatoryModification_Add
    extends StObject
       with NEMModificationType
  /* 1 */ val CosignatoryModification_Add: typings.trezorConnect.protobufMod.NEMModificationType.CosignatoryModification_Add & Double = js.native
  
  @js.native
  sealed trait CosignatoryModification_Delete
    extends StObject
       with NEMModificationType
  /* 2 */ val CosignatoryModification_Delete: typings.trezorConnect.protobufMod.NEMModificationType.CosignatoryModification_Delete & Double = js.native
}

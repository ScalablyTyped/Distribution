package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NEMImportanceTransferMode extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "NEMImportanceTransferMode")
@js.native
object NEMImportanceTransferMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NEMImportanceTransferMode & Double] = js.native
  
  @js.native
  sealed trait ImportanceTransfer_Activate
    extends StObject
       with NEMImportanceTransferMode
  /* 1 */ val ImportanceTransfer_Activate: typings.trezorConnect.protobufMod.NEMImportanceTransferMode.ImportanceTransfer_Activate & Double = js.native
  
  @js.native
  sealed trait ImportanceTransfer_Deactivate
    extends StObject
       with NEMImportanceTransferMode
  /* 2 */ val ImportanceTransfer_Deactivate: typings.trezorConnect.protobufMod.NEMImportanceTransferMode.ImportanceTransfer_Deactivate & Double = js.native
}

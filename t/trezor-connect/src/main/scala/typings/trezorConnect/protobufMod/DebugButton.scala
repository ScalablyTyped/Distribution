package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DebugButton extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "DebugButton")
@js.native
object DebugButton extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DebugButton & Double] = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with DebugButton
  /* 2 */ val INFO: typings.trezorConnect.protobufMod.DebugButton.INFO & Double = js.native
  
  @js.native
  sealed trait NO
    extends StObject
       with DebugButton
  /* 0 */ val NO: typings.trezorConnect.protobufMod.DebugButton.NO & Double = js.native
  
  @js.native
  sealed trait YES
    extends StObject
       with DebugButton
  /* 1 */ val YES: typings.trezorConnect.protobufMod.DebugButton.YES & Double = js.native
}

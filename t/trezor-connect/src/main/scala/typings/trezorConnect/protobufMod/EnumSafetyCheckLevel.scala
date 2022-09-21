package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumSafetyCheckLevel extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_SafetyCheckLevel")
@js.native
object EnumSafetyCheckLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumSafetyCheckLevel & Double] = js.native
  
  @js.native
  sealed trait PromptAlways
    extends StObject
       with EnumSafetyCheckLevel
  /* 1 */ val PromptAlways: typings.trezorConnect.protobufMod.EnumSafetyCheckLevel.PromptAlways & Double = js.native
  
  @js.native
  sealed trait PromptTemporarily
    extends StObject
       with EnumSafetyCheckLevel
  /* 2 */ val PromptTemporarily: typings.trezorConnect.protobufMod.EnumSafetyCheckLevel.PromptTemporarily & Double = js.native
  
  @js.native
  sealed trait Strict
    extends StObject
       with EnumSafetyCheckLevel
  /* 0 */ val Strict: typings.trezorConnect.protobufMod.EnumSafetyCheckLevel.Strict & Double = js.native
}

package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumPinMatrixRequestType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_PinMatrixRequestType")
@js.native
object EnumPinMatrixRequestType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumPinMatrixRequestType & Double] = js.native
  
  @js.native
  sealed trait PinMatrixRequestType_Current
    extends StObject
       with EnumPinMatrixRequestType
  /* 1 */ val PinMatrixRequestType_Current: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumPinMatrixRequestType.PinMatrixRequestType_Current & Double = js.native
  
  @js.native
  sealed trait PinMatrixRequestType_NewFirst
    extends StObject
       with EnumPinMatrixRequestType
  /* 2 */ val PinMatrixRequestType_NewFirst: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumPinMatrixRequestType.PinMatrixRequestType_NewFirst & Double = js.native
  
  @js.native
  sealed trait PinMatrixRequestType_NewSecond
    extends StObject
       with EnumPinMatrixRequestType
  /* 3 */ val PinMatrixRequestType_NewSecond: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumPinMatrixRequestType.PinMatrixRequestType_NewSecond & Double = js.native
  
  @js.native
  sealed trait PinMatrixRequestType_WipeCodeFirst
    extends StObject
       with EnumPinMatrixRequestType
  /* 4 */ val PinMatrixRequestType_WipeCodeFirst: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumPinMatrixRequestType.PinMatrixRequestType_WipeCodeFirst & Double = js.native
  
  @js.native
  sealed trait PinMatrixRequestType_WipeCodeSecond
    extends StObject
       with EnumPinMatrixRequestType
  /* 5 */ val PinMatrixRequestType_WipeCodeSecond: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumPinMatrixRequestType.PinMatrixRequestType_WipeCodeSecond & Double = js.native
}

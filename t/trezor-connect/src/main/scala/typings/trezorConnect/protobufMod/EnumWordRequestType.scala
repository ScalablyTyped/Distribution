package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumWordRequestType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_WordRequestType")
@js.native
object EnumWordRequestType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumWordRequestType & Double] = js.native
  
  @js.native
  sealed trait WordRequestType_Matrix6
    extends StObject
       with EnumWordRequestType
  /* 2 */ val WordRequestType_Matrix6: typings.trezorConnect.protobufMod.EnumWordRequestType.WordRequestType_Matrix6 & Double = js.native
  
  @js.native
  sealed trait WordRequestType_Matrix9
    extends StObject
       with EnumWordRequestType
  /* 1 */ val WordRequestType_Matrix9: typings.trezorConnect.protobufMod.EnumWordRequestType.WordRequestType_Matrix9 & Double = js.native
  
  @js.native
  sealed trait WordRequestType_Plain
    extends StObject
       with EnumWordRequestType
  /* 0 */ val WordRequestType_Plain: typings.trezorConnect.protobufMod.EnumWordRequestType.WordRequestType_Plain & Double = js.native
}

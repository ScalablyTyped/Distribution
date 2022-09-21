package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumRequestType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_RequestType")
@js.native
object EnumRequestType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumRequestType & Double] = js.native
  
  @js.native
  sealed trait TXEXTRADATA
    extends StObject
       with EnumRequestType
  /* 4 */ val TXEXTRADATA: typings.trezorConnect.protobufMod.EnumRequestType.TXEXTRADATA & Double = js.native
  
  @js.native
  sealed trait TXFINISHED
    extends StObject
       with EnumRequestType
  /* 3 */ val TXFINISHED: typings.trezorConnect.protobufMod.EnumRequestType.TXFINISHED & Double = js.native
  
  @js.native
  sealed trait TXINPUT
    extends StObject
       with EnumRequestType
  /* 0 */ val TXINPUT: typings.trezorConnect.protobufMod.EnumRequestType.TXINPUT & Double = js.native
  
  @js.native
  sealed trait TXMETA
    extends StObject
       with EnumRequestType
  /* 2 */ val TXMETA: typings.trezorConnect.protobufMod.EnumRequestType.TXMETA & Double = js.native
  
  @js.native
  sealed trait TXORIGINPUT
    extends StObject
       with EnumRequestType
  /* 5 */ val TXORIGINPUT: typings.trezorConnect.protobufMod.EnumRequestType.TXORIGINPUT & Double = js.native
  
  @js.native
  sealed trait TXORIGOUTPUT
    extends StObject
       with EnumRequestType
  /* 6 */ val TXORIGOUTPUT: typings.trezorConnect.protobufMod.EnumRequestType.TXORIGOUTPUT & Double = js.native
  
  @js.native
  sealed trait TXOUTPUT
    extends StObject
       with EnumRequestType
  /* 1 */ val TXOUTPUT: typings.trezorConnect.protobufMod.EnumRequestType.TXOUTPUT & Double = js.native
  
  @js.native
  sealed trait TXPAYMENTREQ
    extends StObject
       with EnumRequestType
  /* 7 */ val TXPAYMENTREQ: typings.trezorConnect.protobufMod.EnumRequestType.TXPAYMENTREQ & Double = js.native
}

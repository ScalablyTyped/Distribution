package typings.trezorConnect.libTypescriptTrezorProtobufMod

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
  /* 4 */ val TXEXTRADATA: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumRequestType.TXEXTRADATA & Double = js.native
  
  @js.native
  sealed trait TXFINISHED
    extends StObject
       with EnumRequestType
  /* 3 */ val TXFINISHED: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumRequestType.TXFINISHED & Double = js.native
  
  @js.native
  sealed trait TXINPUT
    extends StObject
       with EnumRequestType
  /* 0 */ val TXINPUT: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumRequestType.TXINPUT & Double = js.native
  
  @js.native
  sealed trait TXMETA
    extends StObject
       with EnumRequestType
  /* 2 */ val TXMETA: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumRequestType.TXMETA & Double = js.native
  
  @js.native
  sealed trait TXORIGINPUT
    extends StObject
       with EnumRequestType
  /* 5 */ val TXORIGINPUT: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumRequestType.TXORIGINPUT & Double = js.native
  
  @js.native
  sealed trait TXORIGOUTPUT
    extends StObject
       with EnumRequestType
  /* 6 */ val TXORIGOUTPUT: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumRequestType.TXORIGOUTPUT & Double = js.native
  
  @js.native
  sealed trait TXOUTPUT
    extends StObject
       with EnumRequestType
  /* 1 */ val TXOUTPUT: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumRequestType.TXOUTPUT & Double = js.native
  
  @js.native
  sealed trait TXPAYMENTREQ
    extends StObject
       with EnumRequestType
  /* 7 */ val TXPAYMENTREQ: typings.trezorConnect.libTypescriptTrezorProtobufMod.EnumRequestType.TXPAYMENTREQ & Double = js.native
}

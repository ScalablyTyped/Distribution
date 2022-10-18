package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinanceOrderType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "BinanceOrderType")
@js.native
object BinanceOrderType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinanceOrderType & Double] = js.native
  
  @js.native
  sealed trait LIMIT
    extends StObject
       with BinanceOrderType
  /* 2 */ val LIMIT: typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderType.LIMIT & Double = js.native
  
  @js.native
  sealed trait MARKET
    extends StObject
       with BinanceOrderType
  /* 1 */ val MARKET: typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderType.MARKET & Double = js.native
  
  @js.native
  sealed trait OT_RESERVED
    extends StObject
       with BinanceOrderType
  /* 3 */ val OT_RESERVED: typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderType.OT_RESERVED & Double = js.native
  
  @js.native
  sealed trait OT_UNKNOWN
    extends StObject
       with BinanceOrderType
  /* 0 */ val OT_UNKNOWN: typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderType.OT_UNKNOWN & Double = js.native
}

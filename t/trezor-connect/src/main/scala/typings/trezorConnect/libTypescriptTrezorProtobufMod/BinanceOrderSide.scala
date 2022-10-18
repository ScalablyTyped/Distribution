package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinanceOrderSide extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "BinanceOrderSide")
@js.native
object BinanceOrderSide extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinanceOrderSide & Double] = js.native
  
  @js.native
  sealed trait BUY
    extends StObject
       with BinanceOrderSide
  /* 1 */ val BUY: typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderSide.BUY & Double = js.native
  
  @js.native
  sealed trait SELL
    extends StObject
       with BinanceOrderSide
  /* 2 */ val SELL: typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderSide.SELL & Double = js.native
  
  @js.native
  sealed trait SIDE_UNKNOWN
    extends StObject
       with BinanceOrderSide
  /* 0 */ val SIDE_UNKNOWN: typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderSide.SIDE_UNKNOWN & Double = js.native
}

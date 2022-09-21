package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinanceTimeInForce extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "BinanceTimeInForce")
@js.native
object BinanceTimeInForce extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinanceTimeInForce & Double] = js.native
  
  @js.native
  sealed trait GTE
    extends StObject
       with BinanceTimeInForce
  /* 1 */ val GTE: typings.trezorConnect.protobufMod.BinanceTimeInForce.GTE & Double = js.native
  
  @js.native
  sealed trait IOC
    extends StObject
       with BinanceTimeInForce
  /* 3 */ val IOC: typings.trezorConnect.protobufMod.BinanceTimeInForce.IOC & Double = js.native
  
  @js.native
  sealed trait TIF_RESERVED
    extends StObject
       with BinanceTimeInForce
  /* 2 */ val TIF_RESERVED: typings.trezorConnect.protobufMod.BinanceTimeInForce.TIF_RESERVED & Double = js.native
  
  @js.native
  sealed trait TIF_UNKNOWN
    extends StObject
       with BinanceTimeInForce
  /* 0 */ val TIF_UNKNOWN: typings.trezorConnect.protobufMod.BinanceTimeInForce.TIF_UNKNOWN & Double = js.native
}

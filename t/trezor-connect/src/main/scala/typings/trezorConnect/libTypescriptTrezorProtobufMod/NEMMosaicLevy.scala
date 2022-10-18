package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NEMMosaicLevy extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "NEMMosaicLevy")
@js.native
object NEMMosaicLevy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NEMMosaicLevy & Double] = js.native
  
  @js.native
  sealed trait MosaicLevy_Absolute
    extends StObject
       with NEMMosaicLevy
  /* 1 */ val MosaicLevy_Absolute: typings.trezorConnect.libTypescriptTrezorProtobufMod.NEMMosaicLevy.MosaicLevy_Absolute & Double = js.native
  
  @js.native
  sealed trait MosaicLevy_Percentile
    extends StObject
       with NEMMosaicLevy
  /* 2 */ val MosaicLevy_Percentile: typings.trezorConnect.libTypescriptTrezorProtobufMod.NEMMosaicLevy.MosaicLevy_Percentile & Double = js.native
}

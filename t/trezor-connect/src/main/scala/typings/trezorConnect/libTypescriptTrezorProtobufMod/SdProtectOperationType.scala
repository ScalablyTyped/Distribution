package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SdProtectOperationType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "SdProtectOperationType")
@js.native
object SdProtectOperationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SdProtectOperationType & Double] = js.native
  
  @js.native
  sealed trait DISABLE
    extends StObject
       with SdProtectOperationType
  /* 0 */ val DISABLE: typings.trezorConnect.libTypescriptTrezorProtobufMod.SdProtectOperationType.DISABLE & Double = js.native
  
  @js.native
  sealed trait ENABLE
    extends StObject
       with SdProtectOperationType
  /* 1 */ val ENABLE: typings.trezorConnect.libTypescriptTrezorProtobufMod.SdProtectOperationType.ENABLE & Double = js.native
  
  @js.native
  sealed trait REFRESH
    extends StObject
       with SdProtectOperationType
  /* 2 */ val REFRESH: typings.trezorConnect.libTypescriptTrezorProtobufMod.SdProtectOperationType.REFRESH & Double = js.native
}

package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StellarSignerType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "StellarSignerType")
@js.native
object StellarSignerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StellarSignerType & Double] = js.native
  
  @js.native
  sealed trait ACCOUNT
    extends StObject
       with StellarSignerType
  /* 0 */ val ACCOUNT: typings.trezorConnect.libTypescriptTrezorProtobufMod.StellarSignerType.ACCOUNT & Double = js.native
  
  @js.native
  sealed trait HASH
    extends StObject
       with StellarSignerType
  /* 2 */ val HASH: typings.trezorConnect.libTypescriptTrezorProtobufMod.StellarSignerType.HASH & Double = js.native
  
  @js.native
  sealed trait PRE_AUTH
    extends StObject
       with StellarSignerType
  /* 1 */ val PRE_AUTH: typings.trezorConnect.libTypescriptTrezorProtobufMod.StellarSignerType.PRE_AUTH & Double = js.native
}

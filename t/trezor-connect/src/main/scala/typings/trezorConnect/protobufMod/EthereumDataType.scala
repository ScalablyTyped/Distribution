package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EthereumDataType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "EthereumDataType")
@js.native
object EthereumDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EthereumDataType & Double] = js.native
  
  @js.native
  sealed trait ADDRESS
    extends StObject
       with EthereumDataType
  /* 6 */ val ADDRESS: typings.trezorConnect.protobufMod.EthereumDataType.ADDRESS & Double = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with EthereumDataType
  /* 7 */ val ARRAY: typings.trezorConnect.protobufMod.EthereumDataType.ARRAY & Double = js.native
  
  @js.native
  sealed trait BOOL
    extends StObject
       with EthereumDataType
  /* 5 */ val BOOL: typings.trezorConnect.protobufMod.EthereumDataType.BOOL & Double = js.native
  
  @js.native
  sealed trait BYTES
    extends StObject
       with EthereumDataType
  /* 3 */ val BYTES: typings.trezorConnect.protobufMod.EthereumDataType.BYTES & Double = js.native
  
  @js.native
  sealed trait INT
    extends StObject
       with EthereumDataType
  /* 2 */ val INT: typings.trezorConnect.protobufMod.EthereumDataType.INT & Double = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with EthereumDataType
  /* 4 */ val STRING: typings.trezorConnect.protobufMod.EthereumDataType.STRING & Double = js.native
  
  @js.native
  sealed trait STRUCT
    extends StObject
       with EthereumDataType
  /* 8 */ val STRUCT: typings.trezorConnect.protobufMod.EthereumDataType.STRUCT & Double = js.native
  
  @js.native
  sealed trait UINT
    extends StObject
       with EthereumDataType
  /* 1 */ val UINT: typings.trezorConnect.protobufMod.EthereumDataType.UINT & Double = js.native
}

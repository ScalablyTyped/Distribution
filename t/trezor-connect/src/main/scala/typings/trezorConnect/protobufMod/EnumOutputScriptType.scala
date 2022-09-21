package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumOutputScriptType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "Enum_OutputScriptType")
@js.native
object EnumOutputScriptType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumOutputScriptType & Double] = js.native
  
  @js.native
  sealed trait PAYTOADDRESS
    extends StObject
       with EnumOutputScriptType
  /* 0 */ val PAYTOADDRESS: typings.trezorConnect.protobufMod.EnumOutputScriptType.PAYTOADDRESS & Double = js.native
  
  @js.native
  sealed trait PAYTOMULTISIG
    extends StObject
       with EnumOutputScriptType
  /* 2 */ val PAYTOMULTISIG: typings.trezorConnect.protobufMod.EnumOutputScriptType.PAYTOMULTISIG & Double = js.native
  
  @js.native
  sealed trait PAYTOOPRETURN
    extends StObject
       with EnumOutputScriptType
  /* 3 */ val PAYTOOPRETURN: typings.trezorConnect.protobufMod.EnumOutputScriptType.PAYTOOPRETURN & Double = js.native
  
  @js.native
  sealed trait PAYTOP2SHWITNESS
    extends StObject
       with EnumOutputScriptType
  /* 5 */ val PAYTOP2SHWITNESS: typings.trezorConnect.protobufMod.EnumOutputScriptType.PAYTOP2SHWITNESS & Double = js.native
  
  @js.native
  sealed trait PAYTOSCRIPTHASH
    extends StObject
       with EnumOutputScriptType
  /* 1 */ val PAYTOSCRIPTHASH: typings.trezorConnect.protobufMod.EnumOutputScriptType.PAYTOSCRIPTHASH & Double = js.native
  
  @js.native
  sealed trait PAYTOTAPROOT
    extends StObject
       with EnumOutputScriptType
  /* 6 */ val PAYTOTAPROOT: typings.trezorConnect.protobufMod.EnumOutputScriptType.PAYTOTAPROOT & Double = js.native
  
  @js.native
  sealed trait PAYTOWITNESS
    extends StObject
       with EnumOutputScriptType
  /* 4 */ val PAYTOWITNESS: typings.trezorConnect.protobufMod.EnumOutputScriptType.PAYTOWITNESS & Double = js.native
}

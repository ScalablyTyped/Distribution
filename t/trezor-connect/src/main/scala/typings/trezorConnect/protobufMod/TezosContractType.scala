package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TezosContractType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "TezosContractType")
@js.native
object TezosContractType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TezosContractType & Double] = js.native
  
  @js.native
  sealed trait Implicit
    extends StObject
       with TezosContractType
  /* 0 */ val Implicit: typings.trezorConnect.protobufMod.TezosContractType.Implicit & Double = js.native
  
  @js.native
  sealed trait Originated
    extends StObject
       with TezosContractType
  /* 1 */ val Originated: typings.trezorConnect.protobufMod.TezosContractType.Originated & Double = js.native
}

package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosContractID extends StObject {
  
  var hash: js.typedarray.Uint8Array
  
  var tag: Double
}
object TezosContractID {
  
  inline def apply(hash: js.typedarray.Uint8Array, tag: Double): TezosContractID = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosContractID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TezosContractID] (val x: Self) extends AnyVal {
    
    inline def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}

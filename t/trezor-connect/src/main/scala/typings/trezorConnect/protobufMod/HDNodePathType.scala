package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HDNodePathType extends StObject {
  
  var address_n: js.Array[Double]
  
  var node: HDNodeType | String
}
object HDNodePathType {
  
  inline def apply(address_n: js.Array[Double], node: HDNodeType | String): HDNodePathType = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[HDNodePathType]
  }
  
  extension [Self <: HDNodePathType](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setNode(value: HDNodeType | String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}

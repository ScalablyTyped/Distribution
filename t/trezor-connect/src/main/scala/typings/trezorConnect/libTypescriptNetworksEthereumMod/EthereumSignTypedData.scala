package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTypedData[T /* <: EthereumSignTypedDataTypes */] extends StObject {
  
  var data: EthereumSignTypedDataMessage[T]
  
  var metamask_v4_compat: Boolean
  
  var path: String | js.Array[Double]
}
object EthereumSignTypedData {
  
  inline def apply[T /* <: EthereumSignTypedDataTypes */](
    data: EthereumSignTypedDataMessage[T],
    metamask_v4_compat: Boolean,
    path: String | js.Array[Double]
  ): EthereumSignTypedData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metamask_v4_compat = metamask_v4_compat.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTypedData[T]]
  }
  
  extension [Self <: EthereumSignTypedData[?], T /* <: EthereumSignTypedDataTypes */](x: Self & EthereumSignTypedData[T]) {
    
    inline def setData(value: EthereumSignTypedDataMessage[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMetamask_v4_compat(value: Boolean): Self = StObject.set(x, "metamask_v4_compat", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
  }
}

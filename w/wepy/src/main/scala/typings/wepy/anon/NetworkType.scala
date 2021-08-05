package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkType extends StObject {
  
  var networkType: String
}
object NetworkType {
  
  inline def apply(networkType: String): NetworkType = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkType]
  }
  
  extension [Self <: NetworkType](x: Self) {
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}

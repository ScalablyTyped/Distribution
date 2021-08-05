package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.9.1
trait WebCLKernelArgInfo extends StObject {
  
  // 'global', 'local', 'constant', or 'private'
  var accessQualifier: String
  
  // 'char', 'float', 'uint4', 'image2d_t', 'sampler_t', etc.
  var addressQualifier: String
  
  var name: String
  
  var typeName: String
}
object WebCLKernelArgInfo {
  
  inline def apply(accessQualifier: String, addressQualifier: String, name: String, typeName: String): WebCLKernelArgInfo = {
    val __obj = js.Dynamic.literal(accessQualifier = accessQualifier.asInstanceOf[js.Any], addressQualifier = addressQualifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebCLKernelArgInfo]
  }
  
  extension [Self <: WebCLKernelArgInfo](x: Self) {
    
    inline def setAccessQualifier(value: String): Self = StObject.set(x, "accessQualifier", value.asInstanceOf[js.Any])
    
    inline def setAddressQualifier(value: String): Self = StObject.set(x, "addressQualifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}

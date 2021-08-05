package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DUPLICATEMODULENAMESPACE extends StObject {
  
  var DUPLICATE_MODULE_NAMESPACE: Boolean
}
object DUPLICATEMODULENAMESPACE {
  
  inline def apply(DUPLICATE_MODULE_NAMESPACE: Boolean): DUPLICATEMODULENAMESPACE = {
    val __obj = js.Dynamic.literal(DUPLICATE_MODULE_NAMESPACE = DUPLICATE_MODULE_NAMESPACE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DUPLICATEMODULENAMESPACE]
  }
  
  extension [Self <: DUPLICATEMODULENAMESPACE](x: Self) {
    
    inline def setDUPLICATE_MODULE_NAMESPACE(value: Boolean): Self = StObject.set(x, "DUPLICATE_MODULE_NAMESPACE", value.asInstanceOf[js.Any])
  }
}

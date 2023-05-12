package typings.workboxSw.mod.global.workbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkboxOptions extends StObject {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var modulePathCb: js.UndefOr[ModulePathCallback] = js.undefined
  
  var modulePathPrefix: js.UndefOr[String] = js.undefined
}
object WorkboxOptions {
  
  inline def apply(): WorkboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkboxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkboxOptions] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setModulePathCb(value: (/* moduleName */ String, /* debug */ Boolean) => String): Self = StObject.set(x, "modulePathCb", js.Any.fromFunction2(value))
    
    inline def setModulePathCbUndefined: Self = StObject.set(x, "modulePathCb", js.undefined)
    
    inline def setModulePathPrefix(value: String): Self = StObject.set(x, "modulePathPrefix", value.asInstanceOf[js.Any])
    
    inline def setModulePathPrefixUndefined: Self = StObject.set(x, "modulePathPrefix", js.undefined)
  }
}

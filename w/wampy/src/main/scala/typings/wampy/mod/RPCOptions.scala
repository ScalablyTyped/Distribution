package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RPCOptions extends StObject {
  
  var process: js.UndefOr[Boolean] = js.undefined
}
object RPCOptions {
  
  inline def apply(): RPCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RPCOptions]
  }
  
  extension [Self <: RPCOptions](x: Self) {
    
    inline def setProcess(value: Boolean): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
  }
}

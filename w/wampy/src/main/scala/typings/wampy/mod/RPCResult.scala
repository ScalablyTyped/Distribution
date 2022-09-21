package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RPCResult
  extends StObject
     with Args {
  
  var options: RPCOptions
}
object RPCResult {
  
  inline def apply(argsDict: Dict, argsList: js.Array[Any], options: RPCOptions): RPCResult = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCResult]
  }
  
  extension [Self <: RPCResult](x: Self) {
    
    inline def setOptions(value: RPCOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}

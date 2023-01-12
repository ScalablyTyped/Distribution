package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var argsDict: Dict
  
  var argsList: js.Array[Any]
}
object Args {
  
  inline def apply(argsDict: Dict, argsList: js.Array[Any]): Args = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    inline def setArgsDict(value: Dict): Self = StObject.set(x, "argsDict", value.asInstanceOf[js.Any])
    
    inline def setArgsList(value: js.Array[Any]): Self = StObject.set(x, "argsList", value.asInstanceOf[js.Any])
    
    inline def setArgsListVarargs(value: Any*): Self = StObject.set(x, "argsList", js.Array(value*))
  }
}

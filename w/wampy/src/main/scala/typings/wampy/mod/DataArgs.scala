package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArgs
  extends StObject
     with Args {
  
  var details: Dict
}
object DataArgs {
  
  inline def apply(argsDict: Dict, argsList: js.Array[Any], details: Dict): DataArgs = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArgs]
  }
  
  extension [Self <: DataArgs](x: Self) {
    
    inline def setDetails(value: Dict): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
  }
}

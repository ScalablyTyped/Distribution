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
  
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[js.Any], details: Dict): DataArgs = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArgs]
  }
  
  @scala.inline
  implicit class DataArgsMutableBuilder[Self <: DataArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Dict): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
  }
}

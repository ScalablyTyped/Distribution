package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RPCResult extends Args {
  
  var options: RPCOptions = js.native
}
object RPCResult {
  
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[_], options: RPCOptions): RPCResult = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCResult]
  }
  
  @scala.inline
  implicit class RPCResultMutableBuilder[Self <: RPCResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: RPCOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}

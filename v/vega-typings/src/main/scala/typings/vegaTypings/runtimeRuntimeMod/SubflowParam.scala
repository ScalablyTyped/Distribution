package typings.vegaTypings.runtimeRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubflowParam
  extends StObject
     with BuiltinParameter {
  
  @JSName("$subflow")
  var $subflow: Subflow
}
object SubflowParam {
  
  inline def apply($subflow: Subflow): SubflowParam = {
    val __obj = js.Dynamic.literal($subflow = $subflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubflowParam]
  }
  
  extension [Self <: SubflowParam](x: Self) {
    
    inline def set$subflow(value: Subflow): Self = StObject.set(x, "$subflow", value.asInstanceOf[js.Any])
  }
}

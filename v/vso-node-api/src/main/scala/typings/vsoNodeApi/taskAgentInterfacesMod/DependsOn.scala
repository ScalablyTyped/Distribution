package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependsOn extends StObject {
  
  var input: String
  
  var map: js.Array[DependencyBinding]
}
object DependsOn {
  
  inline def apply(input: String, map: js.Array[DependencyBinding]): DependsOn = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependsOn]
  }
  
  extension [Self <: DependsOn](x: Self) {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setMap(value: js.Array[DependencyBinding]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapVarargs(value: DependencyBinding*): Self = StObject.set(x, "map", js.Array(value*))
  }
}

package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import typings.vsoNodeApi.anon.KeyString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyData extends StObject {
  
  var input: String
  
  var map: js.Array[KeyString]
}
object DependencyData {
  
  inline def apply(input: String, map: js.Array[KeyString]): DependencyData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyData]
  }
  
  extension [Self <: DependencyData](x: Self) {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setMap(value: js.Array[KeyString]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapVarargs(value: KeyString*): Self = StObject.set(x, "map", js.Array(value*))
  }
}

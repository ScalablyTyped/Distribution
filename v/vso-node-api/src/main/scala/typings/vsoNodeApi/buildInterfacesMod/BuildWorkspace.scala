package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildWorkspace extends StObject {
  
  var mappings: js.Array[MappingDetails]
}
object BuildWorkspace {
  
  inline def apply(mappings: js.Array[MappingDetails]): BuildWorkspace = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildWorkspace]
  }
  
  extension [Self <: BuildWorkspace](x: Self) {
    
    inline def setMappings(value: js.Array[MappingDetails]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsVarargs(value: MappingDetails*): Self = StObject.set(x, "mappings", js.Array(value*))
  }
}

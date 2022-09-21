package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.shaderCompilerMod.UniformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayIndexName extends StObject {
  
  var arrayIndex: Double
  
  var name: String
  
  var `type`: UniformType
}
object ArrayIndexName {
  
  inline def apply(arrayIndex: Double, name: String, `type`: UniformType): ArrayIndexName = {
    val __obj = js.Dynamic.literal(arrayIndex = arrayIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayIndexName]
  }
  
  extension [Self <: ArrayIndexName](x: Self) {
    
    inline def setArrayIndex(value: Double): Self = StObject.set(x, "arrayIndex", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: UniformType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

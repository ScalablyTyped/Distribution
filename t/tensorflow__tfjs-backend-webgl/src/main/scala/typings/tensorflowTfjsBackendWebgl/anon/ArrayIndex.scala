package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.shaderCompilerMod.UniformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayIndex extends StObject {
  
  var arrayIndex: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var `type`: UniformType
}
object ArrayIndex {
  
  inline def apply(name: String, `type`: UniformType): ArrayIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayIndex]
  }
  
  extension [Self <: ArrayIndex](x: Self) {
    
    inline def setArrayIndex(value: Double): Self = StObject.set(x, "arrayIndex", value.asInstanceOf[js.Any])
    
    inline def setArrayIndexUndefined: Self = StObject.set(x, "arrayIndex", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: UniformType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

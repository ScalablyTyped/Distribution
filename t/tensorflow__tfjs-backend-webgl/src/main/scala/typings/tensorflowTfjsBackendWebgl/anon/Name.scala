package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.distShaderCompilerMod.UniformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var `type`: UniformType
}
object Name {
  
  inline def apply(name: String, `type`: UniformType): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: UniformType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

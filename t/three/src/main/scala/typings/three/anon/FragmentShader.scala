package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentShader extends StObject {
  
  var fragmentShader: Any
  
  var uniforms: Any
  
  var vertexShader: Any
}
object FragmentShader {
  
  inline def apply(fragmentShader: Any, uniforms: Any, vertexShader: Any): FragmentShader = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentShader]
  }
  
  extension [Self <: FragmentShader](x: Self) {
    
    inline def setFragmentShader(value: Any): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    inline def setUniforms(value: Any): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setVertexShader(value: Any): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
  }
}

package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplacementBias extends StObject {
  
  var displacementBias: IUniform
  
  var displacementMap: IUniform
  
  var displacementScale: IUniform
}
object DisplacementBias {
  
  inline def apply(displacementBias: IUniform, displacementMap: IUniform, displacementScale: IUniform): DisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias.asInstanceOf[js.Any], displacementMap = displacementMap.asInstanceOf[js.Any], displacementScale = displacementScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementBias]
  }
  
  extension [Self <: DisplacementBias](x: Self) {
    
    inline def setDisplacementBias(value: IUniform): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
    
    inline def setDisplacementMap(value: IUniform): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
    
    inline def setDisplacementScale(value: IUniform): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
  }
}

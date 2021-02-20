package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplacementBias extends StObject {
  
  var displacementBias: IUniform = js.native
  
  var displacementMap: IUniform = js.native
  
  var displacementScale: IUniform = js.native
}
object DisplacementBias {
  
  @scala.inline
  def apply(displacementBias: IUniform, displacementMap: IUniform, displacementScale: IUniform): DisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias.asInstanceOf[js.Any], displacementMap = displacementMap.asInstanceOf[js.Any], displacementScale = displacementScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementBias]
  }
  
  @scala.inline
  implicit class DisplacementBiasMutableBuilder[Self <: DisplacementBias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplacementBias(value: IUniform): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplacementMap(value: IUniform): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplacementScale(value: IUniform): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
  }
}

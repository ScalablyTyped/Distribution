package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FogColor extends StObject {
  
  var fogColor: IUniform
  
  var fogDensity: IUniform
  
  var fogFar: IUniform
  
  var fogNear: IUniform
}
object FogColor {
  
  @scala.inline
  def apply(fogColor: IUniform, fogDensity: IUniform, fogFar: IUniform, fogNear: IUniform): FogColor = {
    val __obj = js.Dynamic.literal(fogColor = fogColor.asInstanceOf[js.Any], fogDensity = fogDensity.asInstanceOf[js.Any], fogFar = fogFar.asInstanceOf[js.Any], fogNear = fogNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[FogColor]
  }
  
  @scala.inline
  implicit class FogColorMutableBuilder[Self <: FogColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFogColor(value: IUniform): Self = StObject.set(x, "fogColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFogDensity(value: IUniform): Self = StObject.set(x, "fogDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFogFar(value: IUniform): Self = StObject.set(x, "fogFar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFogNear(value: IUniform): Self = StObject.set(x, "fogNear", value.asInstanceOf[js.Any])
  }
}

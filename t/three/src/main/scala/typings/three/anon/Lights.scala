package typings.three.anon

import typings.three.lightMod.Light
import typings.three.webGLLightsMod.WebGLLights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lights extends StObject {
  
  var lights: WebGLLights = js.native
  
  var lightsArray: js.Array[Light] = js.native
  
  var shadowsArray: js.Array[Light] = js.native
}
object Lights {
  
  @scala.inline
  def apply(lights: WebGLLights, lightsArray: js.Array[Light], shadowsArray: js.Array[Light]): Lights = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any], lightsArray = lightsArray.asInstanceOf[js.Any], shadowsArray = shadowsArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lights]
  }
  
  @scala.inline
  implicit class LightsMutableBuilder[Self <: Lights] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLights(value: WebGLLights): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsArray(value: js.Array[Light]): Self = StObject.set(x, "lightsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsArrayVarargs(value: Light*): Self = StObject.set(x, "lightsArray", js.Array(value :_*))
    
    @scala.inline
    def setShadowsArray(value: js.Array[Light]): Self = StObject.set(x, "shadowsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsArrayVarargs(value: Light*): Self = StObject.set(x, "shadowsArray", js.Array(value :_*))
  }
}

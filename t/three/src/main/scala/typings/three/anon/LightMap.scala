package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightMap extends StObject {
  
  var lightMap: IUniform = js.native
  
  var lightMapIntensity: IUniform = js.native
}
object LightMap {
  
  @scala.inline
  def apply(lightMap: IUniform, lightMapIntensity: IUniform): LightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap.asInstanceOf[js.Any], lightMapIntensity = lightMapIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightMap]
  }
  
  @scala.inline
  implicit class LightMapMutableBuilder[Self <: LightMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLightMap(value: IUniform): Self = StObject.set(x, "lightMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightMapIntensity(value: IUniform): Self = StObject.set(x, "lightMapIntensity", value.asInstanceOf[js.Any])
  }
}

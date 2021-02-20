package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaMap extends StObject {
  
  var alphaMap: IUniform = js.native
  
  var diffuse: IUniform = js.native
  
  var map: IUniform = js.native
  
  var opacity: IUniform = js.native
  
  var uv2Transform: IUniform = js.native
  
  var uvTransform: IUniform = js.native
}
object AlphaMap {
  
  @scala.inline
  def apply(
    alphaMap: IUniform,
    diffuse: IUniform,
    map: IUniform,
    opacity: IUniform,
    uv2Transform: IUniform,
    uvTransform: IUniform
  ): AlphaMap = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], uv2Transform = uv2Transform.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaMap]
  }
  
  @scala.inline
  implicit class AlphaMapMutableBuilder[Self <: AlphaMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaMap(value: IUniform): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffuse(value: IUniform): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: IUniform): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: IUniform): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUv2Transform(value: IUniform): Self = StObject.set(x, "uv2Transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvTransform(value: IUniform): Self = StObject.set(x, "uvTransform", value.asInstanceOf[js.Any])
  }
}

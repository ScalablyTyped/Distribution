package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diffuse extends StObject {
  
  var diffuse: IUniform = js.native
  
  var map: IUniform = js.native
  
  var opacity: IUniform = js.native
  
  var scale: IUniform = js.native
  
  var size: IUniform = js.native
  
  var uvTransform: IUniform = js.native
}
object Diffuse {
  
  @scala.inline
  def apply(
    diffuse: IUniform,
    map: IUniform,
    opacity: IUniform,
    scale: IUniform,
    size: IUniform,
    uvTransform: IUniform
  ): Diffuse = {
    val __obj = js.Dynamic.literal(diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diffuse]
  }
  
  @scala.inline
  implicit class DiffuseMutableBuilder[Self <: Diffuse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiffuse(value: IUniform): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: IUniform): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: IUniform): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: IUniform): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: IUniform): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvTransform(value: IUniform): Self = StObject.set(x, "uvTransform", value.asInstanceOf[js.Any])
  }
}

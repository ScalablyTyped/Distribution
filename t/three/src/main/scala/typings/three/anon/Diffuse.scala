package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diffuse extends js.Object {
  
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
  implicit class DiffuseOps[Self <: Diffuse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiffuse(value: IUniform): Self = this.set("diffuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: IUniform): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: IUniform): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: IUniform): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: IUniform): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvTransform(value: IUniform): Self = this.set("uvTransform", value.asInstanceOf[js.Any])
  }
}

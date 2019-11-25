package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Diffuse extends js.Object {
  var diffuse: IUniform
  var map: IUniform
  var opacity: IUniform
  var scale: IUniform
  var size: IUniform
  var uvTransform: IUniform
}

object Anon_Diffuse {
  @scala.inline
  def apply(
    diffuse: IUniform,
    map: IUniform,
    opacity: IUniform,
    scale: IUniform,
    size: IUniform,
    uvTransform: IUniform
  ): Anon_Diffuse = {
    val __obj = js.Dynamic.literal(diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Diffuse]
  }
}


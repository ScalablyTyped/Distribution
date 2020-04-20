package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiffuse extends js.Object {
  var diffuse: IUniform
  var map: IUniform
  var opacity: IUniform
  var scale: IUniform
  var size: IUniform
  var uvTransform: IUniform
}

object AnonDiffuse {
  @scala.inline
  def apply(
    diffuse: IUniform,
    map: IUniform,
    opacity: IUniform,
    scale: IUniform,
    size: IUniform,
    uvTransform: IUniform
  ): AnonDiffuse = {
    val __obj = js.Dynamic.literal(diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiffuse]
  }
}


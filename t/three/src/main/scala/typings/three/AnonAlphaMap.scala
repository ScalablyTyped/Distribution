package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphaMap extends js.Object {
  var alphaMap: IUniform
  var diffuse: IUniform
  var map: IUniform
  var opacity: IUniform
  var uv2Transform: IUniform
  var uvTransform: IUniform
}

object AnonAlphaMap {
  @scala.inline
  def apply(
    alphaMap: IUniform,
    diffuse: IUniform,
    map: IUniform,
    opacity: IUniform,
    uv2Transform: IUniform,
    uvTransform: IUniform
  ): AnonAlphaMap = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], uv2Transform = uv2Transform.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlphaMap]
  }
}


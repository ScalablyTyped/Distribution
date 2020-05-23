package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaMap extends js.Object {
  var alphaMap: IUniform
  var diffuse: IUniform
  var map: IUniform
  var opacity: IUniform
  var uv2Transform: IUniform
  var uvTransform: IUniform
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
}


package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaMap extends js.Object {
  var alphaMap: IUniform
  var diffuse: IUniform
  var map: IUniform
  var opacity: IUniform
  var uvTransform: IUniform
}

object Anon_AlphaMap {
  @scala.inline
  def apply(alphaMap: IUniform, diffuse: IUniform, map: IUniform, opacity: IUniform, uvTransform: IUniform): Anon_AlphaMap = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlphaMap]
  }
}


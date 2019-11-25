package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NormalMap extends js.Object {
  var normalMap: IUniform
  var normalScale: IUniform
}

object Anon_NormalMap {
  @scala.inline
  def apply(normalMap: IUniform, normalScale: IUniform): Anon_NormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap.asInstanceOf[js.Any], normalScale = normalScale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NormalMap]
  }
}


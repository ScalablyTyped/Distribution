package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalMap extends js.Object {
  var normalMap: IUniform
  var normalScale: IUniform
}

object NormalMap {
  @scala.inline
  def apply(normalMap: IUniform, normalScale: IUniform): NormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap.asInstanceOf[js.Any], normalScale = normalScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalMap]
  }
}


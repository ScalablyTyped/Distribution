package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightMap extends js.Object {
  var lightMap: IUniform
  var lightMapIntensity: IUniform
}

object LightMap {
  @scala.inline
  def apply(lightMap: IUniform, lightMapIntensity: IUniform): LightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap.asInstanceOf[js.Any], lightMapIntensity = lightMapIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightMap]
  }
}


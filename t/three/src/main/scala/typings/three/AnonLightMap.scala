package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLightMap extends js.Object {
  var lightMap: IUniform
  var lightMapIntensity: IUniform
}

object AnonLightMap {
  @scala.inline
  def apply(lightMap: IUniform, lightMapIntensity: IUniform): AnonLightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap.asInstanceOf[js.Any], lightMapIntensity = lightMapIntensity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLightMap]
  }
}


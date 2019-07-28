package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LightMap extends js.Object {
  var lightMap: IUniform
  var lightMapIntensity: IUniform
}

object Anon_LightMap {
  @scala.inline
  def apply(lightMap: IUniform, lightMapIntensity: IUniform): Anon_LightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap, lightMapIntensity = lightMapIntensity)
  
    __obj.asInstanceOf[Anon_LightMap]
  }
}


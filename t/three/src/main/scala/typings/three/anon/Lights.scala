package typings.three.anon

import typings.three.lightMod.Light
import typings.three.webGLLightsMod.WebGLLights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lights extends js.Object {
  var lights: WebGLLights
  var lightsArray: js.Array[Light]
  var shadowsArray: js.Array[Light]
}

object Lights {
  @scala.inline
  def apply(lights: WebGLLights, lightsArray: js.Array[Light], shadowsArray: js.Array[Light]): Lights = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any], lightsArray = lightsArray.asInstanceOf[js.Any], shadowsArray = shadowsArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lights]
  }
}


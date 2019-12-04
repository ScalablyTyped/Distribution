package typings.three

import typings.three.srcLightsLightMod.Light
import typings.three.srcRenderersWebglWebGLLightsMod.WebGLLights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lights extends js.Object {
  var lights: WebGLLights
  var lightsArray: js.Array[Light]
  var shadowsArray: js.Array[Light]
}

object Anon_Lights {
  @scala.inline
  def apply(lights: WebGLLights, lightsArray: js.Array[Light], shadowsArray: js.Array[Light]): Anon_Lights = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any], lightsArray = lightsArray.asInstanceOf[js.Any], shadowsArray = shadowsArray.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Lights]
  }
}


package typings.three.anon

import typings.three.lightMod.Light
import typings.three.webGLLightsMod.WebGLLights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lights extends js.Object {
  var lights: WebGLLights = js.native
  var lightsArray: js.Array[Light] = js.native
  var shadowsArray: js.Array[Light] = js.native
}

object Lights {
  @scala.inline
  def apply(lights: WebGLLights, lightsArray: js.Array[Light], shadowsArray: js.Array[Light]): Lights = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any], lightsArray = lightsArray.asInstanceOf[js.Any], shadowsArray = shadowsArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lights]
  }
  @scala.inline
  implicit class LightsOps[Self <: Lights] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLights(value: WebGLLights): Self = this.set("lights", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightsArrayVarargs(value: Light*): Self = this.set("lightsArray", js.Array(value :_*))
    @scala.inline
    def setLightsArray(value: js.Array[Light]): Self = this.set("lightsArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowsArrayVarargs(value: Light*): Self = this.set("shadowsArray", js.Array(value :_*))
    @scala.inline
    def setShadowsArray(value: js.Array[Light]): Self = this.set("shadowsArray", value.asInstanceOf[js.Any])
  }
  
}


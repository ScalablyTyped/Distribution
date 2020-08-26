package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvMap extends js.Object {
  var envMap: IUniform = js.native
  var flipEnvMap: IUniform = js.native
  var maxMipLevel: IUniform = js.native
  var reflectivity: IUniform = js.native
  var refractionRatio: IUniform = js.native
}

object EnvMap {
  @scala.inline
  def apply(
    envMap: IUniform,
    flipEnvMap: IUniform,
    maxMipLevel: IUniform,
    reflectivity: IUniform,
    refractionRatio: IUniform
  ): EnvMap = {
    val __obj = js.Dynamic.literal(envMap = envMap.asInstanceOf[js.Any], flipEnvMap = flipEnvMap.asInstanceOf[js.Any], maxMipLevel = maxMipLevel.asInstanceOf[js.Any], reflectivity = reflectivity.asInstanceOf[js.Any], refractionRatio = refractionRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvMap]
  }
  @scala.inline
  implicit class EnvMapOps[Self <: EnvMap] (val x: Self) extends AnyVal {
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
    def setEnvMap(value: IUniform): Self = this.set("envMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlipEnvMap(value: IUniform): Self = this.set("flipEnvMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxMipLevel(value: IUniform): Self = this.set("maxMipLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setReflectivity(value: IUniform): Self = this.set("reflectivity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefractionRatio(value: IUniform): Self = this.set("refractionRatio", value.asInstanceOf[js.Any])
  }
  
}


package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmbientLightColor extends js.Object {
  var ambientLightColor: IUniform = js.native
  var directionalLightShadows: Value = js.native
  var directionalLights: Properties = js.native
  var directionalShadowMap: IUniform = js.native
  var directionalShadowMatrix: IUniform = js.native
  var hemisphereLights: PropertiesDirection = js.native
  var pointLightShadows: Value = js.native
  var pointLights: PropertiesDecay = js.native
  var pointShadowMap: IUniform = js.native
  var pointShadowMatrix: IUniform = js.native
  var rectAreaLights: PropertiesHeight = js.native
  var spotLightShadows: Value = js.native
  var spotLights: PropertiesValue = js.native
  var spotShadowMap: IUniform = js.native
  var spotShadowMatrix: IUniform = js.native
}

object AmbientLightColor {
  @scala.inline
  def apply(
    ambientLightColor: IUniform,
    directionalLightShadows: Value,
    directionalLights: Properties,
    directionalShadowMap: IUniform,
    directionalShadowMatrix: IUniform,
    hemisphereLights: PropertiesDirection,
    pointLightShadows: Value,
    pointLights: PropertiesDecay,
    pointShadowMap: IUniform,
    pointShadowMatrix: IUniform,
    rectAreaLights: PropertiesHeight,
    spotLightShadows: Value,
    spotLights: PropertiesValue,
    spotShadowMap: IUniform,
    spotShadowMatrix: IUniform
  ): AmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor.asInstanceOf[js.Any], directionalLightShadows = directionalLightShadows.asInstanceOf[js.Any], directionalLights = directionalLights.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hemisphereLights = hemisphereLights.asInstanceOf[js.Any], pointLightShadows = pointLightShadows.asInstanceOf[js.Any], pointLights = pointLights.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], rectAreaLights = rectAreaLights.asInstanceOf[js.Any], spotLightShadows = spotLightShadows.asInstanceOf[js.Any], spotLights = spotLights.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientLightColor]
  }
  @scala.inline
  implicit class AmbientLightColorOps[Self <: AmbientLightColor] (val x: Self) extends AnyVal {
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
    def setAmbientLightColor(value: IUniform): Self = this.set("ambientLightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalLightShadows(value: Value): Self = this.set("directionalLightShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalLights(value: Properties): Self = this.set("directionalLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalShadowMap(value: IUniform): Self = this.set("directionalShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalShadowMatrix(value: IUniform): Self = this.set("directionalShadowMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setHemisphereLights(value: PropertiesDirection): Self = this.set("hemisphereLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointLightShadows(value: Value): Self = this.set("pointLightShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointLights(value: PropertiesDecay): Self = this.set("pointLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointShadowMap(value: IUniform): Self = this.set("pointShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointShadowMatrix(value: IUniform): Self = this.set("pointShadowMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRectAreaLights(value: PropertiesHeight): Self = this.set("rectAreaLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotLightShadows(value: Value): Self = this.set("spotLightShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotLights(value: PropertiesValue): Self = this.set("spotLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotShadowMap(value: IUniform): Self = this.set("spotShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotShadowMatrix(value: IUniform): Self = this.set("spotShadowMatrix", value.asInstanceOf[js.Any])
  }
  
}


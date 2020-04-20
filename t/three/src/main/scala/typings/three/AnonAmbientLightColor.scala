package typings.three

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmbientLightColor extends js.Object {
  var ambientLightColor: IUniform
  var directionalLightShadows: AnonValue
  var directionalLights: AnonProperties
  var directionalShadowMap: IUniform
  var directionalShadowMatrix: IUniform
  var hemisphereLights: AnonPropertiesAnonDirection
  var pointLightShadows: AnonValue
  var pointLights: AnonPropertiesAnonDecay
  var pointShadowMap: IUniform
  var pointShadowMatrix: IUniform
  var rectAreaLights: AnonPropertiesAnonHeight
  var spotLightShadows: AnonValue
  var spotLights: AnonPropertiesValue
  var spotShadowMap: IUniform
  var spotShadowMatrix: IUniform
}

object AnonAmbientLightColor {
  @scala.inline
  def apply(
    ambientLightColor: IUniform,
    directionalLightShadows: AnonValue,
    directionalLights: AnonProperties,
    directionalShadowMap: IUniform,
    directionalShadowMatrix: IUniform,
    hemisphereLights: AnonPropertiesAnonDirection,
    pointLightShadows: AnonValue,
    pointLights: AnonPropertiesAnonDecay,
    pointShadowMap: IUniform,
    pointShadowMatrix: IUniform,
    rectAreaLights: AnonPropertiesAnonHeight,
    spotLightShadows: AnonValue,
    spotLights: AnonPropertiesValue,
    spotShadowMap: IUniform,
    spotShadowMatrix: IUniform
  ): AnonAmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor.asInstanceOf[js.Any], directionalLightShadows = directionalLightShadows.asInstanceOf[js.Any], directionalLights = directionalLights.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hemisphereLights = hemisphereLights.asInstanceOf[js.Any], pointLightShadows = pointLightShadows.asInstanceOf[js.Any], pointLights = pointLights.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], rectAreaLights = rectAreaLights.asInstanceOf[js.Any], spotLightShadows = spotLightShadows.asInstanceOf[js.Any], spotLights = spotLights.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmbientLightColor]
  }
}


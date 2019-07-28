package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbientLightColor extends js.Object {
  var ambientLightColor: IUniform
  var directionalLights: Anon_Properties
  var directionalShadowMap: IUniform
  var directionalShadowMatrix: IUniform
  var hemisphereLights: Anon_PropertiesValueAnonDirection
  var pointLights: Anon_PropertiesValueAnonColorDecay
  var pointShadowMap: IUniform
  var pointShadowMatrix: IUniform
  var rectAreaLights: Anon_PropertiesValueAnonColorHeight
  var spotLights: Anon_PropertiesValue
  var spotShadowMap: IUniform
  var spotShadowMatrix: IUniform
}

object Anon_AmbientLightColor {
  @scala.inline
  def apply(
    ambientLightColor: IUniform,
    directionalLights: Anon_Properties,
    directionalShadowMap: IUniform,
    directionalShadowMatrix: IUniform,
    hemisphereLights: Anon_PropertiesValueAnonDirection,
    pointLights: Anon_PropertiesValueAnonColorDecay,
    pointShadowMap: IUniform,
    pointShadowMatrix: IUniform,
    rectAreaLights: Anon_PropertiesValueAnonColorHeight,
    spotLights: Anon_PropertiesValue,
    spotShadowMap: IUniform,
    spotShadowMatrix: IUniform
  ): Anon_AmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor, directionalLights = directionalLights, directionalShadowMap = directionalShadowMap, directionalShadowMatrix = directionalShadowMatrix, hemisphereLights = hemisphereLights, pointLights = pointLights, pointShadowMap = pointShadowMap, pointShadowMatrix = pointShadowMatrix, rectAreaLights = rectAreaLights, spotLights = spotLights, spotShadowMap = spotShadowMap, spotShadowMatrix = spotShadowMatrix)
  
    __obj.asInstanceOf[Anon_AmbientLightColor]
  }
}


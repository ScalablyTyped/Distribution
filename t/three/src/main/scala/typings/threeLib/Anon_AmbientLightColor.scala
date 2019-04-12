package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbientLightColor extends js.Object {
  var ambientLightColor: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var directionalLights: Anon_Properties
  var directionalShadowMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var directionalShadowMatrix: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var hemisphereLights: Anon_PropertiesValueAnonDirection
  var pointLights: Anon_PropertiesValueAnonColorDecay
  var pointShadowMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var pointShadowMatrix: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var rectAreaLights: Anon_PropertiesValueAnonColorHeight
  var spotLights: Anon_PropertiesValue
  var spotShadowMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var spotShadowMatrix: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_AmbientLightColor {
  @scala.inline
  def apply(
    ambientLightColor: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    directionalLights: Anon_Properties,
    directionalShadowMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    directionalShadowMatrix: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    hemisphereLights: Anon_PropertiesValueAnonDirection,
    pointLights: Anon_PropertiesValueAnonColorDecay,
    pointShadowMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    pointShadowMatrix: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    rectAreaLights: Anon_PropertiesValueAnonColorHeight,
    spotLights: Anon_PropertiesValue,
    spotShadowMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    spotShadowMatrix: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_AmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor, directionalLights = directionalLights, directionalShadowMap = directionalShadowMap, directionalShadowMatrix = directionalShadowMatrix, hemisphereLights = hemisphereLights, pointLights = pointLights, pointShadowMap = pointShadowMap, pointShadowMatrix = pointShadowMatrix, rectAreaLights = rectAreaLights, spotLights = spotLights, spotShadowMap = spotShadowMap, spotShadowMatrix = spotShadowMatrix)
  
    __obj.asInstanceOf[Anon_AmbientLightColor]
  }
}


package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbientLightColor extends js.Object {
  var ambientLightColor: threeLib.threeDashCoreMod.IUniform
  var directionalLights: Anon_Properties
  var directionalShadowMap: threeLib.threeDashCoreMod.IUniform
  var directionalShadowMatrix: threeLib.threeDashCoreMod.IUniform
  var hemisphereLights: Anon_PropertiesValueAnonDirection
  var pointLights: Anon_PropertiesValueAnonColorDecay
  var pointShadowMap: threeLib.threeDashCoreMod.IUniform
  var pointShadowMatrix: threeLib.threeDashCoreMod.IUniform
  var rectAreaLights: Anon_PropertiesValueAnonColorHeight
  var spotLights: Anon_PropertiesValue
  var spotShadowMap: threeLib.threeDashCoreMod.IUniform
  var spotShadowMatrix: threeLib.threeDashCoreMod.IUniform
}

object Anon_AmbientLightColor {
  @scala.inline
  def apply(
    ambientLightColor: threeLib.threeDashCoreMod.IUniform,
    directionalLights: Anon_Properties,
    directionalShadowMap: threeLib.threeDashCoreMod.IUniform,
    directionalShadowMatrix: threeLib.threeDashCoreMod.IUniform,
    hemisphereLights: Anon_PropertiesValueAnonDirection,
    pointLights: Anon_PropertiesValueAnonColorDecay,
    pointShadowMap: threeLib.threeDashCoreMod.IUniform,
    pointShadowMatrix: threeLib.threeDashCoreMod.IUniform,
    rectAreaLights: Anon_PropertiesValueAnonColorHeight,
    spotLights: Anon_PropertiesValue,
    spotShadowMap: threeLib.threeDashCoreMod.IUniform,
    spotShadowMatrix: threeLib.threeDashCoreMod.IUniform
  ): Anon_AmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor, directionalLights = directionalLights, directionalShadowMap = directionalShadowMap, directionalShadowMatrix = directionalShadowMatrix, hemisphereLights = hemisphereLights, pointLights = pointLights, pointShadowMap = pointShadowMap, pointShadowMatrix = pointShadowMatrix, rectAreaLights = rectAreaLights, spotLights = spotLights, spotShadowMap = spotShadowMap, spotShadowMatrix = spotShadowMatrix)
  
    __obj.asInstanceOf[Anon_AmbientLightColor]
  }
}


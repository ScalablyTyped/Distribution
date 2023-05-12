package typings.three.buildThreeDotmoduleMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "PointLightHelper")
@js.native
open class PointLightHelper protected ()
  extends typings.three.srcThreeMod.PointLightHelper {
  /**
    * Create a new instance of {@link PointLightHelper}
    * @param light The light to be visualized.
    * @param sphereSize The size of the sphere helper. Expects a `Float`. Default `1`
    * @param color If this is not the set the helper will take the color of the light.
    */
  def this(light: typings.three.srcLightsPointLightMod.PointLight) = this()
  def this(light: typings.three.srcLightsPointLightMod.PointLight, sphereSize: Double) = this()
  def this(
    light: typings.three.srcLightsPointLightMod.PointLight,
    sphereSize: Double,
    color: ColorRepresentation
  ) = this()
  def this(
    light: typings.three.srcLightsPointLightMod.PointLight,
    sphereSize: Unit,
    color: ColorRepresentation
  ) = this()
}

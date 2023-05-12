package typings.three.buildThreeMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "DirectionalLightHelper")
@js.native
open class DirectionalLightHelper protected ()
  extends typings.three.srcThreeMod.DirectionalLightHelper {
  /**
    * Create a new instance of {@link DirectionalLightHelper}
    * @param light The light to be visualized.
    * @param size Dimensions of the plane. Default `1`
    * @param color If this is not the set the helper will take the color of the light. Default `light.color`
    */
  def this(light: typings.three.srcLightsDirectionalLightMod.DirectionalLight) = this()
  def this(light: typings.three.srcLightsDirectionalLightMod.DirectionalLight, size: Double) = this()
  def this(
    light: typings.three.srcLightsDirectionalLightMod.DirectionalLight,
    size: Double,
    color: ColorRepresentation
  ) = this()
  def this(
    light: typings.three.srcLightsDirectionalLightMod.DirectionalLight,
    size: Unit,
    color: ColorRepresentation
  ) = this()
}

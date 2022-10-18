package typings.three.srcThreeMod

import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "DirectionalLightHelper")
@js.native
open class DirectionalLightHelper protected ()
  extends typings.three.srcHelpersDirectionalLightHelperMod.DirectionalLightHelper {
  /**
    * @param light
    * @param [size=1]
    * @param color
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

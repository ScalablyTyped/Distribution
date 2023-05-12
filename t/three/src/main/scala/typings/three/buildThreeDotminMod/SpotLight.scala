package typings.three.buildThreeDotminMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "SpotLight")
@js.native
open class SpotLight protected ()
  extends typings.three.srcThreeMod.SpotLight {
  /**
    * Creates a new SpotLight.
    * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
    * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`.
    * @param distance Maximum range of the light. Default is 0 (no limit). Expects a `Float`.
    * @param angle Maximum angle of light dispersion from its direction whose upper bound is Math.PI/2.
    * @param penumbra Percent of the {@link SpotLight} cone that is attenuated due to penumbra. Takes values between zero and 1. Expects a `Float`. Default `0`.
    * @param decay The amount the light dims along the distance of the light. Expects a `Float`. Default `2`.
    */
  def this(
    color: js.UndefOr[ColorRepresentation],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    penumbra: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}

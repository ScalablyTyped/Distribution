package typings.three.buildThreeDotmoduleDotminMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module.min", "AmbientLightProbe")
@js.native
/**
  * Creates a new {@link AmbientLightProbe}.
  * @param color An instance of Color, string representing a color or a number representing a color.
  * @param intensity Numeric value of the light probe's intensity. Expects a `Float`. Default `1`
  */
open class AmbientLightProbe ()
  extends typings.three.srcThreeMod.AmbientLightProbe {
  def this(color: ColorRepresentation) = this()
  def this(color: Unit, intensity: Double) = this()
  def this(color: ColorRepresentation, intensity: Double) = this()
}

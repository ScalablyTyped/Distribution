package typings.three.buildThreeMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "HemisphereLightProbe")
@js.native
/**
  * Creates a new HemisphereLightProbe.
  * @param skyColor An instance of Color, string representing a color or a number representing a color.
  * @param groundColor An instance of Color, string representing a color or a number representing a color.
  * @param intensity Numeric value of the light probe's intensity. Expects a `Float`. Default `1`
  */
open class HemisphereLightProbe ()
  extends typings.three.srcThreeMod.HemisphereLightProbe {
  def this(skyColor: ColorRepresentation) = this()
  def this(skyColor: Unit, groundColor: ColorRepresentation) = this()
  def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation) = this()
  def this(skyColor: Unit, groundColor: Unit, intensity: Double) = this()
  def this(skyColor: Unit, groundColor: ColorRepresentation, intensity: Double) = this()
  def this(skyColor: ColorRepresentation, groundColor: Unit, intensity: Double) = this()
  def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation, intensity: Double) = this()
}

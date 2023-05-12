package typings.three.buildThreeDotminMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "HemisphereLight")
@js.native
/**
  * Creates a new {@link HemisphereLight}.
  * @param skyColor Hexadecimal color of the sky. Expects a `Integer`. Default `0xffffff` _(white)_.
  * @param groundColor Hexadecimal color of the ground. Expects a `Integer`. Default `0xffffff` _(white)_.
  * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`.
  */
open class HemisphereLight ()
  extends typings.three.srcThreeMod.HemisphereLight {
  def this(skyColor: ColorRepresentation) = this()
  def this(skyColor: Unit, groundColor: ColorRepresentation) = this()
  def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation) = this()
  def this(skyColor: Unit, groundColor: Unit, intensity: Double) = this()
  def this(skyColor: Unit, groundColor: ColorRepresentation, intensity: Double) = this()
  def this(skyColor: ColorRepresentation, groundColor: Unit, intensity: Double) = this()
  def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation, intensity: Double) = this()
}

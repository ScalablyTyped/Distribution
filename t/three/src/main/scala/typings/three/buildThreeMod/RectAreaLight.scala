package typings.three.buildThreeMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "RectAreaLight")
@js.native
/**
  * Creates a new {@link RectAreaLight}.
  * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
  * @param intensity The light's intensity, or brightness. Expects a `Float`. Default `1`
  * @param width Width of the light. Expects a `Float`. Default `10`
  * @param height Height of the light. Expects a `Float`. Default `10`
  */
open class RectAreaLight ()
  extends typings.three.srcThreeMod.RectAreaLight {
  def this(color: ColorRepresentation) = this()
  def this(color: Unit, intensity: Double) = this()
  def this(color: ColorRepresentation, intensity: Double) = this()
  def this(color: Unit, intensity: Double, width: Double) = this()
  def this(color: Unit, intensity: Unit, width: Double) = this()
  def this(color: ColorRepresentation, intensity: Double, width: Double) = this()
  def this(color: ColorRepresentation, intensity: Unit, width: Double) = this()
  def this(color: Unit, intensity: Double, width: Double, height: Double) = this()
  def this(color: Unit, intensity: Double, width: Unit, height: Double) = this()
  def this(color: Unit, intensity: Unit, width: Double, height: Double) = this()
  def this(color: Unit, intensity: Unit, width: Unit, height: Double) = this()
  def this(color: ColorRepresentation, intensity: Double, width: Double, height: Double) = this()
  def this(color: ColorRepresentation, intensity: Double, width: Unit, height: Double) = this()
  def this(color: ColorRepresentation, intensity: Unit, width: Double, height: Double) = this()
  def this(color: ColorRepresentation, intensity: Unit, width: Unit, height: Double) = this()
}

package typings.three.buildThreeMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "PointLight")
@js.native
/**
  * Creates a new PointLight.
  * @param color Hexadecimal color of the light. Default is 0xffffff (white). Expects a `Integer`
  * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`
  * @param distance Maximum range of the light. Default is 0 (no limit).
  * @param decay The amount the light dims along the distance of the light. Expects a `Float`. Default `2`
  */
open class PointLight ()
  extends typings.three.srcThreeMod.PointLight {
  def this(color: ColorRepresentation) = this()
  def this(color: Unit, intensity: Double) = this()
  def this(color: ColorRepresentation, intensity: Double) = this()
  def this(color: Unit, intensity: Double, distance: Double) = this()
  def this(color: Unit, intensity: Unit, distance: Double) = this()
  def this(color: ColorRepresentation, intensity: Double, distance: Double) = this()
  def this(color: ColorRepresentation, intensity: Unit, distance: Double) = this()
  def this(color: Unit, intensity: Double, distance: Double, decay: Double) = this()
  def this(color: Unit, intensity: Double, distance: Unit, decay: Double) = this()
  def this(color: Unit, intensity: Unit, distance: Double, decay: Double) = this()
  def this(color: Unit, intensity: Unit, distance: Unit, decay: Double) = this()
  def this(color: ColorRepresentation, intensity: Double, distance: Double, decay: Double) = this()
  def this(color: ColorRepresentation, intensity: Double, distance: Unit, decay: Double) = this()
  def this(color: ColorRepresentation, intensity: Unit, distance: Double, decay: Double) = this()
  def this(color: ColorRepresentation, intensity: Unit, distance: Unit, decay: Double) = this()
}

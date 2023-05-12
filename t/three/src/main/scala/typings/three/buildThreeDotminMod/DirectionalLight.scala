package typings.three.buildThreeDotminMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "DirectionalLight")
@js.native
/**
  * Creates a new {@link DirectionalLight}.
  * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
  * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`
  */
open class DirectionalLight ()
  extends typings.three.srcThreeMod.DirectionalLight {
  def this(color: ColorRepresentation) = this()
  def this(color: Unit, intensity: Double) = this()
  def this(color: ColorRepresentation, intensity: Double) = this()
}

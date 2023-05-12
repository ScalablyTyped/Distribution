package typings.three.buildThreeDotminMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "AmbientLight")
@js.native
/**
  * Creates a new {@link AmbientLight}.
  * @param color Numeric value of the RGB component of the color. Default `0xffffff`
  * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`
  */
open class AmbientLight ()
  extends typings.three.srcThreeMod.AmbientLight {
  def this(color: ColorRepresentation) = this()
  def this(color: Unit, intensity: Double) = this()
  def this(color: ColorRepresentation, intensity: Double) = this()
}

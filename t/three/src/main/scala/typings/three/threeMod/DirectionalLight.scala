package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DirectionalLight")
@js.native
class DirectionalLight ()
  extends typings.three.srcLightsDirectionalLightMod.DirectionalLight {
  def this(color: String) = this()
  def this(color: Double) = this()
  def this(color: typings.three.srcMathColorMod.Color) = this()
  def this(color: String, intensity: Double) = this()
  def this(color: Double, intensity: Double) = this()
  def this(color: typings.three.srcMathColorMod.Color, intensity: Double) = this()
}


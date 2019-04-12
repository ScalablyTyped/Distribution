package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DirectionalLight")
@js.native
class DirectionalLight ()
  extends threeLib.srcLightsDirectionalLightMod.DirectionalLight {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color) = this()
  def this(color: java.lang.String, intensity: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color, intensity: scala.Double) = this()
}


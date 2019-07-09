package typings
package threeLib.srcLightsAmbientLightProbeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/AmbientLightProbe", "AmbientLightProbe")
@js.native
class AmbientLightProbe ()
  extends threeLib.srcLightsLightProbeMod.LightProbe {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color) = this()
  def this(color: java.lang.String, intensity: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double) = this()
  def this(color: threeLib.srcMathColorMod.Color, intensity: scala.Double) = this()
  var isAmbientLightProbe: threeLib.threeLibNumbers.`true` = js.native
}


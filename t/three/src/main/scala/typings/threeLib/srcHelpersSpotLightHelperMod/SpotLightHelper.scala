package typings
package threeLib.srcHelpersSpotLightHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/SpotLightHelper", "SpotLightHelper")
@js.native
class SpotLightHelper protected ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(light: threeLib.srcLightsLightMod.Light) = this()
  def this(light: threeLib.srcLightsLightMod.Light, color: java.lang.String) = this()
  def this(light: threeLib.srcLightsLightMod.Light, color: scala.Double) = this()
  def this(light: threeLib.srcLightsLightMod.Light, color: threeLib.srcMathColorMod.Color) = this()
  var color: js.UndefOr[threeLib.srcMathColorMod.Color | java.lang.String | scala.Double] = js.native
  var light: threeLib.srcLightsLightMod.Light = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


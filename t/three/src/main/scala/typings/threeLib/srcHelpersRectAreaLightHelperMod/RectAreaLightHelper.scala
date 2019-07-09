package typings
package threeLib.srcHelpersRectAreaLightHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/RectAreaLightHelper", "RectAreaLightHelper")
@js.native
class RectAreaLightHelper protected ()
  extends threeLib.srcObjectsLineMod.Line {
  def this(light: threeLib.srcLightsRectAreaLightMod.RectAreaLight) = this()
  def this(light: threeLib.srcLightsRectAreaLightMod.RectAreaLight, color: java.lang.String) = this()
  def this(light: threeLib.srcLightsRectAreaLightMod.RectAreaLight, color: scala.Double) = this()
  def this(light: threeLib.srcLightsRectAreaLightMod.RectAreaLight, color: threeLib.srcMathColorMod.Color) = this()
  var color: js.UndefOr[threeLib.srcMathColorMod.Color | java.lang.String | scala.Double] = js.native
  var light: threeLib.srcLightsRectAreaLightMod.RectAreaLight = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


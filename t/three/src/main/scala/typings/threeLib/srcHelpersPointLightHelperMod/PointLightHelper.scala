package typings
package threeLib.srcHelpersPointLightHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/PointLightHelper", "PointLightHelper")
@js.native
class PointLightHelper protected ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(light: threeLib.srcLightsPointLightMod.PointLight) = this()
  def this(light: threeLib.srcLightsPointLightMod.PointLight, sphereSize: scala.Double) = this()
  def this(light: threeLib.srcLightsPointLightMod.PointLight, sphereSize: scala.Double, color: java.lang.String) = this()
  def this(light: threeLib.srcLightsPointLightMod.PointLight, sphereSize: scala.Double, color: scala.Double) = this()
  def this(light: threeLib.srcLightsPointLightMod.PointLight, sphereSize: scala.Double, color: threeLib.srcMathColorMod.Color) = this()
  var color: js.UndefOr[threeLib.srcMathColorMod.Color | java.lang.String | scala.Double] = js.native
  var light: threeLib.srcLightsPointLightMod.PointLight = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


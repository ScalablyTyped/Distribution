package typings
package threeLib.srcHelpersDirectionalLightHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/DirectionalLightHelper", "DirectionalLightHelper")
@js.native
class DirectionalLightHelper protected ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(light: threeLib.srcLightsDirectionalLightMod.DirectionalLight) = this()
  def this(light: threeLib.srcLightsDirectionalLightMod.DirectionalLight, size: scala.Double) = this()
  def this(light: threeLib.srcLightsDirectionalLightMod.DirectionalLight, size: scala.Double, color: java.lang.String) = this()
  def this(light: threeLib.srcLightsDirectionalLightMod.DirectionalLight, size: scala.Double, color: scala.Double) = this()
  def this(light: threeLib.srcLightsDirectionalLightMod.DirectionalLight, size: scala.Double, color: threeLib.srcMathColorMod.Color) = this()
  var color: js.UndefOr[threeLib.srcMathColorMod.Color | java.lang.String | scala.Double] = js.native
  var light: threeLib.srcLightsDirectionalLightMod.DirectionalLight = js.native
  var lightPlane: threeLib.srcObjectsLineMod.Line = js.native
  var targetPlane: threeLib.srcObjectsLineMod.Line = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


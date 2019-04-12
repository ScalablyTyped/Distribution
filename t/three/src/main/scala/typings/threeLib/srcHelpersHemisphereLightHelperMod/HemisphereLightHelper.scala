package typings
package threeLib.srcHelpersHemisphereLightHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/HemisphereLightHelper", "HemisphereLightHelper")
@js.native
class HemisphereLightHelper protected ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(light: threeLib.srcLightsHemisphereLightMod.HemisphereLight, size: scala.Double) = this()
  def this(light: threeLib.srcLightsHemisphereLightMod.HemisphereLight, size: scala.Double, color: java.lang.String) = this()
  def this(light: threeLib.srcLightsHemisphereLightMod.HemisphereLight, size: scala.Double, color: scala.Double) = this()
  def this(light: threeLib.srcLightsHemisphereLightMod.HemisphereLight, size: scala.Double, color: threeLib.srcMathColorMod.Color) = this()
  var color: js.UndefOr[threeLib.srcMathColorMod.Color | java.lang.String | scala.Double] = js.native
  var light: threeLib.srcLightsHemisphereLightMod.HemisphereLight = js.native
  var material: threeLib.srcMaterialsMeshBasicMaterialMod.MeshBasicMaterial = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


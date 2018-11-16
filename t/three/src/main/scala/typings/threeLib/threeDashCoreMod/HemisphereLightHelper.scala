package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "HemisphereLightHelper")
@js.native
class HemisphereLightHelper protected () extends Object3D {
  def this(light: HemisphereLight, size: scala.Double) = this()
  def this(light: HemisphereLight, size: scala.Double, color: java.lang.String) = this()
  def this(light: HemisphereLight, size: scala.Double, color: scala.Double) = this()
  def this(light: HemisphereLight, size: scala.Double, color: Color) = this()
  var color: js.UndefOr[Color | java.lang.String | scala.Double] = js.native
  var light: HemisphereLight = js.native
  var material: MeshBasicMaterial = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


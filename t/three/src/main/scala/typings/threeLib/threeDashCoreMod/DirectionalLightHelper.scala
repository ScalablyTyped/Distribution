package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "DirectionalLightHelper")
@js.native
class DirectionalLightHelper protected () extends Object3D {
  def this(light: DirectionalLight) = this()
  def this(light: DirectionalLight, size: scala.Double) = this()
  def this(light: DirectionalLight, size: scala.Double, color: java.lang.String) = this()
  def this(light: DirectionalLight, size: scala.Double, color: scala.Double) = this()
  def this(light: DirectionalLight, size: scala.Double, color: Color) = this()
  var color: js.UndefOr[Color | java.lang.String | scala.Double] = js.native
  var light: DirectionalLight = js.native
  var lightPlane: Line = js.native
  var targetPlane: Line = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


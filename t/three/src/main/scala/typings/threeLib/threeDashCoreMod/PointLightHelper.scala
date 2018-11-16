package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "PointLightHelper")
@js.native
class PointLightHelper protected () extends Object3D {
  def this(light: PointLight) = this()
  def this(light: PointLight, sphereSize: scala.Double) = this()
  def this(light: PointLight, sphereSize: scala.Double, color: java.lang.String) = this()
  def this(light: PointLight, sphereSize: scala.Double, color: scala.Double) = this()
  def this(light: PointLight, sphereSize: scala.Double, color: Color) = this()
  var color: js.UndefOr[Color | java.lang.String | scala.Double] = js.native
  var light: PointLight = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


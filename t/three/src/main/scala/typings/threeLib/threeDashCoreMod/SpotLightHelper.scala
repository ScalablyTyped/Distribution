package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "SpotLightHelper")
@js.native
class SpotLightHelper protected () extends Object3D {
  def this(light: Light) = this()
  def this(light: Light, color: java.lang.String) = this()
  def this(light: Light, color: scala.Double) = this()
  def this(light: Light, color: Color) = this()
  var color: js.UndefOr[Color | java.lang.String | scala.Double] = js.native
  var light: Light = js.native
  def dispose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}


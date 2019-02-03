package typings
package threeLib.threeDashLensflareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-lensflare", "LensFlareElement")
@js.native
class LensFlareElement protected () extends js.Object {
  def this(texture: threeLib.threeDashCoreMod.Texture) = this()
  def this(texture: threeLib.threeDashCoreMod.Texture, size: scala.Double) = this()
  def this(texture: threeLib.threeDashCoreMod.Texture, size: scala.Double, distance: scala.Double) = this()
  def this(texture: threeLib.threeDashCoreMod.Texture, size: scala.Double, distance: scala.Double, color: threeLib.threeDashCoreMod.Color) = this()
  var color: threeLib.threeDashCoreMod.Color = js.native
  var distance: scala.Double = js.native
  var size: scala.Double = js.native
  var texture: threeLib.threeDashCoreMod.Texture = js.native
}

/* static members */
@JSImport("three/three-lensflare", "LensFlareElement")
@js.native
object LensFlareElement extends js.Object {
  var Geometry: threeLib.threeDashCoreMod.BufferGeometry = js.native
  var Shader: threeLib.threeDashCoreMod.Shader = js.native
}


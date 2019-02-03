package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "LensFlareElement")
@js.native
class LensFlareElement protected ()
  extends threeLib.threeDashLensflareMod.LensFlareElement {
  def this(texture: threeLib.threeDashCoreMod.Texture) = this()
  def this(texture: threeLib.threeDashCoreMod.Texture, size: scala.Double) = this()
  def this(texture: threeLib.threeDashCoreMod.Texture, size: scala.Double, distance: scala.Double) = this()
  def this(texture: threeLib.threeDashCoreMod.Texture, size: scala.Double, distance: scala.Double, color: threeLib.threeDashCoreMod.Color) = this()
}

/* static members */
@JSImport("three", "LensFlareElement")
@js.native
object LensFlareElement extends js.Object {
  var Geometry: threeLib.threeDashCoreMod.BufferGeometry = js.native
  var Shader: threeLib.threeDashCoreMod.Shader = js.native
}


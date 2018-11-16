package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Layers")
@js.native
class Layers () extends js.Object {
  var mask: scala.Double = js.native
  def disable(channel: scala.Double): scala.Unit = js.native
  def enable(channel: scala.Double): scala.Unit = js.native
  def set(channel: scala.Double): scala.Unit = js.native
  def test(layers: Layers): scala.Boolean = js.native
  def toggle(channel: scala.Double): scala.Unit = js.native
}


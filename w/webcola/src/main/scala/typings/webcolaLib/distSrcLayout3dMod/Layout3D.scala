package typings
package webcolaLib.distSrcLayout3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/layout3d", "Layout3D")
@js.native
class Layout3D protected () extends js.Object {
  def this(nodes: js.Array[Node3D], links: js.Array[Link3D]) = this()
  def this(nodes: js.Array[Node3D], links: js.Array[Link3D], idealLinkLength: scala.Double) = this()
  var constraints: js.Array[_] = js.native
  var descent: webcolaLib.distSrcDescentMod.Descent = js.native
  var idealLinkLength: scala.Double = js.native
  var links: js.Array[Link3D] = js.native
  var nodes: js.Array[Node3D] = js.native
  var result: js.Array[js.Array[scala.Double]] = js.native
  var useJaccardLinkLengths: scala.Boolean = js.native
  def linkLength(l: Link3D): scala.Double = js.native
  def start(): Layout3D = js.native
  def start(iterations: scala.Double): Layout3D = js.native
  def tick(): scala.Double = js.native
}

@JSImport("webcola/dist/src/layout3d", "Layout3D")
@js.native
object Layout3D extends js.Object {
  var dims: js.Array[java.lang.String] = js.native
  var k: scala.Double = js.native
}


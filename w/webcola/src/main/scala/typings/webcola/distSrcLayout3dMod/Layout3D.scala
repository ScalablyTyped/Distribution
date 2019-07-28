package typings.webcola.distSrcLayout3dMod

import typings.webcola.distSrcDescentMod.Descent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/layout3d", "Layout3D")
@js.native
class Layout3D protected () extends js.Object {
  def this(nodes: js.Array[Node3D], links: js.Array[Link3D]) = this()
  def this(nodes: js.Array[Node3D], links: js.Array[Link3D], idealLinkLength: Double) = this()
  var constraints: js.Array[_] = js.native
  var descent: Descent = js.native
  var idealLinkLength: Double = js.native
  var links: js.Array[Link3D] = js.native
  var nodes: js.Array[Node3D] = js.native
  var result: js.Array[js.Array[Double]] = js.native
  var useJaccardLinkLengths: Boolean = js.native
  def linkLength(l: Link3D): Double = js.native
  def start(): Layout3D = js.native
  def start(iterations: Double): Layout3D = js.native
  def tick(): Double = js.native
}

/* static members */
@JSImport("webcola/dist/src/layout3d", "Layout3D")
@js.native
object Layout3D extends js.Object {
  var dims: js.Array[String] = js.native
  var k: Double = js.native
}


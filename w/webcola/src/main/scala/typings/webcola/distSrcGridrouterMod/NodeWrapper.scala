package typings.webcola.distSrcGridrouterMod

import typings.webcola.distSrcRectangleMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/gridrouter", "NodeWrapper")
@js.native
class NodeWrapper protected () extends js.Object {
  def this(id: Double, rect: Rectangle, children: js.Array[Double]) = this()
  var children: js.Array[Double] = js.native
  var id: Double = js.native
  var leaf: Boolean = js.native
  var parent: NodeWrapper = js.native
  var ports: js.Array[Vert] = js.native
  var rect: Rectangle = js.native
}


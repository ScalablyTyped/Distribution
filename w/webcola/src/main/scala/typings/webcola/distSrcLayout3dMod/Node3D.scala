package typings.webcola.distSrcLayout3dMod

import typings.webcola.distSrcRectangleMod.GraphNode
import typings.webcola.distSrcRectangleMod.Rectangle
import typings.webcola.distSrcVpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/layout3d", "Node3D")
@js.native
class Node3D () extends GraphNode {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  /* CompleteClass */
  override var bounds: Rectangle = js.native
  /* CompleteClass */
  override var fixed: Boolean = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var px: Double = js.native
  /* CompleteClass */
  override var py: Double = js.native
  /* CompleteClass */
  override var variable: Variable = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  var z: Double = js.native
}


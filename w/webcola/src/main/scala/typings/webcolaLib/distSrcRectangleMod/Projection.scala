package typings
package webcolaLib.distSrcRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/rectangle", "Projection")
@js.native
class Projection protected () extends js.Object {
  def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup]) = this()
  def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup], rootGroup: ProjectionGroup) = this()
  def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup], rootGroup: ProjectionGroup, constraints: js.Array[_]) = this()
  def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup], rootGroup: ProjectionGroup, constraints: js.Array[_], avoidOverlaps: scala.Boolean) = this()
  var avoidOverlaps: js.Any = js.native
  var createAlignment: js.Any = js.native
  var createConstraints: js.Any = js.native
  var createSeparation: js.Any = js.native
  var groups: js.Any = js.native
  var makeFeasible: js.Any = js.native
  var nodes: js.Any = js.native
  var project: js.Any = js.native
  var rootGroup: js.Any = js.native
  var setupVariablesAndBounds: js.Any = js.native
  var solve: js.Any = js.native
  var variables: js.Any = js.native
  var xConstraints: js.Any = js.native
  var yConstraints: js.Any = js.native
  def projectFunctions(): js.Array[webcolaLib.Anon_R] = js.native
  def xProject(x0: js.Array[scala.Double], y0: js.Array[scala.Double], x: js.Array[scala.Double]): scala.Unit = js.native
  def yProject(x0: js.Array[scala.Double], y0: js.Array[scala.Double], y: js.Array[scala.Double]): scala.Unit = js.native
}


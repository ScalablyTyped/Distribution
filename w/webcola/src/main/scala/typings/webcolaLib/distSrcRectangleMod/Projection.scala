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
  var groups: js.Any = js.native
  var nodes: js.Any = js.native
  var rootGroup: js.Any = js.native
  var variables: js.Any = js.native
  var xConstraints: js.Any = js.native
  var yConstraints: js.Any = js.native
  /* private */ def createAlignment(c: js.Any): js.Any = js.native
  /* private */ def createConstraints(constraints: js.Any): js.Any = js.native
  /* private */ def createSeparation(c: js.Any): js.Any = js.native
  /* private */ def makeFeasible(c: js.Any): js.Any = js.native
  /* private */ def project(
    x0: js.Any,
    y0: js.Any,
    start: js.Any,
    desired: js.Any,
    getDesired: js.Any,
    cs: js.Any,
    generateConstraints: js.Any,
    updateNodeBounds: js.Any,
    updateGroupBounds: js.Any
  ): js.Any = js.native
  def projectFunctions(): js.Array[webcolaLib.Anon_R] = js.native
  /* private */ def setupVariablesAndBounds(x0: js.Any, y0: js.Any, desired: js.Any, getDesired: js.Any): js.Any = js.native
  /* private */ def solve(vs: js.Any, cs: js.Any, starting: js.Any, desired: js.Any): js.Any = js.native
  def xProject(x0: js.Array[scala.Double], y0: js.Array[scala.Double], x: js.Array[scala.Double]): scala.Unit = js.native
  def yProject(x0: js.Array[scala.Double], y0: js.Array[scala.Double], y: js.Array[scala.Double]): scala.Unit = js.native
}


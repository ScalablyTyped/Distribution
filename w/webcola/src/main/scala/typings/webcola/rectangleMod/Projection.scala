package typings.webcola.rectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola/dist/src/rectangle", "Projection")
@js.native
class Projection protected () extends js.Object {
  def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup]) = this()
  def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup], rootGroup: ProjectionGroup) = this()
  def this(
    nodes: js.Array[GraphNode],
    groups: js.Array[ProjectionGroup],
    rootGroup: js.UndefOr[scala.Nothing],
    constraints: js.Array[_]
  ) = this()
  def this(
    nodes: js.Array[GraphNode],
    groups: js.Array[ProjectionGroup],
    rootGroup: ProjectionGroup,
    constraints: js.Array[_]
  ) = this()
  def this(
    nodes: js.Array[GraphNode],
    groups: js.Array[ProjectionGroup],
    rootGroup: js.UndefOr[scala.Nothing],
    constraints: js.UndefOr[scala.Nothing],
    avoidOverlaps: Boolean
  ) = this()
  def this(
    nodes: js.Array[GraphNode],
    groups: js.Array[ProjectionGroup],
    rootGroup: js.UndefOr[scala.Nothing],
    constraints: js.Array[_],
    avoidOverlaps: Boolean
  ) = this()
  def this(
    nodes: js.Array[GraphNode],
    groups: js.Array[ProjectionGroup],
    rootGroup: ProjectionGroup,
    constraints: js.UndefOr[scala.Nothing],
    avoidOverlaps: Boolean
  ) = this()
  def this(
    nodes: js.Array[GraphNode],
    groups: js.Array[ProjectionGroup],
    rootGroup: ProjectionGroup,
    constraints: js.Array[_],
    avoidOverlaps: Boolean
  ) = this()
  
  var avoidOverlaps: js.Any = js.native
  
  var createAlignment: js.Any = js.native
  
  var createConstraints: js.Any = js.native
  
  var createSeparation: js.Any = js.native
  
  var groups: js.Any = js.native
  
  var makeFeasible: js.Any = js.native
  
  var nodes: js.Any = js.native
  
  var project: js.Any = js.native
  
  def projectFunctions(): js.Array[
    js.Function3[/* x0 */ js.Array[Double], /* y0 */ js.Array[Double], /* r */ js.Array[Double], Unit]
  ] = js.native
  
  var rootGroup: js.Any = js.native
  
  var setupVariablesAndBounds: js.Any = js.native
  
  var solve: js.Any = js.native
  
  var variables: js.Any = js.native
  
  var xConstraints: js.Any = js.native
  
  def xProject(x0: js.Array[Double], y0: js.Array[Double], x: js.Array[Double]): Unit = js.native
  
  var yConstraints: js.Any = js.native
  
  def yProject(x0: js.Array[Double], y0: js.Array[Double], y: js.Array[Double]): Unit = js.native
}

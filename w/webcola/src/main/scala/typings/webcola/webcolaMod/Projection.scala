package typings.webcola.webcolaMod

import typings.webcola.distSrcRectangleMod.GraphNode
import typings.webcola.distSrcRectangleMod.ProjectionGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Projection")
@js.native
class Projection protected ()
  extends typings.webcola.distSrcRectangleMod.Projection {
  def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup]) = this()
  def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup], rootGroup: ProjectionGroup) = this()
  def this(
    nodes: js.Array[GraphNode],
    groups: js.Array[ProjectionGroup],
    rootGroup: ProjectionGroup,
    constraints: js.Array[_]
  ) = this()
  def this(
    nodes: js.Array[GraphNode],
    groups: js.Array[ProjectionGroup],
    rootGroup: ProjectionGroup,
    constraints: js.Array[_],
    avoidOverlaps: Boolean
  ) = this()
}


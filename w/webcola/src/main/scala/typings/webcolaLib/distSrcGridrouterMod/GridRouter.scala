package typings
package webcolaLib.distSrcGridrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/gridrouter", "GridRouter")
@js.native
class GridRouter[Node] protected () extends js.Object {
  def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node]) = this()
  def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node], groupPadding: scala.Double) = this()
  var avg: js.Any = js.native
  var backToFront: js.Any = js.native
  var cols: js.Array[GridLine] = js.native
  var edges: js.Any = js.native
  var findAncestorPathBetween: js.Any = js.native
  var findLineage: js.Any = js.native
  var getDepth: js.Any = js.native
  var getGridLines: js.Any = js.native
  var groupPadding: scala.Double = js.native
  var groups: js.Array[NodeWrapper] = js.native
  var leaves: js.Array[NodeWrapper] = js.native
  var midPoints: js.Any = js.native
  var nodes: js.Array[NodeWrapper] = js.native
  var obstacles: js.Any = js.native
  var originalnodes: js.Array[Node] = js.native
  var passableEdges: js.Any = js.native
  var root: js.Any = js.native
  var rows: js.Array[GridLine] = js.native
  var verts: js.Array[Vert] = js.native
  def route(s: scala.Double, t: scala.Double): js.Array[webcolaLib.distSrcGeomMod.Point] = js.native
  def routeEdges[Edge](
    edges: js.Array[Edge],
    nudgeGap: scala.Double,
    source: js.Function1[/* e */ Edge, scala.Double],
    target: js.Function1[/* e */ Edge, scala.Double]
  ): js.Array[js.Array[js.Array[webcolaLib.distSrcGeomMod.Point]]] = js.native
  def siblingObstacles(a: js.Any, b: js.Any): js.Any = js.native
}

/* static members */
@JSImport("webcola/dist/src/gridrouter", "GridRouter")
@js.native
object GridRouter extends js.Object {
  var getOrder: js.Any = js.native
  var isLeft: js.Any = js.native
  def angleBetween2Lines(line1: js.Array[webcolaLib.distSrcGeomMod.Point], line2: js.Array[webcolaLib.distSrcGeomMod.Point]): scala.Double = js.native
  def getRoutePath(
    route: js.Array[js.Array[webcolaLib.distSrcGeomMod.Point]],
    cornerradius: scala.Double,
    arrowwidth: scala.Double,
    arrowheight: scala.Double
  ): webcolaLib.Anon_Arrowpath = js.native
  def getSegmentSets(routes: js.Any, x: js.Any, y: js.Any): js.Array[_] = js.native
  def makeSegments(path: js.Array[webcolaLib.distSrcGeomMod.Point]): js.Array[js.Array[webcolaLib.distSrcGeomMod.Point]] = js.native
  def nudgeSegments(
    routes: js.Any,
    x: java.lang.String,
    y: java.lang.String,
    leftOf: js.Function2[/* e1 */ scala.Double, /* e2 */ scala.Double, scala.Boolean],
    gap: scala.Double
  ): scala.Unit = js.native
  def nudgeSegs(
    x: java.lang.String,
    y: java.lang.String,
    routes: js.Any,
    segments: js.Any,
    leftOf: js.Any,
    gap: scala.Double
  ): scala.Unit = js.native
  def orderEdges(edges: js.Any): js.Function2[/* l */ scala.Double, /* r */ scala.Double, scala.Boolean] = js.native
  def unreverseEdges(routes: js.Any, routePaths: js.Any): scala.Unit = js.native
}


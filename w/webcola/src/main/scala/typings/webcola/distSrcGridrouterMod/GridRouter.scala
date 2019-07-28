package typings.webcola.distSrcGridrouterMod

import typings.webcola.Anon_Arrowpath
import typings.webcola.distSrcGeomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/gridrouter", "GridRouter")
@js.native
class GridRouter[Node] protected () extends js.Object {
  def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node]) = this()
  def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node], groupPadding: Double) = this()
  var avg: js.Any = js.native
  var backToFront: js.Any = js.native
  var cols: js.Array[GridLine] = js.native
  var edges: js.Any = js.native
  var findAncestorPathBetween: js.Any = js.native
  var findLineage: js.Any = js.native
  var getDepth: js.Any = js.native
  var getGridLines: js.Any = js.native
  var groupPadding: Double = js.native
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
  def route(s: Double, t: Double): js.Array[Point] = js.native
  def routeEdges[Edge](
    edges: js.Array[Edge],
    nudgeGap: Double,
    source: js.Function1[/* e */ Edge, Double],
    target: js.Function1[/* e */ Edge, Double]
  ): js.Array[js.Array[js.Array[Point]]] = js.native
  def siblingObstacles(a: js.Any, b: js.Any): js.Any = js.native
}

/* static members */
@JSImport("webcola/dist/src/gridrouter", "GridRouter")
@js.native
object GridRouter extends js.Object {
  var getOrder: js.Any = js.native
  var isLeft: js.Any = js.native
  def angleBetween2Lines(line1: js.Array[Point], line2: js.Array[Point]): Double = js.native
  def getRoutePath(route: js.Array[js.Array[Point]], cornerradius: Double, arrowwidth: Double, arrowheight: Double): Anon_Arrowpath = js.native
  def getSegmentSets(routes: js.Any, x: js.Any, y: js.Any): js.Array[_] = js.native
  def makeSegments(path: js.Array[Point]): js.Array[js.Array[Point]] = js.native
  def nudgeSegments(
    routes: js.Any,
    x: String,
    y: String,
    leftOf: js.Function2[/* e1 */ Double, /* e2 */ Double, Boolean],
    gap: Double
  ): Unit = js.native
  def nudgeSegs(x: String, y: String, routes: js.Any, segments: js.Any, leftOf: js.Any, gap: Double): Unit = js.native
  def orderEdges(edges: js.Any): js.Function2[/* l */ Double, /* r */ Double, Boolean] = js.native
  def unreverseEdges(routes: js.Any, routePaths: js.Any): Unit = js.native
}


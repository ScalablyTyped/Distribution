package typings.webcola.mod

import typings.webcola.anon.Arrowpath
import typings.webcola.gridrouterMod.NodeAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "GridRouter")
@js.native
class GridRouter[Node] protected ()
  extends typings.webcola.gridrouterMod.GridRouter[Node] {
  def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node]) = this()
  def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node], groupPadding: Double) = this()
}

/* static members */
@JSImport("webcola", "GridRouter")
@js.native
object GridRouter extends js.Object {
  var getOrder: js.Any = js.native
  var isLeft: js.Any = js.native
  def angleBetween2Lines(line1: js.Array[typings.webcola.geomMod.Point], line2: js.Array[typings.webcola.geomMod.Point]): Double = js.native
  def getRoutePath(
    route: js.Array[js.Array[typings.webcola.geomMod.Point]],
    cornerradius: Double,
    arrowwidth: Double,
    arrowheight: Double
  ): Arrowpath = js.native
  def getSegmentSets(routes: js.Any, x: js.Any, y: js.Any): js.Array[_] = js.native
  def makeSegments(path: js.Array[typings.webcola.geomMod.Point]): js.Array[js.Array[typings.webcola.geomMod.Point]] = js.native
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


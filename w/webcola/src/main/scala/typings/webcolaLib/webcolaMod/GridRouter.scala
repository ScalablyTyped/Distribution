package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "GridRouter")
@js.native
class GridRouter[Node] protected ()
  extends webcolaLib.distSrcGridrouterMod.GridRouter[Node] {
  def this(originalnodes: js.Array[Node], accessor: webcolaLib.distSrcGridrouterMod.NodeAccessor[Node]) = this()
  def this(originalnodes: js.Array[Node], accessor: webcolaLib.distSrcGridrouterMod.NodeAccessor[Node], groupPadding: scala.Double) = this()
}

/* static members */
@JSImport("webcola", "GridRouter")
@js.native
object GridRouter extends js.Object {
  def angleBetween2Lines(line1: js.Array[webcolaLib.distSrcGeomMod.Point], line2: js.Array[webcolaLib.distSrcGeomMod.Point]): scala.Double = js.native
  /* private */ def getOrder(pairs: js.Any): js.Any = js.native
  def getRoutePath(
    route: js.Array[js.Array[webcolaLib.distSrcGeomMod.Point]],
    cornerradius: scala.Double,
    arrowwidth: scala.Double,
    arrowheight: scala.Double
  ): webcolaLib.Anon_Arrowpath = js.native
  def getSegmentSets(routes: js.Any, x: js.Any, y: js.Any): js.Array[_] = js.native
  /* private */ def isLeft(a: js.Any, b: js.Any, c: js.Any): js.Any = js.native
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


package typings.webcola.mod

import typings.webcola.anon.Arrowpath
import typings.webcola.gridrouterMod.NodeAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "GridRouter")
@js.native
class GridRouter[Node] protected ()
  extends typings.webcola.gridrouterMod.GridRouter[Node] {
  def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node]) = this()
  def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node], groupPadding: Double) = this()
}
/* static members */
object GridRouter {
  
  @JSImport("webcola", "GridRouter")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def angleBetween2Lines(line1: js.Array[typings.webcola.geomMod.Point], line2: js.Array[typings.webcola.geomMod.Point]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween2Lines")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("webcola", "GridRouter.getOrder")
  @js.native
  def getOrder: js.Any = js.native
  @scala.inline
  def getOrder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrder")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getRoutePath(
    route: js.Array[js.Array[typings.webcola.geomMod.Point]],
    cornerradius: Double,
    arrowwidth: Double,
    arrowheight: Double
  ): Arrowpath = (^.asInstanceOf[js.Dynamic].applyDynamic("getRoutePath")(route.asInstanceOf[js.Any], cornerradius.asInstanceOf[js.Any], arrowwidth.asInstanceOf[js.Any], arrowheight.asInstanceOf[js.Any])).asInstanceOf[Arrowpath]
  
  @scala.inline
  def getSegmentSets(routes: js.Any, x: js.Any, y: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSegmentSets")(routes.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @JSImport("webcola", "GridRouter.isLeft")
  @js.native
  def isLeft: js.Any = js.native
  @scala.inline
  def isLeft_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLeft")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def makeSegments(path: js.Array[typings.webcola.geomMod.Point]): js.Array[js.Array[typings.webcola.geomMod.Point]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSegments")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[typings.webcola.geomMod.Point]]]
  
  @scala.inline
  def nudgeSegments(
    routes: js.Any,
    x: String,
    y: String,
    leftOf: js.Function2[/* e1 */ Double, /* e2 */ Double, Boolean],
    gap: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nudgeSegments")(routes.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], leftOf.asInstanceOf[js.Any], gap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def nudgeSegs(x: String, y: String, routes: js.Any, segments: js.Any, leftOf: js.Any, gap: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nudgeSegs")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], leftOf.asInstanceOf[js.Any], gap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def orderEdges(edges: js.Any): js.Function2[/* l */ Double, /* r */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderEdges")(edges.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* l */ Double, /* r */ Double, Boolean]]
  
  @scala.inline
  def unreverseEdges(routes: js.Any, routePaths: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unreverseEdges")(routes.asInstanceOf[js.Any], routePaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

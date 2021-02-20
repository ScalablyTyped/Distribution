package typings.webcola.mod

import typings.webcola.anon.Arrowpath
import typings.webcola.gridrouterMod.NodeAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSImport("webcola", "GridRouter.angleBetween2Lines")
  @js.native
  def angleBetween2Lines(line1: js.Array[typings.webcola.geomMod.Point], line2: js.Array[typings.webcola.geomMod.Point]): Double = js.native
  
  @JSImport("webcola", "GridRouter.getOrder")
  @js.native
  def getOrder: js.Any = js.native
  @scala.inline
  def getOrder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "GridRouter.getRoutePath")
  @js.native
  def getRoutePath(
    route: js.Array[js.Array[typings.webcola.geomMod.Point]],
    cornerradius: Double,
    arrowwidth: Double,
    arrowheight: Double
  ): Arrowpath = js.native
  
  @JSImport("webcola", "GridRouter.getSegmentSets")
  @js.native
  def getSegmentSets(routes: js.Any, x: js.Any, y: js.Any): js.Array[_] = js.native
  
  @JSImport("webcola", "GridRouter.isLeft")
  @js.native
  def isLeft: js.Any = js.native
  @scala.inline
  def isLeft_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLeft")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "GridRouter.makeSegments")
  @js.native
  def makeSegments(path: js.Array[typings.webcola.geomMod.Point]): js.Array[js.Array[typings.webcola.geomMod.Point]] = js.native
  
  @JSImport("webcola", "GridRouter.nudgeSegments")
  @js.native
  def nudgeSegments(
    routes: js.Any,
    x: String,
    y: String,
    leftOf: js.Function2[/* e1 */ Double, /* e2 */ Double, Boolean],
    gap: Double
  ): Unit = js.native
  
  @JSImport("webcola", "GridRouter.nudgeSegs")
  @js.native
  def nudgeSegs(x: String, y: String, routes: js.Any, segments: js.Any, leftOf: js.Any, gap: Double): Unit = js.native
  
  @JSImport("webcola", "GridRouter.orderEdges")
  @js.native
  def orderEdges(edges: js.Any): js.Function2[/* l */ Double, /* r */ Double, Boolean] = js.native
  
  @JSImport("webcola", "GridRouter.unreverseEdges")
  @js.native
  def unreverseEdges(routes: js.Any, routePaths: js.Any): Unit = js.native
}

package typings.webcola

import typings.webcola.anon.Arrowpath
import typings.webcola.distSrcGeomMod.Point
import typings.webcola.distSrcRectangleMod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGridrouterMod {
  
  @JSImport("webcola/dist/src/gridrouter", "GridRouter")
  @js.native
  open class GridRouter[Node] protected () extends StObject {
    def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node]) = this()
    def this(originalnodes: js.Array[Node], accessor: NodeAccessor[Node], groupPadding: Double) = this()
    
    /* private */ var avg: Any = js.native
    
    var backToFront: Any = js.native
    
    var cols: js.Array[GridLine] = js.native
    
    var edges: Any = js.native
    
    /* private */ var findAncestorPathBetween: Any = js.native
    
    /* private */ var findLineage: Any = js.native
    
    /* private */ var getDepth: Any = js.native
    
    /* private */ var getGridLines: Any = js.native
    
    var groupPadding: Double = js.native
    
    var groups: js.Array[NodeWrapper] = js.native
    
    var leaves: js.Array[NodeWrapper] = js.native
    
    /* private */ var midPoints: Any = js.native
    
    var nodes: js.Array[NodeWrapper] = js.native
    
    var obstacles: Any = js.native
    
    var originalnodes: js.Array[Node] = js.native
    
    var passableEdges: Any = js.native
    
    var root: Any = js.native
    
    def route(s: Double, t: Double): js.Array[Point] = js.native
    
    def routeEdges[Edge](
      edges: js.Array[Edge],
      nudgeGap: Double,
      source: js.Function1[/* e */ Edge, Double],
      target: js.Function1[/* e */ Edge, Double]
    ): js.Array[js.Array[js.Array[Point]]] = js.native
    
    var rows: js.Array[GridLine] = js.native
    
    def siblingObstacles(a: Any, b: Any): Any = js.native
    
    var verts: js.Array[Vert] = js.native
  }
  /* static members */
  object GridRouter {
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def angleBetween2Lines(line1: js.Array[Point], line2: js.Array[Point]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween2Lines")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.getOrder")
    @js.native
    def getOrder: Any = js.native
    inline def getOrder_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrder")(x.asInstanceOf[js.Any])
    
    inline def getRoutePath(route: js.Array[js.Array[Point]], cornerradius: Double, arrowwidth: Double, arrowheight: Double): Arrowpath = (^.asInstanceOf[js.Dynamic].applyDynamic("getRoutePath")(route.asInstanceOf[js.Any], cornerradius.asInstanceOf[js.Any], arrowwidth.asInstanceOf[js.Any], arrowheight.asInstanceOf[js.Any])).asInstanceOf[Arrowpath]
    
    inline def getSegmentSets(routes: Any, x: Any, y: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSegmentSets")(routes.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.isLeft")
    @js.native
    def isLeft: Any = js.native
    inline def isLeft_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLeft")(x.asInstanceOf[js.Any])
    
    inline def makeSegments(path: js.Array[Point]): js.Array[js.Array[Point]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSegments")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Point]]]
    
    inline def nudgeSegments(
      routes: Any,
      x: String,
      y: String,
      leftOf: js.Function2[/* e1 */ Double, /* e2 */ Double, Boolean],
      gap: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nudgeSegments")(routes.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], leftOf.asInstanceOf[js.Any], gap.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def nudgeSegs(x: String, y: String, routes: Any, segments: Any, leftOf: Any, gap: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nudgeSegs")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], leftOf.asInstanceOf[js.Any], gap.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def orderEdges(edges: Any): js.Function2[/* l */ Double, /* r */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderEdges")(edges.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* l */ Double, /* r */ Double, Boolean]]
    
    inline def unreverseEdges(routes: Any, routePaths: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unreverseEdges")(routes.asInstanceOf[js.Any], routePaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("webcola/dist/src/gridrouter", "LongestCommonSubsequence")
  @js.native
  open class LongestCommonSubsequence[T] protected () extends StObject {
    def this(s: js.Array[T], t: js.Array[T]) = this()
    
    def getSequence(): js.Array[T] = js.native
    
    var length: Double = js.native
    
    var reversed: Boolean = js.native
    
    var s: js.Array[T] = js.native
    
    var si: Double = js.native
    
    var t: js.Array[T] = js.native
    
    var ti: Double = js.native
  }
  /* static members */
  object LongestCommonSubsequence {
    
    @JSImport("webcola/dist/src/gridrouter", "LongestCommonSubsequence")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "LongestCommonSubsequence.findMatch")
    @js.native
    def findMatch: Any = js.native
    inline def findMatch_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findMatch")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webcola/dist/src/gridrouter", "NodeWrapper")
  @js.native
  open class NodeWrapper protected () extends StObject {
    def this(id: Double, rect: Rectangle, children: js.Array[Double]) = this()
    
    var children: js.Array[Double] = js.native
    
    var id: Double = js.native
    
    var leaf: Boolean = js.native
    
    var parent: NodeWrapper = js.native
    
    var ports: js.Array[Vert] = js.native
    
    var rect: Rectangle = js.native
  }
  
  @JSImport("webcola/dist/src/gridrouter", "Vert")
  @js.native
  open class Vert protected () extends StObject {
    def this(id: Double, x: Double, y: Double) = this()
    def this(id: Double, x: Double, y: Double, node: NodeWrapper) = this()
    def this(id: Double, x: Double, y: Double, node: Unit, line: Any) = this()
    def this(id: Double, x: Double, y: Double, node: NodeWrapper, line: Any) = this()
    
    var id: Double = js.native
    
    var line: Any = js.native
    
    var node: NodeWrapper = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  trait GridLine extends StObject {
    
    var nodes: js.Array[NodeWrapper]
    
    var pos: Double
  }
  object GridLine {
    
    inline def apply(nodes: js.Array[NodeWrapper], pos: Double): GridLine = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridLine]
    }
    
    extension [Self <: GridLine](x: Self) {
      
      inline def setNodes(value: js.Array[NodeWrapper]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: NodeWrapper*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeAccessor[Node] extends StObject {
    
    def getBounds(v: Node): Rectangle
    
    def getChildren(v: Node): js.Array[Double]
  }
  object NodeAccessor {
    
    inline def apply[Node](getBounds: Node => Rectangle, getChildren: Node => js.Array[Double]): NodeAccessor[Node] = {
      val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction1(getBounds), getChildren = js.Any.fromFunction1(getChildren))
      __obj.asInstanceOf[NodeAccessor[Node]]
    }
    
    extension [Self <: NodeAccessor[?], Node](x: Self & NodeAccessor[Node]) {
      
      inline def setGetBounds(value: Node => Rectangle): Self = StObject.set(x, "getBounds", js.Any.fromFunction1(value))
      
      inline def setGetChildren(value: Node => js.Array[Double]): Self = StObject.set(x, "getChildren", js.Any.fromFunction1(value))
    }
  }
}

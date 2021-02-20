package typings.webcola

import typings.webcola.anon.Arrowpath
import typings.webcola.geomMod.Point
import typings.webcola.rectangleMod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridrouterMod {
  
  @JSImport("webcola/dist/src/gridrouter", "GridRouter")
  @js.native
  class GridRouter[Node] protected () extends StObject {
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
    
    def route(s: Double, t: Double): js.Array[Point] = js.native
    
    def routeEdges[Edge](
      edges: js.Array[Edge],
      nudgeGap: Double,
      source: js.Function1[/* e */ Edge, Double],
      target: js.Function1[/* e */ Edge, Double]
    ): js.Array[js.Array[js.Array[Point]]] = js.native
    
    var rows: js.Array[GridLine] = js.native
    
    def siblingObstacles(a: js.Any, b: js.Any): js.Any = js.native
    
    var verts: js.Array[Vert] = js.native
  }
  /* static members */
  object GridRouter {
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.angleBetween2Lines")
    @js.native
    def angleBetween2Lines(line1: js.Array[Point], line2: js.Array[Point]): Double = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.getOrder")
    @js.native
    def getOrder: js.Any = js.native
    @scala.inline
    def getOrder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrder")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.getRoutePath")
    @js.native
    def getRoutePath(route: js.Array[js.Array[Point]], cornerradius: Double, arrowwidth: Double, arrowheight: Double): Arrowpath = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.getSegmentSets")
    @js.native
    def getSegmentSets(routes: js.Any, x: js.Any, y: js.Any): js.Array[_] = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.isLeft")
    @js.native
    def isLeft: js.Any = js.native
    @scala.inline
    def isLeft_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.makeSegments")
    @js.native
    def makeSegments(path: js.Array[Point]): js.Array[js.Array[Point]] = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.nudgeSegments")
    @js.native
    def nudgeSegments(
      routes: js.Any,
      x: String,
      y: String,
      leftOf: js.Function2[/* e1 */ Double, /* e2 */ Double, Boolean],
      gap: Double
    ): Unit = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.nudgeSegs")
    @js.native
    def nudgeSegs(x: String, y: String, routes: js.Any, segments: js.Any, leftOf: js.Any, gap: Double): Unit = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.orderEdges")
    @js.native
    def orderEdges(edges: js.Any): js.Function2[/* l */ Double, /* r */ Double, Boolean] = js.native
    
    @JSImport("webcola/dist/src/gridrouter", "GridRouter.unreverseEdges")
    @js.native
    def unreverseEdges(routes: js.Any, routePaths: js.Any): Unit = js.native
  }
  
  @JSImport("webcola/dist/src/gridrouter", "LongestCommonSubsequence")
  @js.native
  class LongestCommonSubsequence[T] protected () extends StObject {
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
    def findMatch: js.Any = js.native
    @scala.inline
    def findMatch_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findMatch")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webcola/dist/src/gridrouter", "NodeWrapper")
  @js.native
  class NodeWrapper protected () extends StObject {
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
  class Vert protected () extends StObject {
    def this(id: Double, x: Double, y: Double) = this()
    def this(id: Double, x: Double, y: Double, node: NodeWrapper) = this()
    def this(id: Double, x: Double, y: Double, node: js.UndefOr[scala.Nothing], line: js.Any) = this()
    def this(id: Double, x: Double, y: Double, node: NodeWrapper, line: js.Any) = this()
    
    var id: Double = js.native
    
    var line: js.Any = js.native
    
    var node: NodeWrapper = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  @js.native
  trait GridLine extends StObject {
    
    var nodes: js.Array[NodeWrapper] = js.native
    
    var pos: Double = js.native
  }
  object GridLine {
    
    @scala.inline
    def apply(nodes: js.Array[NodeWrapper], pos: Double): GridLine = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridLine]
    }
    
    @scala.inline
    implicit class GridLineMutableBuilder[Self <: GridLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[NodeWrapper]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: NodeWrapper*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeAccessor[Node] extends StObject {
    
    def getBounds(v: Node): Rectangle = js.native
    
    def getChildren(v: Node): js.Array[Double] = js.native
  }
  object NodeAccessor {
    
    @scala.inline
    def apply[Node](getBounds: Node => Rectangle, getChildren: Node => js.Array[Double]): NodeAccessor[Node] = {
      val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction1(getBounds), getChildren = js.Any.fromFunction1(getChildren))
      __obj.asInstanceOf[NodeAccessor[Node]]
    }
    
    @scala.inline
    implicit class NodeAccessorMutableBuilder[Self <: NodeAccessor[_], Node] (val x: Self with NodeAccessor[Node]) extends AnyVal {
      
      @scala.inline
      def setGetBounds(value: Node => Rectangle): Self = StObject.set(x, "getBounds", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetChildren(value: Node => js.Array[Double]): Self = StObject.set(x, "getChildren", js.Any.fromFunction1(value))
    }
  }
}

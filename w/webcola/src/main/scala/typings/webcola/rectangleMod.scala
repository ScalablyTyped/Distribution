package typings.webcola

import typings.webcola.anon.ArrowStart
import typings.webcola.anon.X
import typings.webcola.geomMod.Point
import typings.webcola.vpscMod.Constraint
import typings.webcola.vpscMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleMod {
  
  @JSImport("webcola/dist/src/rectangle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola/dist/src/rectangle", "IndexedVariable")
  @js.native
  class IndexedVariable protected () extends Variable {
    def this(index: Double, w: Double) = this()
    
    var index: Double = js.native
  }
  
  @JSImport("webcola/dist/src/rectangle", "Projection")
  @js.native
  class Projection protected () extends StObject {
    def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup]) = this()
    def this(nodes: js.Array[GraphNode], groups: js.Array[ProjectionGroup], rootGroup: ProjectionGroup) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: Unit,
      constraints: js.Array[js.Any]
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: ProjectionGroup,
      constraints: js.Array[js.Any]
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: Unit,
      constraints: js.Array[js.Any],
      avoidOverlaps: Boolean
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: Unit,
      constraints: Unit,
      avoidOverlaps: Boolean
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: ProjectionGroup,
      constraints: js.Array[js.Any],
      avoidOverlaps: Boolean
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: ProjectionGroup,
      constraints: Unit,
      avoidOverlaps: Boolean
    ) = this()
    
    /* private */ var avoidOverlaps: js.Any = js.native
    
    /* private */ var createAlignment: js.Any = js.native
    
    /* private */ var createConstraints: js.Any = js.native
    
    /* private */ var createSeparation: js.Any = js.native
    
    /* private */ var groups: js.Any = js.native
    
    /* private */ var makeFeasible: js.Any = js.native
    
    /* private */ var nodes: js.Any = js.native
    
    /* private */ var project: js.Any = js.native
    
    def projectFunctions(): js.Array[
        js.Function3[/* x0 */ js.Array[Double], /* y0 */ js.Array[Double], /* r */ js.Array[Double], Unit]
      ] = js.native
    
    /* private */ var rootGroup: js.Any = js.native
    
    /* private */ var setupVariablesAndBounds: js.Any = js.native
    
    /* private */ var solve: js.Any = js.native
    
    /* private */ var variables: js.Any = js.native
    
    /* private */ var xConstraints: js.Any = js.native
    
    def xProject(x0: js.Array[Double], y0: js.Array[Double], x: js.Array[Double]): Unit = js.native
    
    /* private */ var yConstraints: js.Any = js.native
    
    def yProject(x0: js.Array[Double], y0: js.Array[Double], y: js.Array[Double]): Unit = js.native
  }
  
  @JSImport("webcola/dist/src/rectangle", "Rectangle")
  @js.native
  class Rectangle protected () extends StObject {
    def this(x: Double, X: Double, y: Double, Y: Double) = this()
    
    var X: Double = js.native
    
    var Y: Double = js.native
    
    def cx(): Double = js.native
    
    def cy(): Double = js.native
    
    def height(): Double = js.native
    
    def inflate(pad: Double): Rectangle = js.native
    
    def lineIntersections(x1: Double, y1: Double, x2: Double, y2: Double): js.Array[Point] = js.native
    
    def overlapX(r: Rectangle): Double = js.native
    
    def overlapY(r: Rectangle): Double = js.native
    
    def rayIntersection(x2: Double, y2: Double): Point = js.native
    
    def setXCentre(cx: Double): Unit = js.native
    
    def setYCentre(cy: Double): Unit = js.native
    
    def union(r: Rectangle): Rectangle = js.native
    
    def vertices(): js.Array[Point] = js.native
    
    def width(): Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object Rectangle {
    
    @JSImport("webcola/dist/src/rectangle", "Rectangle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Rectangle]
    
    inline def lineIntersection(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("lineIntersection")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
  
  inline def computeGroupBounds(g: ProjectionGroup): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("computeGroupBounds")(g.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  
  inline def generateXConstraints(rs: js.Array[Rectangle], vars: js.Array[Variable]): js.Array[Constraint] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateXConstraints")(rs.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Array[Constraint]]
  
  inline def generateXGroupConstraints(root: ProjectionGroup): js.Array[Constraint] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateXGroupConstraints")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[Constraint]]
  
  inline def generateYConstraints(rs: js.Array[Rectangle], vars: js.Array[Variable]): js.Array[Constraint] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateYConstraints")(rs.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Array[Constraint]]
  
  inline def generateYGroupConstraints(root: ProjectionGroup): js.Array[Constraint] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateYGroupConstraints")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[Constraint]]
  
  inline def makeEdgeBetween(source: Rectangle, target: Rectangle, ah: Double): ArrowStart = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEdgeBetween")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ah.asInstanceOf[js.Any])).asInstanceOf[ArrowStart]
  
  inline def makeEdgeTo(s: X, target: Rectangle, ah: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEdgeTo")(s.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ah.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def removeOverlaps(rs: js.Array[Rectangle]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlaps")(rs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait GraphNode
    extends StObject
       with Leaf {
    
    var fixed: Boolean
    
    var fixedWeight: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var px: Double
    
    var py: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object GraphNode {
    
    inline def apply(
      bounds: Rectangle,
      fixed: Boolean,
      height: Double,
      px: Double,
      py: Double,
      variable: Variable,
      width: Double,
      x: Double,
      y: Double
    ): GraphNode = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphNode]
    }
    
    extension [Self <: GraphNode](x: Self) {
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedWeight(value: Double): Self = StObject.set(x, "fixedWeight", value.asInstanceOf[js.Any])
      
      inline def setFixedWeightUndefined: Self = StObject.set(x, "fixedWeight", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPx(value: Double): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPy(value: Double): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Leaf extends StObject {
    
    var bounds: Rectangle
    
    var variable: Variable
  }
  object Leaf {
    
    inline def apply(bounds: Rectangle, variable: Variable): Leaf = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Leaf]
    }
    
    extension [Self <: Leaf](x: Self) {
      
      inline def setBounds(value: Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectionGroup extends StObject {
    
    var bounds: Rectangle
    
    var groups: js.Array[ProjectionGroup]
    
    var leaves: js.Array[Leaf]
    
    var maxVar: Variable
    
    var minVar: Variable
    
    var padding: Double
    
    var stiffness: Double
  }
  object ProjectionGroup {
    
    inline def apply(
      bounds: Rectangle,
      groups: js.Array[ProjectionGroup],
      leaves: js.Array[Leaf],
      maxVar: Variable,
      minVar: Variable,
      padding: Double,
      stiffness: Double
    ): ProjectionGroup = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any], maxVar = maxVar.asInstanceOf[js.Any], minVar = minVar.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectionGroup]
    }
    
    extension [Self <: ProjectionGroup](x: Self) {
      
      inline def setBounds(value: Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: js.Array[ProjectionGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: ProjectionGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setLeaves(value: js.Array[Leaf]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
      
      inline def setLeavesVarargs(value: Leaf*): Self = StObject.set(x, "leaves", js.Array(value :_*))
      
      inline def setMaxVar(value: Variable): Self = StObject.set(x, "maxVar", value.asInstanceOf[js.Any])
      
      inline def setMinVar(value: Variable): Self = StObject.set(x, "minVar", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    }
  }
}

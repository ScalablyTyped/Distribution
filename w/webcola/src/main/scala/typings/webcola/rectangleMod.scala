package typings.webcola

import typings.webcola.anon.ArrowStart
import typings.webcola.anon.X
import typings.webcola.geomMod.Point
import typings.webcola.vpscMod.Constraint
import typings.webcola.vpscMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleMod {
  
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
      rootGroup: js.UndefOr[scala.Nothing],
      constraints: js.Array[_]
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: ProjectionGroup,
      constraints: js.Array[_]
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: js.UndefOr[scala.Nothing],
      constraints: js.UndefOr[scala.Nothing],
      avoidOverlaps: Boolean
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: js.UndefOr[scala.Nothing],
      constraints: js.Array[_],
      avoidOverlaps: Boolean
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: ProjectionGroup,
      constraints: js.UndefOr[scala.Nothing],
      avoidOverlaps: Boolean
    ) = this()
    def this(
      nodes: js.Array[GraphNode],
      groups: js.Array[ProjectionGroup],
      rootGroup: ProjectionGroup,
      constraints: js.Array[_],
      avoidOverlaps: Boolean
    ) = this()
    
    var avoidOverlaps: js.Any = js.native
    
    var createAlignment: js.Any = js.native
    
    var createConstraints: js.Any = js.native
    
    var createSeparation: js.Any = js.native
    
    var groups: js.Any = js.native
    
    var makeFeasible: js.Any = js.native
    
    var nodes: js.Any = js.native
    
    var project: js.Any = js.native
    
    def projectFunctions(): js.Array[
        js.Function3[/* x0 */ js.Array[Double], /* y0 */ js.Array[Double], /* r */ js.Array[Double], Unit]
      ] = js.native
    
    var rootGroup: js.Any = js.native
    
    var setupVariablesAndBounds: js.Any = js.native
    
    var solve: js.Any = js.native
    
    var variables: js.Any = js.native
    
    var xConstraints: js.Any = js.native
    
    def xProject(x0: js.Array[Double], y0: js.Array[Double], x: js.Array[Double]): Unit = js.native
    
    var yConstraints: js.Any = js.native
    
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
    
    @JSImport("webcola/dist/src/rectangle", "Rectangle.empty")
    @js.native
    def empty(): Rectangle = js.native
    
    @JSImport("webcola/dist/src/rectangle", "Rectangle.lineIntersection")
    @js.native
    def lineIntersection(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Point = js.native
  }
  
  @JSImport("webcola/dist/src/rectangle", "computeGroupBounds")
  @js.native
  def computeGroupBounds(g: ProjectionGroup): Rectangle = js.native
  
  @JSImport("webcola/dist/src/rectangle", "generateXConstraints")
  @js.native
  def generateXConstraints(rs: js.Array[Rectangle], vars: js.Array[Variable]): js.Array[Constraint] = js.native
  
  @JSImport("webcola/dist/src/rectangle", "generateXGroupConstraints")
  @js.native
  def generateXGroupConstraints(root: ProjectionGroup): js.Array[Constraint] = js.native
  
  @JSImport("webcola/dist/src/rectangle", "generateYConstraints")
  @js.native
  def generateYConstraints(rs: js.Array[Rectangle], vars: js.Array[Variable]): js.Array[Constraint] = js.native
  
  @JSImport("webcola/dist/src/rectangle", "generateYGroupConstraints")
  @js.native
  def generateYGroupConstraints(root: ProjectionGroup): js.Array[Constraint] = js.native
  
  @JSImport("webcola/dist/src/rectangle", "makeEdgeBetween")
  @js.native
  def makeEdgeBetween(source: Rectangle, target: Rectangle, ah: Double): ArrowStart = js.native
  
  @JSImport("webcola/dist/src/rectangle", "makeEdgeTo")
  @js.native
  def makeEdgeTo(s: X, target: Rectangle, ah: Double): Point = js.native
  
  @JSImport("webcola/dist/src/rectangle", "removeOverlaps")
  @js.native
  def removeOverlaps(rs: js.Array[Rectangle]): Unit = js.native
  
  @js.native
  trait GraphNode extends Leaf {
    
    var fixed: Boolean = js.native
    
    var fixedWeight: js.UndefOr[Double] = js.native
    
    var height: Double = js.native
    
    var px: Double = js.native
    
    var py: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object GraphNode {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GraphNodeMutableBuilder[Self <: GraphNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWeight(value: Double): Self = StObject.set(x, "fixedWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWeightUndefined: Self = StObject.set(x, "fixedWeight", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPx(value: Double): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPy(value: Double): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Leaf extends StObject {
    
    var bounds: Rectangle = js.native
    
    var variable: Variable = js.native
  }
  object Leaf {
    
    @scala.inline
    def apply(bounds: Rectangle, variable: Variable): Leaf = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Leaf]
    }
    
    @scala.inline
    implicit class LeafMutableBuilder[Self <: Leaf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProjectionGroup extends StObject {
    
    var bounds: Rectangle = js.native
    
    var groups: js.Array[ProjectionGroup] = js.native
    
    var leaves: js.Array[Leaf] = js.native
    
    var maxVar: Variable = js.native
    
    var minVar: Variable = js.native
    
    var padding: Double = js.native
    
    var stiffness: Double = js.native
  }
  object ProjectionGroup {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ProjectionGroupMutableBuilder[Self <: ProjectionGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroups(value: js.Array[ProjectionGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: ProjectionGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setLeaves(value: js.Array[Leaf]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavesVarargs(value: Leaf*): Self = StObject.set(x, "leaves", js.Array(value :_*))
      
      @scala.inline
      def setMaxVar(value: Variable): Self = StObject.set(x, "maxVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVar(value: Variable): Self = StObject.set(x, "minVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    }
  }
}

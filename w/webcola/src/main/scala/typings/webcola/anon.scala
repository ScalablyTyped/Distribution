package typings.webcola

import typings.d3Dispatch.mod.Dispatch_
import typings.d3Drag.mod.DragBehavior
import typings.d3Drag.mod.DraggedElementBaseType
import typings.d3Drag.mod.SubjectPosition
import typings.d3Timer.mod.Timer_
import typings.webcola.geomMod.Point
import typings.webcola.geomMod.VisibilityEdge
import typings.webcola.geomMod.VisibilityVertex
import typings.webcola.layoutMod.Layout
import typings.webcola.layoutMod.Link
import typings.webcola.layoutMod.Node
import typings.webcola.powergraphMod.PowerEdge
import typings.webcola.vpscMod.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ArrowStart extends StObject {
    
    var arrowStart: Point = js.native
    
    var sourceIntersection: Point = js.native
    
    var targetIntersection: Point = js.native
  }
  object ArrowStart {
    
    @scala.inline
    def apply(arrowStart: Point, sourceIntersection: Point, targetIntersection: Point): ArrowStart = {
      val __obj = js.Dynamic.literal(arrowStart = arrowStart.asInstanceOf[js.Any], sourceIntersection = sourceIntersection.asInstanceOf[js.Any], targetIntersection = targetIntersection.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowStart]
    }
    
    @scala.inline
    implicit class ArrowStartMutableBuilder[Self <: ArrowStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowStart(value: Point): Self = StObject.set(x, "arrowStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIntersection(value: Point): Self = StObject.set(x, "sourceIntersection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIntersection(value: Point): Self = StObject.set(x, "targetIntersection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Arrowpath extends StObject {
    
    var arrowpath: String = js.native
    
    var routepath: String = js.native
  }
  object Arrowpath {
    
    @scala.inline
    def apply(arrowpath: String, routepath: String): Arrowpath = {
      val __obj = js.Dynamic.literal(arrowpath = arrowpath.asInstanceOf[js.Any], routepath = routepath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arrowpath]
    }
    
    @scala.inline
    implicit class ArrowpathMutableBuilder[Self <: Arrowpath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowpath(value: String): Self = StObject.set(x, "arrowpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutepath(value: String): Self = StObject.set(x, "routepath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cola extends StObject {
    
    var cola: Layout = js.native
    
    var powerGraph: js.Any = js.native
  }
  object Cola {
    
    @scala.inline
    def apply(cola: Layout, powerGraph: js.Any): Cola = {
      val __obj = js.Dynamic.literal(cola = cola.asInstanceOf[js.Any], powerGraph = powerGraph.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cola]
    }
    
    @scala.inline
    implicit class ColaMutableBuilder[Self <: Cola] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCola(value: Layout): Self = StObject.set(x, "cola", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerGraph(value: js.Any): Self = StObject.set(x, "powerGraph", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Constraint extends StObject {
    
    var constraint: typings.webcola.vpscMod.Constraint = js.native
    
    var lb: Block = js.native
    
    var rb: Block = js.native
  }
  object Constraint {
    
    @scala.inline
    def apply(constraint: typings.webcola.vpscMod.Constraint, lb: Block, rb: Block): Constraint = {
      val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], lb = lb.asInstanceOf[js.Any], rb = rb.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constraint]
    }
    
    @scala.inline
    implicit class ConstraintMutableBuilder[Self <: Constraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraint(value: typings.webcola.vpscMod.Constraint): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLb(value: Block): Self = StObject.set(x, "lb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRb(value: Block): Self = StObject.set(x, "rb", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DesiredCenter extends StObject {
    
    var desiredCenter: Double = js.native
    
    var size: Double = js.native
  }
  object DesiredCenter {
    
    @scala.inline
    def apply(desiredCenter: Double, size: Double): DesiredCenter = {
      val __obj = js.Dynamic.literal(desiredCenter = desiredCenter.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DesiredCenter]
    }
    
    @scala.inline
    implicit class DesiredCenterMutableBuilder[Self <: DesiredCenter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesiredCenter(value: Double): Self = StObject.set(x, "desiredCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait E extends StObject {
    
    var E: js.Array[VisibilityEdge] = js.native
    
    var V: js.Array[VisibilityVertex] = js.native
  }
  object E {
    
    @scala.inline
    def apply(E: js.Array[VisibilityEdge], V: js.Array[VisibilityVertex]): E = {
      val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
      __obj.asInstanceOf[E]
    }
    
    @scala.inline
    implicit class EMutableBuilder[Self <: E] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: js.Array[VisibilityEdge]): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEVarargs(value: VisibilityEdge*): Self = StObject.set(x, "E", js.Array(value :_*))
      
      @scala.inline
      def setV(value: js.Array[VisibilityVertex]): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVVarargs(value: VisibilityVertex*): Self = StObject.set(x, "V", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[GElement /* <: DraggedElementBaseType */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = js.native
    def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: js.UndefOr[scala.Nothing], time: Double): Timer_ = js.native
    def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = js.native
    def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = js.native
  }
  
  @js.native
  trait FnCallTypes extends StObject {
    
    def apply[T /* <: js.Object */](types: String*): Dispatch_[T] = js.native
  }
  
  @js.native
  trait Groups extends StObject {
    
    var groups: js.Array[_] = js.native
    
    var powerEdges: js.Array[PowerEdge] = js.native
  }
  object Groups {
    
    @scala.inline
    def apply(groups: js.Array[_], powerEdges: js.Array[PowerEdge]): Groups = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], powerEdges = powerEdges.asInstanceOf[js.Any])
      __obj.asInstanceOf[Groups]
    }
    
    @scala.inline
    implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[_]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: js.Any*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setPowerEdges(value: js.Array[PowerEdge]): Self = StObject.set(x, "powerEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerEdgesVarargs(value: PowerEdge*): Self = StObject.set(x, "powerEdges", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Links extends StObject {
    
    var links: js.Array[Link[Node]] = js.native
    
    var nodes: js.Array[Node] = js.native
  }
  object Links {
    
    @scala.inline
    def apply(links: js.Array[Link[Node]], nodes: js.Array[Node]): Links = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links]
    }
    
    @scala.inline
    implicit class LinksMutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinks(value: js.Array[Link[Node]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: Link[Node]*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LowerBound extends StObject {
    
    var lowerBound: Double = js.native
    
    var newCenters: js.Array[Double] = js.native
    
    var upperBound: Double = js.native
  }
  object LowerBound {
    
    @scala.inline
    def apply(lowerBound: Double, newCenters: js.Array[Double], upperBound: Double): LowerBound = {
      val __obj = js.Dynamic.literal(lowerBound = lowerBound.asInstanceOf[js.Any], newCenters = newCenters.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
      __obj.asInstanceOf[LowerBound]
    }
    
    @scala.inline
    implicit class LowerBoundMutableBuilder[Self <: LowerBound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLowerBound(value: Double): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewCenters(value: js.Array[Double]): Self = StObject.set(x, "newCenters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewCentersVarargs(value: Double*): Self = StObject.set(x, "newCenters", js.Array(value :_*))
      
      @scala.inline
      def setUpperBound(value: Double): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait T1 extends StObject {
    
    var t1: Double = js.native
    
    var t2: Double = js.native
  }
  object T1 {
    
    @scala.inline
    def apply(t1: Double, t2: Double): T1 = {
      val __obj = js.Dynamic.literal(t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any])
      __obj.asInstanceOf[T1]
    }
    
    @scala.inline
    implicit class T1MutableBuilder[Self <: T1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setT1(value: Double): Self = StObject.set(x, "t1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT2(value: Double): Self = StObject.set(x, "t2", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}

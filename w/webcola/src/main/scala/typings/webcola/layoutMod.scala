package typings.webcola

import typings.webcola.anon.X
import typings.webcola.linklengthsMod.LinkLengthAccessor
import typings.webcola.rectangleMod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("webcola/dist/src/layout", "EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventType & Double] = js.native
    
    @js.native
    sealed trait end
      extends StObject
         with EventType
    /* 2 */ val end: typings.webcola.layoutMod.EventType.end & Double = js.native
    
    @js.native
    sealed trait start
      extends StObject
         with EventType
    /* 0 */ val start: typings.webcola.layoutMod.EventType.start & Double = js.native
    
    @js.native
    sealed trait tick
      extends StObject
         with EventType
    /* 1 */ val tick: typings.webcola.layoutMod.EventType.tick & Double = js.native
  }
  
  @JSImport("webcola/dist/src/layout", "Layout")
  @js.native
  class Layout () extends StObject {
    
    var _alpha: js.Any = js.native
    
    var _avoidOverlaps: js.Any = js.native
    
    var _canvasSize: js.Any = js.native
    
    var _constraints: js.Any = js.native
    
    var _defaultNodeSize: js.Any = js.native
    
    var _descent: js.Any = js.native
    
    var _directedLinkConstraints: js.Any = js.native
    
    var _distanceMatrix: js.Any = js.native
    
    var _groupCompactness: js.Any = js.native
    
    var _groups: js.Any = js.native
    
    var _handleDisconnected: js.Any = js.native
    
    var _lastStress: js.Any = js.native
    
    var _linkDistance: js.Any = js.native
    
    var _linkLengthCalculator: js.Any = js.native
    
    var _linkType: js.Any = js.native
    
    var _links: js.Any = js.native
    
    var _nodes: js.Any = js.native
    
    var _rootGroup: js.Any = js.native
    
    var _running: js.Any = js.native
    
    var _threshold: js.Any = js.native
    
    var _visibilityGraph: js.Any = js.native
    
    def alpha(): Double = js.native
    def alpha(x: Double): this.type = js.native
    
    def avoidOverlaps(): Boolean = js.native
    def avoidOverlaps(v: Boolean): this.type = js.native
    
    def constraints(): js.Array[js.Any] = js.native
    def constraints(c: js.Array[js.Any]): this.type = js.native
    
    def convergenceThreshold(): Double = js.native
    def convergenceThreshold(x: Double): this.type = js.native
    
    def defaultNodeSize(): Double = js.native
    def defaultNodeSize(x: Double): this.type = js.native
    
    def distanceMatrix(): js.Array[js.Array[Double]] = js.native
    def distanceMatrix(d: js.Array[js.Array[Double]]): this.type = js.native
    
    var event: js.Any = js.native
    
    def flowLayout(axis: String, minSeparation: js.Function1[/* t */ js.Any, Double]): this.type = js.native
    def flowLayout(axis: String, minSeparation: Double): this.type = js.native
    
    def getLinkLength(link: Link[Node | Double]): Double = js.native
    
    def getLinkType(link: Link[Node | Double]): Double = js.native
    
    def groupCompactness(): Double = js.native
    def groupCompactness(x: Double): this.type = js.native
    
    def groups(): js.Array[Group] = js.native
    def groups(x: js.Array[Group]): this.type = js.native
    
    def handleDisconnected(): Boolean = js.native
    def handleDisconnected(v: Boolean): this.type = js.native
    
    var initialLayout: js.Any = js.native
    
    def jaccardLinkLengths(idealLength: Double): this.type = js.native
    def jaccardLinkLengths(idealLength: Double, w: Double): this.type = js.native
    
    /* protected */ def kick(): Unit = js.native
    
    var linkAccessor: LinkLengthTypeAccessor = js.native
    
    def linkDistance(): Double = js.native
    def linkDistance(x: Double): this.type = js.native
    def linkDistance(x: LinkNumericPropertyAccessor): this.type = js.native
    @JSName("linkDistance")
    def linkDistance_LinkNumericPropertyAccessor(): LinkNumericPropertyAccessor = js.native
    
    def linkType(f: js.Function): this.type = js.native
    def linkType(f: Double): this.type = js.native
    
    def links(): js.Array[Link[Node | Double]] = js.native
    def links(x: js.Array[Link[Node | Double]]): this.type = js.native
    
    def nodes(): js.Array[Node] = js.native
    def nodes(v: js.Array[InputNode]): this.type = js.native
    
    def on(e: String, listener: js.Function1[/* event */ js.UndefOr[Event], Unit]): this.type = js.native
    def on(e: EventType, listener: js.Function1[/* event */ js.UndefOr[Event], Unit]): this.type = js.native
    
    def powerGraphGroups(f: js.Function): this.type = js.native
    
    def prepareEdgeRouting(): Unit = js.native
    def prepareEdgeRouting(nodeMargin: Double): Unit = js.native
    
    def resume(): this.type = js.native
    
    def routeEdge(edge: js.Any, ah: Double, draw: js.Any): js.Array[js.Any] = js.native
    
    var separateOverlappingComponents: js.Any = js.native
    
    def size(): js.Array[Double] = js.native
    def size(x: js.Array[Double]): this.type = js.native
    
    def start(
      initialUnconstrainedIterations: js.UndefOr[Double],
      initialUserConstraintIterations: js.UndefOr[Double],
      initialAllConstraintsIterations: js.UndefOr[Double],
      gridSnapIterations: js.UndefOr[Double],
      keepRunning: js.UndefOr[Boolean],
      centerGraph: js.UndefOr[Boolean]
    ): this.type = js.native
    
    def stop(): this.type = js.native
    
    def symmetricDiffLinkLengths(idealLength: Double): this.type = js.native
    def symmetricDiffLinkLengths(idealLength: Double, w: Double): this.type = js.native
    
    /* protected */ def tick(): Boolean = js.native
    
    /* protected */ def trigger(e: Event): Unit = js.native
    
    var updateNodePositions: js.Any = js.native
  }
  /* static members */
  object Layout {
    
    @JSImport("webcola/dist/src/layout", "Layout")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def drag(d: Group, position: X): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drag")(d.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def drag(d: Node, position: X): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drag")(d.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def dragEnd(d: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragEnd")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def dragOrigin(d: Group): X = ^.asInstanceOf[js.Dynamic].applyDynamic("dragOrigin")(d.asInstanceOf[js.Any]).asInstanceOf[X]
    @scala.inline
    def dragOrigin(d: Node): X = ^.asInstanceOf[js.Dynamic].applyDynamic("dragOrigin")(d.asInstanceOf[js.Any]).asInstanceOf[X]
    
    @scala.inline
    def dragStart(d: Group): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragStart")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def dragStart(d: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragStart")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def getSourceIndex(e: Link[Node | Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceIndex")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def getTargetIndex(e: Link[Node | Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetIndex")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def linkId(e: Link[Node | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("linkId")(e.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def mouseOut(d: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOut")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def mouseOver(d: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOver")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setLinkLength(link: Link[Node | Double], length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLinkLength")(link.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("webcola/dist/src/layout", "Layout.stopNode")
    @js.native
    def stopNode: js.Any = js.native
    @scala.inline
    def stopNode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopNode")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/layout", "Layout.storeOffset")
    @js.native
    def storeOffset: js.Any = js.native
    @scala.inline
    def storeOffset_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storeOffset")(x.asInstanceOf[js.Any])
  }
  
  trait Event extends StObject {
    
    var alpha: Double
    
    var listener: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stress: js.UndefOr[Double] = js.undefined
    
    var `type`: EventType
  }
  object Event {
    
    @scala.inline
    def apply(alpha: Double, `type`: EventType): Event = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListener(value: () => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      @scala.inline
      def setStress(value: Double): Self = StObject.set(x, "stress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStressUndefined: Self = StObject.set(x, "stress", js.undefined)
      
      @scala.inline
      def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Group extends StObject {
    
    var bounds: js.UndefOr[Rectangle] = js.undefined
    
    var groups: js.UndefOr[js.Array[Group]] = js.undefined
    
    var leaves: js.UndefOr[js.Array[Node]] = js.undefined
    
    var padding: Double
  }
  object Group {
    
    @scala.inline
    def apply(padding: Double): Group = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setGroups(value: js.Array[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: Group*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setLeaves(value: js.Array[Node]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavesUndefined: Self = StObject.set(x, "leaves", js.undefined)
      
      @scala.inline
      def setLeavesVarargs(value: Node*): Self = StObject.set(x, "leaves", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputNode extends StObject {
    
    var fixed: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object InputNode {
    
    @scala.inline
    def apply(): InputNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputNode]
    }
    
    @scala.inline
    implicit class InputNodeMutableBuilder[Self <: InputNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixed(value: Double): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Link[NodeRefType] extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var source: NodeRefType
    
    var target: NodeRefType
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object Link {
    
    @scala.inline
    def apply[NodeRefType](source: NodeRefType, target: NodeRefType): Link[NodeRefType] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link[NodeRefType]]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link[?], NodeRefType] (val x: Self & Link[NodeRefType]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setSource(value: NodeRefType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: NodeRefType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait LinkLengthTypeAccessor
    extends StObject
       with LinkLengthAccessor[Link[Node | Double]] {
    
    def getType(t: Link[Node | Double]): Double
    @JSName("getType")
    var getType_Original: LinkNumericPropertyAccessor
  }
  object LinkLengthTypeAccessor {
    
    @scala.inline
    def apply(
      getSourceIndex: Link[Node | Double] => Double,
      getTargetIndex: Link[Node | Double] => Double,
      getType: /* t */ Link[Node | Double] => Double,
      setLength: (Link[Node | Double], Double) => Unit
    ): LinkLengthTypeAccessor = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), getType = js.Any.fromFunction1(getType), setLength = js.Any.fromFunction2(setLength))
      __obj.asInstanceOf[LinkLengthTypeAccessor]
    }
    
    @scala.inline
    implicit class LinkLengthTypeAccessorMutableBuilder[Self <: LinkLengthTypeAccessor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetType(value: /* t */ Link[Node | Double] => Double): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    }
  }
  
  type LinkNumericPropertyAccessor = js.Function1[/* t */ Link[Node | Double], Double]
  
  trait Node
    extends StObject
       with InputNode {
    
    @JSName("x")
    var x_Node: Double
    
    @JSName("y")
    var y_Node: Double
  }
  object Node {
    
    @scala.inline
    def apply(x: Double, y: Double): Node = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}

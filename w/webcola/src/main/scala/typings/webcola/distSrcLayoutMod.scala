package typings.webcola

import typings.webcola.anon.X
import typings.webcola.distSrcLinklengthsMod.LinkLengthAccessor
import typings.webcola.distSrcRectangleMod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLayoutMod {
  
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
    /* 2 */ val end: typings.webcola.distSrcLayoutMod.EventType.end & Double = js.native
    
    @js.native
    sealed trait start
      extends StObject
         with EventType
    /* 0 */ val start: typings.webcola.distSrcLayoutMod.EventType.start & Double = js.native
    
    @js.native
    sealed trait tick
      extends StObject
         with EventType
    /* 1 */ val tick: typings.webcola.distSrcLayoutMod.EventType.tick & Double = js.native
  }
  
  @JSImport("webcola/dist/src/layout", "Layout")
  @js.native
  open class Layout () extends StObject {
    
    /* private */ var _alpha: Any = js.native
    
    /* private */ var _avoidOverlaps: Any = js.native
    
    /* private */ var _canvasSize: Any = js.native
    
    /* private */ var _constraints: Any = js.native
    
    /* private */ var _defaultNodeSize: Any = js.native
    
    /* private */ var _descent: Any = js.native
    
    /* private */ var _directedLinkConstraints: Any = js.native
    
    /* private */ var _distanceMatrix: Any = js.native
    
    /* private */ var _groupCompactness: Any = js.native
    
    /* private */ var _groups: Any = js.native
    
    /* private */ var _handleDisconnected: Any = js.native
    
    /* private */ var _lastStress: Any = js.native
    
    /* private */ var _linkDistance: Any = js.native
    
    /* private */ var _linkLengthCalculator: Any = js.native
    
    /* private */ var _linkType: Any = js.native
    
    /* private */ var _links: Any = js.native
    
    /* private */ var _nodes: Any = js.native
    
    /* private */ var _rootGroup: Any = js.native
    
    /* private */ var _running: Any = js.native
    
    /* private */ var _threshold: Any = js.native
    
    /* private */ var _visibilityGraph: Any = js.native
    
    def alpha(): Double = js.native
    def alpha(x: Double): this.type = js.native
    
    def avoidOverlaps(): Boolean = js.native
    def avoidOverlaps(v: Boolean): this.type = js.native
    
    def constraints(): js.Array[Any] = js.native
    def constraints(c: js.Array[Any]): this.type = js.native
    
    def convergenceThreshold(): Double = js.native
    def convergenceThreshold(x: Double): this.type = js.native
    
    def defaultNodeSize(): Double = js.native
    def defaultNodeSize(x: Double): this.type = js.native
    
    def distanceMatrix(): js.Array[js.Array[Double]] = js.native
    def distanceMatrix(d: js.Array[js.Array[Double]]): this.type = js.native
    
    /* protected */ var event: Any = js.native
    
    def flowLayout(axis: String, minSeparation: js.Function1[/* t */ Any, Double]): this.type = js.native
    def flowLayout(axis: String, minSeparation: Double): this.type = js.native
    
    def getLinkLength(link: Link[Node | Double]): Double = js.native
    
    def getLinkType(link: Link[Node | Double]): Double = js.native
    
    def groupCompactness(): Double = js.native
    def groupCompactness(x: Double): this.type = js.native
    
    def groups(): js.Array[Group] = js.native
    def groups(x: js.Array[Group]): this.type = js.native
    
    def handleDisconnected(): Boolean = js.native
    def handleDisconnected(v: Boolean): this.type = js.native
    
    /* private */ var initialLayout: Any = js.native
    
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
    
    def routeEdge(edge: Any, ah: Double, draw: Any): js.Array[Any] = js.native
    
    /* private */ var separateOverlappingComponents: Any = js.native
    
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
    
    /* private */ var updateNodePositions: Any = js.native
  }
  /* static members */
  object Layout {
    
    @JSImport("webcola/dist/src/layout", "Layout")
    @js.native
    val ^ : js.Any = js.native
    
    inline def drag(d: Group, position: X): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drag")(d.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drag(d: Node, position: X): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drag")(d.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dragEnd(d: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragEnd")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def dragOrigin(d: Group): X = ^.asInstanceOf[js.Dynamic].applyDynamic("dragOrigin")(d.asInstanceOf[js.Any]).asInstanceOf[X]
    inline def dragOrigin(d: Node): X = ^.asInstanceOf[js.Dynamic].applyDynamic("dragOrigin")(d.asInstanceOf[js.Any]).asInstanceOf[X]
    
    inline def dragStart(d: Group): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragStart")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def dragStart(d: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragStart")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getSourceIndex(e: Link[Node | Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceIndex")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getTargetIndex(e: Link[Node | Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetIndex")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def linkId(e: Link[Node | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("linkId")(e.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def mouseOut(d: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOut")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def mouseOver(d: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOver")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setLinkLength(link: Link[Node | Double], length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLinkLength")(link.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("webcola/dist/src/layout", "Layout.stopNode")
    @js.native
    def stopNode: Any = js.native
    inline def stopNode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopNode")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/layout", "Layout.storeOffset")
    @js.native
    def storeOffset: Any = js.native
    inline def storeOffset_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storeOffset")(x.asInstanceOf[js.Any])
  }
  
  trait Event extends StObject {
    
    var alpha: Double
    
    var listener: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stress: js.UndefOr[Double] = js.undefined
    
    var `type`: EventType
  }
  object Event {
    
    inline def apply(alpha: Double, `type`: EventType): Event = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setListener(value: () => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction0(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setStress(value: Double): Self = StObject.set(x, "stress", value.asInstanceOf[js.Any])
      
      inline def setStressUndefined: Self = StObject.set(x, "stress", js.undefined)
      
      inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Group extends StObject {
    
    var bounds: js.UndefOr[Rectangle] = js.undefined
    
    var groups: js.UndefOr[js.Array[Group]] = js.undefined
    
    var leaves: js.UndefOr[js.Array[Node]] = js.undefined
    
    var padding: Double
  }
  object Group {
    
    inline def apply(padding: Double): Group = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: Rectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setGroups(value: js.Array[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setLeaves(value: js.Array[Node]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
      
      inline def setLeavesUndefined: Self = StObject.set(x, "leaves", js.undefined)
      
      inline def setLeavesVarargs(value: Node*): Self = StObject.set(x, "leaves", js.Array(value*))
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
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
    
    inline def apply(): InputNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputNode] (val x: Self) extends AnyVal {
      
      inline def setFixed(value: Double): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Link[NodeRefType] extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var source: NodeRefType
    
    var target: NodeRefType
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object Link {
    
    inline def apply[NodeRefType](source: NodeRefType, target: NodeRefType): Link[NodeRefType] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link[NodeRefType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link[?], NodeRefType] (val x: Self & Link[NodeRefType]) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setSource(value: NodeRefType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: NodeRefType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
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
    
    inline def apply(
      getSourceIndex: Link[Node | Double] => Double,
      getTargetIndex: Link[Node | Double] => Double,
      getType: /* t */ Link[Node | Double] => Double,
      setLength: (Link[Node | Double], Double) => Unit
    ): LinkLengthTypeAccessor = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), getType = js.Any.fromFunction1(getType), setLength = js.Any.fromFunction2(setLength))
      __obj.asInstanceOf[LinkLengthTypeAccessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkLengthTypeAccessor] (val x: Self) extends AnyVal {
      
      inline def setGetType(value: /* t */ Link[Node | Double] => Double): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
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
    
    inline def apply(x: Double, y: Double): Node = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}

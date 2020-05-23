package typings.webcola.layoutMod

import typings.webcola.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/layout", "Layout")
@js.native
class Layout () extends js.Object {
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
  var event: js.Any = js.native
  var initialLayout: js.Any = js.native
  var linkAccessor: LinkLengthTypeAccessor = js.native
  var separateOverlappingComponents: js.Any = js.native
  var updateNodePositions: js.Any = js.native
  def alpha(): Double = js.native
  def alpha(x: Double): this.type = js.native
  def avoidOverlaps(): Boolean = js.native
  def avoidOverlaps(v: Boolean): this.type = js.native
  def constraints(): js.Array[_] = js.native
  def constraints(c: js.Array[_]): this.type = js.native
  def convergenceThreshold(): Double = js.native
  def convergenceThreshold(x: Double): this.type = js.native
  def defaultNodeSize(): Double = js.native
  def defaultNodeSize(x: Double): this.type = js.native
  def distanceMatrix(): js.Array[js.Array[Double]] = js.native
  def distanceMatrix(d: js.Array[js.Array[Double]]): this.type = js.native
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
  def jaccardLinkLengths(idealLength: Double): this.type = js.native
  def jaccardLinkLengths(idealLength: Double, w: Double): this.type = js.native
  /* protected */ def kick(): Unit = js.native
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
  def routeEdge(edge: js.Any, ah: Double, draw: js.Any): js.Array[_] = js.native
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
}

/* static members */
@JSImport("webcola/dist/src/layout", "Layout")
@js.native
object Layout extends js.Object {
  var stopNode: js.Any = js.native
  var storeOffset: js.Any = js.native
  def drag(d: Group, position: X): Unit = js.native
  def drag(d: Node, position: X): Unit = js.native
  def dragEnd(d: js.Any): Unit = js.native
  def dragOrigin(d: Group): X = js.native
  def dragOrigin(d: Node): X = js.native
  def dragStart(d: Group): Unit = js.native
  def dragStart(d: Node): Unit = js.native
  def getSourceIndex(e: Link[Node | Double]): Double = js.native
  def getTargetIndex(e: Link[Node | Double]): Double = js.native
  def linkId(e: Link[Node | Double]): String = js.native
  def mouseOut(d: js.Any): Unit = js.native
  def mouseOver(d: js.Any): Unit = js.native
  def setLinkLength(link: Link[Node | Double], length: Double): Unit = js.native
}


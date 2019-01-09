package typings
package webcolaLib.distSrcLayoutMod

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
  var linkAccessor: LinkLengthTypeAccessor = js.native
  def alpha(): scala.Double = js.native
  def alpha(x: scala.Double): this.type = js.native
  def avoidOverlaps(): scala.Boolean = js.native
  def avoidOverlaps(v: scala.Boolean): this.type = js.native
  def constraints(): js.Array[_] = js.native
  def constraints(c: js.Array[_]): this.type = js.native
  def convergenceThreshold(): scala.Double = js.native
  def convergenceThreshold(x: scala.Double): this.type = js.native
  def defaultNodeSize(): scala.Double = js.native
  def defaultNodeSize(x: scala.Double): this.type = js.native
  def distanceMatrix(): js.Array[js.Array[scala.Double]] = js.native
  def distanceMatrix(d: js.Array[js.Array[scala.Double]]): this.type = js.native
  def flowLayout(axis: java.lang.String, minSeparation: js.Function1[/* t */ js.Any, scala.Double]): this.type = js.native
  def flowLayout(axis: java.lang.String, minSeparation: scala.Double): this.type = js.native
  def getLinkLength(link: Link[Node | scala.Double]): scala.Double = js.native
  def getLinkType(link: Link[Node | scala.Double]): scala.Double = js.native
  def groupCompactness(): scala.Double = js.native
  def groupCompactness(x: scala.Double): this.type = js.native
  def groups(): js.Array[Group] = js.native
  def groups(x: js.Array[Group]): this.type = js.native
  def handleDisconnected(): scala.Boolean = js.native
  def handleDisconnected(v: scala.Boolean): this.type = js.native
  /* private */ def initialLayout(iterations: js.Any, x: js.Any, y: js.Any): js.Any = js.native
  def jaccardLinkLengths(idealLength: scala.Double): this.type = js.native
  def jaccardLinkLengths(idealLength: scala.Double, w: scala.Double): this.type = js.native
  /* protected */ def kick(): scala.Unit = js.native
  def linkDistance(): LinkNumericPropertyAccessor = js.native
  def linkDistance(x: scala.Double): this.type = js.native
  def linkDistance(x: LinkNumericPropertyAccessor): this.type = js.native
  @JSName("linkDistance")
  def linkDistance_Double(): scala.Double = js.native
  def linkType(f: js.Function): this.type = js.native
  def linkType(f: scala.Double): this.type = js.native
  def links(): js.Array[Link[Node | scala.Double]] = js.native
  def links(x: js.Array[Link[Node | scala.Double]]): this.type = js.native
  def nodes(): js.Array[Node] = js.native
  def nodes(v: js.Array[InputNode]): this.type = js.native
  def on(e: java.lang.String, listener: js.Function1[/* event */ js.UndefOr[Event], scala.Unit]): this.type = js.native
  def on(e: EventType, listener: js.Function1[/* event */ js.UndefOr[Event], scala.Unit]): this.type = js.native
  def powerGraphGroups(f: js.Function): this.type = js.native
  def prepareEdgeRouting(): scala.Unit = js.native
  def prepareEdgeRouting(nodeMargin: scala.Double): scala.Unit = js.native
  def resume(): this.type = js.native
  def routeEdge(edge: js.Any, ah: scala.Double, draw: js.Any): js.Array[_] = js.native
  /* private */ def separateOverlappingComponents(width: js.Any, height: js.Any): js.Any = js.native
  def size(): js.Array[scala.Double] = js.native
  def size(x: js.Array[scala.Double]): this.type = js.native
  def start(): this.type = js.native
  def start(initialUnconstrainedIterations: scala.Double): this.type = js.native
  def start(initialUnconstrainedIterations: scala.Double, initialUserConstraintIterations: scala.Double): this.type = js.native
  def start(
    initialUnconstrainedIterations: scala.Double,
    initialUserConstraintIterations: scala.Double,
    initialAllConstraintsIterations: scala.Double
  ): this.type = js.native
  def start(
    initialUnconstrainedIterations: scala.Double,
    initialUserConstraintIterations: scala.Double,
    initialAllConstraintsIterations: scala.Double,
    gridSnapIterations: scala.Double
  ): this.type = js.native
  def start(
    initialUnconstrainedIterations: scala.Double,
    initialUserConstraintIterations: scala.Double,
    initialAllConstraintsIterations: scala.Double,
    gridSnapIterations: scala.Double,
    keepRunning: scala.Boolean
  ): this.type = js.native
  def stop(): this.type = js.native
  def symmetricDiffLinkLengths(idealLength: scala.Double): this.type = js.native
  def symmetricDiffLinkLengths(idealLength: scala.Double, w: scala.Double): this.type = js.native
  /* protected */ def tick(): scala.Boolean = js.native
  /* protected */ def trigger(e: Event): scala.Unit = js.native
  /* private */ def updateNodePositions(): js.Any = js.native
}

@JSImport("webcola/dist/src/layout", "Layout")
@js.native
object Layout extends js.Object {
  def drag(d: webcolaLib.distSrcLayoutMod.Group, position: webcolaLib.Anon_X): scala.Unit = js.native
  def drag(d: webcolaLib.distSrcLayoutMod.Node, position: webcolaLib.Anon_X): scala.Unit = js.native
  def dragEnd(d: js.Any): scala.Unit = js.native
  def dragOrigin(d: webcolaLib.distSrcLayoutMod.Group): webcolaLib.Anon_X = js.native
  def dragOrigin(d: webcolaLib.distSrcLayoutMod.Node): webcolaLib.Anon_X = js.native
  def dragStart(d: webcolaLib.distSrcLayoutMod.Group): scala.Unit = js.native
  def dragStart(d: webcolaLib.distSrcLayoutMod.Node): scala.Unit = js.native
  def getSourceIndex(e: webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node | scala.Double]): scala.Double = js.native
  def getTargetIndex(e: webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node | scala.Double]): scala.Double = js.native
  def linkId(e: webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node | scala.Double]): java.lang.String = js.native
  def mouseOut(d: js.Any): scala.Unit = js.native
  def mouseOver(d: js.Any): scala.Unit = js.native
  def setLinkLength(
    link: webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node | scala.Double],
    length: scala.Double
  ): scala.Unit = js.native
  /* private */ def stopNode(v: js.Any): js.Any = js.native
  /* private */ def storeOffset(d: js.Any, origin: js.Any): js.Any = js.native
}


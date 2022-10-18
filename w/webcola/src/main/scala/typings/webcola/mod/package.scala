package typings.webcola.mod

import typings.webcola.anon.ArrowStart
import typings.webcola.anon.Cola
import typings.webcola.anon.DesiredCenter
import typings.webcola.anon.Groups
import typings.webcola.anon.Links
import typings.webcola.anon.LowerBound
import typings.webcola.anon.T1
import typings.webcola.anon.X
import typings.webcola.distSrcD3adaptorMod.D3v3Context
import typings.webcola.distSrcD3adaptorMod.ID3StyleLayoutAdaptor
import typings.webcola.distSrcD3v4adaptorMod.D3Context
import typings.webcola.distSrcLinklengthsMod.IConstraint
import typings.webcola.distSrcLinklengthsMod.LinkAccessor
import typings.webcola.distSrcLinklengthsMod.LinkLengthAccessor
import typings.webcola.distSrcLinklengthsMod.LinkSepAccessor
import typings.webcola.distSrcPowergraphMod.LinkTypeAccessor
import typings.webcola.distSrcRectangleMod.ProjectionGroup
import typings.webcola.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ConvexHull(S: js.Array[typings.webcola.distSrcGeomMod.Point]): js.Array[typings.webcola.distSrcGeomMod.Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvexHull")(S.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.webcola.distSrcGeomMod.Point]]

inline def LLtangentPolyPolyC(
  V: js.Array[typings.webcola.distSrcGeomMod.Point],
  W: js.Array[typings.webcola.distSrcGeomMod.Point]
): T1 = (^.asInstanceOf[js.Dynamic].applyDynamic("LLtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[T1]

inline def LRtangentPolyPolyC(
  V: js.Array[typings.webcola.distSrcGeomMod.Point],
  W: js.Array[typings.webcola.distSrcGeomMod.Point]
): T1 = (^.asInstanceOf[js.Dynamic].applyDynamic("LRtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[T1]

inline def RLtangentPolyPolyC(
  V: js.Array[typings.webcola.distSrcGeomMod.Point],
  W: js.Array[typings.webcola.distSrcGeomMod.Point]
): T1 = (^.asInstanceOf[js.Dynamic].applyDynamic("RLtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[T1]

inline def RRtangentPolyPolyC(
  V: js.Array[typings.webcola.distSrcGeomMod.Point],
  W: js.Array[typings.webcola.distSrcGeomMod.Point]
): T1 = (^.asInstanceOf[js.Dynamic].applyDynamic("RRtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[T1]

inline def adaptor(options: Any): typings.webcola.distSrcAdaptorMod.LayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(options.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.distSrcAdaptorMod.LayoutAdaptor]

inline def applyPacking(graphs: js.Array[Any], w: Any, h: Any, node_size: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyPacking(graphs: js.Array[Any], w: Any, h: Any, node_size: Any, desired_ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyPacking(graphs: js.Array[Any], w: Any, h: Any, node_size: Any, desired_ratio: Double, centerGraph: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any], centerGraph.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def applyPacking(graphs: js.Array[Any], w: Any, h: Any, node_size: Any, desired_ratio: Unit, centerGraph: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any], centerGraph.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def clockwiseRadialSweep(
  p: typings.webcola.distSrcGeomMod.Point,
  P: js.Array[typings.webcola.distSrcGeomMod.Point],
  f: js.Function1[/* p */ typings.webcola.distSrcGeomMod.Point, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clockwiseRadialSweep")(p.asInstanceOf[js.Any], P.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def computeGroupBounds(g: ProjectionGroup): typings.webcola.distSrcRectangleMod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("computeGroupBounds")(g.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.distSrcRectangleMod.Rectangle]

inline def d3adaptor(): typings.webcola.distSrcLayoutMod.Layout & ID3StyleLayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")().asInstanceOf[typings.webcola.distSrcLayoutMod.Layout & ID3StyleLayoutAdaptor]
inline def d3adaptor(d3Context: D3v3Context): typings.webcola.distSrcLayoutMod.Layout & ID3StyleLayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")(d3Context.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.distSrcLayoutMod.Layout & ID3StyleLayoutAdaptor]
inline def d3adaptor(d3Context: D3Context): typings.webcola.distSrcLayoutMod.Layout & ID3StyleLayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")(d3Context.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.distSrcLayoutMod.Layout & ID3StyleLayoutAdaptor]

inline def generateDirectedEdgeConstraints[Link](n: Double, links: js.Array[Link], axis: String, la: LinkSepAccessor[Link]): js.Array[IConstraint] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDirectedEdgeConstraints")(n.asInstanceOf[js.Any], links.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[IConstraint]]

inline def generateXConstraints(
  rs: js.Array[typings.webcola.distSrcRectangleMod.Rectangle],
  vars: js.Array[typings.webcola.distSrcVpscMod.Variable]
): js.Array[typings.webcola.distSrcVpscMod.Constraint] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateXConstraints")(rs.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.webcola.distSrcVpscMod.Constraint]]

inline def generateXGroupConstraints(root: ProjectionGroup): js.Array[typings.webcola.distSrcVpscMod.Constraint] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateXGroupConstraints")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.webcola.distSrcVpscMod.Constraint]]

inline def generateYConstraints(
  rs: js.Array[typings.webcola.distSrcRectangleMod.Rectangle],
  vars: js.Array[typings.webcola.distSrcVpscMod.Variable]
): js.Array[typings.webcola.distSrcVpscMod.Constraint] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateYConstraints")(rs.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.webcola.distSrcVpscMod.Constraint]]

inline def generateYGroupConstraints(root: ProjectionGroup): js.Array[typings.webcola.distSrcVpscMod.Constraint] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateYGroupConstraints")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.webcola.distSrcVpscMod.Constraint]]

inline def getGroups[Link](nodes: js.Array[Any], links: js.Array[Link], la: LinkTypeAccessor[Link]): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroups")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[Groups]
inline def getGroups[Link](nodes: js.Array[Any], links: js.Array[Link], la: LinkTypeAccessor[Link], rootGroup: js.Array[Any]): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroups")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], rootGroup.asInstanceOf[js.Any])).asInstanceOf[Groups]

inline def gridify(pgLayout: Any, nudgeGap: Double, margin: Double, groupMargin: Double): js.Array[js.Array[js.Array[typings.webcola.distSrcGeomMod.Point]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("gridify")(pgLayout.asInstanceOf[js.Any], nudgeGap.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], groupMargin.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Array[typings.webcola.distSrcGeomMod.Point]]]]

inline def isLeft(
  P0: typings.webcola.distSrcGeomMod.Point,
  P1: typings.webcola.distSrcGeomMod.Point,
  P2: typings.webcola.distSrcGeomMod.Point
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("isLeft")(P0.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def makeEdgeBetween(
  source: typings.webcola.distSrcRectangleMod.Rectangle,
  target: typings.webcola.distSrcRectangleMod.Rectangle,
  ah: Double
): ArrowStart = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEdgeBetween")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ah.asInstanceOf[js.Any])).asInstanceOf[ArrowStart]

inline def makeEdgeTo(s: X, target: typings.webcola.distSrcRectangleMod.Rectangle, ah: Double): typings.webcola.distSrcGeomMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEdgeTo")(s.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ah.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.distSrcGeomMod.Point]

inline def polysOverlap(
  p: js.Array[typings.webcola.distSrcGeomMod.Point],
  q: js.Array[typings.webcola.distSrcGeomMod.Point]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polysOverlap")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def powerGraphGridLayout(graph: Links, size: js.Array[Double], grouppadding: Double): Cola = (^.asInstanceOf[js.Dynamic].applyDynamic("powerGraphGridLayout")(graph.asInstanceOf[js.Any], size.asInstanceOf[js.Any], grouppadding.asInstanceOf[js.Any])).asInstanceOf[Cola]

inline def removeOverlapInOneDimension(spans: js.Array[DesiredCenter]): LowerBound = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any]).asInstanceOf[LowerBound]
inline def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Double): LowerBound = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any])).asInstanceOf[LowerBound]
inline def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Double, upperBound: Double): LowerBound = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[LowerBound]
inline def removeOverlapInOneDimension(spans: js.Array[DesiredCenter], lowerBound: Unit, upperBound: Double): LowerBound = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[LowerBound]

inline def removeOverlaps(rs: js.Array[typings.webcola.distSrcRectangleMod.Rectangle]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlaps")(rs.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def separateGraphs(nodes: Any, links: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("separateGraphs")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def stronglyConnectedComponents[Link](numVertices: Double, edges: js.Array[Link], la: LinkAccessor[Link]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stronglyConnectedComponents")(numVertices.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]

inline def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def tangentPolyPolyC(
  V: js.Array[typings.webcola.distSrcGeomMod.Point],
  W: js.Array[typings.webcola.distSrcGeomMod.Point],
  t1: js.Function2[
  /* a */ typings.webcola.distSrcGeomMod.Point, 
  /* b */ js.Array[typings.webcola.distSrcGeomMod.Point], 
  Double
],
  t2: js.Function2[
  /* a */ typings.webcola.distSrcGeomMod.Point, 
  /* b */ js.Array[typings.webcola.distSrcGeomMod.Point], 
  Double
],
  cmp1: js.Function3[
  /* a */ typings.webcola.distSrcGeomMod.Point, 
  /* b */ typings.webcola.distSrcGeomMod.Point, 
  /* c */ typings.webcola.distSrcGeomMod.Point, 
  Boolean
],
  cmp2: js.Function3[
  /* a */ typings.webcola.distSrcGeomMod.Point, 
  /* b */ typings.webcola.distSrcGeomMod.Point, 
  /* c */ typings.webcola.distSrcGeomMod.Point, 
  Boolean
]
): T1 = (^.asInstanceOf[js.Dynamic].applyDynamic("tangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], cmp1.asInstanceOf[js.Any], cmp2.asInstanceOf[js.Any])).asInstanceOf[T1]

inline def tangents(
  V: js.Array[typings.webcola.distSrcGeomMod.Point],
  W: js.Array[typings.webcola.distSrcGeomMod.Point]
): typings.webcola.distSrcGeomMod.BiTangents = (^.asInstanceOf[js.Dynamic].applyDynamic("tangents")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.distSrcGeomMod.BiTangents]

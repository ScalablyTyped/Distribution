package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ConvexHull(S: js.Array[typings.webcola.geomMod.Point]): js.Array[typings.webcola.geomMod.Point] = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ConvexHull")(S.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.webcola.geomMod.Point]]

inline def LLtangentPolyPolyC(V: js.Array[typings.webcola.geomMod.Point], W: js.Array[typings.webcola.geomMod.Point]): typings.webcola.anon.T1 = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("LLtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.T1]

inline def LRtangentPolyPolyC(V: js.Array[typings.webcola.geomMod.Point], W: js.Array[typings.webcola.geomMod.Point]): typings.webcola.anon.T1 = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("LRtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.T1]

inline def RLtangentPolyPolyC(V: js.Array[typings.webcola.geomMod.Point], W: js.Array[typings.webcola.geomMod.Point]): typings.webcola.anon.T1 = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("RLtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.T1]

inline def RRtangentPolyPolyC(V: js.Array[typings.webcola.geomMod.Point], W: js.Array[typings.webcola.geomMod.Point]): typings.webcola.anon.T1 = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("RRtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.T1]

inline def adaptor(options: js.Any): typings.webcola.adaptorMod.LayoutAdaptor = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(options.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.adaptorMod.LayoutAdaptor]

inline def applyPacking(graphs: js.Array[js.Any], w: js.Any, h: js.Any, node_size: js.Any): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def applyPacking(graphs: js.Array[js.Any], w: js.Any, h: js.Any, node_size: js.Any, desired_ratio: scala.Double): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def applyPacking(
  graphs: js.Array[js.Any],
  w: js.Any,
  h: js.Any,
  node_size: js.Any,
  desired_ratio: scala.Double,
  centerGraph: scala.Boolean
): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any], centerGraph.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def applyPacking(
  graphs: js.Array[js.Any],
  w: js.Any,
  h: js.Any,
  node_size: js.Any,
  desired_ratio: scala.Unit,
  centerGraph: scala.Boolean
): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any], centerGraph.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def clockwiseRadialSweep(
  p: typings.webcola.geomMod.Point,
  P: js.Array[typings.webcola.geomMod.Point],
  f: js.Function1[/* p */ typings.webcola.geomMod.Point, scala.Unit]
): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clockwiseRadialSweep")(p.asInstanceOf[js.Any], P.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def computeGroupBounds(g: typings.webcola.rectangleMod.ProjectionGroup): typings.webcola.rectangleMod.Rectangle = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("computeGroupBounds")(g.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.rectangleMod.Rectangle]

inline def d3adaptor(): typings.webcola.layoutMod.Layout & typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")().asInstanceOf[typings.webcola.layoutMod.Layout & typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor]
inline def d3adaptor(d3Context: typings.webcola.d3adaptorMod.D3v3Context): typings.webcola.layoutMod.Layout & typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")(d3Context.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.layoutMod.Layout & typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor]
inline def d3adaptor(d3Context: typings.webcola.d3v4adaptorMod.D3Context): typings.webcola.layoutMod.Layout & typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")(d3Context.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.layoutMod.Layout & typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor]

inline def generateDirectedEdgeConstraints[Link](
  n: scala.Double,
  links: js.Array[Link],
  axis: java.lang.String,
  la: typings.webcola.linklengthsMod.LinkSepAccessor[Link]
): js.Array[typings.webcola.linklengthsMod.IConstraint] = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateDirectedEdgeConstraints")(n.asInstanceOf[js.Any], links.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.webcola.linklengthsMod.IConstraint]]

inline def generateXConstraints(
  rs: js.Array[typings.webcola.rectangleMod.Rectangle],
  vars: js.Array[typings.webcola.vpscMod.Variable]
): js.Array[typings.webcola.vpscMod.Constraint] = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateXConstraints")(rs.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.webcola.vpscMod.Constraint]]

inline def generateXGroupConstraints(root: typings.webcola.rectangleMod.ProjectionGroup): js.Array[typings.webcola.vpscMod.Constraint] = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateXGroupConstraints")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.webcola.vpscMod.Constraint]]

inline def generateYConstraints(
  rs: js.Array[typings.webcola.rectangleMod.Rectangle],
  vars: js.Array[typings.webcola.vpscMod.Variable]
): js.Array[typings.webcola.vpscMod.Constraint] = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateYConstraints")(rs.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.webcola.vpscMod.Constraint]]

inline def generateYGroupConstraints(root: typings.webcola.rectangleMod.ProjectionGroup): js.Array[typings.webcola.vpscMod.Constraint] = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateYGroupConstraints")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.webcola.vpscMod.Constraint]]

inline def getGroups[Link](
  nodes: js.Array[js.Any],
  links: js.Array[Link],
  la: typings.webcola.powergraphMod.LinkTypeAccessor[Link]
): typings.webcola.anon.Groups = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getGroups")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.Groups]
inline def getGroups[Link](
  nodes: js.Array[js.Any],
  links: js.Array[Link],
  la: typings.webcola.powergraphMod.LinkTypeAccessor[Link],
  rootGroup: js.Array[js.Any]
): typings.webcola.anon.Groups = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getGroups")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], rootGroup.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.Groups]

inline def gridify(pgLayout: js.Any, nudgeGap: scala.Double, margin: scala.Double, groupMargin: scala.Double): js.Array[js.Array[js.Array[typings.webcola.geomMod.Point]]] = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gridify")(pgLayout.asInstanceOf[js.Any], nudgeGap.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], groupMargin.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Array[typings.webcola.geomMod.Point]]]]

inline def isLeft(
  P0: typings.webcola.geomMod.Point,
  P1: typings.webcola.geomMod.Point,
  P2: typings.webcola.geomMod.Point
): scala.Double = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isLeft")(P0.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def jaccardLinkLengths[Link](links: js.Array[Link], la: typings.webcola.linklengthsMod.LinkLengthAccessor[Link]): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def jaccardLinkLengths[Link](
  links: js.Array[Link],
  la: typings.webcola.linklengthsMod.LinkLengthAccessor[Link],
  w: scala.Double
): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def makeEdgeBetween(
  source: typings.webcola.rectangleMod.Rectangle,
  target: typings.webcola.rectangleMod.Rectangle,
  ah: scala.Double
): typings.webcola.anon.ArrowStart = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeEdgeBetween")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ah.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.ArrowStart]

inline def makeEdgeTo(s: typings.webcola.anon.X, target: typings.webcola.rectangleMod.Rectangle, ah: scala.Double): typings.webcola.geomMod.Point = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeEdgeTo")(s.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ah.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.geomMod.Point]

inline def polysOverlap(p: js.Array[typings.webcola.geomMod.Point], q: js.Array[typings.webcola.geomMod.Point]): scala.Boolean = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polysOverlap")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def powerGraphGridLayout(graph: typings.webcola.anon.Links, size: js.Array[scala.Double], grouppadding: scala.Double): typings.webcola.anon.Cola = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("powerGraphGridLayout")(graph.asInstanceOf[js.Any], size.asInstanceOf[js.Any], grouppadding.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.Cola]

inline def removeOverlapInOneDimension(spans: js.Array[typings.webcola.anon.DesiredCenter]): typings.webcola.anon.LowerBound = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any]).asInstanceOf[typings.webcola.anon.LowerBound]
inline def removeOverlapInOneDimension(spans: js.Array[typings.webcola.anon.DesiredCenter], lowerBound: scala.Double): typings.webcola.anon.LowerBound = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.LowerBound]
inline def removeOverlapInOneDimension(
  spans: js.Array[typings.webcola.anon.DesiredCenter],
  lowerBound: scala.Double,
  upperBound: scala.Double
): typings.webcola.anon.LowerBound = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.LowerBound]
inline def removeOverlapInOneDimension(
  spans: js.Array[typings.webcola.anon.DesiredCenter],
  lowerBound: scala.Unit,
  upperBound: scala.Double
): typings.webcola.anon.LowerBound = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.LowerBound]

inline def removeOverlaps(rs: js.Array[typings.webcola.rectangleMod.Rectangle]): scala.Unit = typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlaps")(rs.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def separateGraphs(nodes: js.Any, links: js.Any): js.Array[js.Any] = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("separateGraphs")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]

inline def stronglyConnectedComponents[Link](
  numVertices: scala.Double,
  edges: js.Array[Link],
  la: typings.webcola.linklengthsMod.LinkAccessor[Link]
): js.Array[js.Array[scala.Double]] = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stronglyConnectedComponents")(numVertices.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[scala.Double]]]

inline def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: typings.webcola.linklengthsMod.LinkLengthAccessor[Link]): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def symmetricDiffLinkLengths[Link](
  links: js.Array[Link],
  la: typings.webcola.linklengthsMod.LinkLengthAccessor[Link],
  w: scala.Double
): scala.Unit = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def tangentPolyPolyC(
  V: js.Array[typings.webcola.geomMod.Point],
  W: js.Array[typings.webcola.geomMod.Point],
  t1: js.Function2[
  /* a */ typings.webcola.geomMod.Point, 
  /* b */ js.Array[typings.webcola.geomMod.Point], 
  scala.Double
],
  t2: js.Function2[
  /* a */ typings.webcola.geomMod.Point, 
  /* b */ js.Array[typings.webcola.geomMod.Point], 
  scala.Double
],
  cmp1: js.Function3[
  /* a */ typings.webcola.geomMod.Point, 
  /* b */ typings.webcola.geomMod.Point, 
  /* c */ typings.webcola.geomMod.Point, 
  scala.Boolean
],
  cmp2: js.Function3[
  /* a */ typings.webcola.geomMod.Point, 
  /* b */ typings.webcola.geomMod.Point, 
  /* c */ typings.webcola.geomMod.Point, 
  scala.Boolean
]
): typings.webcola.anon.T1 = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], cmp1.asInstanceOf[js.Any], cmp2.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.anon.T1]

inline def tangents(V: js.Array[typings.webcola.geomMod.Point], W: js.Array[typings.webcola.geomMod.Point]): typings.webcola.geomMod.BiTangents = (typings.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tangents")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typings.webcola.geomMod.BiTangents]

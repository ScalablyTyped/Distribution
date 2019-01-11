package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ConvexHull(S: js.Array[webcolaLib.distSrcGeomMod.Point]): js.Array[webcolaLib.distSrcGeomMod.Point] = js.native
  def LLtangent_PolyPolyC(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.Anon_T1 = js.native
  def LRtangent_PolyPolyC(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.Anon_T1 = js.native
  def RLtangent_PolyPolyC(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.Anon_T1 = js.native
  def RRtangent_PolyPolyC(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.Anon_T1 = js.native
  def adaptor(options: js.Any): webcolaLib.distSrcAdaptorMod.LayoutAdaptor = js.native
  def applyPacking(graphs: js.Array[_], w: js.Any, h: js.Any, node_size: js.Any): scala.Unit = js.native
  def applyPacking(graphs: js.Array[_], w: js.Any, h: js.Any, node_size: js.Any, desired_ratio: scala.Double): scala.Unit = js.native
  def clockwiseRadialSweep(
    p: webcolaLib.distSrcGeomMod.Point,
    P: js.Array[webcolaLib.distSrcGeomMod.Point],
    f: js.Function1[/* p */ webcolaLib.distSrcGeomMod.Point, scala.Unit]
  ): scala.Unit = js.native
  def computeGroupBounds(g: webcolaLib.distSrcRectangleMod.ProjectionGroup): webcolaLib.distSrcRectangleMod.Rectangle = js.native
  def d3adaptor(): webcolaLib.distSrcLayoutMod.Layout with webcolaLib.distSrcD3adaptorMod.ID3StyleLayoutAdaptor = js.native
  def d3adaptor(d3Context: webcolaLib.distSrcD3adaptorMod.D3v3Context): webcolaLib.distSrcLayoutMod.Layout with webcolaLib.distSrcD3adaptorMod.ID3StyleLayoutAdaptor = js.native
  def d3adaptor(d3Context: webcolaLib.distSrcD3v4adaptorMod.D3Context): webcolaLib.distSrcLayoutMod.Layout with webcolaLib.distSrcD3adaptorMod.ID3StyleLayoutAdaptor = js.native
  def generateDirectedEdgeConstraints[Link](
    n: scala.Double,
    links: js.Array[Link],
    axis: java.lang.String,
    la: webcolaLib.distSrcLinklengthsMod.LinkSepAccessor[Link]
  ): js.Array[webcolaLib.distSrcLinklengthsMod.IConstraint] = js.native
  def generateXConstraints(
    rs: js.Array[webcolaLib.distSrcRectangleMod.Rectangle],
    vars: js.Array[webcolaLib.distSrcVpscMod.Variable]
  ): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateXGroupConstraints(root: webcolaLib.distSrcRectangleMod.ProjectionGroup): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateYConstraints(
    rs: js.Array[webcolaLib.distSrcRectangleMod.Rectangle],
    vars: js.Array[webcolaLib.distSrcVpscMod.Variable]
  ): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateYGroupConstraints(root: webcolaLib.distSrcRectangleMod.ProjectionGroup): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def getGroups[Link](
    nodes: js.Array[_],
    links: js.Array[Link],
    la: webcolaLib.distSrcPowergraphMod.LinkTypeAccessor[Link]
  ): webcolaLib.Anon_Groups = js.native
  def getGroups[Link](
    nodes: js.Array[_],
    links: js.Array[Link],
    la: webcolaLib.distSrcPowergraphMod.LinkTypeAccessor[Link],
    rootGroup: js.Array[_]
  ): webcolaLib.Anon_Groups = js.native
  def gridify(pgLayout: js.Any, nudgeGap: scala.Double, margin: scala.Double, groupMargin: scala.Double): js.Array[js.Array[js.Array[webcolaLib.distSrcGeomMod.Point]]] = js.native
  def isLeft(
    P0: webcolaLib.distSrcGeomMod.Point,
    P1: webcolaLib.distSrcGeomMod.Point,
    P2: webcolaLib.distSrcGeomMod.Point
  ): scala.Double = js.native
  def jaccardLinkLengths[Link](links: js.Array[Link], la: webcolaLib.distSrcLinklengthsMod.LinkLengthAccessor[Link]): scala.Unit = js.native
  def jaccardLinkLengths[Link](
    links: js.Array[Link],
    la: webcolaLib.distSrcLinklengthsMod.LinkLengthAccessor[Link],
    w: scala.Double
  ): scala.Unit = js.native
  def makeEdgeBetween(
    source: webcolaLib.distSrcRectangleMod.Rectangle,
    target: webcolaLib.distSrcRectangleMod.Rectangle,
    ah: scala.Double
  ): webcolaLib.Anon_ArrowStart = js.native
  def makeEdgeTo(s: webcolaLib.Anon_X, target: webcolaLib.distSrcRectangleMod.Rectangle, ah: scala.Double): webcolaLib.distSrcGeomMod.Point = js.native
  def polysOverlap(p: js.Array[webcolaLib.distSrcGeomMod.Point], q: js.Array[webcolaLib.distSrcGeomMod.Point]): scala.Boolean = js.native
  def powerGraphGridLayout(graph: webcolaLib.Anon_Links, size: js.Array[scala.Double], grouppadding: scala.Double): webcolaLib.Anon_Cola = js.native
  def removeOverlapInOneDimension(spans: js.Array[webcolaLib.Anon_DesiredCenter]): webcolaLib.Anon_LowerBound = js.native
  def removeOverlapInOneDimension(spans: js.Array[webcolaLib.Anon_DesiredCenter], lowerBound: scala.Double): webcolaLib.Anon_LowerBound = js.native
  def removeOverlapInOneDimension(spans: js.Array[webcolaLib.Anon_DesiredCenter], lowerBound: scala.Double, upperBound: scala.Double): webcolaLib.Anon_LowerBound = js.native
  def removeOverlaps(rs: js.Array[webcolaLib.distSrcRectangleMod.Rectangle]): scala.Unit = js.native
  def separateGraphs(nodes: js.Any, links: js.Any): js.Array[_] = js.native
  def stronglyConnectedComponents[Link](
    numVertices: scala.Double,
    edges: js.Array[Link],
    la: webcolaLib.distSrcLinklengthsMod.LinkAccessor[Link]
  ): js.Array[js.Array[scala.Double]] = js.native
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: webcolaLib.distSrcLinklengthsMod.LinkLengthAccessor[Link]): scala.Unit = js.native
  def symmetricDiffLinkLengths[Link](
    links: js.Array[Link],
    la: webcolaLib.distSrcLinklengthsMod.LinkLengthAccessor[Link],
    w: scala.Double
  ): scala.Unit = js.native
  def tangent_PolyPolyC(
    V: js.Array[webcolaLib.distSrcGeomMod.Point],
    W: js.Array[webcolaLib.distSrcGeomMod.Point],
    t1: js.Function2[
      /* a */ webcolaLib.distSrcGeomMod.Point, 
      /* b */ js.Array[webcolaLib.distSrcGeomMod.Point], 
      scala.Double
    ],
    t2: js.Function2[
      /* a */ webcolaLib.distSrcGeomMod.Point, 
      /* b */ js.Array[webcolaLib.distSrcGeomMod.Point], 
      scala.Double
    ],
    cmp1: js.Function3[
      /* a */ webcolaLib.distSrcGeomMod.Point, 
      /* b */ webcolaLib.distSrcGeomMod.Point, 
      /* c */ webcolaLib.distSrcGeomMod.Point, 
      scala.Boolean
    ],
    cmp2: js.Function3[
      /* a */ webcolaLib.distSrcGeomMod.Point, 
      /* b */ webcolaLib.distSrcGeomMod.Point, 
      /* c */ webcolaLib.distSrcGeomMod.Point, 
      scala.Boolean
    ]
  ): webcolaLib.Anon_T1 = js.native
  def tangents(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.distSrcGeomMod.BiTangents = js.native
}


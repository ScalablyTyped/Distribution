package typings.webcola.webcolaMod

import typings.webcola.Anon_ArrowStart
import typings.webcola.Anon_Cola
import typings.webcola.Anon_DesiredCenter
import typings.webcola.Anon_Groups
import typings.webcola.Anon_Links
import typings.webcola.Anon_LowerBound
import typings.webcola.Anon_T1
import typings.webcola.Anon_X
import typings.webcola.distSrcD3adaptorMod.D3v3Context
import typings.webcola.distSrcD3adaptorMod.ID3StyleLayoutAdaptor
import typings.webcola.distSrcD3v4adaptorMod.D3Context
import typings.webcola.distSrcLinklengthsMod.IConstraint
import typings.webcola.distSrcLinklengthsMod.LinkAccessor
import typings.webcola.distSrcLinklengthsMod.LinkLengthAccessor
import typings.webcola.distSrcLinklengthsMod.LinkSepAccessor
import typings.webcola.distSrcPowergraphMod.LinkTypeAccessor
import typings.webcola.distSrcRectangleMod.ProjectionGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ConvexHull(S: js.Array[typings.webcola.distSrcGeomMod.Point]): js.Array[typings.webcola.distSrcGeomMod.Point] = js.native
  def LLtangent_PolyPolyC(
    V: js.Array[typings.webcola.distSrcGeomMod.Point],
    W: js.Array[typings.webcola.distSrcGeomMod.Point]
  ): Anon_T1 = js.native
  def LRtangent_PolyPolyC(
    V: js.Array[typings.webcola.distSrcGeomMod.Point],
    W: js.Array[typings.webcola.distSrcGeomMod.Point]
  ): Anon_T1 = js.native
  def RLtangent_PolyPolyC(
    V: js.Array[typings.webcola.distSrcGeomMod.Point],
    W: js.Array[typings.webcola.distSrcGeomMod.Point]
  ): Anon_T1 = js.native
  def RRtangent_PolyPolyC(
    V: js.Array[typings.webcola.distSrcGeomMod.Point],
    W: js.Array[typings.webcola.distSrcGeomMod.Point]
  ): Anon_T1 = js.native
  def adaptor(options: js.Any): typings.webcola.distSrcAdaptorMod.LayoutAdaptor = js.native
  def applyPacking(graphs: js.Array[_], w: js.Any, h: js.Any, node_size: js.Any): Unit = js.native
  def applyPacking(graphs: js.Array[_], w: js.Any, h: js.Any, node_size: js.Any, desired_ratio: Double): Unit = js.native
  def applyPacking(
    graphs: js.Array[_],
    w: js.Any,
    h: js.Any,
    node_size: js.Any,
    desired_ratio: Double,
    centerGraph: Boolean
  ): Unit = js.native
  def clockwiseRadialSweep(
    p: typings.webcola.distSrcGeomMod.Point,
    P: js.Array[typings.webcola.distSrcGeomMod.Point],
    f: js.Function1[/* p */ typings.webcola.distSrcGeomMod.Point, Unit]
  ): Unit = js.native
  def computeGroupBounds(g: ProjectionGroup): typings.webcola.distSrcRectangleMod.Rectangle = js.native
  def d3adaptor(): typings.webcola.distSrcLayoutMod.Layout with ID3StyleLayoutAdaptor = js.native
  def d3adaptor(d3Context: D3v3Context): typings.webcola.distSrcLayoutMod.Layout with ID3StyleLayoutAdaptor = js.native
  def d3adaptor(d3Context: D3Context): typings.webcola.distSrcLayoutMod.Layout with ID3StyleLayoutAdaptor = js.native
  def generateDirectedEdgeConstraints[Link](n: Double, links: js.Array[Link], axis: String, la: LinkSepAccessor[Link]): js.Array[IConstraint] = js.native
  def generateXConstraints(
    rs: js.Array[typings.webcola.distSrcRectangleMod.Rectangle],
    vars: js.Array[typings.webcola.distSrcVpscMod.Variable]
  ): js.Array[typings.webcola.distSrcVpscMod.Constraint] = js.native
  def generateXGroupConstraints(root: ProjectionGroup): js.Array[typings.webcola.distSrcVpscMod.Constraint] = js.native
  def generateYConstraints(
    rs: js.Array[typings.webcola.distSrcRectangleMod.Rectangle],
    vars: js.Array[typings.webcola.distSrcVpscMod.Variable]
  ): js.Array[typings.webcola.distSrcVpscMod.Constraint] = js.native
  def generateYGroupConstraints(root: ProjectionGroup): js.Array[typings.webcola.distSrcVpscMod.Constraint] = js.native
  def getGroups[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link]): Anon_Groups = js.native
  def getGroups[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link], rootGroup: js.Array[_]): Anon_Groups = js.native
  def gridify(pgLayout: js.Any, nudgeGap: Double, margin: Double, groupMargin: Double): js.Array[js.Array[js.Array[typings.webcola.distSrcGeomMod.Point]]] = js.native
  def isLeft(
    P0: typings.webcola.distSrcGeomMod.Point,
    P1: typings.webcola.distSrcGeomMod.Point,
    P2: typings.webcola.distSrcGeomMod.Point
  ): Double = js.native
  def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = js.native
  def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = js.native
  def makeEdgeBetween(
    source: typings.webcola.distSrcRectangleMod.Rectangle,
    target: typings.webcola.distSrcRectangleMod.Rectangle,
    ah: Double
  ): Anon_ArrowStart = js.native
  def makeEdgeTo(s: Anon_X, target: typings.webcola.distSrcRectangleMod.Rectangle, ah: Double): typings.webcola.distSrcGeomMod.Point = js.native
  def polysOverlap(
    p: js.Array[typings.webcola.distSrcGeomMod.Point],
    q: js.Array[typings.webcola.distSrcGeomMod.Point]
  ): Boolean = js.native
  def powerGraphGridLayout(graph: Anon_Links, size: js.Array[Double], grouppadding: Double): Anon_Cola = js.native
  def removeOverlapInOneDimension(spans: js.Array[Anon_DesiredCenter]): Anon_LowerBound = js.native
  def removeOverlapInOneDimension(spans: js.Array[Anon_DesiredCenter], lowerBound: Double): Anon_LowerBound = js.native
  def removeOverlapInOneDimension(spans: js.Array[Anon_DesiredCenter], lowerBound: Double, upperBound: Double): Anon_LowerBound = js.native
  def removeOverlaps(rs: js.Array[typings.webcola.distSrcRectangleMod.Rectangle]): Unit = js.native
  def separateGraphs(nodes: js.Any, links: js.Any): js.Array[_] = js.native
  def stronglyConnectedComponents[Link](numVertices: Double, edges: js.Array[Link], la: LinkAccessor[Link]): js.Array[js.Array[Double]] = js.native
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = js.native
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = js.native
  def tangent_PolyPolyC(
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
  ): Anon_T1 = js.native
  def tangents(
    V: js.Array[typings.webcola.distSrcGeomMod.Point],
    W: js.Array[typings.webcola.distSrcGeomMod.Point]
  ): typings.webcola.distSrcGeomMod.BiTangents = js.native
}


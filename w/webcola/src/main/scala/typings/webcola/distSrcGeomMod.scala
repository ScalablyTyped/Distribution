package typings.webcola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/geom", JSImport.Namespace)
@js.native
object distSrcGeomMod extends js.Object {
  @js.native
  class BiTangent protected () extends js.Object {
    def this(t1: Double, t2: Double) = this()
    var t1: Double = js.native
    var t2: Double = js.native
  }
  
  @js.native
  class BiTangents () extends js.Object {
    var ll: BiTangent = js.native
    var lr: BiTangent = js.native
    var rl: BiTangent = js.native
    var rr: BiTangent = js.native
  }
  
  @js.native
  class LineSegment protected () extends js.Object {
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
    var x1: Double = js.native
    var x2: Double = js.native
    var y1: Double = js.native
    var y2: Double = js.native
  }
  
  @js.native
  class Point () extends js.Object {
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class PolyPoint () extends Point {
    var polyIndex: Double = js.native
  }
  
  @js.native
  class TVGPoint () extends Point {
    var vv: VisibilityVertex = js.native
  }
  
  @js.native
  class TangentVisibilityGraph protected () extends js.Object {
    def this(P: js.Array[js.Array[TVGPoint]]) = this()
    def this(P: js.Array[js.Array[TVGPoint]], g0: Anon_E) = this()
    var E: js.Array[VisibilityEdge] = js.native
    var P: js.Array[js.Array[TVGPoint]] = js.native
    var V: js.Array[VisibilityVertex] = js.native
    var intersectsPolys: js.Any = js.native
    def addEdgeIfVisible(u: TVGPoint, v: TVGPoint, i1: Double, i2: Double): Unit = js.native
    def addPoint(p: TVGPoint, i1: Double): VisibilityVertex = js.native
  }
  
  @js.native
  class VisibilityEdge protected () extends js.Object {
    def this(source: VisibilityVertex, target: VisibilityVertex) = this()
    var source: VisibilityVertex = js.native
    var target: VisibilityVertex = js.native
    def length(): Double = js.native
  }
  
  @js.native
  class VisibilityVertex protected () extends js.Object {
    def this(id: Double, polyid: Double, polyvertid: Double, p: TVGPoint) = this()
    var id: Double = js.native
    var p: TVGPoint = js.native
    var polyid: Double = js.native
    var polyvertid: Double = js.native
  }
  
  def ConvexHull(S: js.Array[Point]): js.Array[Point] = js.native
  def LLtangent_PolyPolyC(V: js.Array[Point], W: js.Array[Point]): Anon_T1 = js.native
  def LRtangent_PolyPolyC(V: js.Array[Point], W: js.Array[Point]): Anon_T1 = js.native
  def RLtangent_PolyPolyC(V: js.Array[Point], W: js.Array[Point]): Anon_T1 = js.native
  def RRtangent_PolyPolyC(V: js.Array[Point], W: js.Array[Point]): Anon_T1 = js.native
  def clockwiseRadialSweep(p: Point, P: js.Array[Point], f: js.Function1[/* p */ Point, Unit]): Unit = js.native
  def isLeft(P0: Point, P1: Point, P2: Point): Double = js.native
  def polysOverlap(p: js.Array[Point], q: js.Array[Point]): Boolean = js.native
  def tangent_PolyPolyC(
    V: js.Array[Point],
    W: js.Array[Point],
    t1: js.Function2[/* a */ Point, /* b */ js.Array[Point], Double],
    t2: js.Function2[/* a */ Point, /* b */ js.Array[Point], Double],
    cmp1: js.Function3[/* a */ Point, /* b */ Point, /* c */ Point, Boolean],
    cmp2: js.Function3[/* a */ Point, /* b */ Point, /* c */ Point, Boolean]
  ): Anon_T1 = js.native
  def tangents(V: js.Array[Point], W: js.Array[Point]): BiTangents = js.native
}


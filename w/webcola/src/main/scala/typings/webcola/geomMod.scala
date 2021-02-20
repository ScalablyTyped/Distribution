package typings.webcola

import typings.webcola.anon.E
import typings.webcola.anon.T1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMod {
  
  @JSImport("webcola/dist/src/geom", "BiTangent")
  @js.native
  class BiTangent protected () extends StObject {
    def this(t1: Double, t2: Double) = this()
    
    var t1: Double = js.native
    
    var t2: Double = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "BiTangents")
  @js.native
  class BiTangents () extends StObject {
    
    var ll: BiTangent = js.native
    
    var lr: BiTangent = js.native
    
    var rl: BiTangent = js.native
    
    var rr: BiTangent = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "ConvexHull")
  @js.native
  def ConvexHull(S: js.Array[Point]): js.Array[Point] = js.native
  
  @JSImport("webcola/dist/src/geom", "LLtangent_PolyPolyC")
  @js.native
  def LLtangentPolyPolyC(V: js.Array[Point], W: js.Array[Point]): T1 = js.native
  
  @JSImport("webcola/dist/src/geom", "LRtangent_PolyPolyC")
  @js.native
  def LRtangentPolyPolyC(V: js.Array[Point], W: js.Array[Point]): T1 = js.native
  
  @JSImport("webcola/dist/src/geom", "LineSegment")
  @js.native
  class LineSegment protected () extends StObject {
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "Point")
  @js.native
  class Point () extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "PolyPoint")
  @js.native
  class PolyPoint () extends Point {
    
    var polyIndex: Double = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "RLtangent_PolyPolyC")
  @js.native
  def RLtangentPolyPolyC(V: js.Array[Point], W: js.Array[Point]): T1 = js.native
  
  @JSImport("webcola/dist/src/geom", "RRtangent_PolyPolyC")
  @js.native
  def RRtangentPolyPolyC(V: js.Array[Point], W: js.Array[Point]): T1 = js.native
  
  @JSImport("webcola/dist/src/geom", "TVGPoint")
  @js.native
  class TVGPoint () extends Point {
    
    var vv: VisibilityVertex = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "TangentVisibilityGraph")
  @js.native
  class TangentVisibilityGraph protected () extends StObject {
    def this(P: js.Array[js.Array[TVGPoint]]) = this()
    def this(P: js.Array[js.Array[TVGPoint]], g0: E) = this()
    
    var E: js.Array[VisibilityEdge] = js.native
    
    var P: js.Array[js.Array[TVGPoint]] = js.native
    
    var V: js.Array[VisibilityVertex] = js.native
    
    def addEdgeIfVisible(u: TVGPoint, v: TVGPoint, i1: Double, i2: Double): Unit = js.native
    
    def addPoint(p: TVGPoint, i1: Double): VisibilityVertex = js.native
    
    var intersectsPolys: js.Any = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "VisibilityEdge")
  @js.native
  class VisibilityEdge protected () extends StObject {
    def this(source: VisibilityVertex, target: VisibilityVertex) = this()
    
    def length(): Double = js.native
    
    var source: VisibilityVertex = js.native
    
    var target: VisibilityVertex = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "VisibilityVertex")
  @js.native
  class VisibilityVertex protected () extends StObject {
    def this(id: Double, polyid: Double, polyvertid: Double, p: TVGPoint) = this()
    
    var id: Double = js.native
    
    var p: TVGPoint = js.native
    
    var polyid: Double = js.native
    
    var polyvertid: Double = js.native
  }
  
  @JSImport("webcola/dist/src/geom", "clockwiseRadialSweep")
  @js.native
  def clockwiseRadialSweep(p: Point, P: js.Array[Point], f: js.Function1[/* p */ Point, Unit]): Unit = js.native
  
  @JSImport("webcola/dist/src/geom", "isLeft")
  @js.native
  def isLeft(P0: Point, P1: Point, P2: Point): Double = js.native
  
  @JSImport("webcola/dist/src/geom", "polysOverlap")
  @js.native
  def polysOverlap(p: js.Array[Point], q: js.Array[Point]): Boolean = js.native
  
  @JSImport("webcola/dist/src/geom", "tangent_PolyPolyC")
  @js.native
  def tangentPolyPolyC(
    V: js.Array[Point],
    W: js.Array[Point],
    t1: js.Function2[/* a */ Point, /* b */ js.Array[Point], Double],
    t2: js.Function2[/* a */ Point, /* b */ js.Array[Point], Double],
    cmp1: js.Function3[/* a */ Point, /* b */ Point, /* c */ Point, Boolean],
    cmp2: js.Function3[/* a */ Point, /* b */ Point, /* c */ Point, Boolean]
  ): T1 = js.native
  
  @JSImport("webcola/dist/src/geom", "tangents")
  @js.native
  def tangents(V: js.Array[Point], W: js.Array[Point]): BiTangents = js.native
}

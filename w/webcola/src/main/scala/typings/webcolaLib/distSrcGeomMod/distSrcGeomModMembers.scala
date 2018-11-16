package typings
package webcolaLib.distSrcGeomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/geom", JSImport.Namespace)
@js.native
object distSrcGeomModMembers extends js.Object {
  def ConvexHull(S: js.Array[Point]): js.Array[Point] = js.native
  def LLtangent_PolyPolyC(V: js.Array[Point], W: js.Array[Point]): webcolaLib.Anon_T1 = js.native
  def LRtangent_PolyPolyC(V: js.Array[Point], W: js.Array[Point]): webcolaLib.Anon_T1 = js.native
  def RLtangent_PolyPolyC(V: js.Array[Point], W: js.Array[Point]): webcolaLib.Anon_T1 = js.native
  def RRtangent_PolyPolyC(V: js.Array[Point], W: js.Array[Point]): webcolaLib.Anon_T1 = js.native
  def clockwiseRadialSweep(p: Point, P: js.Array[Point], f: js.Function1[/* p */ Point, scala.Unit]): scala.Unit = js.native
  def isLeft(P0: Point, P1: Point, P2: Point): scala.Double = js.native
  def polysOverlap(p: js.Array[Point], q: js.Array[Point]): scala.Boolean = js.native
  def tangent_PolyPolyC(
    V: js.Array[Point],
    W: js.Array[Point],
    t1: js.Function2[/* a */ Point, /* b */ js.Array[Point], scala.Double],
    t2: js.Function2[/* a */ Point, /* b */ js.Array[Point], scala.Double],
    cmp1: js.Function3[/* a */ Point, /* b */ Point, /* c */ Point, scala.Boolean],
    cmp2: js.Function3[/* a */ Point, /* b */ Point, /* c */ Point, scala.Boolean]
  ): webcolaLib.Anon_T1 = js.native
  def tangents(V: js.Array[Point], W: js.Array[Point]): BiTangents = js.native
}


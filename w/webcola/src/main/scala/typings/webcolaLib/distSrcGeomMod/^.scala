package typings
package webcolaLib.distSrcGeomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/geom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ConvexHull(S: js.Array[webcolaLib.distSrcGeomMod.Point]): js.Array[webcolaLib.distSrcGeomMod.Point] = js.native
  def LLtangent_PolyPolyC(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.Anon_T1 = js.native
  def LRtangent_PolyPolyC(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.Anon_T1 = js.native
  def RLtangent_PolyPolyC(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.Anon_T1 = js.native
  def RRtangent_PolyPolyC(V: js.Array[webcolaLib.distSrcGeomMod.Point], W: js.Array[webcolaLib.distSrcGeomMod.Point]): webcolaLib.Anon_T1 = js.native
  def clockwiseRadialSweep(
    p: webcolaLib.distSrcGeomMod.Point,
    P: js.Array[webcolaLib.distSrcGeomMod.Point],
    f: js.Function1[/* p */ webcolaLib.distSrcGeomMod.Point, scala.Unit]
  ): scala.Unit = js.native
  def isLeft(
    P0: webcolaLib.distSrcGeomMod.Point,
    P1: webcolaLib.distSrcGeomMod.Point,
    P2: webcolaLib.distSrcGeomMod.Point
  ): scala.Double = js.native
  def polysOverlap(p: js.Array[webcolaLib.distSrcGeomMod.Point], q: js.Array[webcolaLib.distSrcGeomMod.Point]): scala.Boolean = js.native
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


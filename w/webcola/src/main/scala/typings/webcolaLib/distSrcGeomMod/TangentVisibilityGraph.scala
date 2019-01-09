package typings
package webcolaLib.distSrcGeomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/geom", "TangentVisibilityGraph")
@js.native
class TangentVisibilityGraph protected () extends js.Object {
  def this(P: js.Array[js.Array[TVGPoint]]) = this()
  def this(P: js.Array[js.Array[TVGPoint]], g0: webcolaLib.Anon_E) = this()
  var E: js.Array[VisibilityEdge] = js.native
  var P: js.Array[js.Array[TVGPoint]] = js.native
  var V: js.Array[VisibilityVertex] = js.native
  def addEdgeIfVisible(u: TVGPoint, v: TVGPoint, i1: scala.Double, i2: scala.Double): scala.Unit = js.native
  def addPoint(p: TVGPoint, i1: scala.Double): VisibilityVertex = js.native
  /* private */ def intersectsPolys(l: js.Any, i1: js.Any, i2: js.Any): js.Any = js.native
}


package typings.webcola

import typings.webcola.distSrcGeomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/batch", JSImport.Namespace)
@js.native
object distSrcBatchMod extends js.Object {
  def gridify(pgLayout: js.Any, nudgeGap: Double, margin: Double, groupMargin: Double): js.Array[js.Array[js.Array[Point]]] = js.native
  def powerGraphGridLayout(graph: Anon_Links, size: js.Array[Double], grouppadding: Double): Anon_Cola = js.native
}


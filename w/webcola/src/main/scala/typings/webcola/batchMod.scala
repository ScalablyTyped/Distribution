package typings.webcola

import typings.webcola.anon.Cola
import typings.webcola.anon.Links
import typings.webcola.geomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/batch", JSImport.Namespace)
@js.native
object batchMod extends js.Object {
  def gridify(pgLayout: js.Any, nudgeGap: Double, margin: Double, groupMargin: Double): js.Array[js.Array[js.Array[Point]]] = js.native
  def powerGraphGridLayout(graph: Links, size: js.Array[Double], grouppadding: Double): Cola = js.native
}


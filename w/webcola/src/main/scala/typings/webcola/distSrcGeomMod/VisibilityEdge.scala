package typings.webcola.distSrcGeomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/geom", "VisibilityEdge")
@js.native
class VisibilityEdge protected () extends js.Object {
  def this(source: VisibilityVertex, target: VisibilityVertex) = this()
  var source: VisibilityVertex = js.native
  var target: VisibilityVertex = js.native
  def length(): Double = js.native
}


package typings.webcola

import typings.webcola.distSrcGeomMod.VisibilityEdge
import typings.webcola.distSrcGeomMod.VisibilityVertex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var E: js.Array[VisibilityEdge]
  var V: js.Array[VisibilityVertex]
}

object Anon_E {
  @scala.inline
  def apply(E: js.Array[VisibilityEdge], V: js.Array[VisibilityVertex]): Anon_E = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_E]
  }
}


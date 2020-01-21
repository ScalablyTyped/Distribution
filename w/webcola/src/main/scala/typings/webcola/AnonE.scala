package typings.webcola

import typings.webcola.geomMod.VisibilityEdge
import typings.webcola.geomMod.VisibilityVertex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonE extends js.Object {
  var E: js.Array[VisibilityEdge]
  var V: js.Array[VisibilityVertex]
}

object AnonE {
  @scala.inline
  def apply(E: js.Array[VisibilityEdge], V: js.Array[VisibilityVertex]): AnonE = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonE]
  }
}


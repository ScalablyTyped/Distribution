package typings
package unlDashCoreLib.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Neighbours extends js.Object {
  var e: java.lang.String
  var n: java.lang.String
  @JSName("ne")
  var ne_FNeighbours: java.lang.String
  var nw: java.lang.String
  var s: java.lang.String
  var se: java.lang.String
  var sw: java.lang.String
  var w: java.lang.String
}

object Neighbours {
  @scala.inline
  def apply(
    e: java.lang.String,
    n: java.lang.String,
    ne: java.lang.String,
    nw: java.lang.String,
    s: java.lang.String,
    se: java.lang.String,
    sw: java.lang.String,
    w: java.lang.String
  ): Neighbours = {
    val __obj = js.Dynamic.literal(e = e, n = n, ne = ne, nw = nw, s = s, se = se, sw = sw, w = w)
  
    __obj.asInstanceOf[Neighbours]
  }
}


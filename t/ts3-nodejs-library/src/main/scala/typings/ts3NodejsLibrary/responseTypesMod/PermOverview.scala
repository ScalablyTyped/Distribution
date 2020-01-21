package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermOverview extends js.Object {
  var id: Double
  var id2: Double
  /** negate */
  var n: Double
  /** perm */
  var p: Double
  /** skip */
  var s: Double
  var t: Double
  /** value */
  var v: Double
}

object PermOverview {
  @scala.inline
  def apply(id: Double, id2: Double, n: Double, p: Double, s: Double, t: Double, v: Double): PermOverview = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id2 = id2.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PermOverview]
  }
}


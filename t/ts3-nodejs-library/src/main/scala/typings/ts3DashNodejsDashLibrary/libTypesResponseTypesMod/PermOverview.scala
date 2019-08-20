package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

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
    val __obj = js.Dynamic.literal(id = id, id2 = id2, n = n, p = p, s = s, t = t, v = v)
  
    __obj.asInstanceOf[PermOverview]
  }
}


package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: scala.Double
  var byDesign: scala.Double
  var closed: scala.Double
  var fixed: scala.Double
  var pending: scala.Double
  var unknown: scala.Double
  var wontFix: scala.Double
}

object Anon_Active {
  @scala.inline
  def apply(
    active: scala.Double,
    byDesign: scala.Double,
    closed: scala.Double,
    fixed: scala.Double,
    pending: scala.Double,
    unknown: scala.Double,
    wontFix: scala.Double
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(active = active, byDesign = byDesign, closed = closed, fixed = fixed, pending = pending, unknown = unknown, wontFix = wontFix)
  
    __obj.asInstanceOf[Anon_Active]
  }
}


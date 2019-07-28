package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: Double
  var byDesign: Double
  var closed: Double
  var fixed: Double
  var pending: Double
  var unknown: Double
  var wontFix: Double
}

object Anon_Active {
  @scala.inline
  def apply(
    active: Double,
    byDesign: Double,
    closed: Double,
    fixed: Double,
    pending: Double,
    unknown: Double,
    wontFix: Double
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(active = active, byDesign = byDesign, closed = closed, fixed = fixed, pending = pending, unknown = unknown, wontFix = wontFix)
  
    __obj.asInstanceOf[Anon_Active]
  }
}


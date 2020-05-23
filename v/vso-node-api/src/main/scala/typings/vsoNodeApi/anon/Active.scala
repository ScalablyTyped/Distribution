package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
  var active: scala.Double
  var byDesign: scala.Double
  var closed: scala.Double
  var fixed: scala.Double
  var pending: scala.Double
  var unknown: scala.Double
  var wontFix: scala.Double
}

object Active {
  @scala.inline
  def apply(
    active: scala.Double,
    byDesign: scala.Double,
    closed: scala.Double,
    fixed: scala.Double,
    pending: scala.Double,
    unknown: scala.Double,
    wontFix: scala.Double
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], byDesign = byDesign.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], wontFix = wontFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}


package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manage extends js.Object {
  var manage: scala.Double
  var none: scala.Double
  var use: scala.Double
}

object Manage {
  @scala.inline
  def apply(manage: scala.Double, none: scala.Double, use: scala.Double): Manage = {
    val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manage]
  }
}


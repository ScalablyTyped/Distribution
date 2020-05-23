package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Automated extends js.Object {
  var automated: scala.Double
  var manual: scala.Double
  var none: scala.Double
  var scheduled: scala.Double
}

object Automated {
  @scala.inline
  def apply(automated: scala.Double, manual: scala.Double, none: scala.Double, scheduled: scala.Double): Automated = {
    val __obj = js.Dynamic.literal(automated = automated.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automated]
  }
}


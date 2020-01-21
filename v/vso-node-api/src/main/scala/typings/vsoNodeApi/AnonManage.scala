package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManage extends js.Object {
  var manage: Double
  var none: Double
  var use: Double
}

object AnonManage {
  @scala.inline
  def apply(manage: Double, none: Double, use: Double): AnonManage = {
    val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonManage]
  }
}


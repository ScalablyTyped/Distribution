package typings.vsoNodeApi.projectAnalysisInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeChangeTrendItem extends js.Object {
  var time: Date
  var value: Double
}

object CodeChangeTrendItem {
  @scala.inline
  def apply(time: Date, value: Double): CodeChangeTrendItem = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeChangeTrendItem]
  }
}


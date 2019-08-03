package typings.wxDashServerDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Boundaries extends js.Object {
  var boundaries: js.Array[_]
  var default: js.UndefOr[js.Any] = js.undefined
  var groupBy: js.Any
  var output: js.UndefOr[js.Object] = js.undefined
}

object Anon_Boundaries {
  @scala.inline
  def apply(boundaries: js.Array[_], groupBy: js.Any, default: js.Any = null, output: js.Object = null): Anon_Boundaries = {
    val __obj = js.Dynamic.literal(boundaries = boundaries, groupBy = groupBy)
    if (default != null) __obj.updateDynamic("default")(default)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Anon_Boundaries]
  }
}


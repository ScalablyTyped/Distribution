package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boundaries extends js.Object {
  var boundaries: js.Array[_]
  var default: js.UndefOr[js.Any] = js.undefined
  var groupBy: js.Any
  var output: js.UndefOr[js.Object] = js.undefined
}

object Boundaries {
  @scala.inline
  def apply(boundaries: js.Array[_], groupBy: js.Any, default: js.Any = null, output: js.Object = null): Boundaries = {
    val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
}


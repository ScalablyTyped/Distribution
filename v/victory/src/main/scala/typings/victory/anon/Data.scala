package typings.victory.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[CSSProperties] = js.undefined
  var labels: js.UndefOr[CSSProperties] = js.undefined
}

object Data {
  @scala.inline
  def apply(data: CSSProperties = null, labels: CSSProperties = null): Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}


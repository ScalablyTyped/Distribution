package typings.victory

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabels extends js.Object {
  var data: js.UndefOr[CSSPropertiestypeScatterS] = js.undefined
  var labels: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[CSSProperties] = js.undefined
}

object AnonLabels {
  @scala.inline
  def apply(data: CSSPropertiestypeScatterS = null, labels: CSSProperties = null, title: CSSProperties = null): AnonLabels = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabels]
  }
}


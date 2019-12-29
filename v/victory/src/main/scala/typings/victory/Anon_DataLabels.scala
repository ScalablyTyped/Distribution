package typings.victory

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataLabels extends js.Object {
  var data: js.UndefOr[CSSProperties with Anon_Type] = js.undefined
  var labels: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_DataLabels {
  @scala.inline
  def apply(
    data: CSSProperties with Anon_Type = null,
    labels: CSSProperties = null,
    title: CSSProperties = null
  ): Anon_DataLabels = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataLabels]
  }
}


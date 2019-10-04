package typings.victory

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataLabelsTitle extends js.Object {
  var data: js.UndefOr[CSSProperties] = js.undefined
  var labels: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_DataLabelsTitle {
  @scala.inline
  def apply(data: CSSProperties = null, labels: CSSProperties = null, title: CSSProperties = null): Anon_DataLabelsTitle = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_DataLabelsTitle]
  }
}


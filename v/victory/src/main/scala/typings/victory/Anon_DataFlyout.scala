package typings.victory

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataFlyout extends js.Object {
  var data: js.UndefOr[CSSProperties] = js.undefined
  var flyout: js.UndefOr[CSSProperties] = js.undefined
  var labels: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_DataFlyout {
  @scala.inline
  def apply(data: CSSProperties = null, flyout: CSSProperties = null, labels: CSSProperties = null): Anon_DataFlyout = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (flyout != null) __obj.updateDynamic("flyout")(flyout.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataFlyout]
  }
}


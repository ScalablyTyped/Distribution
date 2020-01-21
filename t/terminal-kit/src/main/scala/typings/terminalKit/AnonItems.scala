package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.UndefOr[Double] = js.undefined
  var progress: Double | Null
  var title: js.UndefOr[String] = js.undefined
}

object AnonItems {
  @scala.inline
  def apply(items: Int | Double = null, progress: Int | Double = null, title: String = null): AnonItems = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}


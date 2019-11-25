package typings.terminalDashKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: js.UndefOr[Double] = js.undefined
  var progress: Double | Null
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Items {
  @scala.inline
  def apply(items: Int | Double = null, progress: Int | Double = null, title: String = null): Anon_Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Items]
  }
}


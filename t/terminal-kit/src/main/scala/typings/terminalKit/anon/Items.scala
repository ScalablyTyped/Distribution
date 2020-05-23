package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  var items: js.UndefOr[Double] = js.undefined
  var progress: Double | Null
  var title: js.UndefOr[String] = js.undefined
}

object Items {
  @scala.inline
  def apply(
    items: js.UndefOr[Double] = js.undefined,
    progress: Double = null.asInstanceOf[Double],
    title: String = null
  ): Items = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}


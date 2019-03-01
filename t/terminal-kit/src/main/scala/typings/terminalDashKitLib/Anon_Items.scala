package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: js.UndefOr[scala.Double] = js.undefined
  var progress: scala.Double | scala.Null
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Items {
  @scala.inline
  def apply(
    items: scala.Int | scala.Double = null,
    progress: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): Anon_Items = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Items]
  }
}


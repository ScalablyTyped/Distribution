package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var image: js.UndefOr[tabrisLib.tabrisMod.Image] = js.undefined
  var style: js.UndefOr[
    tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.cancel | tabrisLib.tabrisLibStrings.destructive
  ] = js.undefined
  var title: java.lang.String
}

object Anon_Cancel {
  @scala.inline
  def apply(
    title: java.lang.String,
    image: tabrisLib.tabrisMod.Image = null,
    style: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.cancel | tabrisLib.tabrisLibStrings.destructive = null
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal(title = title)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancel]
  }
}


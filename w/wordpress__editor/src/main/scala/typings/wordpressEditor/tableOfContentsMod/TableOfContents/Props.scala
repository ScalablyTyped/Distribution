package typings.wordpressEditor.tableOfContentsMod.TableOfContents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var hasOutlineItemsDisabled: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(hasOutlineItemsDisabled: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasOutlineItemsDisabled)) __obj.updateDynamic("hasOutlineItemsDisabled")(hasOutlineItemsDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


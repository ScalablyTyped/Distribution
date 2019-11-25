package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var confirm: js.UndefOr[Boolean] = js.undefined
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, confirm: js.UndefOr[Boolean] = js.undefined): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancel]
  }
}


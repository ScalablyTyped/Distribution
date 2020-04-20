package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var neutral: js.UndefOr[String] = js.undefined
  var ok: js.UndefOr[String] = js.undefined
}

object AnonCancel {
  @scala.inline
  def apply(cancel: String = null, neutral: String = null, ok: String = null): AnonCancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (neutral != null) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}


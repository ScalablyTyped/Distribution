package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Components
trait UIkitCountdownOptions extends js.Object {
  var date: js.UndefOr[String | Boolean] = js.undefined
}

object UIkitCountdownOptions {
  @scala.inline
  def apply(date: String | Boolean = null): UIkitCountdownOptions = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitCountdownOptions]
  }
}


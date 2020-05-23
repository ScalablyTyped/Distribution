package typings.wordpressComponents.withFocusReturnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WFROptions extends js.Object {
  var onFocusReturn: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
}

object WFROptions {
  @scala.inline
  def apply(onFocusReturn: () => Boolean | Unit = null): WFROptions = {
    val __obj = js.Dynamic.literal()
    if (onFocusReturn != null) __obj.updateDynamic("onFocusReturn")(js.Any.fromFunction0(onFocusReturn))
    __obj.asInstanceOf[WFROptions]
  }
}


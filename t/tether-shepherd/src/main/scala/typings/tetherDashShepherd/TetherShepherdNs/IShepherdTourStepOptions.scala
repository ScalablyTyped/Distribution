package typings.tetherDashShepherd.TetherShepherdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShepherdTourStepOptions extends js.Object {
  var advanceOn: js.UndefOr[js.Any] = js.undefined
  var attachTo: js.UndefOr[js.Any] = js.undefined
  var beforeShowPromise: js.UndefOr[js.Any] = js.undefined
  var buttons: js.UndefOr[js.Array[IShepherdTourButton]] = js.undefined
  var classes: js.UndefOr[String] = js.undefined
  var scrollTo: js.UndefOr[Boolean] = js.undefined
  var showCancelLink: js.UndefOr[Boolean] = js.undefined
  var showOn: js.UndefOr[js.Function0[Boolean]] = js.undefined
  // TODO: Tie this in with the tether.d.ts
  var tetherOptions: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var when: js.UndefOr[js.Any] = js.undefined
}

object IShepherdTourStepOptions {
  @scala.inline
  def apply(
    advanceOn: js.Any = null,
    attachTo: js.Any = null,
    beforeShowPromise: js.Any = null,
    buttons: js.Array[IShepherdTourButton] = null,
    classes: String = null,
    scrollTo: js.UndefOr[Boolean] = js.undefined,
    showCancelLink: js.UndefOr[Boolean] = js.undefined,
    showOn: () => Boolean = null,
    tetherOptions: js.Any = null,
    text: js.Any = null,
    title: String = null,
    when: js.Any = null
  ): IShepherdTourStepOptions = {
    val __obj = js.Dynamic.literal()
    if (advanceOn != null) __obj.updateDynamic("advanceOn")(advanceOn)
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo)
    if (beforeShowPromise != null) __obj.updateDynamic("beforeShowPromise")(beforeShowPromise)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(scrollTo)) __obj.updateDynamic("scrollTo")(scrollTo)
    if (!js.isUndefined(showCancelLink)) __obj.updateDynamic("showCancelLink")(showCancelLink)
    if (showOn != null) __obj.updateDynamic("showOn")(js.Any.fromFunction0(showOn))
    if (tetherOptions != null) __obj.updateDynamic("tetherOptions")(tetherOptions)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (when != null) __obj.updateDynamic("when")(when)
    __obj.asInstanceOf[IShepherdTourStepOptions]
  }
}


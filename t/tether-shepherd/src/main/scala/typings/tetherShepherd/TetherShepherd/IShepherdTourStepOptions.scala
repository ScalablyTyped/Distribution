package typings.tetherShepherd.TetherShepherd

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
    if (advanceOn != null) __obj.updateDynamic("advanceOn")(advanceOn.asInstanceOf[js.Any])
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo.asInstanceOf[js.Any])
    if (beforeShowPromise != null) __obj.updateDynamic("beforeShowPromise")(beforeShowPromise.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTo)) __obj.updateDynamic("scrollTo")(scrollTo.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelLink)) __obj.updateDynamic("showCancelLink")(showCancelLink.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(js.Any.fromFunction0(showOn))
    if (tetherOptions != null) __obj.updateDynamic("tetherOptions")(tetherOptions.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShepherdTourStepOptions]
  }
}


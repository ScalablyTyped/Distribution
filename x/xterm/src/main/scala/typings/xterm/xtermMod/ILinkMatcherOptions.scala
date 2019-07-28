package typings.xterm.xtermMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkMatcherOptions extends js.Object {
  /**
    * A callback that fires when the mouse leaves a link. Note that this can
    * happen even when tooltipCallback hasn't fired for the link yet.
    */
  var leaveCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The index of the link from the regex.match(text) call. This defaults to 0
    * (for regular expressions without capture groups).
    */
  var matchIndex: js.UndefOr[Double] = js.undefined
  /**
    * The priority of the link matcher, this defines the order in which the link
    * matcher is evaluated relative to others, from highest to lowest. The
    * default value is 0.
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * A callback that fires when the mouse hovers over a link for a moment.
    */
  var tooltipCallback: js.UndefOr[js.Function2[/* event */ MouseEvent, /* uri */ String, Boolean | Unit]] = js.undefined
  /**
    * A callback that validates whether to create an individual link, pass
    * whether the link is valid to the callback.
    */
  var validationCallback: js.UndefOr[
    js.Function2[/* uri */ String, /* callback */ js.Function1[/* isValid */ Boolean, Unit], Unit]
  ] = js.undefined
  /**
    * A callback that fires when the mousedown and click events occur that
    * determines whether a link will be activated upon click. This enables
    * only activating a link when a certain modifier is held down, if not the
    * mouse event will continue propagation (eg. double click to select word).
    */
  var willLinkActivate: js.UndefOr[js.Function2[/* event */ MouseEvent, /* uri */ String, Boolean]] = js.undefined
}

object ILinkMatcherOptions {
  @scala.inline
  def apply(
    leaveCallback: () => Unit = null,
    matchIndex: Int | Double = null,
    priority: Int | Double = null,
    tooltipCallback: (/* event */ MouseEvent, /* uri */ String) => Boolean | Unit = null,
    validationCallback: (/* uri */ String, /* callback */ js.Function1[/* isValid */ Boolean, Unit]) => Unit = null,
    willLinkActivate: (/* event */ MouseEvent, /* uri */ String) => Boolean = null
  ): ILinkMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (leaveCallback != null) __obj.updateDynamic("leaveCallback")(js.Any.fromFunction0(leaveCallback))
    if (matchIndex != null) __obj.updateDynamic("matchIndex")(matchIndex.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tooltipCallback != null) __obj.updateDynamic("tooltipCallback")(js.Any.fromFunction2(tooltipCallback))
    if (validationCallback != null) __obj.updateDynamic("validationCallback")(js.Any.fromFunction2(validationCallback))
    if (willLinkActivate != null) __obj.updateDynamic("willLinkActivate")(js.Any.fromFunction2(willLinkActivate))
    __obj.asInstanceOf[ILinkMatcherOptions]
  }
}


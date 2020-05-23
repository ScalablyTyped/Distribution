package typings.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /** This event is triggered when the fonts have rendered. */
  var active: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Setting this to false will disable html classes (defaults to true) */
  var classes: js.UndefOr[Boolean] = js.undefined
  /** Child window or iframes to manage fonts for */
  var context: js.UndefOr[js.Array[String]] = js.undefined
  var custom: js.UndefOr[Custom] = js.undefined
  /** Settings this to false will disable callbacks/events (defaults to true) */
  var events: js.UndefOr[Boolean] = js.undefined
  /** This event is triggered once for each font that renders. */
  var fontactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
  var fontdeck: js.UndefOr[Fontdeck] = js.undefined
  /** This event is triggered if the font can't be loaded. */
  var fontinactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
  /** This event is triggered once for each font that's loaded. */
  var fontloading: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
  var google: js.UndefOr[Google] = js.undefined
  /** This event is triggered when the browser does not support linked fonts or if none of the fonts could be loaded. */
  var inactive: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** This event is triggered when all fonts have been requested. */
  var loading: js.UndefOr[js.Function0[Unit]] = js.undefined
  var monotype: js.UndefOr[Monotype] = js.undefined
  /** Time (in ms) until the fontinactive callback will be triggered (defaults to 5000) */
  var timeout: js.UndefOr[Double] = js.undefined
  var typekit: js.UndefOr[Typekit] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    active: () => Unit = null,
    classes: js.UndefOr[Boolean] = js.undefined,
    context: js.Array[String] = null,
    custom: Custom = null,
    events: js.UndefOr[Boolean] = js.undefined,
    fontactive: (/* familyName */ String, /* fvd */ String) => Unit = null,
    fontdeck: Fontdeck = null,
    fontinactive: (/* familyName */ String, /* fvd */ String) => Unit = null,
    fontloading: (/* familyName */ String, /* fvd */ String) => Unit = null,
    google: Google = null,
    inactive: () => Unit = null,
    loading: () => Unit = null,
    monotype: Monotype = null,
    timeout: js.UndefOr[Double] = js.undefined,
    typekit: Typekit = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(js.Any.fromFunction0(active))
    if (!js.isUndefined(classes)) __obj.updateDynamic("classes")(classes.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.get.asInstanceOf[js.Any])
    if (fontactive != null) __obj.updateDynamic("fontactive")(js.Any.fromFunction2(fontactive))
    if (fontdeck != null) __obj.updateDynamic("fontdeck")(fontdeck.asInstanceOf[js.Any])
    if (fontinactive != null) __obj.updateDynamic("fontinactive")(js.Any.fromFunction2(fontinactive))
    if (fontloading != null) __obj.updateDynamic("fontloading")(js.Any.fromFunction2(fontloading))
    if (google != null) __obj.updateDynamic("google")(google.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(js.Any.fromFunction0(inactive))
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction0(loading))
    if (monotype != null) __obj.updateDynamic("monotype")(monotype.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (typekit != null) __obj.updateDynamic("typekit")(typekit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}


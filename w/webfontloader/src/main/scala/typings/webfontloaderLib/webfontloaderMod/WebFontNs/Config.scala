package typings
package webfontloaderLib.webfontloaderMod.WebFontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /** This event is triggered when the fonts have rendered. */
  var active: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Setting this to false will disable html classes (defaults to true) */
  var classes: js.UndefOr[scala.Boolean] = js.undefined
  /** Child window or iframes to manage fonts for */
  var context: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var custom: js.UndefOr[Custom] = js.undefined
  /** Settings this to false will disable callbacks/events (defaults to true) */
  var events: js.UndefOr[scala.Boolean] = js.undefined
  /** This event is triggered once for each font that renders. */
  var fontactive: js.UndefOr[
    js.Function2[/* familyName */ java.lang.String, /* fvd */ java.lang.String, scala.Unit]
  ] = js.undefined
  var fontdeck: js.UndefOr[Fontdeck] = js.undefined
  /** This event is triggered if the font can't be loaded. */
  var fontinactive: js.UndefOr[
    js.Function2[/* familyName */ java.lang.String, /* fvd */ java.lang.String, scala.Unit]
  ] = js.undefined
  /** This event is triggered once for each font that's loaded. */
  var fontloading: js.UndefOr[
    js.Function2[/* familyName */ java.lang.String, /* fvd */ java.lang.String, scala.Unit]
  ] = js.undefined
  var google: js.UndefOr[Google] = js.undefined
  /** This event is triggered when the browser does not support linked fonts or if none of the fonts could be loaded. */
  var inactive: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** This event is triggered when all fonts have been requested. */
  var loading: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var monotype: js.UndefOr[Monotype] = js.undefined
  /** Time (in ms) until the fontinactive callback will be triggered (defaults to 5000) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var typekit: js.UndefOr[Typekit] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    active: js.Function0[scala.Unit] = null,
    classes: js.UndefOr[scala.Boolean] = js.undefined,
    context: js.Array[java.lang.String] = null,
    custom: Custom = null,
    events: js.UndefOr[scala.Boolean] = js.undefined,
    fontactive: js.Function2[/* familyName */ java.lang.String, /* fvd */ java.lang.String, scala.Unit] = null,
    fontdeck: Fontdeck = null,
    fontinactive: js.Function2[/* familyName */ java.lang.String, /* fvd */ java.lang.String, scala.Unit] = null,
    fontloading: js.Function2[/* familyName */ java.lang.String, /* fvd */ java.lang.String, scala.Unit] = null,
    google: Google = null,
    inactive: js.Function0[scala.Unit] = null,
    loading: js.Function0[scala.Unit] = null,
    monotype: Monotype = null,
    timeout: scala.Int | scala.Double = null,
    typekit: Typekit = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(classes)) __obj.updateDynamic("classes")(classes)
    if (context != null) __obj.updateDynamic("context")(context)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events)
    if (fontactive != null) __obj.updateDynamic("fontactive")(fontactive)
    if (fontdeck != null) __obj.updateDynamic("fontdeck")(fontdeck)
    if (fontinactive != null) __obj.updateDynamic("fontinactive")(fontinactive)
    if (fontloading != null) __obj.updateDynamic("fontloading")(fontloading)
    if (google != null) __obj.updateDynamic("google")(google)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (monotype != null) __obj.updateDynamic("monotype")(monotype)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (typekit != null) __obj.updateDynamic("typekit")(typekit)
    __obj.asInstanceOf[Config]
  }
}


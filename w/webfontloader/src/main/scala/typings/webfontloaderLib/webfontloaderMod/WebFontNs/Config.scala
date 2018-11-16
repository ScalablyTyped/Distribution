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


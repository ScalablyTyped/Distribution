package typings.svgDashInjector.svgDashInjectorMod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGInjectorOptions extends js.Object {
  /**
    * Callback to run during each SVG injection. The SVG element is passed if
    * the injection was successful.
    */
  var each: js.UndefOr[js.Function1[/* svg */ SVGElement | String, Unit]] = js.undefined
  /**
    * Whether to run scripts blocks found in the SVG.
    *
    * Possible values:
    * 'always' — Run scripts every time.
    * 'once' — Only run scripts once for each SVG.
    * 'never' — Ignore scripts (default)
    */
  var evalScripts: js.UndefOr[String] = js.undefined
  /**
    * Location of fallback pngs, if desired.
    */
  var pngFallback: js.UndefOr[String] = js.undefined
}

object SVGInjectorOptions {
  @scala.inline
  def apply(
    each: /* svg */ SVGElement | String => Unit = null,
    evalScripts: String = null,
    pngFallback: String = null
  ): SVGInjectorOptions = {
    val __obj = js.Dynamic.literal()
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction1(each))
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts.asInstanceOf[js.Any])
    if (pngFallback != null) __obj.updateDynamic("pngFallback")(pngFallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGInjectorOptions]
  }
}


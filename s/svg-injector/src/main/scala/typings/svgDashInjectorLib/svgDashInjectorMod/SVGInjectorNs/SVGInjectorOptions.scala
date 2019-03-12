package typings
package svgDashInjectorLib.svgDashInjectorMod.SVGInjectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGInjectorOptions extends js.Object {
  /**
    * Callback to run during each SVG injection. The SVG element is passed if
    * the injection was successful.
    */
  var each: js.UndefOr[js.Function1[/* svg */ stdLib.SVGElement | java.lang.String, scala.Unit]] = js.undefined
  /**
    * Whether to run scripts blocks found in the SVG.
    *
    * Possible values:
    * 'always' — Run scripts every time.
    * 'once' — Only run scripts once for each SVG.
    * 'never' — Ignore scripts (default)
    */
  var evalScripts: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Location of fallback pngs, if desired.
    */
  var pngFallback: js.UndefOr[java.lang.String] = js.undefined
}

object SVGInjectorOptions {
  @scala.inline
  def apply(
    each: /* svg */ stdLib.SVGElement | java.lang.String => scala.Unit = null,
    evalScripts: java.lang.String = null,
    pngFallback: java.lang.String = null
  ): SVGInjectorOptions = {
    val __obj = js.Dynamic.literal()
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction1(each))
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts)
    if (pngFallback != null) __obj.updateDynamic("pngFallback")(pngFallback)
    __obj.asInstanceOf[SVGInjectorOptions]
  }
}


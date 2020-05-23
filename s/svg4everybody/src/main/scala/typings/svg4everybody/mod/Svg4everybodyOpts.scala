package typings.svg4everybody.mod

import typings.std.SVGElement
import typings.std.SVGUseElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg4everybodyOpts extends js.Object {
  var attributeName: js.UndefOr[String] = js.undefined
  var fallback: js.UndefOr[
    js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, String]
  ] = js.undefined
  var nosvg: js.UndefOr[Boolean] = js.undefined
  var polyfill: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[
    js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, Boolean]
  ] = js.undefined
}

object Svg4everybodyOpts {
  @scala.inline
  def apply(
    attributeName: String = null,
    fallback: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => String = null,
    nosvg: js.UndefOr[Boolean] = js.undefined,
    polyfill: js.UndefOr[Boolean] = js.undefined,
    validate: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => Boolean = null
  ): Svg4everybodyOpts = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction3(fallback))
    if (!js.isUndefined(nosvg)) __obj.updateDynamic("nosvg")(nosvg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polyfill)) __obj.updateDynamic("polyfill")(polyfill.get.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction3(validate))
    __obj.asInstanceOf[Svg4everybodyOpts]
  }
}


package typings
package svg4everybodyLib.svg4everybodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg4everybodyOpts extends js.Object {
  var attributeName: js.UndefOr[java.lang.String] = js.undefined
  var fallback: js.UndefOr[
    js.Function3[
      /* src */ java.lang.String, 
      /* svg */ stdLib.SVGElement, 
      /* use */ stdLib.SVGUseElement, 
      java.lang.String
    ]
  ] = js.undefined
  var nosvg: js.UndefOr[scala.Boolean] = js.undefined
  var polyfill: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[
    js.Function3[
      /* src */ java.lang.String, 
      /* svg */ stdLib.SVGElement, 
      /* use */ stdLib.SVGUseElement, 
      scala.Boolean
    ]
  ] = js.undefined
}

object Svg4everybodyOpts {
  @scala.inline
  def apply(
    attributeName: java.lang.String = null,
    fallback: (/* src */ java.lang.String, /* svg */ stdLib.SVGElement, /* use */ stdLib.SVGUseElement) => java.lang.String = null,
    nosvg: js.UndefOr[scala.Boolean] = js.undefined,
    polyfill: js.UndefOr[scala.Boolean] = js.undefined,
    validate: (/* src */ java.lang.String, /* svg */ stdLib.SVGElement, /* use */ stdLib.SVGUseElement) => scala.Boolean = null
  ): Svg4everybodyOpts = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction3(fallback))
    if (!js.isUndefined(nosvg)) __obj.updateDynamic("nosvg")(nosvg)
    if (!js.isUndefined(polyfill)) __obj.updateDynamic("polyfill")(polyfill)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction3(validate))
    __obj.asInstanceOf[Svg4everybodyOpts]
  }
}


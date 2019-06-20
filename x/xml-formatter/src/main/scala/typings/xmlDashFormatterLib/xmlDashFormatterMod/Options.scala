package typings
package xmlDashFormatterLib.xmlDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var collapseContent: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var indentation: js.UndefOr[java.lang.String] = js.undefined
  var stripComments: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    collapseContent: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    indentation: java.lang.String = null,
    stripComments: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseContent)) __obj.updateDynamic("collapseContent")(collapseContent)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (indentation != null) __obj.updateDynamic("indentation")(indentation)
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments)
    __obj.asInstanceOf[Options]
  }
}


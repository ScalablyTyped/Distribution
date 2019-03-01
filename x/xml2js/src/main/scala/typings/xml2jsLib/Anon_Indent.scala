package typings
package xml2jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var newline: js.UndefOr[java.lang.String] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Indent {
  @scala.inline
  def apply(
    indent: java.lang.String = null,
    newline: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    __obj.asInstanceOf[Anon_Indent]
  }
}


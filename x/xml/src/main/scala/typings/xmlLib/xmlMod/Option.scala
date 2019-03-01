package typings
package xmlLib.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * Add default xml declaration (default false)
    */
  var declaration: js.UndefOr[scala.Boolean | xmlLib.Anon_Encoding] = js.undefined
  /**
    * String used for tab, defaults to no tabs (compressed)
    */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return the result as a `stream` (default false)
    */
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    declaration: scala.Boolean | xmlLib.Anon_Encoding = null,
    indent: java.lang.String = null,
    stream: js.UndefOr[scala.Boolean] = js.undefined
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Option]
  }
}


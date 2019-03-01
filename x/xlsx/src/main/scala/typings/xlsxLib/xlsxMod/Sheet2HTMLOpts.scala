package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet2HTMLOpts extends js.Object {
  /** Add contenteditable to every cell */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /** Footer HTML */
  var footer: js.UndefOr[java.lang.String] = js.undefined
  /** Header HTML */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /** TABLE element id attribute */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Sheet2HTMLOpts {
  @scala.inline
  def apply(
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    footer: java.lang.String = null,
    header: java.lang.String = null,
    id: java.lang.String = null
  ): Sheet2HTMLOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Sheet2HTMLOpts]
  }
}


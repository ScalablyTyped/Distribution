package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet2HTMLOpts extends js.Object {
  /** Add contenteditable to every cell */
  var editable: js.UndefOr[Boolean] = js.undefined
  /** Footer HTML */
  var footer: js.UndefOr[String] = js.undefined
  /** Header HTML */
  var header: js.UndefOr[String] = js.undefined
  /** TABLE element id attribute */
  var id: js.UndefOr[String] = js.undefined
}

object Sheet2HTMLOpts {
  @scala.inline
  def apply(
    editable: js.UndefOr[Boolean] = js.undefined,
    footer: String = null,
    header: String = null,
    id: String = null
  ): Sheet2HTMLOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sheet2HTMLOpts]
  }
}


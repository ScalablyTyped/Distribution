package typings.wixStyleReact.baseComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WixComponentProps extends js.Object {
  var dataHook: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[String] = js.undefined
}

object WixComponentProps {
  @scala.inline
  def apply(dataHook: String = null, styles: String = null): WixComponentProps = {
    val __obj = js.Dynamic.literal()
    if (dataHook != null) __obj.updateDynamic("dataHook")(dataHook.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WixComponentProps]
  }
}


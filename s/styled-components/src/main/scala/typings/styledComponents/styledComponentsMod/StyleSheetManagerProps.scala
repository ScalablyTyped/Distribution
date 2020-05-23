package typings.styledComponents.styledComponentsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetManagerProps extends js.Object {
  var disableCSSOMInjection: js.UndefOr[Boolean] = js.undefined
  var disableVendorPrefixes: js.UndefOr[Boolean] = js.undefined
  var sheet: js.UndefOr[ServerStyleSheet] = js.undefined
  var stylisPlugins: js.UndefOr[js.Array[StylisPlugin]] = js.undefined
  var target: js.UndefOr[HTMLElement] = js.undefined
}

object StyleSheetManagerProps {
  @scala.inline
  def apply(
    disableCSSOMInjection: js.UndefOr[Boolean] = js.undefined,
    disableVendorPrefixes: js.UndefOr[Boolean] = js.undefined,
    sheet: ServerStyleSheet = null,
    stylisPlugins: js.Array[StylisPlugin] = null,
    target: HTMLElement = null
  ): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCSSOMInjection)) __obj.updateDynamic("disableCSSOMInjection")(disableCSSOMInjection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableVendorPrefixes)) __obj.updateDynamic("disableVendorPrefixes")(disableVendorPrefixes.get.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    if (stylisPlugins != null) __obj.updateDynamic("stylisPlugins")(stylisPlugins.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
}


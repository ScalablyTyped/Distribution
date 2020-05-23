package typings.wordpressBlockEditor.blockIconMod.BlockIcon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var icon: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
  var showColors: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    icon: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any,
    className: String = null,
    showColors: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(showColors)) __obj.updateDynamic("showColors")(showColors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


package typings.sweetalert.typingsModulesOptionsDeprecationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionReplacement extends js.Object {
  var link: js.UndefOr[String] = js.undefined
  var onlyRename: js.UndefOr[Boolean] = js.undefined
  var replacement: js.UndefOr[String] = js.undefined
  var subOption: js.UndefOr[String] = js.undefined
}

object OptionReplacement {
  @scala.inline
  def apply(
    link: String = null,
    onlyRename: js.UndefOr[Boolean] = js.undefined,
    replacement: String = null,
    subOption: String = null
  ): OptionReplacement = {
    val __obj = js.Dynamic.literal()
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyRename)) __obj.updateDynamic("onlyRename")(onlyRename.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (subOption != null) __obj.updateDynamic("subOption")(subOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionReplacement]
  }
}


package typings.atUifabricExampleDashData.libPeopleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExampleExtendedPersonaProps extends js.Object {
  var canExpand: js.UndefOr[Boolean] = js.undefined
  var imageInitials: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var isValid: Boolean
  var optionalText: js.UndefOr[String] = js.undefined
  var presence: js.UndefOr[Double] = js.undefined
  var secondaryText: js.UndefOr[String] = js.undefined
  var tertiaryText: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object IExampleExtendedPersonaProps {
  @scala.inline
  def apply(
    isValid: Boolean,
    canExpand: js.UndefOr[Boolean] = js.undefined,
    imageInitials: String = null,
    imageUrl: String = null,
    optionalText: String = null,
    presence: Int | Double = null,
    secondaryText: String = null,
    tertiaryText: String = null,
    text: String = null
  ): IExampleExtendedPersonaProps = {
    val __obj = js.Dynamic.literal(isValid = isValid)
    if (!js.isUndefined(canExpand)) __obj.updateDynamic("canExpand")(canExpand)
    if (imageInitials != null) __obj.updateDynamic("imageInitials")(imageInitials)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (optionalText != null) __obj.updateDynamic("optionalText")(optionalText)
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText)
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[IExampleExtendedPersonaProps]
  }
}


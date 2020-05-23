package typings.wordpressComponents.buttonMod.Button

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressComponents.buttonMod.Button.AnchorProps
  - typings.wordpressComponents.buttonMod.Button.ButtonProps
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def AnchorProps(
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    Props: Props = null,
    isBusy: js.UndefOr[Boolean] = js.undefined,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isDestructive: js.UndefOr[Boolean] = js.undefined,
    isLarge: js.UndefOr[Boolean] = js.undefined,
    isLink: js.UndefOr[Boolean] = js.undefined,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    isSmall: js.UndefOr[Boolean] = js.undefined,
    isTertiary: js.UndefOr[Boolean] = js.undefined,
    isToggled: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (Props != null) js.Dynamic.global.Object.assign(__obj, Props)
    if (!js.isUndefined(isBusy)) __obj.updateDynamic("isBusy")(isBusy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDestructive)) __obj.updateDynamic("isDestructive")(isDestructive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLarge)) __obj.updateDynamic("isLarge")(isLarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSmall)) __obj.updateDynamic("isSmall")(isSmall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTertiary)) __obj.updateDynamic("isTertiary")(isTertiary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isToggled)) __obj.updateDynamic("isToggled")(isToggled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def ButtonProps(
    AllHTMLAttributes: AllHTMLAttributes[HTMLButtonElement] = null,
    ClassAttributes: ClassAttributes[HTMLButtonElement] = null,
    Props: Props = null,
    isBusy: js.UndefOr[Boolean] = js.undefined,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isDestructive: js.UndefOr[Boolean] = js.undefined,
    isLarge: js.UndefOr[Boolean] = js.undefined,
    isLink: js.UndefOr[Boolean] = js.undefined,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    isSmall: js.UndefOr[Boolean] = js.undefined,
    isTertiary: js.UndefOr[Boolean] = js.undefined,
    isToggled: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (Props != null) js.Dynamic.global.Object.assign(__obj, Props)
    if (!js.isUndefined(isBusy)) __obj.updateDynamic("isBusy")(isBusy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDestructive)) __obj.updateDynamic("isDestructive")(isDestructive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLarge)) __obj.updateDynamic("isLarge")(isLarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSmall)) __obj.updateDynamic("isSmall")(isSmall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTertiary)) __obj.updateDynamic("isTertiary")(isTertiary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isToggled)) __obj.updateDynamic("isToggled")(isToggled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


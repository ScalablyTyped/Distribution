package typings.wordpressComponents.buttonMod.Button

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.wordpressComponents.buttonMod.Button.BaseProps because var conflicts: className, disabled. Inlined isDefault, isPrimary, isTertiary, isDestructive, isLarge, isSmall, isToggled, isBusy, isLink */ trait AnchorProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement]
     with Props {
  /**
    * Indicates activity while a action is being performed.
    */
  var isBusy: js.UndefOr[Boolean] = js.undefined
  /**
    * Renders a default button style.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Renders a red text-based button style to indicate destructive
    * behavior.
    */
  var isDestructive: js.UndefOr[Boolean] = js.undefined
  /**
    * Increases the size of the button.
    */
  var isLarge: js.UndefOr[Boolean] = js.undefined
  /**
    * Renders a button with an anchor style.
    */
  var isLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Renders a primary button style.
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * Decreases the size of the button.
    */
  var isSmall: js.UndefOr[Boolean] = js.undefined
  /**
    * Renders a text-based button style.
    */
  var isTertiary: js.UndefOr[Boolean] = js.undefined
  /**
    * Renders a toggled button style.
    */
  var isToggled: js.UndefOr[Boolean] = js.undefined
}

object AnchorProps {
  @scala.inline
  def apply(
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
  ): AnchorProps = {
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
    __obj.asInstanceOf[AnchorProps]
  }
}


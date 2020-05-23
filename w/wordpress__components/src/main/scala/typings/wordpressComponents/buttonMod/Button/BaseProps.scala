package typings.wordpressComponents.buttonMod.Button

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
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

object BaseProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isBusy: js.UndefOr[Boolean] = js.undefined,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isDestructive: js.UndefOr[Boolean] = js.undefined,
    isLarge: js.UndefOr[Boolean] = js.undefined,
    isLink: js.UndefOr[Boolean] = js.undefined,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    isSmall: js.UndefOr[Boolean] = js.undefined,
    isTertiary: js.UndefOr[Boolean] = js.undefined,
    isToggled: js.UndefOr[Boolean] = js.undefined
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBusy)) __obj.updateDynamic("isBusy")(isBusy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDestructive)) __obj.updateDynamic("isDestructive")(isDestructive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLarge)) __obj.updateDynamic("isLarge")(isLarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSmall)) __obj.updateDynamic("isSmall")(isSmall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTertiary)) __obj.updateDynamic("isTertiary")(isTertiary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isToggled)) __obj.updateDynamic("isToggled")(isToggled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}


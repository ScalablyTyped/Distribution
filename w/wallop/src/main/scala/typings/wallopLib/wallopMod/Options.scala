package typings
package wallopLib.wallopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Override class for "next" button.
    *
    * @default 'Wallop-buttonNext'
    */
  var buttonNextClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override class for "previous" button.
    *
    * @default 'Wallop-buttonPrevious'
    */
  var buttonPreviousClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable/disable carousel mode.
    *
    * @default true
    */
  var carousel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Override class for current item.
    *
    * @default 'Wallop-item--current'
    */
  var currentItemClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override class that hides next item.
    *
    * @default 'Wallop-item--hideNext'
    */
  var hideNextClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override class that hides previous item.
    *
    * @default 'Wallop-item--hidePrevious'
    */
  var hidePreviousClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override class for item.
    *
    * @default 'Wallop-item'
    */
  var itemClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override class for item that will show next.
    *
    * @default 'Wallop-item--showNext'
    */
  var showNextClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override class for item that will showed previously.
    *
    * @default 'Wallop-item--showPrevious'
    */
  var showPreviousClass: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buttonNextClass: java.lang.String = null,
    buttonPreviousClass: java.lang.String = null,
    carousel: js.UndefOr[scala.Boolean] = js.undefined,
    currentItemClass: java.lang.String = null,
    hideNextClass: java.lang.String = null,
    hidePreviousClass: java.lang.String = null,
    itemClass: java.lang.String = null,
    showNextClass: java.lang.String = null,
    showPreviousClass: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (buttonNextClass != null) __obj.updateDynamic("buttonNextClass")(buttonNextClass)
    if (buttonPreviousClass != null) __obj.updateDynamic("buttonPreviousClass")(buttonPreviousClass)
    if (!js.isUndefined(carousel)) __obj.updateDynamic("carousel")(carousel)
    if (currentItemClass != null) __obj.updateDynamic("currentItemClass")(currentItemClass)
    if (hideNextClass != null) __obj.updateDynamic("hideNextClass")(hideNextClass)
    if (hidePreviousClass != null) __obj.updateDynamic("hidePreviousClass")(hidePreviousClass)
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass)
    if (showNextClass != null) __obj.updateDynamic("showNextClass")(showNextClass)
    if (showPreviousClass != null) __obj.updateDynamic("showPreviousClass")(showPreviousClass)
    __obj.asInstanceOf[Options]
  }
}


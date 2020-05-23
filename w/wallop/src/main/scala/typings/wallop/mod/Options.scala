package typings.wallop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Override class for "next" button.
    *
    * @default 'Wallop-buttonNext'
    */
  var buttonNextClass: js.UndefOr[String] = js.undefined
  /**
    * Override class for "previous" button.
    *
    * @default 'Wallop-buttonPrevious'
    */
  var buttonPreviousClass: js.UndefOr[String] = js.undefined
  /**
    * Enable/disable carousel mode.
    *
    * @default true
    */
  var carousel: js.UndefOr[Boolean] = js.undefined
  /**
    * Override class for current item.
    *
    * @default 'Wallop-item--current'
    */
  var currentItemClass: js.UndefOr[String] = js.undefined
  /**
    * Override class that hides next item.
    *
    * @default 'Wallop-item--hideNext'
    */
  var hideNextClass: js.UndefOr[String] = js.undefined
  /**
    * Override class that hides previous item.
    *
    * @default 'Wallop-item--hidePrevious'
    */
  var hidePreviousClass: js.UndefOr[String] = js.undefined
  /**
    * Override class for item.
    *
    * @default 'Wallop-item'
    */
  var itemClass: js.UndefOr[String] = js.undefined
  /**
    * Override class for item that will show next.
    *
    * @default 'Wallop-item--showNext'
    */
  var showNextClass: js.UndefOr[String] = js.undefined
  /**
    * Override class for item that will showed previously.
    *
    * @default 'Wallop-item--showPrevious'
    */
  var showPreviousClass: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buttonNextClass: String = null,
    buttonPreviousClass: String = null,
    carousel: js.UndefOr[Boolean] = js.undefined,
    currentItemClass: String = null,
    hideNextClass: String = null,
    hidePreviousClass: String = null,
    itemClass: String = null,
    showNextClass: String = null,
    showPreviousClass: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (buttonNextClass != null) __obj.updateDynamic("buttonNextClass")(buttonNextClass.asInstanceOf[js.Any])
    if (buttonPreviousClass != null) __obj.updateDynamic("buttonPreviousClass")(buttonPreviousClass.asInstanceOf[js.Any])
    if (!js.isUndefined(carousel)) __obj.updateDynamic("carousel")(carousel.get.asInstanceOf[js.Any])
    if (currentItemClass != null) __obj.updateDynamic("currentItemClass")(currentItemClass.asInstanceOf[js.Any])
    if (hideNextClass != null) __obj.updateDynamic("hideNextClass")(hideNextClass.asInstanceOf[js.Any])
    if (hidePreviousClass != null) __obj.updateDynamic("hidePreviousClass")(hidePreviousClass.asInstanceOf[js.Any])
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass.asInstanceOf[js.Any])
    if (showNextClass != null) __obj.updateDynamic("showNextClass")(showNextClass.asInstanceOf[js.Any])
    if (showPreviousClass != null) __obj.updateDynamic("showPreviousClass")(showPreviousClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


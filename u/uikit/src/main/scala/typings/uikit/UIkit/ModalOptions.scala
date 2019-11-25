package typings.uikit.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptions extends js.Object {
  /**
    * Allow modal to close automatically when clicking on the modal overlay
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var bgclose: js.UndefOr[Boolean] = js.undefined
  /**
    * Vertically center the modal
    * @default false
    * <h2>Possible value</h2>
    * boolean
    */
  var center: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows controls from keyboard (ESC to close)
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the height for overflow container to start scrolling
    * @default 150
    * <h2>Possible value</h2>
    * integer
    */
  var minScrollHeight: js.UndefOr[Double] = js.undefined
  /**
    * Close currently opened modals on opening modal
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var modal: js.UndefOr[Boolean] = js.undefined
}

object ModalOptions {
  @scala.inline
  def apply(
    bgclose: js.UndefOr[Boolean] = js.undefined,
    center: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    minScrollHeight: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined
  ): ModalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bgclose)) __obj.updateDynamic("bgclose")(bgclose.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (minScrollHeight != null) __obj.updateDynamic("minScrollHeight")(minScrollHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
}


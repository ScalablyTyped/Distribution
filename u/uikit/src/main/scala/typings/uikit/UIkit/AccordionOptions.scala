package typings.uikit.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionOptions extends js.Object {
  /**
    * Animate toggle
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * Class to add when an item is active
    * @default uk-active
    * <h2>Possible value</h2>
    * string
    */
  var clsactive: js.UndefOr[String] = js.undefined
  /**
    * Allow multiple open items
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var collapse: js.UndefOr[Boolean] = js.undefined
  /**
    * Css selector for content containers
    * @default .uk-accordion-content
    * <h2>Possible value</h2>
    * string
    */
  var containers: js.UndefOr[String] = js.undefined
  /**
    * Animation duration
    * @default 300
    * <h2>Possible value</h2>
    * integer
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Animation function
    * @default swing
    * <h2>Possible value</h2>
    * string
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * Show first item on init
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var showfirst: js.UndefOr[Boolean] = js.undefined
  /**
    * Css selector for toggles
    * @default .uk-accordion-title
    * <h2>Possible value</h2>
    * string
    */
  var toggle: js.UndefOr[String] = js.undefined
}

object AccordionOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    clsactive: String = null,
    collapse: js.UndefOr[Boolean] = js.undefined,
    containers: String = null,
    duration: Int | Double = null,
    easing: String = null,
    showfirst: js.UndefOr[Boolean] = js.undefined,
    toggle: String = null
  ): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (clsactive != null) __obj.updateDynamic("clsactive")(clsactive.asInstanceOf[js.Any])
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(showfirst)) __obj.updateDynamic("showfirst")(showfirst.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionOptions]
  }
}


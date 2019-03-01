package typings
package uikitLib.UIkitNs

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
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class to add when an item is active
    * @default uk-active
    * <h2>Possible value</h2>
    * string
    */
  var clsactive: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow multiple open items
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var collapse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Css selector for content containers
    * @default .uk-accordion-content
    * <h2>Possible value</h2>
    * string
    */
  var containers: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Animation duration
    * @default 300
    * <h2>Possible value</h2>
    * integer
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation function
    * @default swing
    * <h2>Possible value</h2>
    * string
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Show first item on init
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var showfirst: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Css selector for toggles
    * @default .uk-accordion-title
    * <h2>Possible value</h2>
    * string
    */
  var toggle: js.UndefOr[java.lang.String] = js.undefined
}

object AccordionOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    clsactive: java.lang.String = null,
    collapse: js.UndefOr[scala.Boolean] = js.undefined,
    containers: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    showfirst: js.UndefOr[scala.Boolean] = js.undefined,
    toggle: java.lang.String = null
  ): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (clsactive != null) __obj.updateDynamic("clsactive")(clsactive)
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (containers != null) __obj.updateDynamic("containers")(containers)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(showfirst)) __obj.updateDynamic("showfirst")(showfirst)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[AccordionOptions]
  }
}


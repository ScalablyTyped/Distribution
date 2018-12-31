package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyOptions extends js.Object {
  /**
    * UIkit animation class
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set to <code>true</code> to bind sticky to the parent or a Css selector to bind sticky to a specific element.
    * @default false
    * <h2>Possible value</h2>
    * mixed
    */
  var boundary: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Active class to add, when element is sticky
    * @default uk-active
    * <h2>Possible value</h2>
    * string
    */
  var clsactive: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class to add, when element is not sticky
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var clsinactive: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Init class when the element is sticky for the first time
    * @default uk-sticky-init
    * <h2>Possible value</h2>
    * string
    */
  var clsinit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Css selector where to get the width from in sticky mode. By default it takes the width from the created wrapper element.
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var getWidthFrom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Condition for the active status with a width as integer (e.g. 640) or a css media query
    * @default false
    * <h2>Possible value</h2>
    * integer / string
    */
  var media: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Show sticky element only when scrolling up.
    * @default false
    * <h2>Possible value</h2>
    * boolean
    */
  var showup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Make sure that a sticky element is not over a targeted element via location hash on dom-ready.
    * @default false
    * <h2>Possible value</h2>
    * boolean
    */
  var target: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Top offset whent sticky should be triggered
    * @default 0
    * <h2>Possible value</h2>
    * integer
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}


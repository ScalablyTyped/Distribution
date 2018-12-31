package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallaxOptions extends js.Object {
  /**
    * Condition for the active status with a width as integer (e.g. 640) or a css media query
    * @default false
    * <h2>Possible Value</h2>
    * integer / string
    */
  var media: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Element dimension reference for animation duration.
    * @default false
    */
  var target: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Animation velocity during scrolling
    * @default 0.5
    */
  var velocity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation range depending on the viewport.
    * <h2>Possible value</h2>
    * float (0 to 1)
    * @default false
    */
  var viewport: js.UndefOr[scala.Double] = js.undefined
}


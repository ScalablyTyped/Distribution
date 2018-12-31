package typings
package uikitLib.UIkitNs

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
  var bgclose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertically center the modal
    * @default false
    * <h2>Possible value</h2>
    * boolean
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows controls from keyboard (ESC to close)
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the height for overflow container to start scrolling
    * @default 150
    * <h2>Possible value</h2>
    * integer
    */
  var minScrollHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Close currently opened modals on opening modal
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
}


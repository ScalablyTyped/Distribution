package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Return a new instance of nlobjButton.
 *
 * @classDescription buttons used for triggering custom behaviors on pages.
 * @return {nlobjButton}
 * @constructor
 *
 * @since 2009.2
 */
@js.native
trait nlobjButton
  extends /**
     *
     * @return
     */
ScalablyTyped.runtime.Instantiable0[nlobjButton] {
  /**
       * disable or enable button.
       * @param {boolean} disabled if true then this button should be disabled on the page
       * @return {nlobjButton}
       *
       * @method
       * @memberOf nlobjButton
       *
       * @since 2008.2
       * @param disabled
       * @return
       */
  def setDisabled(disabled: scala.Boolean): nlobjButton = js.native
  /**
       * set the label for this button.
       * @param {string} label display label for button
       * @return {nlobjButton}
       *
       * @method
       * @memberOf nlobjButton
       *
       * @since 2008.2
       * @param label
       * @return
       */
  def setLabel(label: java.lang.String): nlobjButton = js.native
  def setVisible(visible: scala.Boolean): nlobjButton = js.native
}


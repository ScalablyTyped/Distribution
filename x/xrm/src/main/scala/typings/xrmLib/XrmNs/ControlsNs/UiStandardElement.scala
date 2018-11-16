package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Base interface for standard UI elements.
         */

trait UiStandardElement
  extends UiCanGetVisibleElement
     with UiLabelElement {
  /**
               * Sets the visibility state.
               * @param visible true to show, false to hide.
               */
  def setVisible(visible: scala.Boolean): scala.Unit
}


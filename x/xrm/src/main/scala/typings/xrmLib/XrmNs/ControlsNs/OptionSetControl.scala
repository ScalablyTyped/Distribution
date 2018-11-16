package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for an OptionSet control.
         *
         * @see {@link StandardControl}
         */
@js.native
trait OptionSetControl extends StandardControl {
  /**
               * Adds an option.
               *
               * @param option The option.
               * @param index (Optional) zero-based index of the option.
               *
               * @remarks This method does not check that the values within the options you add are valid.
               *          If index is not provided, the new option will be added to the end of the list.
               */
  def addOption(option: xrmLib.XrmNs.OptionSetValue): scala.Unit = js.native
  /**
               * Adds an option.
               *
               * @param option The option.
               * @param index (Optional) zero-based index of the option.
               *
               * @remarks This method does not check that the values within the options you add are valid.
               *          If index is not provided, the new option will be added to the end of the list.
               */
  def addOption(option: xrmLib.XrmNs.OptionSetValue, index: scala.Double): scala.Unit = js.native
  /**
               * Clears all options.
               */
  def clearOptions(): scala.Unit = js.native
  /**
               * Removes the option matching the value.
               *
               * @param value The value.
               */
  def removeOption(value: scala.Double): scala.Unit = js.native
}


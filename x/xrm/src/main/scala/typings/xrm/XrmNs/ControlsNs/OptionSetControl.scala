package typings.xrm.XrmNs.ControlsNs

import typings.xrm.XrmNs.OptionSetValue
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
  def addOption(option: OptionSetValue): Unit = js.native
  def addOption(option: OptionSetValue, index: Double): Unit = js.native
  /**
    * Clears all options.
    */
  def clearOptions(): Unit = js.native
  /**
    * Removes the option matching the value.
    *
    * @param value The value.
    */
  def removeOption(value: Double): Unit = js.native
}


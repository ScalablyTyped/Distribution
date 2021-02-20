package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.OptionSetValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

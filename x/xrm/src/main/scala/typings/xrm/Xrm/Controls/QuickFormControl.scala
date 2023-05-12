package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a quick view control instance on a form.
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui-quickforms External Link: formContext.ui.quickForms (Client API reference)}
  */
@js.native
trait QuickFormControl
  extends StObject
     with Control
     with UiFocusable
     with UiCanGetDisabledElement
     with UiCanSetDisabledElement
     with UiCanSetVisibleElement {
  
  /**
    * Gets the constituent controls in a quick view control.
    * @returns An array of controls.
    * @remarks Constituent controls in a quick view control are read only.
    */
  def getControl(): js.Array[Control] = js.native
  /**
    * Gets the constituent controls in a quick view control.
    * @param controlName Name of the control.
    * @returns The control.
    * @remarks Constituent controls in a quick view control are read only.
    */
  def getControl(controlName: String): Control = js.native
  /**
    * Gets a control by index.
    * @param index The control index.
    * @returns The control.
    * @remarks Constituent controls in a quick view control are read only.
    */
  def getControl(index: Double): Control = js.native
  /**
    * Gets the constituent controls in a quick view control.
    * @param T A Control type
    * @param controlName Name of the control.
    * @returns The control.
    * @remarks Constituent controls in a quick view control are read only.
    */
  @JSName("getControl")
  def getControl_T_T[T /* <: Control */](controlName: String): T = js.native
  /**
    * Gets a control by index.
    * @param T A Control type
    * @param index The control index.
    * @returns The control.
    * @remarks Constituent controls in a quick view control are read only.
    */
  @JSName("getControl")
  def getControl_T_T[T /* <: Control */](index: Double): T = js.native
  
  /**
    * Returns whether the data binding for the constituent controls in a quick view control is complete.
    * @returns  True is the data binding for a constituent control is complete, otherwise false.
    *          because the quick view form that the control is bound to may not have loaded completely.
    *          As a result, using the getAttribute or any data-related methods on a constituent control might not work.
    *          The isLoaded method for the quick view control helps determine the data binding status for constituent controls in a quick view control.
    * @remarks The data binding for the constituent controls in a quick view control may not be complete during the main form OnLoad event
    */
  def isLoaded(): Boolean = js.native
  
  /**
    * Refreshes the data displayed in a quick view control.
    */
  def refresh(): Unit = js.native
}

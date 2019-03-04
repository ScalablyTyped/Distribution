package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a CRM grid control.
  *
  * @see {@link Control}
  */
trait GridControl extends Control {
  /**
    * Use this method to add event handlers to the GridControl's OnLoad event.
    *
    * @param handler The event handler.
    */
  def addOnLoad(handler: js.Function0[scala.Unit]): scala.Unit
  /**
    * This method returns context information about the GridControl.
    *
    * @returns The context type.
    */
  def getContextType(): xrmLib.XrmEnumNs.GridControlContext
  /**
    * Use this method to get the logical name of the entity data displayed in the grid.
    *
    * @returns The entity name.
    */
  def getEntityName(): java.lang.String
  /**
    * Use this method to get access to the Grid available in the GridControl.
    * @returns The grid.
    */
  def getGrid(): Grid
  /**
    * Use this method to get access to the ViewSelector available for the GridControl when it is configured to display views.
    * @returns The view selector.
    */
  def getViewSelector(): ViewSelector
  /**
    * Refreshes the sub grid.
    * @remarks Not available during the "on load" event of the form.
    */
  def refresh(): scala.Unit
  /**
    * Use this method to remove event handlers from the GridControl's OnLoad event.
    * @param handler The handler.
    */
  def removeOnLoad(handler: js.Function0[scala.Unit]): scala.Unit
}

object GridControl {
  @scala.inline
  def apply(
    addOnLoad: js.Function1[js.Function0[scala.Unit], scala.Unit],
    getContextType: js.Function0[xrmLib.XrmEnumNs.GridControlContext],
    getControlType: js.Function0[ControlType | java.lang.String],
    getEntityName: js.Function0[java.lang.String],
    getGrid: js.Function0[Grid],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[Section],
    getViewSelector: js.Function0[ViewSelector],
    getVisible: js.Function0[scala.Boolean],
    refresh: js.Function0[scala.Unit],
    removeOnLoad: js.Function1[js.Function0[scala.Unit], scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): GridControl = {
    val __obj = js.Dynamic.literal(addOnLoad = addOnLoad, getContextType = getContextType, getControlType = getControlType, getEntityName = getEntityName, getGrid = getGrid, getLabel = getLabel, getName = getName, getParent = getParent, getViewSelector = getViewSelector, getVisible = getVisible, refresh = refresh, removeOnLoad = removeOnLoad, setLabel = setLabel)
  
    __obj.asInstanceOf[GridControl]
  }
}


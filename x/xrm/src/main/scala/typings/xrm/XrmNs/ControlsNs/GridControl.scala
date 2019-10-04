package typings.xrm.XrmNs.ControlsNs

import typings.xrm.XrmEnumNs.GridControlContext
import typings.xrm.XrmNs.EventsNs.ContextSensitiveHandler
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
  def addOnLoad(handler: ContextSensitiveHandler): Unit
  /**
    * This method returns context information about the GridControl.
    *
    * @returns The context type.
    */
  def getContextType(): GridControlContext
  /**
    * Use this method to get the logical name of the entity data displayed in the grid.
    *
    * @returns The entity name.
    */
  def getEntityName(): String
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
  def refresh(): Unit
  /**
    * Use this method to remove event handlers from the GridControl's OnLoad event.
    * @param handler The handler.
    */
  def removeOnLoad(handler: js.Function0[Unit]): Unit
}

object GridControl {
  @scala.inline
  def apply(
    addOnLoad: ContextSensitiveHandler => Unit,
    getContextType: () => GridControlContext,
    getControlType: () => ControlType | String,
    getEntityName: () => String,
    getGrid: () => Grid,
    getLabel: () => String,
    getName: () => String,
    getParent: () => Section,
    getViewSelector: () => ViewSelector,
    getVisible: () => Boolean,
    refresh: () => Unit,
    removeOnLoad: js.Function0[Unit] => Unit,
    setLabel: String => Unit
  ): GridControl = {
    val __obj = js.Dynamic.literal(addOnLoad = js.Any.fromFunction1(addOnLoad), getContextType = js.Any.fromFunction0(getContextType), getControlType = js.Any.fromFunction0(getControlType), getEntityName = js.Any.fromFunction0(getEntityName), getGrid = js.Any.fromFunction0(getGrid), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getViewSelector = js.Any.fromFunction0(getViewSelector), getVisible = js.Any.fromFunction0(getVisible), refresh = js.Any.fromFunction0(refresh), removeOnLoad = js.Any.fromFunction1(removeOnLoad), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[GridControl]
  }
}


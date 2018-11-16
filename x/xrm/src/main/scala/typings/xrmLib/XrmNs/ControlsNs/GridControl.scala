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


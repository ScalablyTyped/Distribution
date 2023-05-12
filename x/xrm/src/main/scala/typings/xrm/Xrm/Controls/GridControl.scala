package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Events.GridControl.LoadEventHandler
import typings.xrm.XrmEnum.GridClient
import typings.xrm.XrmEnum.GridControlContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a CRM grid control.
  *
  * @see {@link Control}
  */
@js.native
trait GridControl
  extends StObject
     with Control
     with UiCanSetVisibleElement {
  
  /**
    * Use this method to add event handlers to the GridControl's OnLoad event.
    * @param handler The event handler.
    */
  def addOnLoad(handler: LoadEventHandler): Unit = js.native
  
  /**
    * This method returns context information about the GridControl.
    * @returns The context type.
    */
  def getContextType(): GridControlContext = js.native
  
  /**
    * Gets the logical name of the table data displayed in the grid.
    * @returns The logical name of the table data displayed in the grid.
    */
  def getEntityName(): String = js.native
  
  /**
    * Gets the FetchXML query that represents the current data, including filtered and sorted data, in the grid control.
    * @returns The FetchXML query.
    */
  def getFetchXml(): String = js.native
  
  /**
    * Get access to the Grid available in the GridControl (gridContext).
    * @returns The Grid object.
    */
  def getGrid(): Grid = js.native
  
  /**
    * Gets information about the relationship used to filter the subgrid.
    * @returns A relationship object.
    */
  def getRelationship(): GridRelationship = js.native
  
  /**
    * Gets the URL of the current grid control.
    * @param client Indicates the client type.
    * @returns Gets the URL of the current grid control.
    */
  def getUrl(): String = js.native
  def getUrl(client: GridClient): String = js.native
  
  /**
    * Use this method to get access to the ViewSelector available for the GridControl when it is configured to display views.
    * @returns The view selector.
    */
  def getViewSelector(): ViewSelector = js.native
  
  /**
    * Displays the associated grid for the grid.
    * @remarks This method does nothing if the grid is not filtered based on a relationship.
    */
  def openRelatedGrid(): Unit = js.native
  
  /**
    * Refreshes the sub grid.
    * @remarks Not available during the "on load" event of the form.
    */
  def refresh(): Unit = js.native
  
  /**
    * Refreshes the sub grid ribbon.
    * @see {@link https://learn.microsoft.com/it-it/power-apps/developer/model-driven-apps/clientapi/reference/grids/gridcontrol/refreshribbon External Link: refreshRibbon (Client API reference)}
    */
  def refreshRibbon(): Unit = js.native
  
  /**
    * Use this method to remove event handlers from the GridControl's OnLoad event.
    * @param handler The handler.
    */
  def removeOnLoad(handler: js.Function0[Unit]): Unit = js.native
}

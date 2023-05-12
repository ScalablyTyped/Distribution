package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Events.KbSearchControl.PostSearchEventHandler
import typings.xrm.Xrm.Events.KbSearchControl.ResultOpenedEventHandler
import typings.xrm.Xrm.Events.KbSearchControl.SelectionEventHandler
import typings.xrm.XrmEnum.OpenSearchResultMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a knowledge base search control
  */
@js.native
trait KbSearchControl
  extends StObject
     with Control {
  
  /**
    * Adds an event handler to the PostSearch event.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/addonpostsearch External Link: addOnPostSearch (Client API reference)}
    */
  def addOnPostSearch(handler: PostSearchEventHandler): Unit = js.native
  
  /**
    * Adds an event handler to the OnResultOpened event.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/addonresultopened External Link: addOnResultOpened (Client API reference)}
    */
  def addOnResultOpened(handler: ResultOpenedEventHandler): Unit = js.native
  
  /**
    * Adds an event handler to the OnSelection event.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/addonselection External Link: addOnSelection (Client API reference)}
    */
  def addOnSelection(handler: SelectionEventHandler): Unit = js.native
  
  /**
    * Gets the text used as the search criteria for the knowledge base management control.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/getsearchquery External Link: getSearchQuery (Client API reference)}
    */
  def getSearchQuery(): String = js.native
  
  /**
    * Gets the currently selected result of the search control. The currently selected result also represents the result that is currently open.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/getselectedresults External Link: getSelectedResults (Client API Reference)}
    */
  def getSelectedResults(): KbSearchResult = js.native
  
  /**
    * Gets the count of results found in the search control.
    * @returns The count of the search result.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/gettotalresultcount External Link: getTotalResultCount (Client API reference)}
    */
  def getTotalResultCount(): Double = js.native
  
  /**
    * Opens a search result in the search control by specifying the result number.
    * @param resultNumber Numerical value specifying the result number to be opened. Result number starts from 1.
    * @param mode Specify "Inline" or "Popout". "Inline" mode opens the result inline either in the reading pane of the control or in a reference panel tab in case of reference panel. "Popout" mode opens the result in a pop-out window.
    * @returns Status of opening the specified search result. Returns 1 if successful; 0 if unsuccessful. The method will return -1 if the specified resultNumber value is not present, or if the specified mode value is invalid.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/opensearchresult External Link: openSearchResult (Client API reference)}
    */
  def openSearchResult(resultNumber: Double): Boolean = js.native
  def openSearchResult(resultNumber: Double, mode: OpenSearchResultMode): Boolean = js.native
  
  /**
    * Removes an event handler from the PostSearch event.
    * @param handler The function to remove from the PostSearch event.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/removeonpostsearch External Link: removeOnPostSearch (Client API reference)}
    */
  def removeOnPostSearch(handler: PostSearchEventHandler): Unit = js.native
  
  /**
    * Removes an event handler from the OnResultOpened event.
    * @param handler The function to remove from the OnResultOpened event.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/removeonresultopened External Link: removeOnResultOpened (Client API reference)}
    */
  def removeOnResultOpened(handler: ResultOpenedEventHandler): Unit = js.native
  
  /**
    * Removes an event handler from the OnResultSelection event.
    * @param handler The function to remove from the OnSelection event.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/removeonselection External Link: removeOnSelection (Client API reference)}
    */
  def removeOnSelection(handler: SelectionEventHandler): Unit = js.native
  
  /**
    * Sets the text used as the search criteria for the knowledge base search control.
    * @param searchString The text for the search query.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/controls/setsearchquery External Link: setSearchQuery (Client API reference)}
    */
  def setSearchQuery(searchString: String): Unit = js.native
}

package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables the user to perform search queries and select suggestions.
  **/
@js.native
trait SearchBox extends js.Object {
  
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets whether the first suggestion is chosen when the user presses Enter.
    **/
  var chooseSuggestionOnEnter: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the SearchBox is disabled. If the control is disabled, it won't receive focus.
    **/
  var disabled: Boolean = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Releases resources held by this SearchBox. Call this method when the SearchBox is no longer needed. After calling this method, the SearchBox becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts the SearchBox.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets a value that specifies whether the search box automatically receives focus when the user types into the app window.
    **/
  var focusOnKeyboardInput: Boolean = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Raised when the user or the app changes the queryText.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.language, detail.queryText, detail.linguisticDetails.
    **/
  def onquerychanged(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Raised awhen the user clicks the search glyph or presses Enter.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.language, detail.queryText, detail.linguisticDetails, detail.keyModifiers.
    **/
  def onquerysubmitted(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Raised when the user selects a suggested option for the search.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.tag, detail.keyModifiers, detail.storageFile.
    **/
  def onresultsuggestionchosen(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Raised when the system requests search suggestions from this app.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.language, detail.linguisticDetails, detail.queryText, detail.searchSuggestionCollection.
    **/
  def onsuggestionsrequested(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Gets or sets the placeholder text for the SearchBox. This text is displayed if there is no other text in the input box.
    **/
  var placeholderText: String = js.native
  
  /**
    * Gets or sets the query text for the SearchBox.
    **/
  var queryText: String = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets the search history context. This context is used a secondary key (the app ID is the primary key) for storing search history.
    **/
  var searchHistoryContext: String = js.native
  
  /**
    * Gets or sets a value that specifies whether search history is disabled.
    **/
  var searchHistoryDisabled: Boolean = js.native
  
  /**
    * Specifies whether suggestions based on local files are automatically displayed in the search pane, and defines the criteria that Windows uses to locate and filter these suggestions.
    * @param settings The new settings for local content suggestions.
    **/
  def setLocalContentSuggestionSettings(settings: js.Any): Unit = js.native
}

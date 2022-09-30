package typings.webextensionPolyfill.tabsMod.Tabs

import typings.webextensionPolyfill.eventsMod.Events.Event
import typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.ImageDetails
import typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.InjectDetails
import typings.webextensionPolyfill.runtimeMod.Runtime.Port
import typings.webextensionPolyfill.webextensionPolyfillInts.`-1`
import typings.webextensionPolyfill.windowsMod.Windows.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends StObject {
  
  /**
    * An ID which represents the absence of a browser tab.
    */
  var TAB_ID_NONE: `-1` = js.native
  
  /**
    * Captures an area of a specified tab. You must have $(topic:declare_permissions)[&lt;all_urls&gt;]
    * permission to use this method.
    *
    * @param tabId Optional. The tab to capture. Defaults to the active tab of the current window.
    * @param options Optional.
    */
  def captureTab(): js.Promise[String] = js.native
  def captureTab(tabId: Double): js.Promise[String] = js.native
  def captureTab(tabId: Double, options: ImageDetails): js.Promise[String] = js.native
  def captureTab(tabId: Unit, options: ImageDetails): js.Promise[String] = js.native
  
  /**
    * Captures an area of the currently active tab in the specified window. You must have $(topic:declare_permissions)
    * [&lt;all_urls&gt;] permission to use this method.
    *
    * @param windowId Optional. The target window. Defaults to the $(topic:current-window)[current window].
    * @param options Optional.
    */
  def captureVisibleTab(): js.Promise[String] = js.native
  def captureVisibleTab(windowId: Double): js.Promise[String] = js.native
  def captureVisibleTab(windowId: Double, options: ImageDetails): js.Promise[String] = js.native
  def captureVisibleTab(windowId: Unit, options: ImageDetails): js.Promise[String] = js.native
  
  /**
    * Connects to the content script(s) in the specified tab. The $(ref:runtime.onConnect)
    * event is fired in each content script running in the specified tab for the current extension. For more details,
    * see $(topic:messaging)[Content Script Messaging].
    *
    * @param tabId
    * @param connectInfo Optional.
    * @returns A port that can be used to communicate with the content scripts running in the specified tab.
    * The port's $(ref:runtime.Port) event is fired if the tab closes or does not exist.
    */
  def connect(tabId: Double): Port = js.native
  def connect(tabId: Double, connectInfo: ConnectConnectInfoType): Port = js.native
  
  /**
    * Creates a new tab.
    *
    * @param createProperties
    */
  def create(createProperties: CreateCreatePropertiesType): js.Promise[Tab] = js.native
  
  /**
    * Detects the primary language of the content in a tab.
    *
    * @param tabId Optional. Defaults to the active tab of the $(topic:current-window)[current window].
    */
  def detectLanguage(): js.Promise[String] = js.native
  def detectLanguage(tabId: Double): js.Promise[String] = js.native
  
  def discard(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * discards one or more tabs.
    *
    * @param tabIds The tab or list of tabs to discard.
    */
  def discard(tabIds: Double): js.Promise[Unit] = js.native
  
  /**
    * Duplicates a tab.
    *
    * @param tabId The ID of the tab which is to be duplicated.
    * @param duplicateProperties Optional.
    */
  def duplicate(tabId: Double): js.Promise[Tab] = js.native
  def duplicate(tabId: Double, duplicateProperties: DuplicateDuplicatePropertiesType): js.Promise[Tab] = js.native
  
  /**
    * Injects JavaScript code into a page. For details, see the $(topic:content_scripts)[programmatic injection]
    * section of the content scripts doc.
    *
    * @param details Details of the script to run.
    * @returns Called after all the JavaScript has been executed.
    */
  def executeScript(details: InjectDetails): js.Promise[js.Array[Any]] = js.native
  /**
    * Injects JavaScript code into a page. For details, see the $(topic:content_scripts)[programmatic injection]
    * section of the content scripts doc.
    *
    * @param tabId Optional. The ID of the tab in which to run the script; defaults to the active tab of the current window.
    * @param details Details of the script to run.
    * @returns Called after all the JavaScript has been executed.
    */
  def executeScript(tabId: Double, details: InjectDetails): js.Promise[js.Array[Any]] = js.native
  def executeScript(tabId: Unit, details: InjectDetails): js.Promise[js.Array[Any]] = js.native
  
  /**
    * Retrieves details about the specified tab.
    *
    * @param tabId
    */
  def get(tabId: Double): js.Promise[Tab] = js.native
  
  /**
    * Gets the tab that this script call is being made from. May be undefined if called from a non-tab context (for example: a
    * background page or popup view).
    */
  def getCurrent(): js.Promise[Tab] = js.native
  
  /**
    * Gets the current zoom factor of a specified tab.
    *
    * @param tabId Optional. The ID of the tab to get the current zoom factor from; defaults to the active tab of the current
    * window.
    * @returns Called with the tab's current zoom factor after it has been fetched.
    */
  def getZoom(): js.Promise[Double] = js.native
  def getZoom(tabId: Double): js.Promise[Double] = js.native
  
  /**
    * Gets the current zoom settings of a specified tab.
    *
    * @param tabId Optional. The ID of the tab to get the current zoom settings from; defaults to the active tab of the
    * current window.
    * @returns Called with the tab's current zoom settings.
    */
  def getZoomSettings(): js.Promise[ZoomSettings] = js.native
  def getZoomSettings(tabId: Double): js.Promise[ZoomSettings] = js.native
  
  /**
    * Navigate to previous page in tab's history, if available.
    *
    * @param tabId Optional. The ID of the tab to navigate backward.
    */
  def goBack(): js.Promise[Unit] = js.native
  def goBack(tabId: Double): js.Promise[Unit] = js.native
  
  /**
    * Navigate to next page in tab's history, if available
    *
    * @param tabId Optional. The ID of the tab to navigate forward.
    */
  def goForward(): js.Promise[Unit] = js.native
  def goForward(tabId: Double): js.Promise[Unit] = js.native
  
  def hide(tabIds: js.Array[Double]): js.Promise[js.Array[Double]] = js.native
  /**
    * Hides one or more tabs. The <code>"tabHide"</code> permission is required to hide tabs.  Not all tabs are hidable.
    * Returns an array of hidden tabs.
    *
    * @param tabIds The TAB ID or list of TAB IDs to hide.
    */
  def hide(tabIds: Double): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Highlights the given tabs.
    *
    * @param highlightInfo
    */
  def highlight(highlightInfo: HighlightHighlightInfoType): js.Promise[Window] = js.native
  
  /**
    * Injects CSS into a page. For details, see the $(topic:content_scripts)[programmatic injection]
    * section of the content scripts doc.
    *
    * @param details Details of the CSS text to insert.
    * @returns Called when all the CSS has been inserted.
    */
  def insertCSS(details: InjectDetails): js.Promise[Unit] = js.native
  /**
    * Injects CSS into a page. For details, see the $(topic:content_scripts)[programmatic injection]
    * section of the content scripts doc.
    *
    * @param tabId Optional. The ID of the tab in which to insert the CSS; defaults to the active tab of the current window.
    * @param details Details of the CSS text to insert.
    * @returns Called when all the CSS has been inserted.
    */
  def insertCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = js.native
  def insertCSS(tabId: Unit, details: InjectDetails): js.Promise[Unit] = js.native
  
  def move(tabIds: js.Array[Double], moveProperties: MoveMovePropertiesType): js.Promise[Tab | js.Array[Tab]] = js.native
  /**
    * Moves one or more tabs to a new position within its window, or to a new window. Note that tabs can only be moved to and
    * from normal (window.type === "normal") windows.
    *
    * @param tabIds The tab or list of tabs to move.
    * @param moveProperties
    */
  def move(tabIds: Double, moveProperties: MoveMovePropertiesType): js.Promise[Tab | js.Array[Tab]] = js.native
  
  /**
    * Removes an array of tabs from their lines of succession and prepends or appends them in a chain to another tab.
    *
    * @param tabIds An array of tab IDs to move in the line of succession. For each tab in the array,
    * the tab's current predecessors will have their successor set to the tab's current successor,
    * and each tab will then be set to be the successor of the previous tab in the array.
    * Any tabs not in the same window as the tab indicated by the second argument (or the first tab in the array,
    * if no second argument) will be skipped.
    * @param tabId Optional. The ID of a tab to set as the successor of the last tab in the array, or $(ref:tabs.TAB_ID_NONE)
    * to leave the last tab without a successor. If options.append is true, then this tab is made the predecessor of the
    * first tab in the array instead.
    * @param options Optional.
    */
  def moveInSuccession(tabIds: js.Array[Double]): Unit = js.native
  def moveInSuccession(tabIds: js.Array[Double], tabId: Double): Unit = js.native
  def moveInSuccession(tabIds: js.Array[Double], tabId: Double, options: MoveInSuccessionOptionsType): Unit = js.native
  def moveInSuccession(tabIds: js.Array[Double], tabId: Unit, options: MoveInSuccessionOptionsType): Unit = js.native
  
  /**
    * Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time this event fired,
    * but you can listen to onUpdated events to be notified when a URL is set.
    *
    * @param activeInfo
    */
  var onActivated: Event[js.Function1[/* activeInfo */ OnActivatedActiveInfoType, Unit]] = js.native
  
  /**
    * Fired when a tab is attached to a window, for example because it was moved between windows.
    *
    * @param tabId
    * @param attachInfo
    */
  var onAttached: Event[
    js.Function2[/* tabId */ Double, /* attachInfo */ OnAttachedAttachInfoType, Unit]
  ] = js.native
  
  /**
    * Fired when a tab is created. Note that the tab's URL may not be set at the time this event fired,
    * but you can listen to onUpdated events to be notified when a URL is set.
    *
    * @param tab Details of the tab that was created.
    */
  var onCreated: Event[js.Function1[/* tab */ Tab, Unit]] = js.native
  
  /**
    * Fired when a tab is detached from a window, for example because it is being moved between windows.
    *
    * @param tabId
    * @param detachInfo
    */
  var onDetached: Event[
    js.Function2[/* tabId */ Double, /* detachInfo */ OnDetachedDetachInfoType, Unit]
  ] = js.native
  
  /**
    * Fired when the highlighted or selected tabs in a window changes.
    *
    * @param highlightInfo
    */
  var onHighlighted: Event[js.Function1[/* highlightInfo */ OnHighlightedHighlightInfoType, Unit]] = js.native
  
  /**
    * Fired when a tab is moved within a window. Only one move event is fired, representing the tab the user directly moved.
    * Move events are not fired for the other tabs that must move in response. This event is not fired when a tab is moved
    * between windows. For that, see $(ref:tabs.onDetached).
    *
    * @param tabId
    * @param moveInfo
    */
  var onMoved: Event[js.Function2[/* tabId */ Double, /* moveInfo */ OnMovedMoveInfoType, Unit]] = js.native
  
  /**
    * Fired when a tab is closed.
    *
    * @param tabId
    * @param removeInfo
    */
  var onRemoved: Event[js.Function2[/* tabId */ Double, /* removeInfo */ OnRemovedRemoveInfoType, Unit]] = js.native
  
  /**
    * Fired when a tab is replaced with another tab due to prerendering or instant.
    *
    * @param addedTabId
    * @param removedTabId
    */
  var onReplaced: Event[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]] = js.native
  
  /**
    * Fired when a tab is updated.
    */
  var onUpdated: onUpdatedEvent = js.native
  
  /**
    * Fired when a tab is zoomed.
    *
    * @param ZoomChangeInfo
    */
  var onZoomChange: Event[js.Function1[/* ZoomChangeInfo */ OnZoomChangeZoomChangeInfoType, Unit]] = js.native
  
  /**
    * Prints page in active tab.
    */
  def print(): Unit = js.native
  
  /**
    * Shows print preview for page in active tab.
    *
    * @returns Called after print preview entered.
    */
  def printPreview(): js.Promise[Unit] = js.native
  
  /**
    * Gets all tabs that have the specified properties, or all tabs if no properties are specified.
    *
    * @param queryInfo
    */
  def query(queryInfo: QueryQueryInfoType): js.Promise[js.Array[Tab]] = js.native
  
  /**
    * Reload a tab.
    *
    * @param tabId Optional. The ID of the tab to reload; defaults to the selected tab of the current window.
    * @param reloadProperties Optional.
    */
  def reload(): js.Promise[Unit] = js.native
  def reload(tabId: Double): js.Promise[Unit] = js.native
  def reload(tabId: Double, reloadProperties: ReloadReloadPropertiesType): js.Promise[Unit] = js.native
  def reload(tabId: Unit, reloadProperties: ReloadReloadPropertiesType): js.Promise[Unit] = js.native
  
  def remove(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * Closes one or more tabs.
    *
    * @param tabIds The tab or list of tabs to close.
    */
  def remove(tabIds: Double): js.Promise[Unit] = js.native
  
  /**
    * Removes injected CSS from a page. For details, see the $(topic:content_scripts)[programmatic injection]
    * section of the content scripts doc.
    *
    * @param details Details of the CSS text to remove.
    * @returns Called when all the CSS has been removed.
    */
  def removeCSS(details: InjectDetails): js.Promise[Unit] = js.native
  /**
    * Removes injected CSS from a page. For details, see the $(topic:content_scripts)[programmatic injection]
    * section of the content scripts doc.
    *
    * @param tabId Optional. The ID of the tab from which to remove the injected CSS; defaults to the active tab of the
    * current window.
    * @param details Details of the CSS text to remove.
    * @returns Called when all the CSS has been removed.
    */
  def removeCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = js.native
  def removeCSS(tabId: Unit, details: InjectDetails): js.Promise[Unit] = js.native
  
  /**
    * Saves page in active tab as a PDF file.
    *
    * @param pageSettings The page settings used to save the PDF file.
    * @returns Called after save as dialog closed.
    */
  def saveAsPDF(pageSettings: PageSettings): js.Promise[String] = js.native
  
  /**
    * Sends a single message to the content script(s) in the specified tab, with an optional callback to run when a response
    * is sent back.  The $(ref:runtime.onMessage) event is fired in each content script running in the specified tab for the
    * current extension.
    *
    * @param tabId
    * @param message
    * @param options Optional.
    */
  def sendMessage(tabId: Double, message: Any): js.Promise[Any] = js.native
  def sendMessage(tabId: Double, message: Any, options: SendMessageOptionsType): js.Promise[Any] = js.native
  
  /**
    * Zooms a specified tab.
    *
    * @param tabId Optional. The ID of the tab to zoom; defaults to the active tab of the current window.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor.
    * Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    * @returns Called after the zoom factor has been changed.
    */
  def setZoom(tabId: Double, zoomFactor: Double): js.Promise[Unit] = js.native
  def setZoom(tabId: Unit, zoomFactor: Double): js.Promise[Unit] = js.native
  /**
    * Zooms a specified tab.
    *
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor.
    * Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    * @returns Called after the zoom factor has been changed.
    */
  def setZoom(zoomFactor: Double): js.Promise[Unit] = js.native
  
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled.
    * These settings are reset to defaults upon navigating the tab.
    *
    * @param tabId Optional. The ID of the tab to change the zoom settings for; defaults to the active tab of the current
    * window.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    * @returns Called after the zoom settings have been changed.
    */
  def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
  def setZoomSettings(tabId: Unit, zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled.
    * These settings are reset to defaults upon navigating the tab.
    *
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    * @returns Called after the zoom settings have been changed.
    */
  def setZoomSettings(zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
  
  def show(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * Shows one or more tabs.
    *
    * @param tabIds The TAB ID or list of TAB IDs to show.
    */
  def show(tabIds: Double): js.Promise[Unit] = js.native
  
  /**
    * Toggles reader mode for the document in the tab.
    *
    * @param tabId Optional. Defaults to the active tab of the $(topic:current-window)[current window].
    */
  def toggleReaderMode(): js.Promise[Unit] = js.native
  def toggleReaderMode(tabId: Double): js.Promise[Unit] = js.native
  
  /**
    * Modifies the properties of a tab. Properties that are not specified in <var>updateProperties</var> are not modified.
    *
    * @param tabId Optional. Defaults to the selected tab of the $(topic:current-window)[current window].
    * @param updateProperties
    */
  def update(tabId: Double, updateProperties: UpdateUpdatePropertiesType): js.Promise[Tab] = js.native
  def update(tabId: Unit, updateProperties: UpdateUpdatePropertiesType): js.Promise[Tab] = js.native
  /**
    * Modifies the properties of a tab. Properties that are not specified in <var>updateProperties</var> are not modified.
    *
    * @param updateProperties
    */
  def update(updateProperties: UpdateUpdatePropertiesType): js.Promise[Tab] = js.native
  
  /**
    * Warm up a tab
    *
    * @param tabId The ID of the tab to warm up.
    */
  def warmup(tabId: Double): Unit = js.native
}

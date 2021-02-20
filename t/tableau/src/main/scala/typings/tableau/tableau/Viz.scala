package typings.tableau.tableau

import typings.std.HTMLElement
import typings.tableau.tableau.TableauEventName.CUSTOM_VIEW_LOAD
import typings.tableau.tableau.TableauEventName.CUSTOM_VIEW_REMOVE
import typings.tableau.tableau.TableauEventName.CUSTOM_VIEW_SAVE
import typings.tableau.tableau.TableauEventName.CUSTOM_VIEW_SET_DEFAULT
import typings.tableau.tableau.TableauEventName.FILTER_CHANGE
import typings.tableau.tableau.TableauEventName.MARKS_SELECTION
import typings.tableau.tableau.TableauEventName.PARAMETER_VALUE_CHANGE
import typings.tableau.tableau.TableauEventName.STORY_POINT_SWITCH
import typings.tableau.tableau.TableauEventName.TAB_SWITCH
import typings.tableau.tableau.TableauEventName.TOOLBAR_STATE_CHANGE
import typings.tableau.tableau.TableauEventName.VIZ_RESIZE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viz extends StObject {
  
  def addEventListener(event: CUSTOM_VIEW_LOAD, f: ListenerFunction[CustomViewEvent]): Unit = js.native
  def addEventListener(event: CUSTOM_VIEW_REMOVE, f: ListenerFunction[CustomViewEvent]): Unit = js.native
  def addEventListener(event: CUSTOM_VIEW_SAVE, f: ListenerFunction[CustomViewEvent]): Unit = js.native
  def addEventListener(event: CUSTOM_VIEW_SET_DEFAULT, f: ListenerFunction[CustomViewEvent]): Unit = js.native
  def addEventListener(event: FILTER_CHANGE, f: ListenerFunction[FilterEvent]): Unit = js.native
  def addEventListener(event: MARKS_SELECTION, f: ListenerFunction[MarksEvent]): Unit = js.native
  def addEventListener(event: PARAMETER_VALUE_CHANGE, f: ListenerFunction[ParameterEvent]): Unit = js.native
  def addEventListener(event: STORY_POINT_SWITCH, f: ListenerFunction[StoryPointSwitchEvent]): Unit = js.native
  def addEventListener(event: TAB_SWITCH, f: ListenerFunction[TabSwitchEvent]): Unit = js.native
  def addEventListener(event: TOOLBAR_STATE_CHANGE, f: ListenerFunction[ToolbarStateEvent]): Unit = js.native
  def addEventListener(event: VIZ_RESIZE, f: ListenerFunction[VizResizeEvent]): Unit = js.native
  
  /**
    * Cleans up any resources associated with the visualization,
    * removes the visualization from the VizManager instance,
    * and removes any DOM elements from the parentElement object.
    * In effect, this method restores the page to what it was before a Viz object was instantiated.
    */
  def dispose(): Unit = js.native
  
  /** Indicates whether automatic updates are currently paused. */
  def getAreAutomaticUpdatesPaused(): Boolean = js.native
  
  /** Indicates whether the tabs are displayed in the UI. It does not actually hide individual tabs. */
  def getAreTabsHidden(): Boolean = js.native
  
  /** Gets the URL of the visualization asynchronously. */
  def getCurrentUrlAsync(): js.Promise[String] = js.native
  
  /** Indicates whether the visualization is displayed on the hosting page. */
  def getIsHidden(): Boolean = js.native
  
  /** Returns the node that was specified in the constructor. */
  def getParentElement(): HTMLElement = js.native
  
  /** Indicates whether the toolbar is displayed. */
  def getToolbarHidden(): Boolean = js.native
  
  /** The URL of the visualization, as specified in the constructor */
  def getUrl(): String = js.native
  
  /** One Workbook is supported per visualization. */
  def getWorkbook(): Workbook = js.native
  
  /** Shows or hides the iframe element hosting the visualization. */
  def hide(): Unit = js.native
  
  /** Pauses or resumes layout updates. This is useful if you are resizing the visualization or performing multiple calls that could affect the layout. */
  def pauseAutomaticUpdatesAsync(): Unit = js.native
  
  /** Redoes last action on a sheet, defaults to a single redo unless optional parameters is specified. */
  def redoAsync(): js.Promise[Unit] = js.native
  
  /** Equivalent to clicking on the Refresh Data toolbar button. */
  def refreshDataAsync(): js.Promise[Unit] = js.native
  
  /** Removes an event listener from the specified event. */
  def removeEventListener(`type`: TableauEventName, f: ListenerFunction[TableauEvent]): Unit = js.native
  
  def resumeAutomaticUpdatesAsync(): Unit = js.native
  
  /** Equivalent to clicking on the Revert All toolbar button, which restores the workbook to its starting state. */
  def revertAllAsync(): js.Promise[Unit] = js.native
  
  /**
    * Sets the size of the iframe element, which causes the visualization to expand or
    * collapse to fit the iframe element if the visualization size (current sheet's size) is set to AUTOMATIC.
    */
  def setFrameSize(width: Double, height: Double): Unit = js.native
  
  /** Shows or hides the iframe element hosting the visualization. */
  def show(): Unit = js.native
  
  /** Equivalent to clicking on the Download toolbar button, which downloads a copy of the original workbook. */
  def showDownloadWorkbookDialog(): Unit = js.native
  
  def showExportCrossTabDialog(worksheetInDashboard: String): Unit = js.native
  /** Shows the Export CrossTab dialog. The worksheetInDashboard parameter is optional. If not specified, the currently active Worksheet is used. */
  def showExportCrossTabDialog(worksheetInDashboard: Sheet): Unit = js.native
  def showExportCrossTabDialog(worksheetInDashboard: SheetInfo): Unit = js.native
  
  def showExportDataDialog(worksheetInDashboard: String): Unit = js.native
  /**
    * Shows the Export Data dialog, which is currently a popup window. The worksheetInDashboard parameter is optional.
    * If not specified, the currently active Worksheet is used.
    */
  def showExportDataDialog(worksheetInDashboard: Sheet): Unit = js.native
  def showExportDataDialog(worksheetInDashboard: SheetInfo): Unit = js.native
  
  /** Equivalent to clicking on the Export Image toolbar button, which creates a PNG file of the current visualization. */
  def showExportImageDialog(): Unit = js.native
  
  /** Equivalent to clicking on the Export PDF toolbar button, which shows a dialog allowing the user to select options for the export. */
  def showExportPDFDialog(): Unit = js.native
  
  /**
    * Equivalent to clicking on the Share toolbar button,
    * which displays a dialog allowing the user to share the visualization by email or by embedding its HTML in a web page.
    */
  def showShareDialog(): Unit = js.native
  
  def toggleAutomaticUpdatesAsync(): Unit = js.native
  
  /** Undoes action on sheet, defaults to a single undo unless optional parameters is specified. */
  def undoAsync(): js.Promise[Unit] = js.native
}

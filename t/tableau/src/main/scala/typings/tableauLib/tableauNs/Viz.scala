package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Viz")
@js.native
class Viz protected () extends js.Object {
  /**
           * Creates a new Tableau Viz inside of the given HTML container, which is typically a <div> element.
           * Each option as well as the options parameter is optional.
           * If there is already a Viz associated with the parentElement, an exception is thrown.
           * Before reusing the parentElement you must first call dispose().
           */
  def this(node: stdLib.HTMLElement, url: java.lang.String) = this()
  /**
           * Creates a new Tableau Viz inside of the given HTML container, which is typically a <div> element.
           * Each option as well as the options parameter is optional.
           * If there is already a Viz associated with the parentElement, an exception is thrown.
           * Before reusing the parentElement you must first call dispose().
           */
  def this(node: stdLib.HTMLElement, url: java.lang.String, options: VizCreateOptions) = this()
  def addEventListener(
    event: TableauEventName,
    f: ListenerFunction[
      CustomViewEvent | FilterEvent | MarksEvent | ParameterEvent | StoryPointSwitchEvent | TabSwitchEvent | ToolbarStateEvent | VizResizeEvent
    ]
  ): scala.Unit = js.native
  /**
           * Cleans up any resources associated with the visualization,
           * removes the visualization from the VizManager instance,
           * and removes any DOM elements from the parentElement object.
           * In effect, this method restores the page to what it was before a Viz object was instantiated.
           */
  def dispose(): scala.Unit = js.native
  /** Indicates whether automatic updates are currently paused. */
  def getAreAutomaticUpdatesPaused(): scala.Boolean = js.native
  /** Indicates whether the tabs are displayed in the UI. It does not actually hide individual tabs. */
  def getAreTabsHidden(): scala.Boolean = js.native
  /** Gets the URL of the visualization asynchronously. */
  def getCurrentUrlAsync(): js.Promise[java.lang.String] = js.native
  /** Indicates whether the visualization is displayed on the hosting page. */
  def getIsHidden(): scala.Boolean = js.native
  /** Returns the node that was specified in the constructor. */
  def getParentElement(): stdLib.HTMLElement = js.native
  /** Indicates whether the toolbar is displayed. */
  def getToolbarHidden(): scala.Boolean = js.native
  /** The URL of the visualization, as specified in the constructor */
  def getUrl(): java.lang.String = js.native
  /** One Workbook is supported per visualization. */
  def getWorkbook(): Workbook = js.native
  /** Shows or hides the iframe element hosting the visualization. */
  def hide(): scala.Unit = js.native
  /** Pauses or resumes layout updates. This is useful if you are resizing the visualization or performing multiple calls that could affect the layout. */
  def pauseAutomaticUpdatesAsync(): scala.Unit = js.native
  /** Redoes last action on a sheet, defaults to a single redo unless optional parameters is specified. */
  def redoAsync(): js.Promise[scala.Unit] = js.native
  /** Equivalent to clicking on the Refresh Data toolbar button. */
  def refreshDataAsync(): js.Promise[scala.Unit] = js.native
  /** Removes an event listener from the specified event. */
  def removeEventListener(`type`: TableauEventName, f: ListenerFunction[TableauEvent]): scala.Unit = js.native
  def resumeAutomaticUpdatesAsync(): scala.Unit = js.native
  /** Equivalent to clicking on the Revert All toolbar button, which restores the workbook to its starting state. */
  def revertAllAsync(): js.Promise[scala.Unit] = js.native
  /**
           * Sets the size of the iframe element, which causes the visualization to expand or
           * collapse to fit the iframe element if the visualization size (current sheet's size) is set to AUTOMATIC.
           */
  def setFrameSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /** Shows or hides the iframe element hosting the visualization. */
  def show(): scala.Unit = js.native
  /** Equivalent to clicking on the Download toolbar button, which downloads a copy of the original workbook. */
  def showDownloadWorkbookDialog(): scala.Unit = js.native
  /** Shows the Export CrossTab dialog. The worksheetInDashboard parameter is optional. If not specified, the currently active Worksheet is used. */
  def showExportCrossTabDialog(worksheetInDashboard: java.lang.String): scala.Unit = js.native
  /** Shows the Export CrossTab dialog. The worksheetInDashboard parameter is optional. If not specified, the currently active Worksheet is used. */
  def showExportCrossTabDialog(worksheetInDashboard: Sheet): scala.Unit = js.native
  /** Shows the Export CrossTab dialog. The worksheetInDashboard parameter is optional. If not specified, the currently active Worksheet is used. */
  def showExportCrossTabDialog(worksheetInDashboard: SheetInfo): scala.Unit = js.native
  /**
           * Shows the Export Data dialog, which is currently a popup window. The worksheetInDashboard parameter is optional.
           * If not specified, the currently active Worksheet is used.
           */
  def showExportDataDialog(worksheetInDashboard: java.lang.String): scala.Unit = js.native
  /**
           * Shows the Export Data dialog, which is currently a popup window. The worksheetInDashboard parameter is optional.
           * If not specified, the currently active Worksheet is used.
           */
  def showExportDataDialog(worksheetInDashboard: Sheet): scala.Unit = js.native
  /**
           * Shows the Export Data dialog, which is currently a popup window. The worksheetInDashboard parameter is optional.
           * If not specified, the currently active Worksheet is used.
           */
  def showExportDataDialog(worksheetInDashboard: SheetInfo): scala.Unit = js.native
  /** Equivalent to clicking on the Export Image toolbar button, which creates a PNG file of the current visualization. */
  def showExportImageDialog(): scala.Unit = js.native
  /** Equivalent to clicking on the Export PDF toolbar button, which shows a dialog allowing the user to select options for the export. */
  def showExportPDFDialog(): scala.Unit = js.native
  /**
           * Equivalent to clicking on the Share toolbar button,
           * which displays a dialog allowing the user to share the visualization by email or by embedding its HTML in a web page.
           */
  def showShareDialog(): scala.Unit = js.native
  def toggleAutomaticUpdatesAsync(): scala.Unit = js.native
  /** Undoes action on sheet, defaults to a single undo unless optional parameters is specified. */
  def undoAsync(): js.Promise[scala.Unit] = js.native
}


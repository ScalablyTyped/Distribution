package typings.tableauJsApi

import typings.std.Extract
import typings.std.HTMLElement
import typings.tableauJsApi.enumsMod.TableauEventName
import typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_LOAD
import typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_REMOVE
import typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_SAVE
import typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_SET_DEFAULT
import typings.tableauJsApi.enumsMod.TableauEventName.FILTER_CHANGE
import typings.tableauJsApi.enumsMod.TableauEventName.MARKS_HIGHLIGHT
import typings.tableauJsApi.enumsMod.TableauEventName.MARKS_SELECTION
import typings.tableauJsApi.enumsMod.TableauEventName.PARAMETER_VALUE_CHANGE
import typings.tableauJsApi.enumsMod.TableauEventName.STORY_POINT_SWITCH
import typings.tableauJsApi.enumsMod.TableauEventName.TAB_SWITCH
import typings.tableauJsApi.enumsMod.TableauEventName.TOOLBAR_STATE_CHANGE
import typings.tableauJsApi.enumsMod.TableauEventName.URL_ACTION
import typings.tableauJsApi.enumsMod.TableauEventName.VIZ_RESIZE
import typings.tableauJsApi.enumsMod.ToolbarButtonName
import typings.tableauJsApi.enumsMod.ToolbarPosition
import typings.tableauJsApi.sheetMod.Sheet
import typings.tableauJsApi.sheetMod.SheetInfo
import typings.tableauJsApi.vizDoteventMod.CustomViewEvent
import typings.tableauJsApi.vizDoteventMod.FilterEvent
import typings.tableauJsApi.vizDoteventMod.MarksEvent
import typings.tableauJsApi.vizDoteventMod.ParameterEvent
import typings.tableauJsApi.vizDoteventMod.StoryPointSwitchEvent
import typings.tableauJsApi.vizDoteventMod.TabSwitchEvent
import typings.tableauJsApi.vizDoteventMod.TableauEvent
import typings.tableauJsApi.vizDoteventMod.ToolbarStateEvent
import typings.tableauJsApi.vizDoteventMod.UrlActionEvent
import typings.tableauJsApi.vizDoteventMod.VizResizeEvent
import typings.tableauJsApi.workbookMod.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vizMod {
  
  @JSImport("tableau-js-api/viz", "ToolbarState")
  @js.native
  open class ToolbarState () extends StObject {
    
    // properties
    def getViz(): Viz = js.native
    
    def isButtonEnabled(toolbarButtonName: ToolbarButtonName): Boolean = js.native
  }
  
  @JSImport("tableau-js-api/viz", "Viz")
  @js.native
  open class Viz protected () extends StObject {
    def this(parentElement: HTMLElement, url: String, options: VizCreateOptions) = this()
    
    // events
    def addEventListener(
      `type`: TableauEventCustomView | TableauEventFilterChange | TableauEventMarks | TableauEventParameterChange | TableauEventStoryPointSwitch | TableauEventTabSwitch | TableauEventToolbarStateChange | TableauEventUrlAction | TableauEventVizResize,
      listener: js.Function1[
          (/* event */ CustomViewEvent) | (/* event */ FilterEvent) | (/* event */ MarksEvent) | (/* event */ ParameterEvent) | (/* event */ StoryPointSwitchEvent) | (/* event */ TabSwitchEvent) | (/* event */ ToolbarStateEvent) | (/* event */ UrlActionEvent) | (/* event */ VizResizeEvent), 
          Unit
        ]
    ): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def exportCrossTabToExcel(): Unit = js.native
    def exportCrossTabToExcel(worksheetInDashboard: String): Unit = js.native
    def exportCrossTabToExcel(worksheetInDashboard: Sheet): Unit = js.native
    def exportCrossTabToExcel(worksheetInDashboard: SheetInfo): Unit = js.native
    
    def getAreAutomaticUpdatesPaused(): Boolean = js.native
    
    // properties
    def getAreTabsHidden(): Boolean = js.native
    
    def getCurrentUrlAsync(): js.Promise[String] = js.native
    
    def getIsHidden(): Boolean = js.native
    
    def getIsToolbarHidden(): Boolean = js.native
    
    def getParentElement(): HTMLElement = js.native
    
    def getUrl(): String = js.native
    
    def getWorkbook(): Workbook = js.native
    
    def hide(): Unit = js.native
    
    def pauseAutomaticUpdatesAsync(): js.Promise[Unit] = js.native
    
    def redoAsync(): Unit = js.native
    
    def refreshDataAsync(): Unit = js.native
    
    def removeEventListener(
      `type`: TableauEventCustomView | TableauEventFilterChange | TableauEventMarks | TableauEventParameterChange | TableauEventStoryPointSwitch | TableauEventTabSwitch | TableauEventToolbarStateChange | TableauEventUrlAction | TableauEventVizResize,
      listener: js.Function1[
          (/* event */ CustomViewEvent) | (/* event */ FilterEvent) | (/* event */ MarksEvent) | (/* event */ ParameterEvent) | (/* event */ StoryPointSwitchEvent) | (/* event */ TabSwitchEvent) | (/* event */ ToolbarStateEvent) | (/* event */ UrlActionEvent) | (/* event */ VizResizeEvent), 
          Unit
        ]
    ): Unit = js.native
    
    def resumeAutomaticUpdatesAsync(): js.Promise[Unit] = js.native
    
    def revertAllAsync(): Unit = js.native
    
    def setFrameSize(width: Double, height: Double): Unit = js.native
    
    // methods
    def show(): Unit = js.native
    
    def showDownloadWorkbookDialog(): Unit = js.native
    
    def showExportCrossTabDialog(worksheetInDashboard: String): Unit = js.native
    def showExportCrossTabDialog(worksheetInDashboard: Sheet): Unit = js.native
    def showExportCrossTabDialog(worksheetInDashboard: SheetInfo): Unit = js.native
    
    def showExportDataDialog(worksheetInDashboard: String): Unit = js.native
    def showExportDataDialog(worksheetInDashboard: Sheet): Unit = js.native
    def showExportDataDialog(worksheetInDashboard: SheetInfo): Unit = js.native
    
    def showExportImageDialog(): Unit = js.native
    
    def showExportPDFDialog(): Unit = js.native
    
    def showExportPowerPointDialog(): Unit = js.native
    
    def showShareDialog(): Unit = js.native
    
    def toggleAutomaticUpdatesAsync(): js.Promise[Unit] = js.native
    
    def undoAsync(): Unit = js.native
  }
  
  @JSImport("tableau-js-api/viz", "VizManager")
  @js.native
  open class VizManager () extends StObject {
    
    def getVizs(): js.Array[Viz] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tableauJsApi.tableauJsApiStrings.default
    - typings.tableauJsApi.tableauJsApiStrings.desktop
    - typings.tableauJsApi.tableauJsApiStrings.tablet
    - typings.tableauJsApi.tableauJsApiStrings.phone
  */
  trait DeviceType extends StObject
  object DeviceType {
    
    inline def default: typings.tableauJsApi.tableauJsApiStrings.default = "default".asInstanceOf[typings.tableauJsApi.tableauJsApiStrings.default]
    
    inline def desktop: typings.tableauJsApi.tableauJsApiStrings.desktop = "desktop".asInstanceOf[typings.tableauJsApi.tableauJsApiStrings.desktop]
    
    inline def phone: typings.tableauJsApi.tableauJsApiStrings.phone = "phone".asInstanceOf[typings.tableauJsApi.tableauJsApiStrings.phone]
    
    inline def tablet: typings.tableauJsApi.tableauJsApiStrings.tablet = "tablet".asInstanceOf[typings.tableauJsApi.tableauJsApiStrings.tablet]
  }
  
  type TableauEventCustomView = Extract[
    TableauEventName, 
    CUSTOM_VIEW_LOAD | CUSTOM_VIEW_REMOVE | CUSTOM_VIEW_SAVE | CUSTOM_VIEW_SET_DEFAULT
  ]
  
  type TableauEventFilterChange = Extract[TableauEventName, FILTER_CHANGE]
  
  type TableauEventMarks = Extract[TableauEventName, MARKS_HIGHLIGHT | MARKS_SELECTION]
  
  type TableauEventParameterChange = Extract[TableauEventName, PARAMETER_VALUE_CHANGE]
  
  type TableauEventStoryPointSwitch = Extract[TableauEventName, STORY_POINT_SWITCH]
  
  type TableauEventTabSwitch = Extract[TableauEventName, TAB_SWITCH]
  
  type TableauEventToolbarStateChange = Extract[TableauEventName, TOOLBAR_STATE_CHANGE]
  
  type TableauEventUrlAction = Extract[TableauEventName, URL_ACTION]
  
  type TableauEventVizResize = Extract[TableauEventName, VIZ_RESIZE]
  
  trait VizCreateOptions extends StObject {
    
    var device: js.UndefOr[DeviceType] = js.undefined
    
    var disableUrlActionsPopups: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var hideTabs: js.UndefOr[Boolean] = js.undefined
    
    var hideToolbar: js.UndefOr[Boolean] = js.undefined
    
    var instanceIdToClone: js.UndefOr[String] = js.undefined
    
    var onFirstInteractive: js.UndefOr[js.Function1[/* event */ TableauEvent, Unit]] = js.undefined
    
    var onFirstVizSizeKnown: js.UndefOr[js.Function1[/* event */ VizResizeEvent, Unit]] = js.undefined
    
    var toolbarPosition: js.UndefOr[ToolbarPosition] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object VizCreateOptions {
    
    inline def apply(): VizCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VizCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VizCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setDevice(value: DeviceType): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setDisableUrlActionsPopups(value: Boolean): Self = StObject.set(x, "disableUrlActionsPopups", value.asInstanceOf[js.Any])
      
      inline def setDisableUrlActionsPopupsUndefined: Self = StObject.set(x, "disableUrlActionsPopups", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideTabs(value: Boolean): Self = StObject.set(x, "hideTabs", value.asInstanceOf[js.Any])
      
      inline def setHideTabsUndefined: Self = StObject.set(x, "hideTabs", js.undefined)
      
      inline def setHideToolbar(value: Boolean): Self = StObject.set(x, "hideToolbar", value.asInstanceOf[js.Any])
      
      inline def setHideToolbarUndefined: Self = StObject.set(x, "hideToolbar", js.undefined)
      
      inline def setInstanceIdToClone(value: String): Self = StObject.set(x, "instanceIdToClone", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdToCloneUndefined: Self = StObject.set(x, "instanceIdToClone", js.undefined)
      
      inline def setOnFirstInteractive(value: /* event */ TableauEvent => Unit): Self = StObject.set(x, "onFirstInteractive", js.Any.fromFunction1(value))
      
      inline def setOnFirstInteractiveUndefined: Self = StObject.set(x, "onFirstInteractive", js.undefined)
      
      inline def setOnFirstVizSizeKnown(value: /* event */ VizResizeEvent => Unit): Self = StObject.set(x, "onFirstVizSizeKnown", js.Any.fromFunction1(value))
      
      inline def setOnFirstVizSizeKnownUndefined: Self = StObject.set(x, "onFirstVizSizeKnown", js.undefined)
      
      inline def setToolbarPosition(value: ToolbarPosition): Self = StObject.set(x, "toolbarPosition", value.asInstanceOf[js.Any])
      
      inline def setToolbarPositionUndefined: Self = StObject.set(x, "toolbarPosition", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

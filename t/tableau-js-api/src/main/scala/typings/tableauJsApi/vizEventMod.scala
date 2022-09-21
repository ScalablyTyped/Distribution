package typings.tableauJsApi

import typings.tableauJsApi.enumsMod.TableauEventName
import typings.tableauJsApi.filteringMod.Filter
import typings.tableauJsApi.marksMod.Mark
import typings.tableauJsApi.otherMod.Size
import typings.tableauJsApi.parameterMod.Parameter
import typings.tableauJsApi.sheetMod.StoryPoint
import typings.tableauJsApi.sheetMod.StoryPointInfo
import typings.tableauJsApi.sheetMod.Worksheet
import typings.tableauJsApi.vizMod.ToolbarState
import typings.tableauJsApi.vizMod.Viz
import typings.tableauJsApi.workbookMod.CustomView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vizEventMod {
  
  @JSImport("tableau-js-api/viz.event", "CustomViewEvent")
  @js.native
  open class CustomViewEvent () extends TableauEvent {
    
    // methods
    def getCustomViewAsync(): js.Promise[CustomView] = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "FilterEvent")
  @js.native
  open class FilterEvent () extends TableauEvent {
    
    def getFieldName(): String = js.native
    
    // methods
    def getFilterAsync(): js.Promise[Filter] = js.native
    
    // properties
    def getWorksheet(): Worksheet = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "MarksEvent")
  @js.native
  open class MarksEvent () extends TableauEvent {
    
    // methods
    def getMarksAsync(): js.Promise[js.Array[Mark]] = js.native
    
    // properties
    def getWorksheet(): Worksheet = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "ParameterEvent")
  @js.native
  open class ParameterEvent () extends TableauEvent {
    
    // methods
    def getParameterAsync(): js.Promise[Parameter] = js.native
    
    // properties
    def getParameterName(): String = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "StoryPointSwitchEvent")
  @js.native
  open class StoryPointSwitchEvent () extends TableauEvent {
    
    def getNewStoryPoint(): StoryPoint = js.native
    
    // properties
    def getOldStoryPointInfo(): StoryPointInfo = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "TabSwitchEvent")
  @js.native
  open class TabSwitchEvent () extends TableauEvent {
    
    def getNewSheetName(): String = js.native
    
    // properties
    def getOldSheetName(): String = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "TableauEvent")
  @js.native
  open class TableauEvent () extends StObject {
    
    def getEventName(): TableauEventName = js.native
    
    def getViz(): Viz = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "ToolbarStateEvent")
  @js.native
  open class ToolbarStateEvent () extends StObject {
    
    def getToolbarState(): ToolbarState = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "UrlActionEvent")
  @js.native
  open class UrlActionEvent () extends StObject {
    
    def getTarget(): String = js.native
    
    def getURL(): String = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "VizResizeEvent")
  @js.native
  open class VizResizeEvent () extends TableauEvent {
    
    def getVizSize(): Size = js.native
  }
}

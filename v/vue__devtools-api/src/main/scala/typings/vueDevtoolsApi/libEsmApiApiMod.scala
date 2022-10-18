package typings.vueDevtoolsApi

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Omit
import typings.vueDevtoolsApi.anon.Action
import typings.vueDevtoolsApi.anon.Icon
import typings.vueDevtoolsApi.libEsmApiAppMod.App
import typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
import typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentState
import typings.vueDevtoolsApi.libEsmApiComponentMod.StateBase
import typings.vueDevtoolsApi.libEsmApiContextMod.Context
import typings.vueDevtoolsApi.libEsmApiHooksMod.ComponentBounds
import typings.vueDevtoolsApi.libEsmApiHooksMod.Hookable
import typings.vueDevtoolsApi.libEsmApiUtilMod.ID
import typings.vueDevtoolsApi.vueDevtoolsApiBooleans.`false`
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.`type`
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.default
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.error
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmApiApiMod {
  
  trait AppRecord extends StObject {
    
    var id: String
    
    var instanceMap: Map[String, ComponentInstance]
    
    var name: String
    
    var rootInstance: ComponentInstance
  }
  object AppRecord {
    
    inline def apply(
      id: String,
      instanceMap: Map[String, ComponentInstance],
      name: String,
      rootInstance: ComponentInstance
    ): AppRecord = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceMap = instanceMap.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rootInstance = rootInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppRecord]
    }
    
    extension [Self <: AppRecord](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceMap(value: Map[String, ComponentInstance]): Self = StObject.set(x, "instanceMap", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRootInstance(value: ComponentInstance): Self = StObject.set(x, "rootInstance", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomInspectorNode extends StObject {
    
    var children: js.UndefOr[js.Array[CustomInspectorNode]] = js.undefined
    
    var id: String
    
    var label: String
    
    var tags: js.UndefOr[js.Array[InspectorNodeTag]] = js.undefined
  }
  object CustomInspectorNode {
    
    inline def apply(id: String, label: String): CustomInspectorNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomInspectorNode]
    }
    
    extension [Self <: CustomInspectorNode](x: Self) {
      
      inline def setChildren(value: js.Array[CustomInspectorNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: CustomInspectorNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[InspectorNodeTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: InspectorNodeTag*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait CustomInspectorOptions extends StObject {
    
    var actions: js.UndefOr[js.Array[Action]] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var label: String
    
    var noSelectionText: js.UndefOr[String] = js.undefined
    
    var nodeActions: js.UndefOr[js.Array[Icon]] = js.undefined
    
    var stateFilterPlaceholder: js.UndefOr[String] = js.undefined
    
    var treeFilterPlaceholder: js.UndefOr[String] = js.undefined
  }
  object CustomInspectorOptions {
    
    inline def apply(id: String, label: String): CustomInspectorOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomInspectorOptions]
    }
    
    extension [Self <: CustomInspectorOptions](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNoSelectionText(value: String): Self = StObject.set(x, "noSelectionText", value.asInstanceOf[js.Any])
      
      inline def setNoSelectionTextUndefined: Self = StObject.set(x, "noSelectionText", js.undefined)
      
      inline def setNodeActions(value: js.Array[Icon]): Self = StObject.set(x, "nodeActions", value.asInstanceOf[js.Any])
      
      inline def setNodeActionsUndefined: Self = StObject.set(x, "nodeActions", js.undefined)
      
      inline def setNodeActionsVarargs(value: Icon*): Self = StObject.set(x, "nodeActions", js.Array(value*))
      
      inline def setStateFilterPlaceholder(value: String): Self = StObject.set(x, "stateFilterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setStateFilterPlaceholderUndefined: Self = StObject.set(x, "stateFilterPlaceholder", js.undefined)
      
      inline def setTreeFilterPlaceholder(value: String): Self = StObject.set(x, "treeFilterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setTreeFilterPlaceholderUndefined: Self = StObject.set(x, "treeFilterPlaceholder", js.undefined)
    }
  }
  
  type CustomInspectorState = StringDictionary[js.Array[StateBase | (Omit[ComponentState, `type`])]]
  
  @js.native
  trait DevtoolsPluginApi[TSettings] extends StObject {
    
    def addInspector(options: CustomInspectorOptions): Unit = js.native
    
    def addTimelineEvent(options: TimelineEventOptions): Unit = js.native
    
    def addTimelineLayer(options: TimelineLayerOptions[Any, Any]): Unit = js.native
    
    def getComponentBounds(instance: ComponentInstance): js.Promise[ComponentBounds] = js.native
    
    def getComponentInstances(app: App): js.Promise[js.Array[ComponentInstance]] = js.native
    
    def getComponentName(instance: ComponentInstance): js.Promise[String] = js.native
    
    def getSettings(): TSettings = js.native
    def getSettings(pluginId: String): TSettings = js.native
    
    def highlightElement(instance: ComponentInstance): Unit = js.native
    
    def notifyComponentUpdate(): Unit = js.native
    def notifyComponentUpdate(instance: ComponentInstance): Unit = js.native
    
    def now(): Double = js.native
    
    var on: Hookable[Context] = js.native
    
    def selectInspectorNode(inspectorId: String, nodeId: String): Unit = js.native
    
    def sendInspectorState(inspectorId: String): Unit = js.native
    
    def sendInspectorTree(inspectorId: String): Unit = js.native
    
    /**
      * @private Not implemented yet
      */
    def setSettings(values: TSettings): Unit = js.native
    
    def unhighlightElement(): Unit = js.native
  }
  
  trait InspectorNodeTag extends StObject {
    
    var backgroundColor: Double
    
    var label: String
    
    var textColor: Double
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object InspectorNodeTag {
    
    inline def apply(backgroundColor: Double, label: String, textColor: Double): InspectorNodeTag = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[InspectorNodeTag]
    }
    
    extension [Self <: InspectorNodeTag](x: Self) {
      
      inline def setBackgroundColor(value: Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: Double): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait ScreenshotData extends StObject {
    
    var time: Double
  }
  object ScreenshotData {
    
    inline def apply(time: Double): ScreenshotData = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenshotData]
    }
    
    extension [Self <: ScreenshotData](x: Self) {
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScreenshotOverlayEvent extends StObject {
    
    var layerId: String
    
    var renderMeta: Any
  }
  object ScreenshotOverlayEvent {
    
    inline def apply(layerId: String, renderMeta: Any): ScreenshotOverlayEvent = {
      val __obj = js.Dynamic.literal(layerId = layerId.asInstanceOf[js.Any], renderMeta = renderMeta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenshotOverlayEvent]
    }
    
    extension [Self <: ScreenshotOverlayEvent](x: Self) {
      
      inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
      
      inline def setRenderMeta(value: Any): Self = StObject.set(x, "renderMeta", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScreenshotOverlayRenderContext[TData, TMeta] extends StObject {
    
    var events: js.Array[(TimelineEvent[TData, TMeta]) & ScreenshotOverlayEvent]
    
    var index: Double
    
    var screenshot: ScreenshotData
  }
  object ScreenshotOverlayRenderContext {
    
    inline def apply[TData, TMeta](
      events: js.Array[(TimelineEvent[TData, TMeta]) & ScreenshotOverlayEvent],
      index: Double,
      screenshot: ScreenshotData
    ): ScreenshotOverlayRenderContext[TData, TMeta] = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], screenshot = screenshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenshotOverlayRenderContext[TData, TMeta]]
    }
    
    extension [Self <: ScreenshotOverlayRenderContext[?, ?], TData, TMeta](x: Self & (ScreenshotOverlayRenderContext[TData, TMeta])) {
      
      inline def setEvents(value: js.Array[(TimelineEvent[TData, TMeta]) & ScreenshotOverlayEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: ((TimelineEvent[TData, TMeta]) & ScreenshotOverlayEvent)*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setScreenshot(value: ScreenshotData): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
    }
  }
  
  type ScreenshotOverlayRenderResult = HTMLElement | String | `false`
  
  trait TimelineEvent[TData, TMeta] extends StObject {
    
    var data: TData
    
    var groupId: js.UndefOr[ID] = js.undefined
    
    var logType: js.UndefOr[default | warning | error] = js.undefined
    
    var meta: js.UndefOr[TMeta] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var time: Double
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TimelineEvent {
    
    inline def apply[TData, TMeta](data: TData, time: Double): TimelineEvent[TData, TMeta] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineEvent[TData, TMeta]]
    }
    
    extension [Self <: TimelineEvent[?, ?], TData, TMeta](x: Self & (TimelineEvent[TData, TMeta])) {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGroupId(value: ID): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setLogType(value: default | warning | error): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
      
      inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
      
      inline def setMeta(value: TMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TimelineEventOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var event: TimelineEvent[Any, Any]
    
    var layerId: String
  }
  object TimelineEventOptions {
    
    inline def apply(event: TimelineEvent[Any, Any], layerId: String): TimelineEventOptions = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineEventOptions]
    }
    
    extension [Self <: TimelineEventOptions](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setEvent(value: TimelineEvent[Any, Any]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimelineLayerOptions[TData, TMeta] extends StObject {
    
    var color: Double
    
    var groupsOnly: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var ignoreNoDurationGroups: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var screenshotOverlayRender: js.UndefOr[
        js.Function2[
          /* event */ (TimelineEvent[TData, TMeta]) & ScreenshotOverlayEvent, 
          /* ctx */ ScreenshotOverlayRenderContext[Any, Any], 
          ScreenshotOverlayRenderResult | js.Promise[ScreenshotOverlayRenderResult]
        ]
      ] = js.undefined
    
    var skipScreenshots: js.UndefOr[Boolean] = js.undefined
  }
  object TimelineLayerOptions {
    
    inline def apply[TData, TMeta](color: Double, id: String, label: String): TimelineLayerOptions[TData, TMeta] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineLayerOptions[TData, TMeta]]
    }
    
    extension [Self <: TimelineLayerOptions[?, ?], TData, TMeta](x: Self & (TimelineLayerOptions[TData, TMeta])) {
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setGroupsOnly(value: Boolean): Self = StObject.set(x, "groupsOnly", value.asInstanceOf[js.Any])
      
      inline def setGroupsOnlyUndefined: Self = StObject.set(x, "groupsOnly", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNoDurationGroups(value: Boolean): Self = StObject.set(x, "ignoreNoDurationGroups", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNoDurationGroupsUndefined: Self = StObject.set(x, "ignoreNoDurationGroups", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setScreenshotOverlayRender(
        value: (/* event */ (TimelineEvent[TData, TMeta]) & ScreenshotOverlayEvent, /* ctx */ ScreenshotOverlayRenderContext[Any, Any]) => ScreenshotOverlayRenderResult | js.Promise[ScreenshotOverlayRenderResult]
      ): Self = StObject.set(x, "screenshotOverlayRender", js.Any.fromFunction2(value))
      
      inline def setScreenshotOverlayRenderUndefined: Self = StObject.set(x, "screenshotOverlayRender", js.undefined)
      
      inline def setSkipScreenshots(value: Boolean): Self = StObject.set(x, "skipScreenshots", value.asInstanceOf[js.Any])
      
      inline def setSkipScreenshotsUndefined: Self = StObject.set(x, "skipScreenshots", js.undefined)
    }
  }
  
  trait TimelineMarkerOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var color: Double
    
    var id: String
    
    var label: String
    
    var time: Double
  }
  object TimelineMarkerOptions {
    
    inline def apply(color: Double, id: String, label: String, time: Double): TimelineMarkerOptions = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineMarkerOptions]
    }
    
    extension [Self <: TimelineMarkerOptions](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}

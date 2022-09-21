package typings.wavesurferJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.wavesurferJs.markersMod.Marker
import typings.wavesurferJs.markersMod.MarkerParams
import typings.wavesurferJs.pluginMod.PluginDefinition
import typings.wavesurferJs.pluginMod.PluginParams
import typings.wavesurferJs.typesUtilMod.Styles
import typings.wavesurferJs.wavesurferJsStrings.drag
import typings.wavesurferJs.wavesurferJsStrings.left
import typings.wavesurferJs.wavesurferJsStrings.resize
import typings.wavesurferJs.wavesurferJsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionsMod {
  
  @JSImport("wavesurfer.js/src/plugin/regions", JSImport.Default)
  @js.native
  open class default protected () extends RegionsPlugin {
    def this(params: RegionsPluginParams, ws: typings.wavesurferJs.wavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/regions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: RegionsPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  @JSImport("wavesurfer.js/src/plugin/regions", "Region")
  @js.native
  open class Region protected ()
    extends typings.wavesurferJs.observerMod.default {
    def this(
      params: RegionParams,
      regionsUtil: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any,
      ws: typings.wavesurferJs.wavesurferMod.default
    ) = this()
    
    val attributes: Attributes = js.native
    
    def bindEvents(): Unit = js.native
    
    def bindInOut(): Unit = js.native
    
    def bindRagEvents(): Unit = js.native
    
    val color: String = js.native
    
    val data: Datas = js.native
    
    val drag: Boolean = js.native
    
    val edgeScrollWidth: js.UndefOr[Double] = js.native
    
    val element: HTMLElement = js.native
    
    val end: Double = js.native
    
    val firedIn: Boolean = js.native
    
    val firedOut: Boolean = js.native
    
    def formatTime(start: Double, end: Double): String = js.native
    
    val formatTimeCallback: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, String]] = js.native
    
    def getWidth(): Double = js.native
    
    val handleLeftEl: HTMLElement | Null = js.native
    
    val handleRightEl: HTMLElement | Null = js.native
    
    val handleStyle: HandleStyle = js.native
    
    val id: String = js.native
    
    val isDragging: Boolean = js.native
    
    val isResizing: Boolean = js.native
    
    val loop: Boolean = js.native
    
    val marginTop: String = js.native
    
    val maxLength: Double = js.native
    
    val minLength: Double = js.native
    
    def onDrag(delta: Double): Unit = js.native
    
    def onResize(
      delta: Double,
      direction: typings.wavesurferJs.wavesurferJsStrings.start | typings.wavesurferJs.wavesurferJsStrings.end
    ): Unit = js.native
    
    def play(): Unit = js.native
    def play(start: Double): Unit = js.native
    
    def playLoop(): Unit = js.native
    def playLoop(start: Double): Unit = js.native
    
    val preventContextMenu: Boolean = js.native
    
    val regionHeight: String = js.native
    
    val regionsUtil: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    def remove(): Unit = js.native
    
    def render(): Unit = js.native
    
    val resize: Boolean = js.native
    
    val scroll: Boolean = js.native
    
    val scrollSpeed: Double = js.native
    
    val scrollThreshold: Double = js.native
    
    def setLoop(loop: Boolean): Unit = js.native
    
    val start: Double = js.native
    
    val style: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util']['style'] */ js.Any = js.native
    
    def update(params: RegionParams): Unit = js.native
    def update(params: RegionParams, eventParams: RegionUpdatedEventParams): Unit = js.native
    
    def updateHandlesResize(resize: Boolean): Unit = js.native
    
    def updateRender(): Unit = js.native
    
    val util: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    val wavesurfer: typings.wavesurferJs.wavesurferMod.default = js.native
    
    val wrapper: HTMLElement = js.native
  }
  
  type Attributes = StringDictionary[String]
  
  type Datas = StringDictionary[Any]
  
  trait HandleStyle extends StObject {
    
    var left: Styles
    
    var right: Styles
  }
  object HandleStyle {
    
    inline def apply(left: Styles, right: Styles): HandleStyle = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleStyle]
    }
    
    extension [Self <: HandleStyle](x: Self) {
      
      inline def setLeft(value: Styles): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Styles): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegionParams extends StObject {
    
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    var channelIdx: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Datas] = js.undefined
    
    var drag: js.UndefOr[Boolean] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var handleStyle: js.UndefOr[HandleStyle] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var preventContextMenu: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Boolean] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object RegionParams {
    
    inline def apply(): RegionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionParams]
    }
    
    extension [Self <: RegionParams](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setChannelIdx(value: Double): Self = StObject.set(x, "channelIdx", value.asInstanceOf[js.Any])
      
      inline def setChannelIdxUndefined: Self = StObject.set(x, "channelIdx", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setData(value: Datas): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setHandleStyle(value: HandleStyle): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setPreventContextMenu(value: Boolean): Self = StObject.set(x, "preventContextMenu", value.asInstanceOf[js.Any])
      
      inline def setPreventContextMenuUndefined: Self = StObject.set(x, "preventContextMenu", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait RegionUpdatedEventParams extends StObject {
    
    var action: drag | resize
    
    var direction: right | left | Null
  }
  object RegionUpdatedEventParams {
    
    inline def apply(action: drag | resize): RegionUpdatedEventParams = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = null)
      __obj.asInstanceOf[RegionUpdatedEventParams]
    }
    
    extension [Self <: RegionUpdatedEventParams](x: Self) {
      
      inline def setAction(value: drag | resize): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: right | left): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.pluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait RegionsPlugin
    extends typings.wavesurferJs.observerMod.default {
    
    def add(params: RegionParams): Region = js.native
    
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def disableDragSelection(): Unit = js.native
    
    def enableDragSelection(options: RegionParams): Unit = js.native
    
    def getCurrentRegion(): Region | Null = js.native
    
    def getRegionSnapToGridValue(value: Double, params: RegionParams): Double = js.native
    
    def init(): Unit = js.native
    
    val list: StringDictionary[Region] = js.native
    
    val maxRegions: Double = js.native
    
    val params: RegionsPluginParams = js.native
    
    val regionsMinLength: Double = js.native
    
    val util: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    val wavesurfer: typings.wavesurferJs.wavesurferMod.default = js.native
    
    val wrapper: HTMLElement = js.native
  }
  
  trait RegionsPluginParams
    extends StObject
       with PluginParams {
    
    /** Enable creating regions by dragging with the mouse. */
    var dragSelection: js.UndefOr[Boolean] = js.undefined
    
    /** from container edges' Optional width for edgeScroll to start (default: 5% of viewport width). */
    var edgeScrollWidth: js.UndefOr[Double] = js.undefined
    
    /** Allows custom formating for region tooltip. */
    var formatTimeCallback: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** Maximum number of regions that may be created by the user at one time. */
    var maxRegions: js.UndefOr[Double] = js.undefined
    
    /** Regions that should be added upon initialisation. */
    var regions: js.UndefOr[js.Array[RegionParams]] = js.undefined
    
    /** The sensitivity of the mouse dragging (default: 2). */
    var slop: js.UndefOr[Double] = js.undefined
    
    /** Snap the regions to a grid of the specified multiples in seconds? */
    var snapToGridInterval: js.UndefOr[Double] = js.undefined
    
    /** Shift the snap-to-grid by the specified seconds. May also be negative. */
    var snapToGridOffset: js.UndefOr[Double] = js.undefined
  }
  object RegionsPluginParams {
    
    inline def apply(): RegionsPluginParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionsPluginParams]
    }
    
    extension [Self <: RegionsPluginParams](x: Self) {
      
      inline def setDragSelection(value: Boolean): Self = StObject.set(x, "dragSelection", value.asInstanceOf[js.Any])
      
      inline def setDragSelectionUndefined: Self = StObject.set(x, "dragSelection", js.undefined)
      
      inline def setEdgeScrollWidth(value: Double): Self = StObject.set(x, "edgeScrollWidth", value.asInstanceOf[js.Any])
      
      inline def setEdgeScrollWidthUndefined: Self = StObject.set(x, "edgeScrollWidth", js.undefined)
      
      inline def setFormatTimeCallback(value: () => String): Self = StObject.set(x, "formatTimeCallback", js.Any.fromFunction0(value))
      
      inline def setFormatTimeCallbackUndefined: Self = StObject.set(x, "formatTimeCallback", js.undefined)
      
      inline def setMaxRegions(value: Double): Self = StObject.set(x, "maxRegions", value.asInstanceOf[js.Any])
      
      inline def setMaxRegionsUndefined: Self = StObject.set(x, "maxRegions", js.undefined)
      
      inline def setRegions(value: js.Array[RegionParams]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      inline def setRegionsVarargs(value: RegionParams*): Self = StObject.set(x, "regions", js.Array(value*))
      
      inline def setSlop(value: Double): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
      
      inline def setSlopUndefined: Self = StObject.set(x, "slop", js.undefined)
      
      inline def setSnapToGridInterval(value: Double): Self = StObject.set(x, "snapToGridInterval", value.asInstanceOf[js.Any])
      
      inline def setSnapToGridIntervalUndefined: Self = StObject.set(x, "snapToGridInterval", js.undefined)
      
      inline def setSnapToGridOffset(value: Double): Self = StObject.set(x, "snapToGridOffset", value.asInstanceOf[js.Any])
      
      inline def setSnapToGridOffsetUndefined: Self = StObject.set(x, "snapToGridOffset", js.undefined)
    }
  }
  
  object WavesurferAugmentingMod {
    
    trait WaveSurfer extends StObject {
      
      def addMarker(param: MarkerParams): Marker
      
      def clearMarkers(): Unit
    }
    object WaveSurfer {
      
      inline def apply(addMarker: MarkerParams => Marker, clearMarkers: () => Unit): WaveSurfer = {
        val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1(addMarker), clearMarkers = js.Any.fromFunction0(clearMarkers))
        __obj.asInstanceOf[WaveSurfer]
      }
      
      extension [Self <: WaveSurfer](x: Self) {
        
        inline def setAddMarker(value: MarkerParams => Marker): Self = StObject.set(x, "addMarker", js.Any.fromFunction1(value))
        
        inline def setClearMarkers(value: () => Unit): Self = StObject.set(x, "clearMarkers", js.Any.fromFunction0(value))
      }
    }
  }
}

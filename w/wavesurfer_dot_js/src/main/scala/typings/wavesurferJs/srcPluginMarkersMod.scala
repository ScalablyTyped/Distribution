package typings.wavesurferJs

import typings.std.HTMLElement
import typings.wavesurferJs.typesPluginMod.PluginDefinition
import typings.wavesurferJs.wavesurferJsStrings.bottom
import typings.wavesurferJs.wavesurferJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPluginMarkersMod {
  
  @JSImport("wavesurfer.js/src/plugin/markers", JSImport.Default)
  @js.native
  open class default protected () extends MarkersPlugin {
    def this(params: MarkersPluginParams, ws: typings.wavesurferJs.srcWavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/markers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: MarkersPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  trait Marker extends StObject {
    
    var color: String
    
    var label: js.UndefOr[String] = js.undefined
    
    var position: top | bottom
    
    var time: Double
  }
  object Marker {
    
    inline def apply(color: String, position: top | bottom, time: Double): Marker = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkerParams extends StObject {
    
    /** Background color for marker. */
    var color: js.UndefOr[String] = js.undefined
    
    /** Set marker as draggable (default: false). */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /** An optional marker label. */
    var label: js.UndefOr[String] = js.undefined
    
    /** An HTML element to display instead of the default marker image. */
    var markerElement: js.UndefOr[HTMLElement] = js.undefined
    
    /** Position (default: "bottom"). */
    var position: js.UndefOr[top | bottom] = js.undefined
    
    /** The time to set the marker at. */
    var time: Double
  }
  object MarkerParams {
    
    inline def apply(time: Double): MarkerParams = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerParams] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMarkerElement(value: HTMLElement): Self = StObject.set(x, "markerElement", value.asInstanceOf[js.Any])
      
      inline def setMarkerElementUndefined: Self = StObject.set(x, "markerElement", js.undefined)
      
      inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.typesPluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait MarkersPlugin
    extends typings.wavesurferJs.srcUtilObserverMod.default {
    
    /** Add a marker. */
    def add(param: MarkerParams): Marker = js.native
    
    /** Remove all markers. */
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
    
    val markerHeight: Double = js.native
    
    val markerWidth: Double = js.native
    
    val markers: js.Array[Marker] = js.native
    
    val params: MarkersPluginParams = js.native
    
    /** Remove a marker. */
    def remove(index: Double): Unit = js.native
    
    val style: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util']['style'] */ js.Any = js.native
    
    val util: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    val wavesurfer: typings.wavesurferJs.srcWavesurferMod.default = js.native
    
    val wrapper: HTMLElement = js.native
  }
  
  trait MarkersPluginParams extends StObject {
    
    /** Initial set of markers. */
    var markers: js.UndefOr[js.Array[MarkerParams]] = js.undefined
  }
  object MarkersPluginParams {
    
    inline def apply(): MarkersPluginParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkersPluginParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkersPluginParams] (val x: Self) extends AnyVal {
      
      inline def setMarkers(value: js.Array[MarkerParams]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: MarkerParams*): Self = StObject.set(x, "markers", js.Array(value*))
    }
  }
  
  /* augmented module */
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WaveSurfer] (val x: Self) extends AnyVal {
        
        inline def setAddMarker(value: MarkerParams => Marker): Self = StObject.set(x, "addMarker", js.Any.fromFunction1(value))
        
        inline def setClearMarkers(value: () => Unit): Self = StObject.set(x, "clearMarkers", js.Any.fromFunction0(value))
      }
    }
  }
}

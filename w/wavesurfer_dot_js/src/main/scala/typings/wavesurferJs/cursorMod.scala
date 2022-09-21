package typings.wavesurferJs

import typings.std.HTMLElement
import typings.wavesurferJs.pluginMod.PluginDefinition
import typings.wavesurferJs.pluginMod.PluginParams
import typings.wavesurferJs.typesUtilMod.Styles
import typings.wavesurferJs.wavesurferJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cursorMod {
  
  @JSImport("wavesurfer.js/src/plugin/cursor", JSImport.Default)
  @js.native
  open class default protected () extends CursorPlugin {
    def this(params: CursorPluginParams, ws: typings.wavesurferJs.wavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/cursor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: CursorPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.pluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait CursorPlugin
    extends typings.wavesurferJs.observerMod.default {
    
    /** The cursor HTML element. */
    val cursor: HTMLElement = js.native
    
    val defaultParams: CursorPluginParams = js.native
    
    def destroy(): Unit = js.native
    
    /** The html container that will display the time. */
    val displayTime: HTMLElement = js.native
    
    def formatTime(cursorTime: Double): String = js.native
    
    def hideCursor(): Unit = js.native
    
    def init(): Unit = js.native
    
    val params: CursorPluginParams = js.native
    
    def showCursor(): Unit = js.native
    
    /** Displays the time next to the cursor. */
    val showTime: HTMLElement = js.native
    
    val style: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util']['style'] */ js.Any = js.native
    
    def updateCursorPosition(xpos: Double, ypos: Double, flip: Boolean): Unit = js.native
    
    val wavesurfer: typings.wavesurferJs.wavesurferMod.default = js.native
    
    val wrapper: HTMLElement = js.native
  }
  
  trait CursorPluginParams
    extends StObject
       with PluginParams {
    
    /** The color of the cursor (default: 'black'). */
    var color: js.UndefOr[String] = js.undefined
    
    /** An object with custom styles which are applied to the cursor time element. */
    var customShowTimeStyle: js.UndefOr[Styles] = js.undefined
    
    /** An object with custom styles which are applied to the cursor element. */
    var customStyle: js.UndefOr[Styles] = js.undefined
    
    /**
      * Whether to follow both the x- and the y-position of the mouse (default: false).
      *
      * Use `true` to make the time on the cursor follow the x and the y-position of the mouse.
      * Use `false` to make the it only follow the x-position of the mouse.
      */
    var followCursorY: js.UndefOr[String | `false`] = js.undefined
    
    /** Formats the timestamp on the cursor. */
    var formatTimeCallback: js.UndefOr[(js.Function1[/* cursorTime */ Double, String]) | Null] = js.undefined
    
    /** Hide the cursor when the mouse leaves the waveform (default: true). */
    var hideOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /** The opacity of the cursor (default 0.25). */
    var opacity: js.UndefOr[String] = js.undefined
    
    /** Show the time on the cursor (default: false). */
    var showTime: js.UndefOr[Boolean] = js.undefined
    
    /** The border style of the cursor (default: 'solid'). */
    var style: js.UndefOr[String] = js.undefined
    
    /** The width of the cursor (default: '1px'). */
    var width: js.UndefOr[String] = js.undefined
    
    /** The z-index of the cursor element (default: 3). */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object CursorPluginParams {
    
    inline def apply(): CursorPluginParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CursorPluginParams]
    }
    
    extension [Self <: CursorPluginParams](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCustomShowTimeStyle(value: Styles): Self = StObject.set(x, "customShowTimeStyle", value.asInstanceOf[js.Any])
      
      inline def setCustomShowTimeStyleUndefined: Self = StObject.set(x, "customShowTimeStyle", js.undefined)
      
      inline def setCustomStyle(value: Styles): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
      
      inline def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
      
      inline def setFollowCursorY(value: String | `false`): Self = StObject.set(x, "followCursorY", value.asInstanceOf[js.Any])
      
      inline def setFollowCursorYUndefined: Self = StObject.set(x, "followCursorY", js.undefined)
      
      inline def setFormatTimeCallback(value: /* cursorTime */ Double => String): Self = StObject.set(x, "formatTimeCallback", js.Any.fromFunction1(value))
      
      inline def setFormatTimeCallbackNull: Self = StObject.set(x, "formatTimeCallback", null)
      
      inline def setFormatTimeCallbackUndefined: Self = StObject.set(x, "formatTimeCallback", js.undefined)
      
      inline def setHideOnBlur(value: Boolean): Self = StObject.set(x, "hideOnBlur", value.asInstanceOf[js.Any])
      
      inline def setHideOnBlurUndefined: Self = StObject.set(x, "hideOnBlur", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}

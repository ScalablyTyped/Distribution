package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.std.DOMRect
import typings.std.HTMLDivElement
import typings.wixStyleReact.anon.CurrentDataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerHueMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHue", JSImport.Default)
  @js.native
  open class default protected () extends ColorPickerHue {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHue", "default.propTypes")
    @js.native
    def propTypes: CurrentDataHook = js.native
    inline def propTypes_=(x: CurrentDataHook): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ColorPickerHue extends PureComponent[Any, Any, Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorPickerHue(): Unit = js.native
    
    def getHueByMouseEvent(e: Any): Double = js.native
    
    def onMarkerDragEnd(): Unit = js.native
    
    def onMarkerDragStart(e: Any): Unit = js.native
    
    def setNewColorByMouseEvent(e: Any): Unit = js.native
    
    var slider: js.UndefOr[HTMLDivElement | Null] = js.native
    
    var sliderRect: js.UndefOr[DOMRect] = js.native
  }
}

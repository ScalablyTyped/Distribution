package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.std.DOMRect
import typings.std.HTMLDivElement
import typings.wixStyleReact.anon.S
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerHsbMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHsb", JSImport.Default)
  @js.native
  open class default protected () extends ColorPickerHsb {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHsb", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** The current Hsb value */
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHsb", "default.propTypes.current")
      @js.native
      def current: Validator[js.Object] = js.native
      inline def current_=(x: Validator[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used to create driver in testing */
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHsb", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** A callback function that will be triggered when the value is changed */
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHsb", "default.propTypes.onChange")
      @js.native
      def onChange: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColorPickerHsb extends PureComponent[Any, Any, Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorPickerHsb(): Unit = js.native
    
    def getSVByMouseEvent(e: Any): S = js.native
    
    var gradient: js.UndefOr[HTMLDivElement | Null] = js.native
    
    var gradientRect: js.UndefOr[DOMRect] = js.native
    
    def onMarkerDragEnd(): Unit = js.native
    
    def onMarkerDragStart(e: Any): Unit = js.native
    
    def setNewColorByMouseEvent(e: Any): Unit = js.native
  }
}

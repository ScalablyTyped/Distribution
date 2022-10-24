package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerMod {
  
  /**
    * Color Picker
    *
    * Under the hood uses color manipulation library [https://github.com/Qix-/color](https://github.com/Qix-/color).
    * Value for this component can be given in `string` or `object` format.
    * The callbacks always respond with color `object` format.
    */
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", JSImport.Default)
  @js.native
  open class default protected () extends ColorPicker {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.defaultProps.allowEmpty_1")
      @js.native
      val allowEmpty1: Boolean = js.native
      
      inline def onCancel1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCancel_1")().asInstanceOf[Unit]
      
      inline def onChange1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange_1")().asInstanceOf[Unit]
      
      inline def onConfirm1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onConfirm_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.defaultProps.showConverter_1")
      @js.native
      val showConverter1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.defaultProps.showHistory_1")
      @js.native
      val showHistory1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.defaultProps.showInput_1")
      @js.native
      val showInput1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.addTooltipContent")
      @js.native
      val addTooltipContent: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.allowEmpty")
      @js.native
      val allowEmpty: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.children")
      @js.native
      val children: Requireable[
            String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
          ] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.emptyPlaceholder")
      @js.native
      val emptyPlaceholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.onAdd")
      @js.native
      val onAdd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.onCancel")
      @js.native
      val onCancel: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.onConfirm")
      @js.native
      val onConfirm: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.showConverter")
      @js.native
      val showConverter: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.showHistory")
      @js.native
      val showHistory: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.showInput")
      @js.native
      val showInput: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPicker", "default.propTypes.value")
      @js.native
      val value: Validator[String | js.Object] = js.native
    }
  }
  
  /**
    * Color Picker
    *
    * Under the hood uses color manipulation library [https://github.com/Qix-/color](https://github.com/Qix-/color).
    * Value for this component can be given in `string` or `object` format.
    * The callbacks always respond with color `object` format.
    */
  @js.native
  trait ColorPicker extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MColorPicker(props: Any): Unit = js.native
    
    def _renderChildren(): Any = js.native
    
    /**
      * cancels the selected color
      */
    def cancel(): Unit = js.native
    
    /**
      * sets the selected color
      * @param {object} color - An object that contains data for the selected color, model, and valpha.
      */
    def change(_color: Any): Unit = js.native
    
    /**
      * confirms the selected color
      */
    def confirm(): Unit = js.native
    
    @JSName("state")
    var state_ColorPicker: Current = js.native
  }
}

package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Active
import typings.wixStyleReact.anon.ValueString
import typings.wixStyleReact.anon.ValueUndefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorInputColorInputMod {
  
  @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", JSImport.Default)
  @js.native
  open class default protected () extends ColorInput {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onCancel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCancel")().asInstanceOf[Unit]
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onConfirm(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onConfirm")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.defaultProps.placeholder")
      @js.native
      def placeholder: String = js.native
      inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.defaultProps.value")
      @js.native
      def value: String = js.native
      inline def value_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getDerivedStateFromProps(props: Any, state: Any): ValueString | ValueUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ValueString | ValueUndefined]
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Defines content to show in add button tooltip. Does not appear if `onAdd` is not passed. */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.addTooltipContent")
      @js.native
      def addTooltipContent: Requireable[ReactNodeLike] = js.native
      inline def addTooltipContent_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addTooltipContent")(x.asInstanceOf[js.Any])
      
      /** Defines child items to render inside of a component. Accepts any kind of content. It receives the `changeColor` function to control <ColorInput/> value. */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.colorPickerChildren")
      @js.native
      def colorPickerChildren: Requireable[
            String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
          ] = js.native
      inline def colorPickerChildren_=(
        x: Requireable[
              String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorPickerChildren")(x.asInstanceOf[js.Any])
      
      /** Specifies whether the input should be disabled */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Defines a callback handler with color HEX string. Handler is called whenever the `Add Color` button is pressed. */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.onAddColor")
      @js.native
      def onAddColor: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onAddColor_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAddColor")(x.asInstanceOf[js.Any])
      
      /** Returns last confirmed value from `value` prop */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.onCancel")
      @js.native
      def onCancel: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCancel_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(x.asInstanceOf[js.Any])
      
      /** Returns changed value of input or color picker */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      /** Returns confirmed value */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.onConfirm")
      @js.native
      def onConfirm: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onConfirm_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(x.asInstanceOf[js.Any])
      
      /** Defines placeholder text to display on an empty input */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.placeholder")
      @js.native
      def placeholder: Requireable[String] = js.native
      inline def placeholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      /** Allows to pass popover props. See <Popover/> API for a full list. */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.popoverProps")
      @js.native
      def popoverProps: Requireable[js.Object] = js.native
      inline def popoverProps_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(x.asInstanceOf[js.Any])
      
      /** Controls input size */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Specifies the status of a field */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.status")
      @js.native
      def status: Requireable[String] = js.native
      
      /** Defines the message to display on status icon hover. If not given or empty, there will be no tooltip. */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.statusMessage")
      @js.native
      def statusMessage: Requireable[ReactNodeLike] = js.native
      inline def statusMessage_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(x.asInstanceOf[js.Any])
      
      inline def status_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
      
      /** Defines input value */
      @JSImport("wix-style-react/dist/types/ColorInput/ColorInput", "default.propTypes.value")
      @js.native
      def value: Validator[String] = js.native
      inline def value_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColorInput extends Component[Any, Any, Any] {
    
    def _keyDown(e: Any): Unit = js.native
    
    def _onChange(evt: Any): Unit = js.native
    
    def _onFocus(): Unit = js.native
    
    def _onPickerChange(value: Any): Unit = js.native
    
    def _renderPrefix(): js.UndefOr[Element] = js.native
    
    def _renderSuffix(): Element = js.native
    
    /**
      * sets the previous color
      * @returns {Void}
      */
    def cancel(): Unit = js.native
    
    /**
      * clicks the input element
      * @returns {Void}
      */
    def click(): Unit = js.native
    
    /**
      * sets the picked color
      * @returns {Void}
      */
    def confirm(): Unit = js.native
    
    var input: js.UndefOr[typings.wixStyleReact.distTypesInputMod.default | Null] = js.native
    
    @JSName("state")
    var state_ColorInput: Active = js.native
  }
}

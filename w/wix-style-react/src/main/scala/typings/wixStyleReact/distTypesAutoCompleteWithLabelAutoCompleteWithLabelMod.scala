package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.IsEditing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAutoCompleteWithLabelAutoCompleteWithLabelMod {
  
  @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", JSImport.Default)
  @js.native
  open class default protected () extends AutoCompleteWithLabel {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Define a string that labels the current element in case where a text label is not visible on the screen. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.ariaLabel")
      @js.native
      def ariaLabel: Requireable[String] = js.native
      inline def ariaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
      
      /** Focus the element on mount (standard React input autoFocus). */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      /** Sets the value of native autocomplete attribute (check the [HTML spec](https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#attr-fe-autocomplete) for possible values  */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.autocomplete")
      @js.native
      def autocomplete: Requireable[String] = js.native
      inline def autocomplete_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(x.asInstanceOf[js.Any])
      
      /** Specifies a CSS class name to be appended to the component’s root element. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Sets a default value for those who want to use this component un-controlled. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Specifies whether input should be disabled or not. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Defines a value label to show inside of a field. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.label")
      @js.native
      def label: Validator[String] = js.native
      inline def label_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
      
      /** Sets the maximum height of the dropdownLayout in pixels. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.maxHeightPixels")
      @js.native
      def maxHeightPixels: Requireable[String | Double] = js.native
      inline def maxHeightPixels_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeightPixels")(x.asInstanceOf[js.Any])
      
      /** Sets the maximum number of characters that can be entered into a field. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.maxLength")
      @js.native
      def maxLength: Requireable[Double] = js.native
      inline def maxLength_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(x.asInstanceOf[js.Any])
      
      /** Reference element data when a form is submitted. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      /** Indicates whether to render using the native select element */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.native")
      @js.native
      def native: Requireable[Boolean] = js.native
      inline def native_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("native")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input onBlur callback */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.onBlur")
      @js.native
      def onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onBlur_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input onChange callback. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input onFocus callback. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.onFocus")
      @js.native
      def onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onFocus_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called whenever user selects a different option in the list. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.onSelect")
      @js.native
      def onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onSelect_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(x.asInstanceOf[js.Any])
      
      /** Specify an array of options to display in the dropdown list. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.options")
      @js.native
      def options: Validator[js.Array[Any]] = js.native
      inline def options_=(x: Validator[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      /** Sets a placeholder message to display. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.placeholder")
      @js.native
      def placeholder: Requireable[String] = js.native
      inline def placeholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      /** Specify the status of a field. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.status")
      @js.native
      def status: Requireable[String] = js.native
      
      /** Defines the message to display on status icon hover. If not given or empty there will be no tooltip. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.statusMessage")
      @js.native
      def statusMessage: Requireable[ReactNodeLike] = js.native
      inline def statusMessage_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(x.asInstanceOf[js.Any])
      
      inline def status_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
      
      /** Pass a component you want to show as the suffix of the input, e.g., text string, icon. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.suffix")
      @js.native
      def suffix: Requireable[js.Array[js.UndefOr[ReactElementLike | Null]]] = js.native
      inline def suffix_=(x: Requireable[js.Array[js.UndefOr[ReactElementLike | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffix")(x.asInstanceOf[js.Any])
      
      /** Specifies the type of `<input/>` element to display. Default is text string. */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      /** Value of rendered child input */
      @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel/AutoCompleteWithLabel", "default.propTypes.value")
      @js.native
      def value: Requireable[String | Double] = js.native
      inline def value_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AutoCompleteWithLabel extends PureComponent[Any, Any, Any] {
    
    def _isInputControlled(): Boolean = js.native
    
    def onChange(event: Any): Unit = js.native
    
    def onSelect(option: Any): Unit = js.native
    
    @JSName("state")
    var state_AutoCompleteWithLabel: IsEditing = js.native
  }
}

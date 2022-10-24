package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.AppendTo
import typings.wixStyleReact.anon.Collapsed
import typings.wixStyleReact.distTypesWixStyleReactDefaultsOverrideProviderWixStyleReactDefaultsOverrideProviderMod.WixStyleReactDefaultsOverride
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSearchSearchMod {
  
  /**
    * Search component with suggestions based on input value listed in dropdown
    */
  @JSImport("wix-style-react/dist/types/Search/Search", JSImport.Default)
  @js.native
  open class default protected () extends Search {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Search/Search", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Search/Search", "default.contextType")
    @js.native
    def contextType: Context[WixStyleReactDefaultsOverride] = js.native
    inline def contextType_=(x: Context[WixStyleReactDefaultsOverride]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Search/Search", "default.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Search/Search", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Associate a control with the regions that it controls */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.ariaControls")
      @js.native
      def ariaControls: Requireable[String] = js.native
      inline def ariaControls_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaControls")(x.asInstanceOf[js.Any])
      
      /** Associate a region with its descriptions. Similar to aria-controls but instead associating descriptions to the region and description identifiers are separated with a space. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.ariaDescribedby")
      @js.native
      def ariaDescribedby: Requireable[String] = js.native
      inline def ariaDescribedby_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedby")(x.asInstanceOf[js.Any])
      
      /** Define a string that labels the current element in case where a text label is not visible on the screen */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.ariaLabel")
      @js.native
      def ariaLabel: Requireable[String] = js.native
      inline def ariaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
      
      /** Focus the element on mount (standard React input autoFocus) */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      /** Select the entire text of the element on focus (standard React input autoSelect) */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.autoSelect")
      @js.native
      def autoSelect: Requireable[Boolean] = js.native
      inline def autoSelect_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(x.asInstanceOf[js.Any])
      
      /** Sets the value of native autocomplete attribute (consult the [HTML spec](https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#attr-fe-autocomplete) for possible values)  */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.autocomplete")
      @js.native
      def autocomplete: Requireable[String] = js.native
      inline def autocomplete_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(x.asInstanceOf[js.Any])
      
      /** Control the border style of input */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.border")
      @js.native
      def border: Requireable[String] = js.native
      inline def border_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
      
      /** Specifies a CSS class name to be appended to the component’s root element */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Displays clear button (X) on a non-empty input */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.clearButton")
      @js.native
      def clearButton: Requireable[Boolean] = js.native
      inline def clearButton_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearButton")(x.asInstanceOf[js.Any])
      
      /** Closes DropdownLayout when option is selected */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.closeOnSelect")
      @js.native
      def closeOnSelect: Requireable[Boolean] = js.native
      inline def closeOnSelect_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(x.asInstanceOf[js.Any])
      
      /** Render a custom input component instead of the default html input tag */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.customInput")
      @js.native
      def customInput: Requireable[ReactNodeLike] = js.native
      inline def customInput_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customInput")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Specifies the `onChange` debounce in milliseconds */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.debounceMs")
      @js.native
      def debounceMs: Requireable[Double] = js.native
      inline def debounceMs_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debounceMs")(x.asInstanceOf[js.Any])
      
      /** Defines the initial value of an input for those who want to use this component un-controlled */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.defaultValue")
      @js.native
      def defaultValue: Requireable[String] = js.native
      inline def defaultValue_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      /** Restricts input editing */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.disableEditing")
      @js.native
      def disableEditing: Requireable[Boolean] = js.native
      inline def disableEditing_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableEditing")(x.asInstanceOf[js.Any])
      
      /** Specifies whether the input should be disabled or not */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Sets the offset of the dropdown from the left in pixels */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.dropdownOffsetLeft")
      @js.native
      def dropdownOffsetLeft: Requireable[String] = js.native
      inline def dropdownOffsetLeft_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropdownOffsetLeft")(x.asInstanceOf[js.Any])
      
      /** Sets the width of the dropdown in pixels */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.dropdownWidth")
      @js.native
      def dropdownWidth: Requireable[String] = js.native
      inline def dropdownWidth_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropdownWidth")(x.asInstanceOf[js.Any])
      
      /** Specifies the width of an input in an  expanded state */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.expandWidth")
      @js.native
      def expandWidth: Requireable[String | Double] = js.native
      inline def expandWidth_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandWidth")(x.asInstanceOf[js.Any])
      
      /** Specifies whether to collapse input to search icon only. Once clicked, icon will expand to a full search input. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.expandable")
      @js.native
      def expandable: Requireable[Boolean] = js.native
      inline def expandable_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandable")(x.asInstanceOf[js.Any])
      
      /** USED FOR TESTING - forces focus state on the input */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.forceFocus")
      @js.native
      def forceFocus: Requireable[Boolean] = js.native
      inline def forceFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceFocus")(x.asInstanceOf[js.Any])
      
      /** USED FOR TESTING - forces hover state on the input */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.forceHover")
      @js.native
      def forceHover: Requireable[Boolean] = js.native
      inline def forceHover_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceHover")(x.asInstanceOf[js.Any])
      
      /** Specifies whether there are more items to be loaded */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.hasMore")
      @js.native
      def hasMore: Requireable[Boolean] = js.native
      inline def hasMore_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasMore")(x.asInstanceOf[js.Any])
      
      /** Specifies whether the status suffix should be hidden */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.hideStatusSuffix")
      @js.native
      def hideStatusSuffix: Requireable[Boolean] = js.native
      inline def hideStatusSuffix_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideStatusSuffix")(x.asInstanceOf[js.Any])
      
      /** Highlight word parts that match search criteria in bold */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.highlight")
      @js.native
      def highlight: Requireable[Boolean] = js.native
      inline def highlight_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlight")(x.asInstanceOf[js.Any])
      
      /** Assigns an unique identifier for the root element */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      /** Specifies whether `<DropdownLayout/>` is in a container component. If true, some styles such as shadows, positioning and padding will be added to the component contentContainer. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.inContainer")
      @js.native
      def inContainer: Requireable[Boolean] = js.native
      inline def inContainer_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inContainer")(x.asInstanceOf[js.Any])
      
      /** Specifies whether lazy loading of the dropdown layout items is enabled */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.infiniteScroll")
      @js.native
      def infiniteScroll: Requireable[Boolean] = js.native
      inline def infiniteScroll_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infiniteScroll")(x.asInstanceOf[js.Any])
      
      /** Allows to render a custom input component instead of the default `<Input/>` */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.inputElement")
      @js.native
      def inputElement: Requireable[ReactElementLike] = js.native
      inline def inputElement_=(x: Requireable[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputElement")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called on a request to render more list items */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.loadMore")
      @js.native
      def loadMore: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def loadMore_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadMore")(x.asInstanceOf[js.Any])
      
      /** Sets a maximum value of an input. Similar to HTML5 max attribute. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.max")
      @js.native
      def max: Requireable[Double] = js.native
      
      /** Sets the maximum height of the `dropdownLayout` in pixels */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.maxHeightPixels")
      @js.native
      def maxHeightPixels: Requireable[String | Double] = js.native
      inline def maxHeightPixels_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeightPixels")(x.asInstanceOf[js.Any])
      
      /** Sets the maximum number of characters that can be entered into a field */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.maxLength")
      @js.native
      def maxLength: Requireable[Double] = js.native
      inline def maxLength_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(x.asInstanceOf[js.Any])
      
      inline def max_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      /** Sets a minimum value of an input. Similar to HTML5 min attribute */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.min")
      @js.native
      def min: Requireable[Double] = js.native
      
      /** Sets the minimum width of dropdownLayout in pixels */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.minWidthPixels")
      @js.native
      def minWidthPixels: Requireable[String | Double] = js.native
      inline def minWidthPixels_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidthPixels")(x.asInstanceOf[js.Any])
      
      inline def min_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      /** Reference element data when a form is submitted */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      /** Specifies whether input shouldn’t have rounded corners on its left */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.noLeftBorderRadius")
      @js.native
      def noLeftBorderRadius: Requireable[Boolean] = js.native
      inline def noLeftBorderRadius_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noLeftBorderRadius")(x.asInstanceOf[js.Any])
      
      /** Specifies whether input shouldn’t have rounded corners on its right */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.noRightBorderRadius")
      @js.native
      def noRightBorderRadius: Requireable[Boolean] = js.native
      inline def noRightBorderRadius_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noRightBorderRadius")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input `onBlur` callback */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onBlur")
      @js.native
      def onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onBlur_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input `onChange` callback */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      /** Displays clear button (X) on a non-empty input and calls a callback function with no arguments */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onClear")
      @js.native
      def onClear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClear_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClear")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called whenever the user presses the escape key */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onClose")
      @js.native
      def onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function called on `compositionstart`/`compositionend` events */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onCompositionChange")
      @js.native
      def onCompositionChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCompositionChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCompositionChange")(x.asInstanceOf[js.Any])
      
      /** Defines a callback handler that is called when the presses -enter- */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onEnterPressed")
      @js.native
      def onEnterPressed: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onEnterPressed_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnterPressed")(x.asInstanceOf[js.Any])
      
      /** Defines a callback handler that is called when the user presses -escape- */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onEscapePressed")
      @js.native
      def onEscapePressed: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onEscapePressed_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEscapePressed")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input `onFocus` callback */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onFocus")
      @js.native
      def onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onFocus_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input `onClick` callback */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onInputClicked")
      @js.native
      def onInputClicked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onInputClicked_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInputClicked")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input `onKeyDown` callback */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onKeyDown")
      @js.native
      def onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyDown_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(x.asInstanceOf[js.Any])
      
      /** Defines a standard input `onKeyUp` callback */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onKeyUp")
      @js.native
      def onKeyUp: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyUp_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called when the user performs a submit action. Submit action triggers are:
        * "Enter", "Tab", [typing any defined delimiters], paste action.
        * `onManuallyInput(values: Array<string>): void` - the array of strings is the result of splitting the input value by the given delimiters */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onManuallyInput")
      @js.native
      def onManuallyInput: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onManuallyInput_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onManuallyInput")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called whenever the user enters dropdown layout with the mouse cursor */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onMouseEnter")
      @js.native
      def onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseEnter_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called whenever the user exits from dropdown layout with a mouse cursor */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onMouseLeave")
      @js.native
      def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called whenever an option becomes focused (hovered/active). Receives the relevant option object from the original `props.options array`. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onOptionMarked")
      @js.native
      def onOptionMarked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onOptionMarked_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOptionMarked")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called when options dropdown is hidden */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onOptionsHide")
      @js.native
      def onOptionsHide: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onOptionsHide_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOptionsHide")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called when the options dropdown is shown */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onOptionsShow")
      @js.native
      def onOptionsShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onOptionsShow_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOptionsShow")(x.asInstanceOf[js.Any])
      
      /** Defines a callback handler that is called when user pastes text from a clipboard (using mouse or keyboard shortcut) */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onPaste")
      @js.native
      def onPaste: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onPaste_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called whenever user selects a different option in the list */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.onSelect")
      @js.native
      def onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onSelect_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(x.asInstanceOf[js.Any])
      
      /** Array of objects:
        * - `id <string / number>` *required*: the id of the option, should be unique;
        * - value `<function / string / node>` *required*: can be a string, react element or a builder function;
        * - disabled `<bool>` *default value- false*: whether this option is disabled or not;
        * - linkTo `<string>`: when provided the option will be an anchor to the given value;
        * - title `<bool>`  *default value- false*  **deprecated**: please use `listItemSectionBuilder` for rendering a title;
        * - overrideStyle `<bool>` *default value- false*  **deprecated**: please use `overrideOptionStyle` for override option styles;
        * - overrideOptionStyle `<bool>` *default value- false* - when set to `true`, the option will be responsible for its own styles. No styles will be applied from the DropdownLayout itself;
        * - label `<string>`: the string displayed within an input when the option is selected. This is used when using `<DropdownLayout/>` with an `<Input/>`.
        */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.options")
      @js.native
      def options: Requireable[js.Array[Any]] = js.native
      inline def options_=(x: Requireable[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      /** Handles container overflow */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.overflow")
      @js.native
      def overflow: Requireable[String] = js.native
      inline def overflow_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflow")(x.asInstanceOf[js.Any])
      
      /** Sets a pattern that the typed value must match to be valid (regex) */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.pattern")
      @js.native
      def pattern: Requireable[String] = js.native
      inline def pattern_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
      
      /** Sets a placeholder message to display */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.placeholder")
      @js.native
      def placeholder: Requireable[String] = js.native
      inline def placeholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      /** Allows to pass common popover props. Check `<Popover/>` API for a full list. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.popoverProps")
      @js.native
      def popoverProps: Requireable[InferProps[AppendTo]] = js.native
      inline def popoverProps_=(x: Requireable[InferProps[AppendTo]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(x.asInstanceOf[js.Any])
      
      /** Defines a custom function for options filtering */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.predicate")
      @js.native
      def predicate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def predicate_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("predicate")(x.asInstanceOf[js.Any])
      
      /** Specifies whether input is read only */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.readOnly")
      @js.native
      def readOnly: Requireable[Boolean] = js.native
      inline def readOnly_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      /** Specifies that an input must be filled out before submitting the form */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      /** Flip the component horizontally so it’s more suitable for RTL */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.rtl")
      @js.native
      def rtl: Requireable[Boolean] = js.native
      inline def rtl_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtl")(x.asInstanceOf[js.Any])
      
      /** Specifies whether the selected option will be highlighted when the dropdown is reopened */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.selectedHighlight")
      @js.native
      def selectedHighlight: Requireable[Boolean] = js.native
      inline def selectedHighlight_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectedHighlight")(x.asInstanceOf[js.Any])
      
      /** Specifies selected option by its id */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.selectedId")
      @js.native
      def selectedId: Requireable[String | Double] = js.native
      inline def selectedId_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectedId")(x.asInstanceOf[js.Any])
      
      /** Controls whether to show options if input is empty */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.showOptionsIfEmptyInput")
      @js.native
      def showOptionsIfEmptyInput: Requireable[Boolean] = js.native
      inline def showOptionsIfEmptyInput_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showOptionsIfEmptyInput")(x.asInstanceOf[js.Any])
      
      /** Controls the size of the input */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Specify the status of a field */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.status")
      @js.native
      def status: Requireable[String] = js.native
      
      /** Defines the message to display on status icon hover. If not given or empty there will be no tooltip. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.statusMessage")
      @js.native
      def statusMessage: Requireable[ReactNodeLike] = js.native
      inline def statusMessage_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(x.asInstanceOf[js.Any])
      
      inline def status_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
      
      /** Indicates that element can be focused and where it participates in sequential keyboard navigation */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.tabIndex")
      @js.native
      def tabIndex: Requireable[Double] = js.native
      inline def tabIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
      
      /** Handles text overflow behavior. It can either `clip` (default) or display `ellipsis`. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.textOverflow")
      @js.native
      def textOverflow: Requireable[String] = js.native
      inline def textOverflow_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(x.asInstanceOf[js.Any])
      
      /** Controls the placement of a status tooltip */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.tooltipPlacement")
      @js.native
      def tooltipPlacement: Requireable[String] = js.native
      inline def tooltipPlacement_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacement")(x.asInstanceOf[js.Any])
      
      /** Specifies the type of `<input>` element to display. The default type is text. */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      /** Specifies the current value of the element */
      @JSImport("wix-style-react/dist/types/Search/Search", "default.propTypes.value")
      @js.native
      def value: Requireable[String | Double] = js.native
      inline def value_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Search component with suggestions based on input value listed in dropdown
    */
  @js.native
  trait Search extends Component[Any, Any, Any] {
    
    /**
      * Creates an onChange debounced function
      */
    def _createDebouncedOnChange(): Any = js.native
    
    def _currentValue(): Any = js.native
    
    def _getFilteredOptions(): Any = js.native
    
    def _getIsControlled(): Boolean = js.native
    
    def _onBlur(event: Any): js.Promise[Unit] = js.native
    
    def _onChange(e: Any): Unit = js.native
    
    var _onChangeHandler: Any = js.native
    
    def _onClear(event: Any): Unit = js.native
    
    def _onClearHandler(event: Any): Unit = js.native
    
    def _onFocus(event: Any): Unit = js.native
    
    def _onWrapperClick(): Unit = js.native
    
    def _onWrapperMouseDown(e: Any): Unit = js.native
    
    def _stringFilter(option: Any): Boolean = js.native
    
    /**
      * Removes focus on the input element
      */
    def blur(): Unit = js.native
    
    /**
      * Clears the input.
      *
      * @param event
      */
    def clear(event: Any): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSearch(prevProps: Any): Unit = js.native
    
    /**
      * Sets focus on the input element
      */
    def focus(): Unit = js.native
    
    var searchInput: RefObject[Any] = js.native
    
    @JSName("state")
    var state_Search: Collapsed = js.native
  }
}

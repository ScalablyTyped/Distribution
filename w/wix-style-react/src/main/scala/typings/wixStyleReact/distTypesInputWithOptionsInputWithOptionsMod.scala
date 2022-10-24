package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.FocusOptions
import typings.std.HTMLElement
import typings.wixStyleReact.anon.LastOptionsShow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithOptionsInputWithOptionsMod {
  
  @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", JSImport.Default)
  @js.native
  open class default protected () extends InputWithOptions {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", "default.defaultProps")
    @js.native
    val defaultProps: Any = js.native
    
    @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", "default.propTypes")
    @js.native
    val propTypes: Any = js.native
  }
  
  object DEFAULT_POPOVER_PROPS {
    
    @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", "DEFAULT_POPOVER_PROPS.appendTo")
    @js.native
    val appendTo: String = js.native
    
    @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", "DEFAULT_POPOVER_PROPS.fixed")
    @js.native
    val fixed: Boolean = js.native
    
    @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", "DEFAULT_POPOVER_PROPS.flip")
    @js.native
    val flip: Boolean = js.native
    
    @JSImport("wix-style-react/dist/types/InputWithOptions/InputWithOptions", "DEFAULT_POPOVER_PROPS.placement")
    @js.native
    val placement: String = js.native
  }
  
  inline def DEFAULT_VALUE_PARSER(option: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_VALUE_PARSER")(option.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @js.native
  trait InputWithOptions extends Component[Any, Any, Any] {
    
    /** Checks if focus event is related to selecting an option */
    def _didSelectOption(event: Any): Any = js.native
    
    var _focused: js.UndefOr[Boolean] = js.native
    
    def _onBlur(event: Any): Unit = js.native
    
    def _onChange(event: Any): Unit = js.native
    
    def _onFocus(e: Any): Unit = js.native
    
    def _onInputClicked(event: Any): Unit = js.native
    
    def _onKeyDown(event: Any): Unit = js.native
    
    def _onManuallyInput(): Unit = js.native
    def _onManuallyInput(inputValue: String): Unit = js.native
    
    def _onSelect(option: Any, isSelectedOption: Any): Unit = js.native
    
    def _renderDropdownLayout(): Element = js.native
    
    def _renderNativeSelect(): Element = js.native
    
    /**
      * Removes focus on the input element
      */
    def blur(): Unit = js.native
    
    /**
      * Clears the input.
      *
      * @param event delegated to the onClear call
      */
    def clear(event: Any): Unit = js.native
    
    def closeOnSelect(): Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInputWithOptions(prevProps: Any, prevState: Any): Unit = js.native
    
    def dropdownAdditionalProps(): Unit = js.native
    
    def dropdownClasses(): Unit = js.native
    
    var dropdownLayout: js.UndefOr[typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutMod.default | Null] = js.native
    
    /**
      * Sets focus on the input element
      * @param {FocusOptions} options
      */
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
    /**
      * An array of key codes that act as manual submit. Will be used within
      * onKeyDown(event).
      *
      * @returns {KeyboardEvent.key[]}
      */
    def getManualSubmitKeys(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyboardEvent.key */ Any
      ] = js.native
    
    /**
      * Hides dropdown options
      */
    def hideOptions(): Unit = js.native
    
    var input: RefObject[Any] = js.native
    
    def inputAdditionalProps(): Unit = js.native
    
    def inputClasses(): Unit = js.native
    
    def isDropdownLayoutVisible(): Any = js.native
    
    def isReadOnly: Any = js.native
    
    def onClickOutside(): Unit = js.native
    
    def onCompositionChange(isComposing: Any): Unit = js.native
    
    def renderInput(): DetailedReactHTMLElement[Any, HTMLElement] = js.native
    
    /**
      * Selects all text in the input element
      */
    def select(): Unit = js.native
    
    /**
      * Determine if the provided key should delegate the keydown event to the
      * DropdownLayout.
      *
      * @param {KeyboardEvent.key}
      * @returns {boolean}
      */
    def shouldDelegateKeyDown(key: Any): Boolean = js.native
    
    /**
      * Determine if the provided key should cause the dropdown to be opened.
      *
      * @param {KeyboardEvent.key}
      * @returns {boolean}
      */
    def shouldOpenDropdown(key: Any): Boolean = js.native
    
    /**
      * Determine if the provided key should cause manual submit.
      *
      * @param {KeyboardEvent.key}
      * @returns {boolean}
      */
    def shouldPerformManualSubmit(key: Any): Boolean = js.native
    
    /**
      * Shows dropdown options
      */
    def showOptions(): Unit = js.native
    
    @JSName("state")
    var state_InputWithOptions: LastOptionsShow = js.native
    
    var uniqueId: String = js.native
  }
}

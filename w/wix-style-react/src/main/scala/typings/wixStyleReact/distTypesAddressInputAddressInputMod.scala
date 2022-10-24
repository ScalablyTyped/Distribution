package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.AppendTo
import typings.wixStyleReact.anon.Disabled
import typings.wixStyleReact.anon.Id
import typings.wixStyleReact.anon.InputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputAddressInputMod {
  
  /** AddressInput */
  @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", JSImport.Default)
  @js.native
  open class default protected () extends AddressInput {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.defaultProps.border_1")
      @js.native
      val border1: String = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.defaultProps.clearButton_1")
      @js.native
      val clearButton1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.defaultProps.debounceDuration_1")
      @js.native
      val debounceDuration1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.border")
      @js.native
      val border: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.clearButton")
      @js.native
      val clearButton: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.debounceDuration")
      @js.native
      val debounceDuration: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.initialValue")
      @js.native
      val initialValue: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.noResultsText")
      @js.native
      val noResultsText: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.onBlur")
      @js.native
      val onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.onClear")
      @js.native
      val onClear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.onFocus")
      @js.native
      val onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.onManuallyInput")
      @js.native
      val onManuallyInput: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.onSelect")
      @js.native
      val onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.options")
      @js.native
      val options: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.popoverProps")
      @js.native
      val popoverProps: Requireable[InferProps[AppendTo]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInput/AddressInput", "default.propTypes.value")
      @js.native
      val value: Requireable[String] = js.native
    }
  }
  
  /** AddressInput */
  @js.native
  trait AddressInput extends PureComponent[Any, Any, Any] {
    
    def _getInputValue(): Any = js.native
    
    def _getIsLoading(): Boolean = js.native
    
    def _getStatus(): Any = js.native
    
    def _onChange(event: Any): Unit = js.native
    
    def _onClear(): Unit = js.native
    
    def _onSelect(option: Any): Unit = js.native
    
    def _renderLoadingOption(): Disabled = js.native
    
    def _renderNoResultsOption(): Id = js.native
    
    def _renderOptions(): Any = js.native
    
    def _setDropdownClosed(): Unit = js.native
    
    def _setDropdownOpen(): Unit = js.native
    
    /**
      * Sets focus on the input element
      * @param {FocusOptions} options
      */
    def focus(): Unit = js.native
    
    var innerRef: RefObject[Any] = js.native
    
    @JSName("state")
    var state_AddressInput: InputValue = js.native
  }
}

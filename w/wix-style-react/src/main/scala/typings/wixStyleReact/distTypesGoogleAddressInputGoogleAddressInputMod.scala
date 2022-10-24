package typings.wixStyleReact

import typings.node.timersMod.global.NodeJS.Timeout
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Suggestions
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.distTypesInputWithOptionsMod.InputWithOptionsProps
import typings.wixStyleReact.distTypesInputWithOptionsMod.ManualInputFnSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleAddressInputGoogleAddressInputMod {
  
  /**
    * Address input box (using Google Maps)
    */
  @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", JSImport.Default)
  @js.native
  open class default protected () extends GoogleAddressInput {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.defaultProps.autoSelect")
      @js.native
      val autoSelect: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.defaultProps.clearSuggestionsOnBlur")
      @js.native
      val clearSuggestionsOnBlur: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.defaultProps.fallbackToManual")
      @js.native
      val fallbackToManual: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.defaultProps.magnifyingGlass")
      @js.native
      val magnifyingGlass: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.defaultProps.poweredByGoogle")
      @js.native
      val poweredByGoogle: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.getGoogleFooter")
    @js.native
    def getGoogleFooter: js.Function0[Element] = js.native
    inline def getGoogleFooter_=(x: js.Function0[Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getGoogleFooter")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.Client")
      @js.native
      val Client: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.autoSelect_1")
      @js.native
      val autoSelect1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.clearSuggestionsOnBlur_1")
      @js.native
      val clearSuggestionsOnBlur1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.countryCode")
      @js.native
      val countryCode: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.fallbackToManual_1")
      @js.native
      val fallbackToManual1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.filterTypes")
      @js.native
      val filterTypes: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.footer")
      @js.native
      val footer: Requireable[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.footerOptions_1")
      @js.native
      val footerOptions1: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.handler_1")
      @js.native
      val handler1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.magnifyingGlass_1")
      @js.native
      val magnifyingGlass1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.onBlur")
      @js.native
      val onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.onFocus")
      @js.native
      val onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.onKeyDown")
      @js.native
      val onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.onSet")
      @js.native
      val onSet: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.placeDetailsFields")
      @js.native
      val placeDetailsFields: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.poweredByGoogle_1")
      @js.native
      val poweredByGoogle1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.types")
      @js.native
      val types: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.value")
      @js.native
      val value: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "default.propTypes.valuePrefix")
      @js.native
      val valuePrefix: Requireable[String] = js.native
    }
  }
  
  object GoogleAddressInputHandler {
    
    @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "GoogleAddressInputHandler.geocode")
    @js.native
    val geocode: String = js.native
    
    @JSImport("wix-style-react/dist/types/GoogleAddressInput/GoogleAddressInput", "GoogleAddressInputHandler.places")
    @js.native
    val places: String = js.native
  }
  
  /**
    * Address input box (using Google Maps)
    */
  @js.native
  trait GoogleAddressInput extends Component[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MGoogleAddressInput(nextProps: Any): Unit = js.native
    
    def _getSuggestions(value: Any, skipSetState: Any): js.Promise[Any] = js.native
    
    var autoCompleteRequestId: Double = js.native
    
    var autocomplete: js.UndefOr[
        (typings.wixStyleReact.distTypesInputWithOptionsMod.default[
          ManualInputFnSignature, 
          js.UndefOr[
            js.Function2[/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean, Unit]
          ], 
          InputWithOptionsProps[
            ManualInputFnSignature, 
            js.UndefOr[
              js.Function2[/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean, Unit]
            ]
          ]
        ]) | Null
      ] = js.native
    
    var client: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGoogleAddressInput(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var geocodeRequestId: Double = js.native
    
    def onBlur(): Unit = js.native
    
    def onChange(e: Any): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onManuallyInput(inputValue: Any): Unit = js.native
    
    def onSet(value: Any): Unit = js.native
    
    def select(): Unit = js.native
    
    @JSName("state")
    var state_GoogleAddressInput: Suggestions = js.native
    
    var timer: js.UndefOr[Timeout] = js.native
  }
}

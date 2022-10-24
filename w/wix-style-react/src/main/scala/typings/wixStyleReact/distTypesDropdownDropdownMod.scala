package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.wixStyleReact.anon.AppendTo
import typings.wixStyleReact.anon.DisableEditing
import typings.wixStyleReact.anon.SelectedId
import typings.wixStyleReact.anon.TabIndex
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.distTypesInputWithOptionsMod.InputWithOptionsProps
import typings.wixStyleReact.distTypesInputWithOptionsMod.ManualInputFnSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownDropdownMod {
  
  @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", JSImport.Default)
  @js.native
  open class default protected () extends Dropdown {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.defaultProps")
    @js.native
    val defaultProps: Any = js.native
    
    @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    /**
      * Updates the value by the selectedId.
      * If selectedId is not found in options, then value is NOT changed.
      */
    /* static member */
    inline def getNextState(props: Any, selectedId: Any): SelectedId = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextState")(props.asInstanceOf[js.Any], selectedId.asInstanceOf[js.Any])).asInstanceOf[SelectedId]
    
    /* static member */
    inline def isOptionsEqual(optionsA: Any, optionsB: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionsEqual")(optionsA.asInstanceOf[js.Any], optionsB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.ariaControls")
      @js.native
      val ariaControls: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.ariaDescribedby")
      @js.native
      val ariaDescribedby: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.ariaLabel")
      @js.native
      val ariaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.autoFocus")
      @js.native
      val autoFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.autoSelect")
      @js.native
      val autoSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.border")
      @js.native
      val border: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.clearButton")
      @js.native
      val clearButton: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.closeOnSelect")
      @js.native
      val closeOnSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.customInput")
      @js.native
      val customInput: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.disableEditing")
      @js.native
      val disableEditing: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.dropdownOffsetLeft")
      @js.native
      val dropdownOffsetLeft: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.dropdownWidth")
      @js.native
      val dropdownWidth: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.fixedFooter")
      @js.native
      val fixedFooter: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.fixedHeader")
      @js.native
      val fixedHeader: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.focusOnOption")
      @js.native
      val focusOnOption: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.focusOnSelectedOption")
      @js.native
      val focusOnSelectedOption: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.forceFocus")
      @js.native
      val forceFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.forceHover")
      @js.native
      val forceHover: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.hasMore")
      @js.native
      val hasMore: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.hideStatusSuffix")
      @js.native
      val hideStatusSuffix: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.id")
      @js.native
      val id: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.inContainer")
      @js.native
      val inContainer: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.infiniteScroll")
      @js.native
      val infiniteScroll: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.initialSelectedId")
      @js.native
      val initialSelectedId: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.inputElement")
      @js.native
      val inputElement: Requireable[ReactElementLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.loadMore")
      @js.native
      val loadMore: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.markedOption")
      @js.native
      val markedOption: Requireable[String | Double | Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.maxHeightPixels")
      @js.native
      val maxHeightPixels: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.menuArrow")
      @js.native
      val menuArrow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.min")
      @js.native
      val min: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.minWidthPixels")
      @js.native
      val minWidthPixels: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.name")
      @js.native
      val name: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.native")
      @js.native
      val native: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.noLeftBorderRadius")
      @js.native
      val noLeftBorderRadius: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.noRightBorderRadius")
      @js.native
      val noRightBorderRadius: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onBlur")
      @js.native
      val onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onClear")
      @js.native
      val onClear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onCompositionChange")
      @js.native
      val onCompositionChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onEnterPressed")
      @js.native
      val onEnterPressed: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onEscapePressed")
      @js.native
      val onEscapePressed: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onFocus")
      @js.native
      val onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onInputClicked")
      @js.native
      val onInputClicked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onKeyDown")
      @js.native
      val onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onKeyUp")
      @js.native
      val onKeyUp: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onManuallyInput")
      @js.native
      val onManuallyInput: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onMouseEnter")
      @js.native
      val onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onMouseLeave")
      @js.native
      val onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onOptionMarked")
      @js.native
      val onOptionMarked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onOptionsHide")
      @js.native
      val onOptionsHide: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onOptionsShow")
      @js.native
      val onOptionsShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.onSelect")
      @js.native
      val onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.options")
      @js.native
      val options: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.overflow")
      @js.native
      val overflow: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.popoverProps")
      @js.native
      val popoverProps: Requireable[InferProps[AppendTo]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.prefix")
      @js.native
      val prefix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.rtl")
      @js.native
      val rtl: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.selectedHighlight")
      @js.native
      val selectedHighlight: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.selectedId")
      @js.native
      val selectedId: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.showOptionsIfEmptyInput")
      @js.native
      val showOptionsIfEmptyInput: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.suffix")
      @js.native
      val suffix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.tabIndex")
      @js.native
      val tabIndex: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.textOverflow")
      @js.native
      val textOverflow: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.tooltipPlacement")
      @js.native
      val tooltipPlacement: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.valueParser")
      @js.native
      val valueParser: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Dropdown/Dropdown", "default.propTypes.visible")
      @js.native
      val visible: Requireable[Boolean] = js.native
    }
  }
  
  @js.native
  trait Dropdown
    extends typings.wixStyleReact.distTypesInputWithOptionsMod.default[
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
        ] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDropdown(nextProps: Any): Unit = js.native
    
    def _onChange(event: Any): Unit = js.native
    
    def _onInputClicked(event: Any): Unit = js.native
    
    def _onSelect(option: Any): Unit = js.native
    
    def dropdownAdditionalProps(): TabIndex = js.native
    
    def getSelectedId(): Any = js.native
    
    def inputAdditionalProps(): DisableEditing = js.native
    
    def inputClasses(): Any = js.native
    
    def isSelectedIdControlled(): Boolean = js.native
    
    @JSName("state")
    var state_Dropdown: SelectedId = js.native
  }
}

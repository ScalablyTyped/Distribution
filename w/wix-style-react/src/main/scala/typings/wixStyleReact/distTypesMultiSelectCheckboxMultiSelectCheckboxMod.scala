package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.wixStyleReact.anon.AppendTo
import typings.wixStyleReact.anon.InputElement
import typings.wixStyleReact.anon.ReadonlyInputWithOptionsP
import typings.wixStyleReact.anon.SelectedHighlight
import typings.wixStyleReact.anon.ValueAny
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.distTypesInputWithOptionsMod.InputWithOptionsProps
import typings.wixStyleReact.distTypesInputWithOptionsMod.ManualInputFnSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMultiSelectCheckboxMultiSelectCheckboxMod {
  
  @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", JSImport.Default)
  @js.native
  open class default protected () extends MultiSelectCheckbox {
    def this(props: ReadonlyInputWithOptionsP) = this()
    def this(props: InputWithOptionsProps[
            ManualInputFnSignature, 
            js.UndefOr[
              js.Function2[/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean, Unit]
            ]
          ]) = this()
    def this(
      props: InputWithOptionsProps[
            ManualInputFnSignature, 
            js.UndefOr[
              js.Function2[/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean, Unit]
            ]
          ],
      context: Any
    ) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.defaultProps")
    @js.native
    val defaultProps: Any = js.native
    
    @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.ariaControls")
      @js.native
      val ariaControls: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.ariaDescribedby")
      @js.native
      val ariaDescribedby: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.ariaLabel")
      @js.native
      val ariaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.autoFocus")
      @js.native
      val autoFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.autoSelect")
      @js.native
      val autoSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.border")
      @js.native
      val border: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.clearButton")
      @js.native
      val clearButton: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.closeOnSelect")
      @js.native
      val closeOnSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.customInput")
      @js.native
      val customInput: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.defaultValue")
      @js.native
      val defaultValue: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.delimiter")
      @js.native
      val delimiter: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.disableEditing")
      @js.native
      val disableEditing: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.dropdownOffsetLeft")
      @js.native
      val dropdownOffsetLeft: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.dropdownWidth")
      @js.native
      val dropdownWidth: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.fixedFooter")
      @js.native
      val fixedFooter: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.fixedHeader")
      @js.native
      val fixedHeader: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.focusOnOption")
      @js.native
      val focusOnOption: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.focusOnSelectedOption")
      @js.native
      val focusOnSelectedOption: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.forceFocus")
      @js.native
      val forceFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.forceHover")
      @js.native
      val forceHover: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.hasMore")
      @js.native
      val hasMore: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.hideStatusSuffix")
      @js.native
      val hideStatusSuffix: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.highlight")
      @js.native
      val highlight: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.id")
      @js.native
      val id: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.inContainer")
      @js.native
      val inContainer: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.infiniteScroll")
      @js.native
      val infiniteScroll: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.inputElement")
      @js.native
      val inputElement: Requireable[ReactElementLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.loadMore")
      @js.native
      val loadMore: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.markedOption")
      @js.native
      val markedOption: Requireable[String | Double | Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.max")
      @js.native
      val max: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.maxHeightPixels")
      @js.native
      val maxHeightPixels: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.maxLength")
      @js.native
      val maxLength: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.menuArrow")
      @js.native
      val menuArrow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.min")
      @js.native
      val min: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.minWidthPixels")
      @js.native
      val minWidthPixels: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.name")
      @js.native
      val name: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.noLeftBorderRadius")
      @js.native
      val noLeftBorderRadius: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.noRightBorderRadius")
      @js.native
      val noRightBorderRadius: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onBlur")
      @js.native
      val onBlur: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onClear")
      @js.native
      val onClear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onCompositionChange")
      @js.native
      val onCompositionChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onDeselect")
      @js.native
      val onDeselect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onEnterPressed")
      @js.native
      val onEnterPressed: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onEscapePressed")
      @js.native
      val onEscapePressed: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onFocus")
      @js.native
      val onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onInputClicked")
      @js.native
      val onInputClicked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onKeyDown")
      @js.native
      val onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onKeyUp")
      @js.native
      val onKeyUp: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onManuallyInput")
      @js.native
      val onManuallyInput: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onMouseEnter")
      @js.native
      val onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onMouseLeave")
      @js.native
      val onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onOptionMarked")
      @js.native
      val onOptionMarked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onOptionsHide")
      @js.native
      val onOptionsHide: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onOptionsShow")
      @js.native
      val onOptionsShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onPaste")
      @js.native
      val onPaste: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.onSelect")
      @js.native
      val onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.options")
      @js.native
      val options: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.overflow")
      @js.native
      val overflow: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.pattern")
      @js.native
      val pattern: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.popoverProps")
      @js.native
      val popoverProps: Requireable[InferProps[AppendTo]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.prefix")
      @js.native
      val prefix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.required")
      @js.native
      val required: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.rtl")
      @js.native
      val rtl: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.selectedHighlight")
      @js.native
      val selectedHighlight: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.selectedId")
      @js.native
      val selectedId: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.selectedOptions")
      @js.native
      val selectedOptions: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.showOptionsIfEmptyInput")
      @js.native
      val showOptionsIfEmptyInput: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.suffix")
      @js.native
      val suffix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.tabIndex")
      @js.native
      val tabIndex: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.textOverflow")
      @js.native
      val textOverflow: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.tooltipPlacement")
      @js.native
      val tooltipPlacement: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.value")
      @js.native
      val value: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.valueParser")
      @js.native
      val valueParser: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelectCheckbox/MultiSelectCheckbox", "default.propTypes.visible")
      @js.native
      val visible: Requireable[Boolean] = js.native
    }
  }
  
  @js.native
  trait MultiSelectCheckbox
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
    
    var _focused: js.UndefOr[Boolean] = js.native
    
    def _isDivider(param0: ValueAny): Boolean = js.native
    
    def _isUsingCustomRenderFunction(param0: ValueAny): Boolean = js.native
    
    def _onFocus(e: Any): Unit = js.native
    
    def _onInputClicked(event: Any): Unit = js.native
    
    def _onKeyDown(event: Any): Unit = js.native
    
    def _onSelect(option: Any): Unit = js.native
    
    def _patchOptionWithSelectionMechanism(option: Any): Any = js.native
    
    def createOptions(options: Any): Any = js.native
    
    def dropdownAdditionalProps(): SelectedHighlight = js.native
    
    def inputAdditionalProps(): InputElement = js.native
    
    def inputClasses(): Any = js.native
    
    def isSelectedId(optionId: Any): Boolean = js.native
    
    def selectedOptionsToText(): Any = js.native
  }
}

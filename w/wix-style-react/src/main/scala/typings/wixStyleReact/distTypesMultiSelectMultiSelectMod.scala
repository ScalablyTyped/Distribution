package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactComponentLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AppendTo
import typings.wixStyleReact.anon.CloseOnSelect
import typings.wixStyleReact.anon.Dataref
import typings.wixStyleReact.anon.Delimiters
import typings.wixStyleReact.anon.PasteDetected
import typings.wixStyleReact.anon.Tag
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.distTypesInputWithOptionsMod.InputWithOptionsProps
import typings.wixStyleReact.distTypesInputWithOptionsMod.ManualInputFnSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMultiSelectMultiSelectMod {
  
  @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", JSImport.Default)
  @js.native
  open class default protected () extends MultiSelect {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.autoSizeInput")
    @js.native
    def autoSizeInput: js.Function1[/* param0 */ Dataref, Element] = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.autoSizeInputWithRef")
    @js.native
    def autoSizeInputWithRef: js.Function0[ForwardRefExoticComponent[RefAttributes[Any]]] = js.native
    inline def autoSizeInputWithRef_=(x: js.Function0[ForwardRefExoticComponent[RefAttributes[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoSizeInputWithRef")(x.asInstanceOf[js.Any])
    
    inline def autoSizeInput_=(x: js.Function1[/* param0 */ Dataref, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoSizeInput")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.defaultProps")
    @js.native
    val defaultProps: Any = js.native
    
    @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.acceptOnBlur")
      @js.native
      val acceptOnBlur: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.ariaControls")
      @js.native
      val ariaControls: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.ariaDescribedby")
      @js.native
      val ariaDescribedby: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.ariaLabel")
      @js.native
      val ariaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.border")
      @js.native
      val border: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.clearOnBlur")
      @js.native
      val clearOnBlur: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.closeOnSelect")
      @js.native
      val closeOnSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.customInput")
      @js.native
      val customInput: Requireable[(js.Function1[/* repeated */ Any, Any]) | ReactComponentLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.customSuffix")
      @js.native
      val customSuffix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.delimiters")
      @js.native
      val delimiters: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.emptyStateMessage")
      @js.native
      val emptyStateMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.hasMore")
      @js.native
      val hasMore: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.infiniteScroll")
      @js.native
      val infiniteScroll: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.loadMore")
      @js.native
      val loadMore: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.maxNumRows")
      @js.native
      val maxNumRows: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.mode")
      @js.native
      val mode: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.onManuallyInput")
      @js.native
      val onManuallyInput: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.onOptionsHide")
      @js.native
      val onOptionsHide: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.onOptionsShow")
      @js.native
      val onOptionsShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.onRemoveTag")
      @js.native
      val onRemoveTag: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.onReorder")
      @js.native
      val onReorder: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.onSelect")
      @js.native
      val onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.popoverProps")
      @js.native
      val popoverProps: Requireable[InferProps[AppendTo]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.predicate")
      @js.native
      val predicate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MultiSelect/MultiSelect", "default.propTypes.tags")
      @js.native
      val tags: Requireable[js.Array[Any]] = js.native
    }
  }
  
  @js.native
  trait MultiSelect
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
    
    def _onBlur(event: Any): Unit = js.native
    
    def _onChange(event: Any): Unit = js.native
    
    def _onManuallyInput(inputValue: Any, event: Any): Unit = js.native
    
    def _onSelect(option: Any): Unit = js.native
    
    def _splitByDelimitersAndTrim(value: Any): Any = js.native
    
    def clearInput(): Unit = js.native
    
    def closeOnSelect(): Boolean = js.native
    
    def dropdownAdditionalProps(): CloseOnSelect = js.native
    
    def getManualSubmitKeys(): js.Array[String] = js.native
    
    def getUnselectedOptions(): js.Array[DropdownLayoutOption] = js.native
    
    def inputAdditionalProps(): Delimiters = js.native
    
    def onClickOutside(): Unit = js.native
    
    def onKeyDown(event: Any): Unit = js.native
    
    def onPaste(): Unit = js.native
    
    def onSelect(option: Any): Unit = js.native
    
    def optionToTag(param0: Tag): Any = js.native
    
    @JSName("state")
    var state_MultiSelect: PasteDetected = js.native
    
    def submitValue(inputValue: Any): Unit = js.native
  }
}

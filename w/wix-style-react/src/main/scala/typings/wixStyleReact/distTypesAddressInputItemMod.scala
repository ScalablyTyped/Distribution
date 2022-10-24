package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.anon.DataHook_
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputItemMod {
  
  @JSImport("wix-style-react/dist/types/AddressInputItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/AddressInputItem", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AddressInputItemProps, js.Object, Any]
  
  inline def addressInputItemBuilder(data: DataHook_): DropdownLayoutValueOption = ^.asInstanceOf[js.Dynamic].applyDynamic("addressInputItemBuilder")(data.asInstanceOf[js.Any]).asInstanceOf[DropdownLayoutValueOption]
  
  type AddressInputItem = PureComponent[AddressInputItemProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.`single-line`
    - typings.wixStyleReact.wixStyleReactStrings.`double-line`
  */
  trait AddressInputItemLayout extends StObject
  object AddressInputItemLayout {
    
    inline def `double-line`: typings.wixStyleReact.wixStyleReactStrings.`double-line` = "double-line".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`double-line`]
    
    inline def `single-line`: typings.wixStyleReact.wixStyleReactStrings.`single-line` = "single-line".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.`single-line`]
  }
  
  trait AddressInputItemProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var highlighted: js.UndefOr[Boolean] = js.undefined
    
    var mainLabel: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var optionLayout: js.UndefOr[AddressInputItemLayout] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var secondaryLabel: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
  }
  object AddressInputItemProps {
    
    inline def apply(): AddressInputItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressInputItemProps]
    }
    
    extension [Self <: AddressInputItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
      
      inline def setMainLabel(value: String): Self = StObject.set(x, "mainLabel", value.asInstanceOf[js.Any])
      
      inline def setMainLabelUndefined: Self = StObject.set(x, "mainLabel", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOptionLayout(value: AddressInputItemLayout): Self = StObject.set(x, "optionLayout", value.asInstanceOf[js.Any])
      
      inline def setOptionLayoutUndefined: Self = StObject.set(x, "optionLayout", js.undefined)
      
      inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSecondaryLabel(value: String): Self = StObject.set(x, "secondaryLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondaryLabelUndefined: Self = StObject.set(x, "secondaryLabel", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}

package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.distTypesBadgeMod.BadgeSize
import typings.wixStyleReact.distTypesBadgeMod.BadgeType
import typings.wixStyleReact.distTypesBadgeSelectItemMod.BadgeSelectItem
import typings.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectMod {
  
  @JSImport("wix-style-react/dist/types/BadgeSelect", JSImport.Default)
  @js.native
  open class default () extends BadgeSelect
  
  @js.native
  trait BadgeSelect
    extends Component[BadgeSelectProps, js.Object, Any] {
    
    def getSelectedOption(props: Any): BadgeSelectItem = js.native
    
    def hideDropdown(): Unit = js.native
    
    def showDropdown(): Unit = js.native
    
    def toggleDropdown(): Unit = js.native
  }
  
  trait BadgeSelectProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* option */ BadgeSelectItem, Unit]] = js.undefined
    
    var options: js.Array[BadgeSelectItem]
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var selectedId: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[BadgeSize] = js.undefined
    
    var `type`: js.UndefOr[BadgeType] = js.undefined
    
    var uppercase: js.UndefOr[Boolean] = js.undefined
  }
  object BadgeSelectProps {
    
    inline def apply(options: js.Array[BadgeSelectItem]): BadgeSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeSelectProps]
    }
    
    extension [Self <: BadgeSelectProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnSelect(value: /* option */ BadgeSelectItem => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[BadgeSelectItem]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: BadgeSelectItem*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setSize(value: BadgeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: BadgeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
}

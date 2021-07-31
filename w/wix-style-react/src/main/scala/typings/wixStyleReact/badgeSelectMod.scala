package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.badgeMod.BadgeSize
import typings.wixStyleReact.badgeMod.BadgeType
import typings.wixStyleReact.badgeSelectItemMod.BadgeSelectItem
import typings.wixStyleReact.commonMod.PopoverCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeSelectMod {
  
  @JSImport("wix-style-react/dist/es/src/BadgeSelect", JSImport.Default)
  @js.native
  class default () extends BadgeSelect
  
  @js.native
  trait BadgeSelect
    extends Component[BadgeSelectProps, js.Object, js.Any] {
    
    def getSelectedOption(props: js.Any): BadgeSelectItem = js.native
    
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
    
    @scala.inline
    def apply(options: js.Array[BadgeSelectItem]): BadgeSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeSelectProps]
    }
    
    @scala.inline
    implicit class BadgeSelectPropsMutableBuilder[Self <: BadgeSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* option */ BadgeSelectItem => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[BadgeSelectItem]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: BadgeSelectItem*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      @scala.inline
      def setSize(value: BadgeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: BadgeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
}

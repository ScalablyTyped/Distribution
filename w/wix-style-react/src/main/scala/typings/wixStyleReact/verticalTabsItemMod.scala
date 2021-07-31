package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.commonMod.IconElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalTabsItemMod {
  
  @JSImport("wix-style-react/dist/es/src/VerticalTabsItem", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[VerticalTabsItemProps, js.Object, js.Any]
  
  type VerticalTabsItem = PureComponent[VerticalTabsItemProps, js.Object, js.Any]
  
  trait VerticalTabsItemProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var prefixIcon: js.UndefOr[IconElement] = js.undefined
    
    var suffixIcon: js.UndefOr[IconElement] = js.undefined
    
    var `type`: js.UndefOr[VerticalTabsItemType] = js.undefined
  }
  object VerticalTabsItemProps {
    
    @scala.inline
    def apply(): VerticalTabsItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTabsItemProps]
    }
    
    @scala.inline
    implicit class VerticalTabsItemPropsMutableBuilder[Self <: VerticalTabsItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: IconElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setType(value: VerticalTabsItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tab
    - typings.wixStyleReact.wixStyleReactStrings.action
    - typings.wixStyleReact.wixStyleReactStrings.title
  */
  trait VerticalTabsItemType extends StObject
  object VerticalTabsItemType {
    
    @scala.inline
    def action: typings.wixStyleReact.wixStyleReactStrings.action = "action".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.action]
    
    @scala.inline
    def tab: typings.wixStyleReact.wixStyleReactStrings.tab = "tab".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tab]
    
    @scala.inline
    def title: typings.wixStyleReact.wixStyleReactStrings.title = "title".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.title]
  }
}

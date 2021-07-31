package typings.wixUiCore

import typings.react.mod.ReactNode
import typings.wixUiCore.anon.PartialDividerArgs
import typings.wixUiCore.anon.PartialOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionFactoryMod {
  
  object OptionFactory {
    
    @JSImport("wix-ui-core/dist/src/components/dropdown-option/OptionFactory", "OptionFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Option]
    @scala.inline
    def create(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @scala.inline
    def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
    @scala.inline
    def createDivider(hasClassNameValue: PartialDividerArgs): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(hasClassNameValue.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @scala.inline
    def createHighlighted(option: Option, highlightValue: String): Option = (^.asInstanceOf[js.Dynamic].applyDynamic("createHighlighted")(option.asInstanceOf[js.Any], highlightValue.asInstanceOf[js.Any])).asInstanceOf[Option]
  }
  
  trait DividerArgs extends StObject {
    
    var className: String
    
    var value: ReactNode
  }
  object DividerArgs {
    
    @scala.inline
    def apply(className: String): DividerArgs = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[DividerArgs]
    }
    
    @scala.inline
    implicit class DividerArgsMutableBuilder[Self <: DividerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var id: Double | String
    
    var isDisabled: Boolean
    
    var isSelectable: Boolean
    
    def render(value: ReactNode): ReactNode
    
    var value: String
  }
  object Option {
    
    @scala.inline
    def apply(
      id: Double | String,
      isDisabled: Boolean,
      isSelectable: Boolean,
      render: ReactNode => ReactNode,
      value: String
    ): Option = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: ReactNode => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

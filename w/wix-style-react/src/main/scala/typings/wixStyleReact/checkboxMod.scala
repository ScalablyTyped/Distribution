package typings.wixStyleReact

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.PureComponent
import typings.std.HTMLInputElement
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("wix-style-react/dist/es/src/Checkbox", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[CheckboxProps, js.Object, js.Any]
  
  type Checkbox = PureComponent[CheckboxProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.small
  */
  trait CheckboxLabelSize extends StObject
  object CheckboxLabelSize {
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  trait CheckboxProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var hasError: js.UndefOr[Boolean] = js.undefined
    
    var hover: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var selectionArea: js.UndefOr[CheckboxSelectionArea] = js.undefined
    
    var size: js.UndefOr[CheckboxLabelSize] = js.undefined
    
    var vAlign: js.UndefOr[CheckboxVAlign] = js.undefined
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasErrorUndefined: Self = StObject.set(x, "hasError", js.undefined)
      
      @scala.inline
      def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSelectionArea(value: CheckboxSelectionArea): Self = StObject.set(x, "selectionArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionAreaUndefined: Self = StObject.set(x, "selectionArea", js.undefined)
      
      @scala.inline
      def setSize(value: CheckboxLabelSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVAlign(value: CheckboxVAlign): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.none_
    - typings.wixStyleReact.wixStyleReactStrings.hover
    - typings.wixStyleReact.wixStyleReactStrings.always
  */
  trait CheckboxSelectionArea extends StObject
  object CheckboxSelectionArea {
    
    @scala.inline
    def always: typings.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.always]
    
    @scala.inline
    def hover: typings.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.hover]
    
    @scala.inline
    def none: none_ = "none".asInstanceOf[none_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.top
  */
  trait CheckboxVAlign extends StObject
  object CheckboxVAlign {
    
    @scala.inline
    def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    @scala.inline
    def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
}

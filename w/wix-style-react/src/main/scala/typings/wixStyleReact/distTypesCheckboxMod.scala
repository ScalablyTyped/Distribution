package typings.wixStyleReact

import typings.csstype.mod.Property.Padding
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCheckboxMod {
  
  @JSImport("wix-style-react/dist/types/Checkbox", JSImport.Default)
  @js.native
  open class default () extends Checkbox
  
  @js.native
  trait Checkbox
    extends PureComponent[CheckboxProps, js.Object, Any] {
    
    def focus(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.small
  */
  trait CheckboxLabelSize extends StObject
  object CheckboxLabelSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  trait CheckboxProps extends StObject {
    
    /** Specifies whether a checkbox is selected */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies a CSS class name to be appended to the component’s root element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Applies a data-hook HTML attribute that can be used in tests */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** Specifies whether a checkbox is disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The error message when there's an error
      * @deprecated use tooltipContent instead
      * */
    var errorMessage: js.UndefOr[String] = js.undefined
    
    /** Specifies whether a checkbox has an error */
    var hasError: js.UndefOr[Boolean] = js.undefined
    
    /** Assigns a unique identifier for the checkbox */
    var id: js.UndefOr[String] = js.undefined
    
    /** Specifies whether a checkbox is in an indeterminate state */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** Defines a callback function which is called every time the checkbox state is changed */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    /** Controls the selection area highlight visibility */
    var selectionArea: js.UndefOr[CheckboxSelectionArea] = js.undefined
    
    /** Sets the amount of white space around the checkbox label in pixels */
    var selectionAreaPadding: js.UndefOr[Padding[String | Double]] = js.undefined
    
    /** Sets the design of the selection area */
    var selectionAreaSkin: js.UndefOr[CheckboxSelectionAreaSkin] = js.undefined
    
    /** Controls the size of the checkbox label */
    var size: js.UndefOr[CheckboxLabelSize] = js.undefined
    
    /** Defines a message to be displayed in a tooltip. Tooltip is displayed on a checkbox hover. */
    var tooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    /** Allows you to pass all common tooltip props. Check `<Tooltip/>` for the full API. */
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    /** Controls checkbox alignment to the label on the Y axis */
    var vAlign: js.UndefOr[CheckboxVAlign] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setHasErrorUndefined: Self = StObject.set(x, "hasError", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSelectionArea(value: CheckboxSelectionArea): Self = StObject.set(x, "selectionArea", value.asInstanceOf[js.Any])
      
      inline def setSelectionAreaPadding(value: Padding[String | Double]): Self = StObject.set(x, "selectionAreaPadding", value.asInstanceOf[js.Any])
      
      inline def setSelectionAreaPaddingUndefined: Self = StObject.set(x, "selectionAreaPadding", js.undefined)
      
      inline def setSelectionAreaSkin(value: CheckboxSelectionAreaSkin): Self = StObject.set(x, "selectionAreaSkin", value.asInstanceOf[js.Any])
      
      inline def setSelectionAreaSkinUndefined: Self = StObject.set(x, "selectionAreaSkin", js.undefined)
      
      inline def setSelectionAreaUndefined: Self = StObject.set(x, "selectionArea", js.undefined)
      
      inline def setSize(value: CheckboxLabelSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTooltipContent(value: ReactNode): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      inline def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
      
      inline def setVAlign(value: CheckboxVAlign): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.none_
    - typings.wixStyleReact.wixStyleReactStrings.hover
    - typings.wixStyleReact.wixStyleReactStrings.always
  */
  trait CheckboxSelectionArea extends StObject
  object CheckboxSelectionArea {
    
    inline def always: typings.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.always]
    
    inline def hover: typings.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.hover]
    
    inline def none: none_ = "none".asInstanceOf[none_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.filled
    - typings.wixStyleReact.wixStyleReactStrings.outlined
  */
  trait CheckboxSelectionAreaSkin extends StObject
  object CheckboxSelectionAreaSkin {
    
    inline def filled: typings.wixStyleReact.wixStyleReactStrings.filled = "filled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.filled]
    
    inline def outlined: typings.wixStyleReact.wixStyleReactStrings.outlined = "outlined".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.outlined]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.top
  */
  trait CheckboxVAlign extends StObject
  object CheckboxVAlign {
    
    inline def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    inline def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
}

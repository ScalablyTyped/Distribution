package typings.wixStyleReact

import typings.csstype.mod.Property.Padding
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.wixStyleReact.anon.RadioPropscontentReactNod
import typings.wixStyleReact.distTypesRadioMod.RadioAlignItems
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadioGroupMod {
  
  @JSImport("wix-style-react/dist/types/RadioGroup", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[RadioGroupProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/RadioGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Radio(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Radio")().asInstanceOf[ReactElement]
    inline def Radio(props: RadioPropscontentReactNod): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Radio")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  type RadioGroup = PureComponent[RadioGroupProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.vertical
    - typings.wixStyleReact.wixStyleReactStrings.horizontal
  */
  trait RadioGroupDisplay extends StObject
  object RadioGroupDisplay {
    
    inline def horizontal: typings.wixStyleReact.wixStyleReactStrings.horizontal = "horizontal".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.horizontal]
    
    inline def vertical: typings.wixStyleReact.wixStyleReactStrings.vertical = "vertical".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.vertical]
  }
  
  trait RadioGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledRadios: js.UndefOr[js.Array[js.UndefOr[String | Double]]] = js.undefined
    
    var display: js.UndefOr[RadioGroupDisplay] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | Double], Unit]] = js.undefined
    
    var selectionArea: js.UndefOr[RadioSelectionArea] = js.undefined
    
    var selectionAreaPadding: js.UndefOr[Padding[String | Double]] = js.undefined
    
    var selectionAreaSkin: js.UndefOr[RadioSelectionAreaSkin] = js.undefined
    
    var spacing: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[RadioType] = js.undefined
    
    var vAlign: js.UndefOr[RadioAlignItems] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object RadioGroupProps {
    
    inline def apply(): RadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    extension [Self <: RadioGroupProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledRadios(value: js.Array[js.UndefOr[String | Double]]): Self = StObject.set(x, "disabledRadios", value.asInstanceOf[js.Any])
      
      inline def setDisabledRadiosUndefined: Self = StObject.set(x, "disabledRadios", js.undefined)
      
      inline def setDisabledRadiosVarargs(value: (js.UndefOr[String | Double])*): Self = StObject.set(x, "disabledRadios", js.Array(value*))
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(value: RadioGroupDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[String | Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSelectionArea(value: RadioSelectionArea): Self = StObject.set(x, "selectionArea", value.asInstanceOf[js.Any])
      
      inline def setSelectionAreaPadding(value: Padding[String | Double]): Self = StObject.set(x, "selectionAreaPadding", value.asInstanceOf[js.Any])
      
      inline def setSelectionAreaPaddingUndefined: Self = StObject.set(x, "selectionAreaPadding", js.undefined)
      
      inline def setSelectionAreaSkin(value: RadioSelectionAreaSkin): Self = StObject.set(x, "selectionAreaSkin", value.asInstanceOf[js.Any])
      
      inline def setSelectionAreaSkinUndefined: Self = StObject.set(x, "selectionAreaSkin", js.undefined)
      
      inline def setSelectionAreaUndefined: Self = StObject.set(x, "selectionArea", js.undefined)
      
      inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setType(value: RadioType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVAlign(value: RadioAlignItems): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.none_
    - typings.wixStyleReact.wixStyleReactStrings.hover
    - typings.wixStyleReact.wixStyleReactStrings.always
  */
  trait RadioSelectionArea extends StObject
  object RadioSelectionArea {
    
    inline def always: typings.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.always]
    
    inline def hover: typings.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.hover]
    
    inline def none: none_ = "none".asInstanceOf[none_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.filled
    - typings.wixStyleReact.wixStyleReactStrings.outlined
  */
  trait RadioSelectionAreaSkin extends StObject
  object RadioSelectionAreaSkin {
    
    inline def filled: typings.wixStyleReact.wixStyleReactStrings.filled = "filled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.filled]
    
    inline def outlined: typings.wixStyleReact.wixStyleReactStrings.outlined = "outlined".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.outlined]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.default
    - typings.wixStyleReact.wixStyleReactStrings.button
  */
  trait RadioType extends StObject
  object RadioType {
    
    inline def default: typings.wixStyleReact.wixStyleReactStrings.default = "default".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.default]
    
    inline def button: typings.wixStyleReact.wixStyleReactStrings.button = "button".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.button]
  }
  
  type RadioVAlign = RadioAlignItems
}

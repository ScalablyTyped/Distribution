package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod {
  
  @JSImport("wix-style-react/dist/es/src/RadioGroup", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[RadioGroupProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/RadioGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/RadioGroup", "default.Radio")
    @js.native
    def Radio: Instantiable0[RadioButton] = js.native
    @scala.inline
    def Radio_=(x: Instantiable0[RadioButton]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Radio")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/es/src/RadioGroup", "RadioButton")
  @js.native
  class RadioButton protected ()
    extends PureComponent[RadioButtonProps, js.Object, js.Any] {
    def this(props: RadioButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RadioButtonProps, context: js.Any) = this()
  }
  
  trait RadioButtonProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var lineHeight: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | Double], Unit]] = js.undefined
    
    var selectionArea: js.UndefOr[RadioButtonSelectionArea] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[RadioButtonType] = js.undefined
    
    var vAlign: js.UndefOr[RadioButtonVAlign] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonProps {
    
    @scala.inline
    def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    @scala.inline
    implicit class RadioButtonPropsMutableBuilder[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[String | Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSelectionArea(value: RadioButtonSelectionArea): Self = StObject.set(x, "selectionArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionAreaUndefined: Self = StObject.set(x, "selectionArea", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setType(value: RadioButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVAlign(value: RadioButtonVAlign): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.none_
    - typings.wixStyleReact.wixStyleReactStrings.hover
    - typings.wixStyleReact.wixStyleReactStrings.always
  */
  trait RadioButtonSelectionArea extends StObject
  object RadioButtonSelectionArea {
    
    @scala.inline
    def always: typings.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.always]
    
    @scala.inline
    def hover: typings.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.hover]
    
    @scala.inline
    def none: none_ = "none".asInstanceOf[none_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.default
    - typings.wixStyleReact.wixStyleReactStrings.button
  */
  trait RadioButtonType extends StObject
  object RadioButtonType {
    
    @scala.inline
    def default: typings.wixStyleReact.wixStyleReactStrings.default = "default".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.default]
    
    @scala.inline
    def button: typings.wixStyleReact.wixStyleReactStrings.button = "button".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.button]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.top
  */
  trait RadioButtonVAlign extends StObject
  object RadioButtonVAlign {
    
    @scala.inline
    def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    @scala.inline
    def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
  
  type RadioGroup = PureComponent[RadioGroupProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.vertical
    - typings.wixStyleReact.wixStyleReactStrings.horizontal
  */
  trait RadioGroupDisplay extends StObject
  object RadioGroupDisplay {
    
    @scala.inline
    def horizontal: typings.wixStyleReact.wixStyleReactStrings.horizontal = "horizontal".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.horizontal]
    
    @scala.inline
    def vertical: typings.wixStyleReact.wixStyleReactStrings.vertical = "vertical".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.vertical]
  }
  
  trait RadioGroupProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledRadios: js.UndefOr[js.Array[js.UndefOr[String | Double]]] = js.undefined
    
    var display: js.UndefOr[RadioGroupDisplay] = js.undefined
    
    var lineHeight: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/es/src/RadioGroup.RadioButtonProps['value'] */ /* value */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var selectionArea: js.UndefOr[RadioButtonSelectionArea] = js.undefined
    
    var spacing: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[RadioButtonType] = js.undefined
    
    var vAlign: js.UndefOr[RadioButtonVAlign] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object RadioGroupProps {
    
    @scala.inline
    def apply(): RadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    @scala.inline
    implicit class RadioGroupPropsMutableBuilder[Self <: RadioGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledRadios(value: js.Array[js.UndefOr[String | Double]]): Self = StObject.set(x, "disabledRadios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledRadiosUndefined: Self = StObject.set(x, "disabledRadios", js.undefined)
      
      @scala.inline
      def setDisabledRadiosVarargs(value: (js.UndefOr[String | Double])*): Self = StObject.set(x, "disabledRadios", js.Array(value :_*))
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplay(value: RadioGroupDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/es/src/RadioGroup.RadioButtonProps['value'] */ /* value */ js.Any => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSelectionArea(value: RadioButtonSelectionArea): Self = StObject.set(x, "selectionArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionAreaUndefined: Self = StObject.set(x, "selectionArea", js.undefined)
      
      @scala.inline
      def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setType(value: RadioButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVAlign(value: RadioButtonVAlign): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

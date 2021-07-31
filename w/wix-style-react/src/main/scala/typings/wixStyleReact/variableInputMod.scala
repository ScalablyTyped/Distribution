package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.Prefix
import typings.wixStyleReact.statusIndicatorMod.StatusIndicatorState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableInputMod {
  
  @JSImport("wix-style-react/dist/es/src/VariableInput", JSImport.Default)
  @js.native
  class default () extends VariableInput
  
  /* Inlined {[ key in wix-style-react.wix-style-react/dist/es/src/VariableInput.VariableInputSize ]: wix-style-react.wix-style-react/dist/es/src/VariableInput.VariableInputSize} */
  object SIZE {
    
    @JSImport("wix-style-react/dist/es/src/VariableInput", "SIZE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/VariableInput", "SIZE.large")
    @js.native
    def large: VariableInputSize = js.native
    @scala.inline
    def large_=(x: VariableInputSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("large")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/VariableInput", "SIZE.medium")
    @js.native
    def medium: VariableInputSize = js.native
    @scala.inline
    def medium_=(x: VariableInputSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/VariableInput", "SIZE.small")
    @js.native
    def small: VariableInputSize = js.native
    @scala.inline
    def small_=(x: VariableInputSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("small")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait VariableInput
    extends PureComponent[VariableInputProps, js.Object, js.Any] {
    
    def insertVariable(key: String): Unit = js.native
    
    def setValue(key: String): Unit = js.native
  }
  
  trait VariableInputProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[VariableInputSize] = js.undefined
    
    var status: js.UndefOr[StatusIndicatorState] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var variableParser: js.UndefOr[js.Function1[/* value */ String, String | Boolean]] = js.undefined
    
    var variableTemplate: js.UndefOr[Prefix] = js.undefined
  }
  object VariableInputProps {
    
    @scala.inline
    def apply(): VariableInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariableInputProps]
    }
    
    @scala.inline
    implicit class VariableInputPropsMutableBuilder[Self <: VariableInputProps] (val x: Self) extends AnyVal {
      
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
      def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* value */ String => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* value */ String => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSize(value: VariableInputSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: StatusIndicatorState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setVariableParser(value: /* value */ String => String | Boolean): Self = StObject.set(x, "variableParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVariableParserUndefined: Self = StObject.set(x, "variableParser", js.undefined)
      
      @scala.inline
      def setVariableTemplate(value: Prefix): Self = StObject.set(x, "variableTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableTemplateUndefined: Self = StObject.set(x, "variableTemplate", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait VariableInputSize extends StObject
  object VariableInputSize {
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
}

package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.BoldButtonLabel
import typings.wixStyleReact.anon.CancelButtonLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object richTextInputAreaMod {
  
  @JSImport("wix-style-react/dist/es/src/RichTextInputArea", JSImport.Default)
  @js.native
  class default () extends RichTextInputArea
  
  @js.native
  trait RichTextInputArea
    extends PureComponent[RichTextInputAreaProps, js.Object, js.Any] {
    
    def setValue(value: String): Unit = js.native
  }
  
  trait RichTextInputAreaProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var minHeight: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[RichTextInputAreaStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var texts: js.UndefOr[typings.wixStyleReact.richTextInputAreaMod.texts] = js.undefined
  }
  object RichTextInputAreaProps {
    
    inline def apply(): RichTextInputAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RichTextInputAreaProps]
    }
    
    extension [Self <: RichTextInputAreaProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStatus(value: RichTextInputAreaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTexts(value: texts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.error
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.loading
  */
  trait RichTextInputAreaStatus extends StObject
  object RichTextInputAreaStatus {
    
    inline def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typings.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  trait texts extends StObject {
    
    var insertionForm: js.UndefOr[CancelButtonLabel] = js.undefined
    
    var toolbarButtons: js.UndefOr[BoldButtonLabel] = js.undefined
  }
  object texts {
    
    inline def apply(): texts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[texts]
    }
    
    extension [Self <: texts](x: Self) {
      
      inline def setInsertionForm(value: CancelButtonLabel): Self = StObject.set(x, "insertionForm", value.asInstanceOf[js.Any])
      
      inline def setInsertionFormUndefined: Self = StObject.set(x, "insertionForm", js.undefined)
      
      inline def setToolbarButtons(value: BoldButtonLabel): Self = StObject.set(x, "toolbarButtons", value.asInstanceOf[js.Any])
      
      inline def setToolbarButtonsUndefined: Self = StObject.set(x, "toolbarButtons", js.undefined)
    }
  }
}

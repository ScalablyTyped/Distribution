package typings.wixStyleReact

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableTitleMod {
  
  @JSImport("wix-style-react/dist/types/EditableTitle", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EditableTitleProps, js.Object, Any]
  
  type EditableTitle = Component[EditableTitleProps, js.Object, Any]
  
  trait EditableTitleProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object EditableTitleProps {
    
    inline def apply(): EditableTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableTitleProps]
    }
    
    extension [Self <: EditableTitleProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSubmit(value: /* value */ String => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

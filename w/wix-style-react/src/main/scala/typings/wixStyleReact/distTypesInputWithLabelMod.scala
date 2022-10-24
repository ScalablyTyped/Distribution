package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLInputElement
import typings.wixStyleReact.distTypesInputMod.InputProps
import typings.wixStyleReact.wixStyleReactStrings.bottomLine
import typings.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithLabelMod {
  
  @JSImport("wix-style-react/dist/types/InputWithLabel", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InputWithLabelProps, js.Object, Any]
  
  type InputWithLabel = Component[InputWithLabelProps, js.Object, Any]
  
  trait InputWithLabelProps
    extends StObject
       with InputProps {
    
    @JSName("border")
    var border_InputWithLabelProps: js.UndefOr[standard | bottomLine] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    @JSName("onFocus")
    var onFocus_InputWithLabelProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    @JSName("suffix")
    var suffix_InputWithLabelProps: js.UndefOr[js.Array[ReactNode]] = js.undefined
  }
  object InputWithLabelProps {
    
    inline def apply(): InputWithLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputWithLabelProps]
    }
    
    extension [Self <: InputWithLabelProps](x: Self) {
      
      inline def setBorder(value: standard | bottomLine): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setSuffix(value: js.Array[ReactNode]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: ReactNode*): Self = StObject.set(x, "suffix", js.Array(value*))
    }
  }
}

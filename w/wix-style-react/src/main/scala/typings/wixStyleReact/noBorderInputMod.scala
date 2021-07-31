package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.inputMod.InputProps
import typings.wixStyleReact.inputMod.InputStatusError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noBorderInputMod {
  
  @JSImport("wix-style-react/dist/es/src/NoBorderInput", JSImport.Default)
  @js.native
  class default ()
    extends Component[NoBorderInputProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/NoBorderInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/NoBorderInput", "default.StatusError")
    @js.native
    def StatusError: InputStatusError = js.native
    @scala.inline
    def StatusError_=(x: InputStatusError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StatusError")(x.asInstanceOf[js.Any])
  }
  
  type NoBorderInput = Component[NoBorderInputProps, js.Object, js.Any]
  
  trait NoBorderInputProps
    extends StObject
       with InputProps {
    
    var label: js.UndefOr[String] = js.undefined
    
    @JSName("status")
    var status_NoBorderInputProps: js.UndefOr[NoBorderInputStatus] = js.undefined
  }
  object NoBorderInputProps {
    
    @scala.inline
    def apply(): NoBorderInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoBorderInputProps]
    }
    
    @scala.inline
    implicit class NoBorderInputPropsMutableBuilder[Self <: NoBorderInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setStatus(value: NoBorderInputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type NoBorderInputStatus = NoBorderInputStatusError
  
  type NoBorderInputStatusError = InputStatusError
}

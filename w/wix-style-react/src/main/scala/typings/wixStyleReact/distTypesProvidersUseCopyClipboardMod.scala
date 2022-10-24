package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUseCopyClipboardMod {
  
  @JSImport("wix-style-react/dist/types/providers/useCopyClipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: useCopyClipboardProps): useCopyClipboardReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[useCopyClipboardReturn]
  
  trait useCopyClipboardProps extends StObject {
    
    var onCopy: js.UndefOr[js.Function] = js.undefined
    
    var resetTimeout: js.UndefOr[Double] = js.undefined
    
    var value: String
  }
  object useCopyClipboardProps {
    
    inline def apply(value: String): useCopyClipboardProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[useCopyClipboardProps]
    }
    
    extension [Self <: useCopyClipboardProps](x: Self) {
      
      inline def setOnCopy(value: js.Function): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setResetTimeout(value: Double): Self = StObject.set(x, "resetTimeout", value.asInstanceOf[js.Any])
      
      inline def setResetTimeoutUndefined: Self = StObject.set(x, "resetTimeout", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait useCopyClipboardReturn extends StObject {
    
    def copyToClipboard(): Unit
    
    var isCopied: Boolean
    
    def resetState(): Unit
  }
  object useCopyClipboardReturn {
    
    inline def apply(copyToClipboard: () => Unit, isCopied: Boolean, resetState: () => Unit): useCopyClipboardReturn = {
      val __obj = js.Dynamic.literal(copyToClipboard = js.Any.fromFunction0(copyToClipboard), isCopied = isCopied.asInstanceOf[js.Any], resetState = js.Any.fromFunction0(resetState))
      __obj.asInstanceOf[useCopyClipboardReturn]
    }
    
    extension [Self <: useCopyClipboardReturn](x: Self) {
      
      inline def setCopyToClipboard(value: () => Unit): Self = StObject.set(x, "copyToClipboard", js.Any.fromFunction0(value))
      
      inline def setIsCopied(value: Boolean): Self = StObject.set(x, "isCopied", value.asInstanceOf[js.Any])
      
      inline def setResetState(value: () => Unit): Self = StObject.set(x, "resetState", js.Any.fromFunction0(value))
    }
  }
}

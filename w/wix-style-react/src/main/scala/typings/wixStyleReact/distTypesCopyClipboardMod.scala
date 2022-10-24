package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCopyClipboardMod {
  
  @JSImport("wix-style-react/dist/types/CopyClipboard", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CopyClipboardProps, js.Object, Any]
  
  type CopyClipboard = PureComponent[CopyClipboardProps, js.Object, Any]
  
  trait CopyClipboardChildrenProps extends StObject {
    
    var copyToClipboard: js.Function
    
    var isCopied: Boolean
    
    var reset: js.Function
  }
  object CopyClipboardChildrenProps {
    
    inline def apply(copyToClipboard: js.Function, isCopied: Boolean, reset: js.Function): CopyClipboardChildrenProps = {
      val __obj = js.Dynamic.literal(copyToClipboard = copyToClipboard.asInstanceOf[js.Any], isCopied = isCopied.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyClipboardChildrenProps]
    }
    
    extension [Self <: CopyClipboardChildrenProps](x: Self) {
      
      inline def setCopyToClipboard(value: js.Function): Self = StObject.set(x, "copyToClipboard", value.asInstanceOf[js.Any])
      
      inline def setIsCopied(value: Boolean): Self = StObject.set(x, "isCopied", value.asInstanceOf[js.Any])
      
      inline def setReset(value: js.Function): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    }
  }
  
  trait CopyClipboardProps extends StObject {
    
    def children(params: CopyClipboardChildrenProps): ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onCopy: js.UndefOr[js.Function] = js.undefined
    
    var resetTimeout: js.UndefOr[Double] = js.undefined
    
    var value: String
  }
  object CopyClipboardProps {
    
    inline def apply(children: CopyClipboardChildrenProps => ReactNode, value: String): CopyClipboardProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyClipboardProps]
    }
    
    extension [Self <: CopyClipboardProps](x: Self) {
      
      inline def setChildren(value: CopyClipboardChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnCopy(value: js.Function): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setResetTimeout(value: Double): Self = StObject.set(x, "resetTimeout", value.asInstanceOf[js.Any])
      
      inline def setResetTimeoutUndefined: Self = StObject.set(x, "resetTimeout", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

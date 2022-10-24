package typings.wixStyleReact

import typings.wixStyleReact.anon.OnCopy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUseCopyClipboardUseCopyClipboardMod {
  
  @JSImport("wix-style-react/dist/types/providers/useCopyClipboard/useCopyClipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Clipboard
    * @prop {boolean} isCopied - a return boolean with status of clipboard action
    * @prop {function} copyToClipboard - a return function that allows to initiate copying
    * @prop {function} resetState - an optional return function
    */
  /**
    * A custom hook for copying to clipboard. Returns copying to clipboard status and function to initiate copying to clipboard
    * @param {Object} props -  an object for value, onCopy, and resetTimeout props
    * @param {string} props.value -  a string that should be copied to clipboard
    * @param {function} [props.onCopy] - an optional parameter to apply additional logic when copying to clipboard
    * @param {number} [props.resetTimeout] - an optional parameter to set interval which after copying to clipboard will reset status
    * @return {Clipboard}
    */
  inline def default(param0: OnCopy): Clipboard = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Clipboard]
  
  trait Clipboard extends StObject {
    
    /**
      * - a return function that allows to initiate copying
      */
    var copyToClipboard: js.Function
    
    /**
      * - a return boolean with status of clipboard action
      */
    var isCopied: Boolean
    
    /**
      * - an optional return function
      */
    var resetState: js.Function
  }
  object Clipboard {
    
    inline def apply(copyToClipboard: js.Function, isCopied: Boolean, resetState: js.Function): Clipboard = {
      val __obj = js.Dynamic.literal(copyToClipboard = copyToClipboard.asInstanceOf[js.Any], isCopied = isCopied.asInstanceOf[js.Any], resetState = resetState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clipboard]
    }
    
    extension [Self <: Clipboard](x: Self) {
      
      inline def setCopyToClipboard(value: js.Function): Self = StObject.set(x, "copyToClipboard", value.asInstanceOf[js.Any])
      
      inline def setIsCopied(value: Boolean): Self = StObject.set(x, "isCopied", value.asInstanceOf[js.Any])
      
      inline def setResetState(value: js.Function): Self = StObject.set(x, "resetState", value.asInstanceOf[js.Any])
    }
  }
}

package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeActionOptions
  extends StObject
     with ClickActionOptions {
  
  /**
    * `true` to replace the typed text with a placeholder when sending action logs to a reporter.
    */
  var confidential: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to insert the entire block of current text in a single keystroke (similar to a copy & paste function),
    * and false to insert the current text character by character.
    */
  var paste: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to remove the current text in the target element, and false to leave the text as it is.
    */
  var replace: js.UndefOr[Boolean] = js.undefined
}
object TypeActionOptions {
  
  inline def apply(): TypeActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeActionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeActionOptions] (val x: Self) extends AnyVal {
    
    inline def setConfidential(value: Boolean): Self = StObject.set(x, "confidential", value.asInstanceOf[js.Any])
    
    inline def setConfidentialUndefined: Self = StObject.set(x, "confidential", js.undefined)
    
    inline def setPaste(value: Boolean): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}

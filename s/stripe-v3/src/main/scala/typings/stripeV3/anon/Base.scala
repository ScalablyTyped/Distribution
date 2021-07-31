package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var base: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[String] = js.undefined
  
  var focus: js.UndefOr[String] = js.undefined
  
  var invalid: js.UndefOr[String] = js.undefined
  
  var webkitAutofill: js.UndefOr[String] = js.undefined
}
object Base {
  
  @scala.inline
  def apply(): Base = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setWebkitAutofill(value: String): Self = StObject.set(x, "webkitAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAutofillUndefined: Self = StObject.set(x, "webkitAutofill", js.undefined)
  }
}

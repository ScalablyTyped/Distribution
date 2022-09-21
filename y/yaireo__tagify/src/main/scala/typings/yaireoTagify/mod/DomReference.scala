package typings.yaireoTagify.mod

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// types for the tagify instance
/**
  * References to DOM elements used by an active tagify instance.
  */
trait DomReference extends StObject {
  
  /**
    * The dropdown container with the `tagify__dropdown` class.
    */
  var dropdown: HTMLDivElement
  
  /**
    * The SPAN element representing the visible tag input area with the
    * `tagify__input` class.
    */
  var input: HTMLSpanElement
  
  /**
    * The original hidden INPUT or TEXTAREA element that stores the value.
    */
  var originalInput: HTMLInputElement | HTMLTextAreaElement
  
  /**
    * The tagify container with the `tagify` class.
    */
  var scope: HTMLElement
}
object DomReference {
  
  inline def apply(
    dropdown: HTMLDivElement,
    input: HTMLSpanElement,
    originalInput: HTMLInputElement | HTMLTextAreaElement,
    scope: HTMLElement
  ): DomReference = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomReference]
  }
  
  extension [Self <: DomReference](x: Self) {
    
    inline def setDropdown(value: HTMLDivElement): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setInput(value: HTMLSpanElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOriginalInput(value: HTMLInputElement | HTMLTextAreaElement): Self = StObject.set(x, "originalInput", value.asInstanceOf[js.Any])
    
    inline def setScope(value: HTMLElement): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}

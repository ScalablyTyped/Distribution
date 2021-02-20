package typings.wordpressComponents.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLSpanElement
import typings.wordpressComponents.wordpressComponentsStrings.error
import typings.wordpressComponents.wordpressComponentsStrings.success
import typings.wordpressComponents.wordpressComponentsStrings.validating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMouseEnter extends StObject {
  
  /**
    * Function to call when onMouseEnter event triggered on token.
    */
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
  
  /**
    * Function to call when onMouseLeave is triggered on token.
    */
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
  
  /**
    * Applies styles to token.
    */
  var status: js.UndefOr[error | validating | success] = js.native
  
  /**
    * Adds a title to the token.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The value of the token.
    */
  var value: String = js.native
}
object OnMouseEnter {
  
  @scala.inline
  def apply(value: String): OnMouseEnter = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMouseEnter]
  }
  
  @scala.inline
  implicit class OnMouseEnterMutableBuilder[Self <: OnMouseEnter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setStatus(value: error | validating | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

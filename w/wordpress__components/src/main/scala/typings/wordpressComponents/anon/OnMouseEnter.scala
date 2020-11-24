package typings.wordpressComponents.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLSpanElement
import typings.wordpressComponents.wordpressComponentsStrings.error
import typings.wordpressComponents.wordpressComponentsStrings.success
import typings.wordpressComponents.wordpressComponentsStrings.validating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMouseEnter extends js.Object {
  
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
  implicit class OnMouseEnterOps[Self <: OnMouseEnter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setStatus(value: error | validating | success): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

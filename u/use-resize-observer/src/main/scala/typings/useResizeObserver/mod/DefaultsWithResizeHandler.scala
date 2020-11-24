package typings.useResizeObserver.mod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultsWithResizeHandler[TElement] extends ObserverDefaults[TElement] {
  
  var onResize: ResizeHandler = js.native
  
  var ref: js.UndefOr[RefObject[TElement]] = js.native
}
object DefaultsWithResizeHandler {
  
  @scala.inline
  def apply[TElement](onResize: /* newSize */ RefSize => Unit): DefaultsWithResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[DefaultsWithResizeHandler[TElement]]
  }
  
  @scala.inline
  implicit class DefaultsWithResizeHandlerOps[Self <: DefaultsWithResizeHandler[_], TElement] (val x: Self with DefaultsWithResizeHandler[TElement]) extends AnyVal {
    
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
    def setOnResize(value: /* newSize */ RefSize => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: RefObject[TElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
}
